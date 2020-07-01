package de.kevin.draconic.recipes.fusionCraftingRecipes;

import de.kevin.draconic.inventorys.XtremeCraftingInventory;
import de.kevin.draconic.items.ItemStackFactory;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class XtremeQuaftingTabletRecipe implements Listener {

    ItemStack dragonScale = ItemStackFactory.getInstance().createDragonScale(1);
    ItemStack xtremeCraftingTablet = ItemStackFactory.getInstance().createCraftingTablets(Material.KNOWLEDGE_BOOK,
            "§6Xtreme Quafting Tablet", "§7Just a bigger crafting table(t) (^._.^)");
    XtremeCraftingInventory xtremeCraftingInventory = new XtremeCraftingInventory();

    @EventHandler
    public void xtremeCraftingTabletresult(InventoryClickEvent event) {
        Inventory xcInventory = xtremeCraftingInventory.getXtremeCraftingInventory();

        if(!event.getInventory().equals(xcInventory)) {
            if(event.isLeftClick() && event.getSlot() == 31
                    || event.isRightClick() && event.getSlot() == 31
                    || event.isShiftClick() && event.getSlot() == 31) {

                if(event.getInventory().getItem(10) != null
                        && event.getInventory().getItem(13) != null
                        && event.getInventory().getItem(16) != null
                        && event.getInventory().getItem(19) != null
                        && event.getInventory().getItem(25) != null
                        && event.getInventory().getItem(28) != null
                        && event.getInventory().getItem(34) != null
                        && event.getInventory().getItem(37) != null
                        && event.getInventory().getItem(43) != null) {

                    if(event.getInventory().getItem(10).isSimilar(dragonScale)
                            && event.getInventory().getItem(13).isSimilar(new ItemStack(Material.CRAFTING_TABLE))
                            && event.getInventory().getItem(16).isSimilar(dragonScale)
                            && event.getInventory().getItem(19).isSimilar(dragonScale)
                            && event.getInventory().getItem(25).isSimilar(dragonScale)
                            && event.getInventory().getItem(28).isSimilar(new ItemStack(Material.DIAMOND))
                            && event.getInventory().getItem(34).isSimilar(new ItemStack(Material.DIAMOND))
                            && event.getInventory().getItem(37).isSimilar(new ItemStack(Material.DIAMOND))
                            && event.getInventory().getItem(43).isSimilar(new ItemStack(Material.DIAMOND))) {

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
                            int amt28 = event.getInventory().getItem(28).getAmount();
                            event.getWhoClicked().getOpenInventory().getItem(28).setAmount(amt28 - 1);
                            int amt34 = event.getInventory().getItem(34).getAmount();
                            event.getWhoClicked().getOpenInventory().getItem(34).setAmount(amt34 - 1);
                            int amt37 = event.getInventory().getItem(37).getAmount();
                            event.getWhoClicked().getOpenInventory().getItem(37).setAmount(amt37 - 1);
                            int amt43 = event.getInventory().getItem(43).getAmount();
                            event.getWhoClicked().getOpenInventory().getItem(43).setAmount(amt43 - 1);

                            if(event.getInventory().getItem(40).isSimilar(ItemStackFactory.getInstance().getResultBarrier())) {
                                event.getInventory().setItem(40, xtremeCraftingTablet);
                                ((Player) event.getView().getPlayer()).playSound(event.getView().getPlayer().getLocation(), Sound.BLOCK_FIRE_EXTINGUISH, 0.7F, 0.7F);
                            } else if (resultamount < 64 && event.getInventory().getItem(40).isSimilar(xtremeCraftingTablet)) {
                                event.getInventory().addItem(xtremeCraftingTablet).put(resultamount + 1, xtremeCraftingTablet);
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
