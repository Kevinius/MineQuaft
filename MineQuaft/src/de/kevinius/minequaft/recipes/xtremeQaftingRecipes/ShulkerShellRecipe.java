package de.kevinius.minequaft.recipes.xtremeQaftingRecipes;

import de.kevinius.minequaft.inventorys.XtremeQuaftingInventory;
import de.kevinius.minequaft.items.ItemStackFactory;
import de.kevinius.minequaft.main.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.ItemStack;

import java.util.Objects;

public class ShulkerShellRecipe implements Listener {

    private final int dragonScaleData = Objects.requireNonNull(ItemStackFactory.getInstance().getDragonScale().getItemMeta()).getCustomModelData();
    private final ItemStack quaftingBook = ItemStackFactory.getInstance().getQuaftingBook();
    private final ItemStack resultBarrier = ItemStackFactory.getInstance().getResultBarrier();
    private final ItemStack chorusFruit = new ItemStack(Material.CHORUS_FRUIT);
    private final ItemStack blazeRod = new ItemStack(Material.BLAZE_ROD);
    private final ItemStack result = new ItemStack(Material.SHULKER_SHELL);

    private final XtremeQuaftingInventory xtremeQuaftingInventory = new XtremeQuaftingInventory();

    @EventHandler
    public void shulkerShellResult(InventoryClickEvent event) {
        InventoryView playerInventory = event.getWhoClicked().getOpenInventory();
        if(event.getView().getTitle().equals(xtremeQuaftingInventory.xqname)) {
            if(event.isRightClick() && event.getRawSlot() < 45
            || event.isLeftClick() && event.getRawSlot() < 45
            || event.isShiftClick() && event.getRawSlot() > 45) {
                if(event.getCurrentItem() != null) {
                    if(Objects.requireNonNull(event.getCurrentItem()).isSimilar(quaftingBook)) {
                        return;
                    }
                }
                Bukkit.getScheduler().runTaskLater(Main.getPlugin(), () -> {

                    if(playerInventory.getItem(0) != null
                            && playerInventory.getItem(1) != null
                            && playerInventory.getItem(2) != null
                            && playerInventory.getItem(3) != null
                            && playerInventory.getItem(4) != null
                            && playerInventory.getItem(9) != null
                            && playerInventory.getItem(10) != null
                            && playerInventory.getItem(11) != null
                            && playerInventory.getItem(12) != null
                            && playerInventory.getItem(13) != null
                            && playerInventory.getItem(18) != null
                            && playerInventory.getItem(19) != null
                            && playerInventory.getItem(21) != null
                            && playerInventory.getItem(22) != null) {

                        if (Objects.requireNonNull(Objects.requireNonNull(playerInventory.getItem(0)).getItemMeta()).getCustomModelData() == dragonScaleData
                                && Objects.requireNonNull(playerInventory.getItem(1)).isSimilar(blazeRod)
                                && Objects.requireNonNull(playerInventory.getItem(2)).isSimilar(blazeRod)
                                && Objects.requireNonNull(playerInventory.getItem(3)).isSimilar(blazeRod)
                                && Objects.requireNonNull(Objects.requireNonNull(playerInventory.getItem(4)).getItemMeta()).getCustomModelData() == dragonScaleData
                                && Objects.requireNonNull(playerInventory.getItem(9)).isSimilar(blazeRod)
                                && Objects.requireNonNull(playerInventory.getItem(10)).isSimilar(chorusFruit)
                                && Objects.requireNonNull(playerInventory.getItem(11)).isSimilar(chorusFruit)
                                && Objects.requireNonNull(playerInventory.getItem(12)).isSimilar(chorusFruit)
                                && Objects.requireNonNull(playerInventory.getItem(13)).isSimilar(blazeRod)
                                && Objects.requireNonNull(playerInventory.getItem(18)).isSimilar(blazeRod)
                                && Objects.requireNonNull(playerInventory.getItem(19)).isSimilar(chorusFruit)
                                && Objects.requireNonNull(playerInventory.getItem(21)).isSimilar(chorusFruit)
                                && Objects.requireNonNull(playerInventory.getItem(22)).isSimilar(blazeRod)) {

                            playerInventory.setItem(25, result);

                            if(event.getCurrentItem() != null && event.getCurrentItem().isSimilar(result) && event.getRawSlot() == 25) {
                                int amt18 = Objects.requireNonNull(playerInventory.getItem(18)).getAmount();
                                Objects.requireNonNull(playerInventory.getItem(18)).setAmount(amt18 - 1);
                                int amt19 = Objects.requireNonNull(playerInventory.getItem(19)).getAmount();
                                Objects.requireNonNull(playerInventory.getItem(19)).setAmount(amt19 - 1);
                                int amt21 = Objects.requireNonNull(playerInventory.getItem(21)).getAmount();
                                Objects.requireNonNull(playerInventory.getItem(21)).setAmount(amt21 - 1);
                                int amt22 = Objects.requireNonNull(playerInventory.getItem(22)).getAmount();
                                Objects.requireNonNull(playerInventory.getItem(22)).setAmount(amt22 - 1);
                            }

                            for(int i = 0; i < 45; i++) {
                                if(event.getCurrentItem() != null && event.getCurrentItem().isSimilar(result) && event.getRawSlot() == 25) {
                                    if(i < 5) {
                                        if(playerInventory.getItem(i) != null) {
                                            int amount = Objects.requireNonNull(playerInventory.getItem(i)).getAmount();
                                            Objects.requireNonNull(playerInventory.getItem(i)).setAmount(amount - 1);
                                        } else {
                                            continue;
                                        }
                                    }
                                    if(i > 8 && i < 14) {
                                        if(playerInventory.getItem(i) != null) {
                                            int amount = Objects.requireNonNull(playerInventory.getItem(i)).getAmount();
                                            Objects.requireNonNull(playerInventory.getItem(i)).setAmount(amount - 1);
                                        }
                                    }
                                    if(i > 41) {
                                        playerInventory.setItem(25, resultBarrier);
                                    }
                                }
                            }
                        }
                    } else {
                        playerInventory.setItem(25, resultBarrier);
                    }
                }, 1);
            }
        }
    }

