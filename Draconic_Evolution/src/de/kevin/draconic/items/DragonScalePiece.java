package de.kevin.draconic.items;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class DragonScalePiece {
	
	public ItemStack dragonScalePiece;
	
	public void createDragonScalePiece() {
		
		dragonScalePiece = new ItemStack(Material.CHAIN_COMMAND_BLOCK, 9);
		
		ItemMeta dragonScalePieceMeta = dragonScalePiece.getItemMeta();
		dragonScalePieceMeta.setDisplayName("§dDragon Scale Piece");
		dragonScalePieceMeta.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
		dragonScalePieceMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		dragonScalePieceMeta.setCustomModelData(654321);
		dragonScalePiece.setItemMeta(dragonScalePieceMeta);
	}
	
	public ItemStack getDragonScalePiece() {
		return dragonScalePiece;
	}

}
