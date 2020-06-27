package de.kevin.draconic.items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Endirium {
	
	public ItemStack endirium;
	
	public ItemStack createEndirium() {
		
		endirium = new ItemStack(Material.REPEATING_COMMAND_BLOCK, 1);
		
		ItemMeta endiriumMeta = endirium.getItemMeta();
		endiriumMeta.setDisplayName("§6Endirium");
		endiriumMeta.setCustomModelData(12321);
		endirium.setItemMeta(endiriumMeta);
		return endirium;
	}
	
	public ItemStack getEndirium() {
		if(endirium == null) {
			createEndirium();
		}
		return endirium;
	}

}
