package de.kevin.draconic.items;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class DragonScale {
	
	public ItemStack dragonScale;
	
	public void createDragonScale() {
		
		dragonScale = new ItemStack(Material.COMMAND_BLOCK, 4);
		
		ItemMeta dragonScaleMeta = dragonScale.getItemMeta();
		dragonScaleMeta.setDisplayName("§dDragon Scale");
		dragonScaleMeta.addEnchant(Enchantment.KNOCKBACK, 1, true);
		dragonScaleMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		dragonScaleMeta.setCustomModelData(123456);
		dragonScale.setItemMeta(dragonScaleMeta);
	}
	
	public ItemStack getDragonScale() {
		if(dragonScale == null) {
			createDragonScale();
		}
		return dragonScale; 
	}

}