    @EventHandler
    public void shulkerShellDrag(InventoryDragEvent event) {
        if(event.getView().getTitle().equals("§3Xtreme Quafting")) {
            Bukkit.getScheduler().runTaskLater(Main.getPlugin(), () -> {
                InventoryView playerInventory = event.getWhoClicked().getOpenInventory();

                if(playerInventory.getItem(0) != null
                        && playerInventory.getItem(1) != null
                        && playerInventory.getItem(2) != null
                        && playerInventory.getItem(3) != null
                        && playerInventory.getItem(4) != null
                        && playerInventory.getItem(9) != null
                        && playerInventory.getItem(10) != null
                        && playerInventory.getItem(11) != null
                        && playerInventory.getItem(12) != null
                        && playerInventory.getItem(13) != null
                        && playerInventory.getItem(18) != null
                        && playerInventory.getItem(19) != null
                        && playerInventory.getItem(21) != null
                        && playerInventory.getItem(22) != null) {

                    if (Objects.requireNonNull(Objects.requireNonNull(playerInventory.getItem(0)).getItemMeta()).getCustomModelData() == dragonScaleData
                            && Objects.requireNonNull(playerInventory.getItem(1)).isSimilar(blazeRod)
                            && Objects.requireNonNull(playerInventory.getItem(2)).isSimilar(blazeRod)
                            && Objects.requireNonNull(playerInventory.getItem(3)).isSimilar(blazeRod)
                            && Objects.requireNonNull(Objects.requireNonNull(playerInventory.getItem(0)).getItemMeta()).getCustomModelData() == dragonScaleData
                            && Objects.requireNonNull(playerInventory.getItem(9)).isSimilar(blazeRod)
                            && Objects.requireNonNull(playerInventory.getItem(10)).isSimilar(chorusFruit)
                            && Objects.requireNonNull(playerInventory.getItem(11)).isSimilar(chorusFruit)
                            && Objects.requireNonNull(playerInventory.getItem(12)).isSimilar(chorusFruit)
                            && Objects.requireNonNull(playerInventory.getItem(13)).isSimilar(blazeRod)
                            && Objects.requireNonNull(playerInventory.getItem(18)).isSimilar(blazeRod)
                            && Objects.requireNonNull(playerInventory.getItem(19)).isSimilar(chorusFruit)
                            && Objects.requireNonNull(playerInventory.getItem(21)).isSimilar(chorusFruit)
                            && Objects.requireNonNull(playerInventory.getItem(22)).isSimilar(blazeRod)) {

                        playerInventory.setItem(25, result);
                    }
                } else {
                    playerInventory.setItem(25, resultBarrier);
                }
            }, 1);
        }
    }
}
