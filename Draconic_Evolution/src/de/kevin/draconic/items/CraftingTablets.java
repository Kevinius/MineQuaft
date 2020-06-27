package de.kevin.draconic.items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class CraftingTablets extends ItemStack {
	
	public ItemStack craftingTablets;
	
	public ItemStack createCraftingTablets(Material material, String displayname, String lore) {
		
		craftingTablets = new ItemStack(material);
		
		ItemMeta craftingTabletsMeta = craftingTablets.getItemMeta();
		if(craftingTabletsMeta != null) {
			craftingTabletsMeta.setDisplayName(displayname);
			ArrayList<String> loreList = new ArrayList<>();
			loreList.add(lore);
			craftingTabletsMeta.setLore(loreList);
			craftingTabletsMeta.setCustomModelData(32123);
		}
		craftingTablets.setItemMeta(craftingTabletsMeta);
		
		return craftingTablets;
		
	}

}
