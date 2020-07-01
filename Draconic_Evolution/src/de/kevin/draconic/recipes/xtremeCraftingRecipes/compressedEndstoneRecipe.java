package de.kevin.draconic.recipes.xtremeCraftingRecipes;

import de.kevin.draconic.inventorys.XtremeCraftingInventory;
import de.kevin.draconic.items.ItemStackFactory;
import de.kevin.draconic.main.Main;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class compressedEndstoneRecipe implements Listener {

    XtremeCraftingInventory xtremeCraftingInventory = new XtremeCraftingInventory();

    ItemStack compressedEndstone = ItemStackFactory.getInstance().getCompressedEndstone();


    @EventHandler
    public void compressedEndstoneResult(InventoryClickEvent event) {

        if(xtremeCraftingInventory != null) {
            if(!event.getInventory().equals(xtremeCraftingInventory)) {
                if(event.isLeftClick() && event.getSlot() == 0 ||
                        event.isLeftClick() && event.getSlot() == 1 ||
                        event.isLeftClick() && event.getSlot() == 2 ||
                        event.isLeftClick() && event.getSlot() == 3 ||
                        event.isLeftClick() && event.getSlot() == 4 ||
                        event.isLeftClick() && event.getSlot() == 9 ||
                        event.isLeftClick() && event.getSlot() == 10 ||
                        event.isLeftClick() && event.getSlot() == 11 ||
                        event.isLeftClick() && event.getSlot() == 12 ||
                        event.isLeftClick() && event.getSlot() == 13 ||
                        event.isLeftClick() && event.getSlot() == 18 ||
                        event.isLeftClick() && event.getSlot() == 19 ||
                        event.isLeftClick() && event.getSlot() == 20 ||
                        event.isLeftClick() && event.getSlot() == 21 ||
                        event.isLeftClick() && event.getSlot() == 22 ||
                        event.isLeftClick() && event.getSlot() == 27 ||
                        event.isLeftClick() && event.getSlot() == 28 ||
                        event.isLeftClick() && event.getSlot() == 29 ||
                        event.isLeftClick() && event.getSlot() == 30 ||
                        event.isLeftClick() && event.getSlot() == 31 ||
                        event.isLeftClick() && event.getSlot() == 36 ||
                        event.isLeftClick() && event.getSlot() == 37 ||
                        event.isLeftClick() && event.getSlot() == 38 ||
                        event.isLeftClick() && event.getSlot() == 39 ||
                        event.isLeftClick() && event.getSlot() == 40) {

                    Bukkit.getServer().getScheduler().runTaskLater(Main.getPlugin(), () -> {

                        if(event.getInventory().getItem(0) != null &&
                                event.getInventory().getItem(1) != null &&
                                event.getInventory().getItem(2) != null &&
                                event.getInventory().getItem(3) != null &&
                                event.getInventory().getItem(4) != null &&
                                event.getInventory().getItem(9) != null &&
                                event.getInventory().getItem(10) != null &&
                                event.getInventory().getItem(11) != null &&
                                event.getInventory().getItem(12) != null &&
                                event.getInventory().getItem(13) != null &&
                                event.getInventory().getItem(18) != null &&
                                event.getInventory().getItem(19) != null &&
                                event.getInventory().getItem(20) != null &&
                                event.getInventory().getItem(21) != null &&
                                event.getInventory().getItem(22) != null &&
                                event.getInventory().getItem(27) != null &&
                                event.getInventory().getItem(28) != null &&
                                event.getInventory().getItem(29) != null &&
                                event.getInventory().getItem(30) != null &&
                                event.getInventory().getItem(31) != null &&
                                event.getInventory().getItem(36) != null &&
                                event.getInventory().getItem(37) != null &&
                                event.getInventory().getItem(38) != null &&
                                event.getInventory().getItem(39) != null &&
                                event.getInventory().getItem(40) != null ) {

                            if(event.getInventory().getItem(0).isSimilar(compressedEndstone) &&
                                    event.getInventory().getItem(1).isSimilar(compressedEndstone) &&
                                    event.getInventory().getItem(2).isSimilar(compressedEndstone) &&
                                    event.getInventory().getItem(3).isSimilar(compressedEndstone) &&
                                    event.getInventory().getItem(4).isSimilar(compressedEndstone) &&
                                    event.getInventory().getItem(9).isSimilar(compressedEndstone) &&
                                    event.getInventory().getItem(10).isSimilar(compressedEndstone) &&
                                    event.getInventory().getItem(11).isSimilar(compressedEndstone) &&
                                    event.getInventory().getItem(12).isSimilar(compressedEndstone) &&
                                    event.getInventory().getItem(13).isSimilar(compressedEndstone) &&
                                    event.getInventory().getItem(18).isSimilar(compressedEndstone) &&
                                    event.getInventory().getItem(19).isSimilar(compressedEndstone) &&
                                    event.getInventory().getItem(20).isSimilar(compressedEndstone) &&
                                    event.getInventory().getItem(21).isSimilar(compressedEndstone) &&
                                    event.getInventory().getItem(22).isSimilar(compressedEndstone) &&
                                    event.getInventory().getItem(27).isSimilar(compressedEndstone) &&
                                    event.getInventory().getItem(28).isSimilar(compressedEndstone) &&
                                    event.getInventory().getItem(29).isSimilar(compressedEndstone) &&
                                    event.getInventory().getItem(30).isSimilar(compressedEndstone) &&
                                    event.getInventory().getItem(31).isSimilar(compressedEndstone) &&
                                    event.getInventory().getItem(36).isSimilar(compressedEndstone) &&
                                    event.getInventory().getItem(37).isSimilar(compressedEndstone) &&
                                    event.getInventory().getItem(38).isSimilar(compressedEndstone) &&
                                    event.getInventory().getItem(39).isSimilar(compressedEndstone) &&
                                    event.getInventory().getItem(40).isSimilar(compressedEndstone)) {

                                if(event.getInventory().getItem(0).getAmount() == 64 &&
                                        event.getInventory().getItem(1).getAmount() == 64 &&
                                        event.getInventory().getItem(2).getAmount() == 64 &&
                                        event.getInventory().getItem(3).getAmount() == 64 &&
                                        event.getInventory().getItem(4).getAmount() == 64 &&
                                        event.getInventory().getItem(9).getAmount() == 64 &&
                                        event.getInventory().getItem(10).getAmount() == 64 &&
                                        event.getInventory().getItem(11).getAmount() == 64 &&
                                        event.getInventory().getItem(12).getAmount() == 64 &&
                                        event.getInventory().getItem(13).getAmount() == 64 &&
                                        event.getInventory().getItem(18).getAmount() == 64 &&
                                        event.getInventory().getItem(19).getAmount() == 64 &&
                                        event.getInventory().getItem(20).getAmount() == 64 &&
                                        event.getInventory().getItem(21).getAmount() == 64 &&
                                        event.getInventory().getItem(22).getAmount() == 64 &&
                                        event.getInventory().getItem(27).getAmount() == 64 &&
                                        event.getInventory().getItem(28).getAmount() == 64 &&
                                        event.getInventory().getItem(29).getAmount() == 64 &&
                                        event.getInventory().getItem(30).getAmount() == 64 &&
                                        event.getInventory().getItem(31).getAmount() == 64 &&
                                        event.getInventory().getItem(36).getAmount() == 64 &&
                                        event.getInventory().getItem(37).getAmount() == 64 &&
                                        event.getInventory().getItem(38).getAmount() == 64 &&
                                        event.getInventory().getItem(39).getAmount() == 64 &&
                                        event.getInventory().getItem(40).getAmount() == 64) {

                                    int resultamount = event.getInventory().getItem(25).getAmount();

                                    if(resultamount < 64) {
                                        if (event.getInventory().getItem(25).isSimilar(ItemStackFactory.getInstance().getResultBarrier())) {
                                            event.getInventory().setItem(25, ItemStackFactory.getInstance().getEndirium());
                                            ((Player) event.getView().getPlayer()).playSound(event.getView().getPlayer().getLocation(), Sound.BLOCK_FIRE_EXTINGUISH, 0.7F, 0.7F);
                                        } else if (resultamount < 64 && event.getInventory().getItem(25).isSimilar(ItemStackFactory.getInstance().getEndirium())) {
                                            event.getInventory().addItem(ItemStackFactory.getInstance().getEndirium()).put(resultamount + 1, ItemStackFactory.getInstance().getEndirium());
                                            ((Player) event.getView().getPlayer()).playSound(event.getView().getPlayer().getLocation(), Sound.BLOCK_FIRE_EXTINGUISH, 0.7F, 0.7F);
                                        } else {
                                            event.setCancelled(true);
                                        }
                                        if(event.getWhoClicked().getOpenInventory().getItem(25).isSimilar(ItemStackFactory.getInstance().getEndirium())) {

                                            int amt0 = event.getInventory().getItem(0).getAmount();
                                            event.getWhoClicked().getOpenInventory().getItem(0).setAmount(amt0 - 64);
                                            int amt1 = event.getInventory().getItem(1).getAmount();
                                            event.getWhoClicked().getOpenInventory().getItem(1).setAmount(amt1 - 64);
                                            int amt2 = event.getInventory().getItem(2).getAmount();
                                            event.getWhoClicked().getOpenInventory().getItem(2).setAmount(amt2 - 64);
                                            int amt3 = event.getInventory().getItem(3).getAmount();
                                            event.getWhoClicked().getOpenInventory().getItem(3).setAmount(amt3 - 64);
                                            int amt4 = event.getInventory().getItem(4).getAmount();
                                            event.getWhoClicked().getOpenInventory().getItem(4).setAmount(amt4 - 64);

                                            int amt9 = event.getInventory().getItem(9).getAmount();
                                            event.getWhoClicked().getOpenInventory().getItem(9).setAmount(amt9 - 64);
                                            int amt10 = event.getInventory().getItem(10).getAmount();
                                            event.getWhoClicked().getOpenInventory().getItem(10).setAmount(amt10 - 64);
                                            int amt11 = event.getInventory().getItem(11).getAmount();
                                            event.getWhoClicked().getOpenInventory().getItem(11).setAmount(amt11 - 64);
                                            int amt12 = event.getInventory().getItem(12).getAmount();
                                            event.getWhoClicked().getOpenInventory().getItem(12).setAmount(amt12 - 64);
                                            int amt13 = event.getInventory().getItem(13).getAmount();
                                            event.getWhoClicked().getOpenInventory().getItem(13).setAmount(amt13 - 64);

                                            int amt18 = event.getInventory().getItem(18).getAmount();
                                            event.getWhoClicked().getOpenInventory().getItem(18).setAmount(amt18 - 64);
                                            int amt19 = event.getInventory().getItem(19).getAmount();
                                            event.getWhoClicked().getOpenInventory().getItem(19).setAmount(amt19 - 64);
                                            int amt20 = event.getInventory().getItem(20).getAmount();
                                            event.getWhoClicked().getOpenInventory().getItem(20).setAmount(amt20 - 64);
                                            int amt21 = event.getInventory().getItem(21).getAmount();
                                            event.getWhoClicked().getOpenInventory().getItem(21).setAmount(amt21 - 64);
                                            int amt22 = event.getInventory().getItem(22).getAmount();
                                            event.getWhoClicked().getOpenInventory().getItem(22).setAmount(amt22 - 64);

                                            int amt27 = event.getInventory().getItem(27).getAmount();
                                            event.getWhoClicked().getOpenInventory().getItem(27).setAmount(amt27 - 64);
                                            int amt28 = event.getInventory().getItem(28).getAmount();
                                            event.getWhoClicked().getOpenInventory().getItem(28).setAmount(amt28 - 64);
                                            int amt29 = event.getInventory().getItem(29).getAmount();
                                            event.getWhoClicked().getOpenInventory().getItem(29).setAmount(amt29 - 64);
                                            int amt30 = event.getInventory().getItem(30).getAmount();
                                            event.getWhoClicked().getOpenInventory().getItem(30).setAmount(amt30 - 64);
                                            int amt31 = event.getInventory().getItem(31).getAmount();
                                            event.getWhoClicked().getOpenInventory().getItem(31).setAmount(amt31 - 64);

                                            int amt36 = event.getInventory().getItem(36).getAmount();
                                            event.getWhoClicked().getOpenInventory().getItem(36).setAmount(amt36 - 64);
                                            int amt37 = event.getInventory().getItem(37).getAmount();
                                            event.getWhoClicked().getOpenInventory().getItem(37).setAmount(amt37 - 64);
                                            int amt38 = event.getInventory().getItem(38).getAmount();
                                            event.getWhoClicked().getOpenInventory().getItem(38).setAmount(amt38 - 64);
                                            int amt39 = event.getInventory().getItem(39).getAmount();
                                            event.getWhoClicked().getOpenInventory().getItem(39).setAmount(amt39 - 64);
                                            int amt40 = event.getInventory().getItem(40).getAmount();
                                            event.getWhoClicked().getOpenInventory().getItem(40).setAmount(amt40 - 64);
                                        }
                                    }
                                }
                            }
                        }
                    }, 1);
                }
            }
        }
    }
}
