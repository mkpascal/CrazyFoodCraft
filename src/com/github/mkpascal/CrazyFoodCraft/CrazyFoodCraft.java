package com.github.mkpascal.CrazyFoodCraft;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class CrazyFoodCraft extends JavaPlugin {
	
	Logger log = Logger.getLogger("Minecraft");
 
	public final CrazyFoodCraftBlockListener blockListener = new CrazyFoodCraftBlockListener();
	
	public void onEnable(){
		log.info("CrazyFoodCraft enabled!");
		
		PluginManager pm = getServer().getPluginManager();
	
		pm.registerEvents(this.blockListener, this);
	}
 
	public void onDisable(){
		log.info("CrazyFoodCraft disabled.");
	}

}





