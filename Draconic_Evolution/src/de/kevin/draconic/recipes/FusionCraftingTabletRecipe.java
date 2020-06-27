package de.kevin.draconic.recipes;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.inventory.ItemStack;

import de.kevin.draconic.items.CraftingTablets;
import de.kevin.draconic.items.Endirium;

public class FusionCraftingTabletRecipe implements Listener{
	
	Endirium endirium = new Endirium();
	CraftingTablets craftingTablets = new CraftingTablets();
	
	@EventHandler
	public void createFusionCraftingTabletRecipe(PrepareItemCraftEvent event) {
		
		ItemStack fusionCraftingTablet = craftingTablets.createCraftingTablets(Material.KNOWLEDGE_BOOK, "§5Fusion Crafting Tablet", "For Fusion Crafting");
		
		if(event.getInventory().getItem(4) != null) {
			if(event.getInventory().getItem(4).isSimilar(endirium.createEndirium())) {
				event.getInventory().setResult(fusionCraftingTablet);
			} else {
				Bukkit.broadcastMessage("joa");
				return;
			}
		} else {
			Bukkit.broadcastMessage("mist");
			return;
		}
	}
}
