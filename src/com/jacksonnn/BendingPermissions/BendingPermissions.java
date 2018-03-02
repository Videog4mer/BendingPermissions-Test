package com.jacksonnn.BendingPermissions;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.material.Command;
import org.bukkit.plugin.java.JavaPlugin;

public class BendingPermissions extends JavaPlugin {
	@Override
	public void onEnable() {
		Bukkit.getServer().getLogger().info(ChatColor.LIGHT_PURPLE + "Bending Permissions by Jacksonnn Enabled!");
	}
	
	@Override
	public void onDisable() {
		Bukkit.getServer().getLogger().info(ChatColor.LIGHT_PURPLE + "Bending Permissions by Jacksonnn Disabled!");
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		if (commandLabel.equalsIgnoreCase("bp")) {
			if (args.length == 0 ) {
				sender.sendMessage(ChatColor.DARK_PURPLE + "ProjectKorra Bending Permissions:");
				sender.sendMessage(ChatColor.LIGHT_PURPLE + "\t/bp air");
				sender.sendMessage(ChatColor.LIGHT_PURPLE + "\t/bp water");
				sender.sendMessage(ChatColor.LIGHT_PURPLE + "\t/bp earth");
				sender.sendMessage(ChatColor.LIGHT_PURPLE + "\t/bp fire");
				sender.sendMessage(ChatColor.LIGHT_PURPLE + "\t/bp chi");
				sender.sendMessage(ChatColor.LIGHT_PURPLE + "\t/bp avatar");
				sender.sendMessage(ChatColor.LIGHT_PURPLE + "\t/bp other");
				return true;
			}
			if (args.length == 1 && args[0].equalsIgnoreCase("air")) {
				sender.sendMessage(ChatColor.DARK_GRAY + "ProJectKorra Airbending Permissions:");
				sender.sendMessage(ChatColor.GRAY + "\tbending.ability.<abilityName>");
				sender.sendMessage(ChatColor.GRAY + "\tEXAMPLE: AirSpout - bending.ability.AirSpout");
				return true;
			}
			if (args.length == 1 && args[0].equalsIgnoreCase("water")) {
				sender.sendMessage(ChatColor.DARK_AQUA + "ProJectKorra Waterbending Permissions:");
				sender.sendMessage(ChatColor.AQUA + "\tbending.ability.<abilityName>");
				sender.sendMessage(ChatColor.AQUA + "\tEXAMPLE: WaterManipulation - bending.ability.WaterManipulation");
				return true;
			}
			if (args.length == 1 && args[0].equalsIgnoreCase("earth")) {
				sender.sendMessage(ChatColor.DARK_GREEN + "ProJectKorra Earthbending Permissions:");
				sender.sendMessage(ChatColor.GREEN + "\tbending.ability.<abilityName>");
				sender.sendMessage(ChatColor.GREEN + "\tEXAMPLE: EarthBlast - bending.ability.EarthBlast");
				return true;
			}
			if (args.length == 1 && args[0].equalsIgnoreCase("fire")) {
				sender.sendMessage(ChatColor.DARK_RED + "ProJectKorra Firebending Permissions:");
				sender.sendMessage(ChatColor.RED + "\tbending.ability.<abilityName>");
				sender.sendMessage(ChatColor.RED + "\tEXAMPLE: FireShield - bending.ability.FireShield");
				return true;
			}
			if (args.length == 1 && args[0].equalsIgnoreCase("chi")) {
				sender.sendMessage(ChatColor.GOLD + "ProJectKorra Waterbending Permissions:");
				sender.sendMessage(ChatColor.YELLOW + "\tbending.ability.<abilityName>");
				sender.sendMessage(ChatColor.YELLOW + "\tEXAMPLE: HighJump - bending.ability.HighJump");
				return true;
			}
			if (args.length == 1 && args[0].equalsIgnoreCase("avatar")) {
				sender.sendMessage(ChatColor.DARK_PURPLE + "ProJectKorra Avatar Permissions:");
				sender.sendMessage(ChatColor.LIGHT_PURPLE + "\tbending.ability.<abilityName>");
				sender.sendMessage(ChatColor.LIGHT_PURPLE + "\tEXAMPLE: AvatarState - bending.ability.AvatarState");
				return true;
			}
			if (args.length == 1 && args[0].equalsIgnoreCase("other")) {
				sender.sendMessage(ChatColor.DARK_RED + "Other ProjectKorra Permissions:");
				sender.sendMessage(ChatColor.RED + "bending.* - Gives access to all abilities and commands.");
				sender.sendMessage(ChatColor.RED + "bending.admin - Same thing as bending.*, just different permission.");
				return true;
			}
			return true;
		}
		return true;
	}
}
