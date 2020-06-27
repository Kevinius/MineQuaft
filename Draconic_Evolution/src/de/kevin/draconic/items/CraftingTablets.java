package de.kevin.draconic.items;

import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class CraftingTablets extends ItemStack {
	
	public ItemStack craftingTablets;
	
	public ItemStack createCraftingTablets(Material material, String displayname, String lore) {
		
		craftingTablets = new ItemStack(Material.BARRIER);
		
		ItemMeta craftingTabletsMeta = craftingTablets.getItemMeta();
		craftingTabletsMeta.setDisplayName(displayname);
		ArrayList<String> Lore = new ArrayList<String>();
		Lore.add(lore);
		craftingTabletsMeta.setLore(Lore);
		craftingTabletsMeta.setCustomModelData(32123);
		craftingTablets.setItemMeta(craftingTabletsMeta);
		
		return craftingTablets;
		
	}

}
