package com.jacksonnn.BendingPermissions;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import com.projectkorra.projectkorra.Element;
import com.projectkorra.projectkorra.ability.CoreAbility;

import net.md_5.bungee.api.ChatColor;

import com.jacksonnn.BendingPermissions.Methods;

public class Commands implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		if (commandLabel.equalsIgnoreCase("bp") || commandLabel.equalsIgnoreCase("bendingpermissions") || commandLabel.equalsIgnoreCase("bendingp") || commandLabel.equalsIgnoreCase("bperm")) {
			
			
			if (args.length == 0) {
				sender.sendMessage(ChatColor.RED + "Bending Permissions - Jacksonnn v" + Methods.version);
				sender.sendMessage(ChatColor.YELLOW + "[Usage]: /bendingpermissions [element]");
			}
			else if (args.length == 1) {
				Element e = Element.getElement(args[0]);
				if (e == null) {
					sender.sendMessage(Methods.error + "Your argument, " + args[0] + ", does not fit the acceptable arguments. Acceptable arguments are air, water, earth, fire, chi, or avatar.");
				}
	
				List<String> abils = new ArrayList<>();
				for (CoreAbility abil : CoreAbility.getAbilities()) {
				    if (abil.getElement().equals(e) && !abils.contains(abil.getName())) {
				        abils.add(abil.getName());
				    }
				}
	
				for (String abil : abils) {
				    sender.sendMessage(e.getColor() + abil + ": bending.ability." + abil);
				}
				return false;
			}
			else {
				sender.sendMessage(Methods.error + "Too many arguments! Please only use one argument such as the following: Air, Water, Earth, Fire, Chi, or Avatar.");
			}
		}
		return false;
	}
}
