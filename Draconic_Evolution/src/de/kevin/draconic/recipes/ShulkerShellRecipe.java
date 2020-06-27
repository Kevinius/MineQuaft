package de.kevin.draconic.recipes;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.inventory.CraftingInventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;

import de.kevin.draconic.items.DragonScale;

public class ShulkerShellRecipe implements Listener{
	
	private DragonScale dragonScale = new DragonScale();
	
	@EventHandler
	public void shulkerShellRecipe(CraftItemEvent event) {
		
		final Recipe recipe = event.getRecipe();
		
	    if (recipe == null)
	        return;
		
		dragonScale.createDragonScale();
		
		CraftingInventory inv = event.getInventory();
		ItemStack[] items = inv.getMatrix();
        if ( !new ItemStack(Material.CHORUS_FRUIT).equals(items[1])
        	&& !dragonScale.getDragonScale().equals(items[4])
        	&& !new ItemStack(Material.CHORUS_FRUIT).equals(items[7])) {
        	event.getInventory().setResult(dragonScale.getDragonScale());
            Bukkit.broadcastMessage("Nein");
        } /*else {
        	event.getInventory().setResult(new ItemStack(Material.SHULKER_SHELL));
        	Bukkit.broadcastMessage("Ja");
        }*/
	}
}
