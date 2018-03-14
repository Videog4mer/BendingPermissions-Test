package com.jacksonnn.BendingPermissions;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

public class BendingPermissions extends JavaPlugin {
	
	@Override
	public void onEnable() {
		registerCommands();
		Bukkit.getServer().getLogger().info(ChatColor.LIGHT_PURPLE + "Bending Permissions" + Methods.version + "by Jacksonnn Enabled!");
	}
	
	@Override
	public void onDisable() {
		Bukkit.getServer().getLogger().info(ChatColor.LIGHT_PURPLE + "Bending Permissions" + Methods.version + "by Jacksonnn Disabled!");
	}
	
	public void registerCommands() {
		getCommand("bp").setExecutor(new Commands());
		getCommand("bendingpermissions").setExecutor(new Commands());
		getCommand("bperm").setExecutor(new Commands());
		getCommand("bendingp").setExecutor(new Commands());
	}
}
