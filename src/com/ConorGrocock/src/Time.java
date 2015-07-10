package com.ConorGrocock.src;

import net.md_5.bungee.api.ChatColor;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;


public class Time extends JavaPlugin{
	public void onEnable()  {}
	public void onDisable() {}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player) sender;
		if(cmd.getName().equalsIgnoreCase("timeA")){
			if(args[0].equalsIgnoreCase("day")){
				p.getWorld().setTime(0);
				Bukkit.broadcastMessage(ChatColor.GREEN + p.getDisplayName() + " has set the time to day!");
			}else if(args[0].equalsIgnoreCase("night")){
				p.getWorld().setTime(13000);
				Bukkit.broadcastMessage(ChatColor.GREEN + p.getDisplayName() + " has set the time to night!");
			}
		}
		return false;
	}
}
