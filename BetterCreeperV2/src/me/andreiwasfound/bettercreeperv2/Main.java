package me.andreiwasfound.bettercreeperv2;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		
		registerEvents();
	}
	
	@Override
	public void onDisable() {
		
	}
	
	private void registerEvents() {
		PluginManager pm = this.getServer().getPluginManager();
		pm.registerEvents(new CreeperExplode(), this);
	}
 
}
