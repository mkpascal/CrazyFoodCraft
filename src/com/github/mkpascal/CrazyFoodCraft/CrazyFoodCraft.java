package com.github.mkpascal.CrazyFoodCraft;

import java.util.logging.Logger;
import org.bukkit.plugin.java.JavaPlugin;
 
public class CrazyFoodCraft extends JavaPlugin {
 
	Logger log = Logger.getLogger("Minecraft");
 
	public void onEnable(){
		log.info("CrazyFoodCraft enabled!");
	}
 
	public void onDisable(){
		log.info("CrazyFoodCraft disabled.");
	}
}
