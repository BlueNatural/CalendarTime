package org.calendartime.bluenatural;

import org.bukkit.ChatColor;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class CalendarTime extends JavaPlugin {
	public static Plugin plugin;
	
    PluginDescriptionFile pdf = getDescription();
    public void onEnable() {
    	plugin = this;
    	System.out.println(ChatColor.YELLOW + "----------------------------------");
    	System.out.println(ChatColor.WHITE + "Name: CalendarTime");
    	System.out.println(ChatColor.WHITE + "Version:" + pdf.getVersion());
    	System.out.println(ChatColor.WHITE + "Author:" + ChatColor.BLUE + "BlueNatural");
        System.out.println(ChatColor.WHITE + "Support:" + pdf.getWebsite());
    	System.out.println(ChatColor.YELLOW + "----------------------------------");
           
    }
    public void onDisable() {
    	
    }

}
