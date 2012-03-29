package com.github.mkpascal.CrazyFoodCraft;

import java.util.Random;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;;

public class CrazyFoodCraftBlockListener implements Listener {

	private static final Random rand = new Random();
	
		@EventHandler(priority = EventPriority.NORMAL) 
        public void interactFood(PlayerInteractEvent event){
  
            Player player = event.getPlayer();

			if(event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK)
			{
				
				if(player.getItemInHand().getType().equals(Material.SPECKLED_MELON))
				{
					int x = rand.nextInt(10);
					 
					   		if(x < 5)
					   		{
					   			player.sendMessage("Ouch. This wasn't a good one.");
					   			player.setFireTicks(10000);
					   			player.setItemInHand(null);
					   		}
					   		else
					   		{
					   			player.sendMessage("Nice, it heals you!");
				                player.setHealth(20);
				                player.setFoodLevel(20);
					   			player.setItemInHand(null);					   			
					   		}
					   
				}
				
			}	
			
        }
		
}