package de.kevin.draconic.recipes.fusionCraftingRecipes;

import de.kevin.draconic.items.ItemStackFactory;
import de.kevin.draconic.inventorys.FusionCraftingInventory;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class EndiriumRecipe implements Listener{
	
	ItemStack dragonScale = ItemStackFactory.getInstance().createDragonScale(1);
	FusionCraftingInventory fusionCraftingInventory = new FusionCraftingInventory();
	
	@EventHandler
	public void endiriumResult(InventoryClickEvent event) {
		Inventory fcInventory = fusionCraftingInventory.getFusionCraftingInventory();
		
		if(!event.getInventory().equals(fcInventory)) {
			if(event.isLeftClick() && event.getSlot() == 31
			|| event.isRightClick() && event.getSlot() == 31
			|| event.isShiftClick() && event.getSlot() == 31) {
				
					if(event.getInventory().getItem(10) != null
					&& event.getInventory().getItem(13) != null
					&& event.getInventory().getItem(16) != null
					&& event.getInventory().getItem(19) != null
					&& event.getInventory().getItem(25) != null) {
						
						if(event.getInventory().getItem(10).isSimilar(dragonScale)
						&& event.getInventory().getItem(13).isSimilar(new ItemStack(Material.IRON_INGOT))
						&& event.getInventory().getItem(16).isSimilar(dragonScale)
						&& event.getInventory().getItem(19).isSimilar(dragonScale)
						&& event.getInventory().getItem(25).isSimilar(dragonScale)) {

							int resultamount = event.getInventory().getItem(40).getAmount();
							
						if(resultamount < 64) {
							int amt10 = event.getInventory().getItem(10).getAmount();
							event.getWhoClicked().getOpenInventory().getItem(10).setAmount(amt10 - 1);
							int amt13 = event.getInventory().getItem(13).getAmount();
							event.getWhoClicked().getOpenInventory().getItem(13).setAmount(amt13 - 1);
							int amt16 = event.getInventory().getItem(16).getAmount();
							event.getWhoClicked().getOpenInventory().getItem(16).setAmount(amt16 - 1);
							int amt19 = event.getInventory().getItem(19).getAmount();
							event.getWhoClicked().getOpenInventory().getItem(19).setAmount(amt19 - 1);
							int amt25 = event.getInventory().getItem(25).getAmount();
							event.getWhoClicked().getOpenInventory().getItem(25).setAmount(amt25 - 1);
							
							if(event.getInventory().getItem(40).isSimilar(ItemStackFactory.getInstance().getResultBarrier())) {
								event.getInventory().setItem(40, ItemStackFactory.getInstance().getEndirium());
								((Player) event.getView().getPlayer()).playSound(event.getView().getPlayer().getLocation(), Sound.BLOCK_FIRE_EXTINGUISH, 0.7F, 0.7F);
							} else if (resultamount < 64 && event.getInventory().getItem(40).isSimilar(ItemStackFactory.getInstance().getEndirium())) {
								event.getInventory().addItem(ItemStackFactory.getInstance().getEndirium()).put(resultamount + 1, ItemStackFactory.getInstance().getEndirium());
								((Player) event.getView().getPlayer()).playSound(event.getView().getPlayer().getLocation(), Sound.BLOCK_FIRE_EXTINGUISH, 0.7F, 0.7F);
							} else {
								event.setCancelled(true);
							}
						}
					}
				}
			}
		}
	}
}


	


