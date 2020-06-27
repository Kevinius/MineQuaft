package de.kevin.draconic.recipes;

import de.kevin.draconic.items.CraftingTablets;
import de.kevin.draconic.items.ItemStackFactory;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.inventory.ItemStack;

public class FusionCraftingTabletRecipe implements Listener{

	CraftingTablets craftingTablets = new CraftingTablets();
	
	@EventHandler
	public void FusionCraftingTabletRecipe(CraftItemEvent event) {
		
		ItemStack fusionCraftingTablet = craftingTablets.createCraftingTablets(Material.KNOWLEDGE_BOOK,
				"§5Fusion Crafting Tablet", "For Fusion Crafting");

		if(event.getInventory().getMatrix()[4] != null) {
			if(event.getInventory().getMatrix()[4].isSimilar(ItemStackFactory.getInstance().getEndirium())) {
				event.getInventory().setResult(fusionCraftingTablet);
				Bukkit.broadcastMessage("Ja");
			} else {
				Bukkit.broadcastMessage("nein");
			}
		} else {
			Bukkit.broadcastMessage("nein nein nein!");
		}
	}
}
