package de.kevinius.minequaft.recipes.xtremeQaftingRecipes;

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

public class ElytraRecipe implements Listener {

    private final int dragonScaleData = Objects.requireNonNull(ItemStackFactory.getInstance().getDragonScale().getItemMeta()).getCustomModelData();
    private final ItemStack resultBarrier = ItemStackFactory.getInstance().getResultBarrier();
    private final ItemStack phantomMembrane = new ItemStack(Material.PHANTOM_MEMBRANE);
    private final ItemStack feather = new ItemStack(Material.FEATHER);
    private final ItemStack dragonEgg = new ItemStack(Material.DRAGON_EGG);
    private final ItemStack result = new ItemStack(Material.ELYTRA);

    @EventHandler
    public void elytraResult(InventoryClickEvent event) {
        if(event.getView().getTitle().equals("§3Xtreme Quafting")) {
            if(event.isRightClick() && event.getRawSlot() < 45 || event.isLeftClick() && event.getRawSlot() < 45 || event.isShiftClick() && event.getRawSlot() > 45) {
                Bukkit.getScheduler().runTaskLater(Main.getPlugin(), () -> {
                    InventoryView playerClickInventory = event.getWhoClicked().getOpenInventory();

                    if(playerClickInventory.getItem(0) != null
                            && playerClickInventory.getItem(1) != null
                            && playerClickInventory.getItem(2) != null
                            && playerClickInventory.getItem(3) != null
                            && playerClickInventory.getItem(4) != null
                            && playerClickInventory.getItem(9) != null
                            && playerClickInventory.getItem(10) != null
                            && playerClickInventory.getItem(11) != null
                            && playerClickInventory.getItem(12) != null
                            && playerClickInventory.getItem(13) != null
                            && playerClickInventory.getItem(18) != null
                            && playerClickInventory.getItem(19) != null
                            && playerClickInventory.getItem(21) != null
                            && playerClickInventory.getItem(22) != null
                            && playerClickInventory.getItem(27) != null
                            && playerClickInventory.getItem(28) != null
                            && playerClickInventory.getItem(30) != null
                            && playerClickInventory.getItem(31) != null
                            && playerClickInventory.getItem(37) != null
                            && playerClickInventory.getItem(39) != null) {

                        if (Objects.requireNonNull(Objects.requireNonNull(playerClickInventory.getItem(0)).getItemMeta()).getCustomModelData() == dragonScaleData
                                && Objects.requireNonNull(Objects.requireNonNull(playerClickInventory.getItem(0)).getItemMeta()).getCustomModelData() == dragonScaleData
                                && Objects.requireNonNull(Objects.requireNonNull(playerClickInventory.getItem(0)).getItemMeta()).getCustomModelData() == dragonScaleData
                                && Objects.requireNonNull(Objects.requireNonNull(playerClickInventory.getItem(0)).getItemMeta()).getCustomModelData() == dragonScaleData
                                && Objects.requireNonNull(Objects.requireNonNull(playerClickInventory.getItem(0)).getItemMeta()).getCustomModelData() == dragonScaleData
                                && Objects.requireNonNull(playerClickInventory.getItem(9)).isSimilar(feather)
                                && Objects.requireNonNull(playerClickInventory.getItem(10)).isSimilar(phantomMembrane)
                                && Objects.requireNonNull(playerClickInventory.getItem(11)).isSimilar(dragonEgg)
                                && Objects.requireNonNull(playerClickInventory.getItem(12)).isSimilar(phantomMembrane)
                                && Objects.requireNonNull(playerClickInventory.getItem(13)).isSimilar(feather)
                                && Objects.requireNonNull(playerClickInventory.getItem(18)).isSimilar(feather)
                                && Objects.requireNonNull(playerClickInventory.getItem(19)).isSimilar(phantomMembrane)
                                && Objects.requireNonNull(playerClickInventory.getItem(21)).isSimilar(phantomMembrane)
                                && Objects.requireNonNull(playerClickInventory.getItem(22)).isSimilar(feather)
                                && Objects.requireNonNull(playerClickInventory.getItem(27)).isSimilar(feather)
                                && Objects.requireNonNull(playerClickInventory.getItem(28)).isSimilar(phantomMembrane)
                                && Objects.requireNonNull(playerClickInventory.getItem(30)).isSimilar(phantomMembrane)
                                && Objects.requireNonNull(playerClickInventory.getItem(31)).isSimilar(feather)
                                && Objects.requireNonNull(playerClickInventory.getItem(37)).isSimilar(phantomMembrane)
                                && Objects.requireNonNull(playerClickInventory.getItem(39)).isSimilar(phantomMembrane)) {

                            playerClickInventory.setItem(25, result);

                            if(event.getCurrentItem() != null && event.getCurrentItem().isSimilar(result) && event.getRawSlot() == 25) {
                                int amt18 = Objects.requireNonNull(playerClickInventory.getItem(18)).getAmount();
                                Objects.requireNonNull(playerClickInventory.getItem(18)).setAmount(amt18 - 1);
                                int amt19 = Objects.requireNonNull(playerClickInventory.getItem(19)).getAmount();
                                Objects.requireNonNull(playerClickInventory.getItem(19)).setAmount(amt19 - 1);
                                int amt21 = Objects.requireNonNull(playerClickInventory.getItem(21)).getAmount();
                                Objects.requireNonNull(playerClickInventory.getItem(21)).setAmount(amt21 - 1);
                                int amt22 = Objects.requireNonNull(playerClickInventory.getItem(22)).getAmount();
                                Objects.requireNonNull(playerClickInventory.getItem(22)).setAmount(amt22 - 1);

                                int amt27 = Objects.requireNonNull(playerClickInventory.getItem(27)).getAmount();
                                Objects.requireNonNull(playerClickInventory.getItem(27)).setAmount(amt27 - 1);
                                int amt28 = Objects.requireNonNull(playerClickInventory.getItem(28)).getAmount();
                                Objects.requireNonNull(playerClickInventory.getItem(28)).setAmount(amt28 - 1);
                                int amt30 = Objects.requireNonNull(playerClickInventory.getItem(30)).getAmount();
                                Objects.requireNonNull(playerClickInventory.getItem(30)).setAmount(amt30 - 1);
                                int amt31 = Objects.requireNonNull(playerClickInventory.getItem(31)).getAmount();
                                Objects.requireNonNull(playerClickInventory.getItem(31)).setAmount(amt31 - 1);
                                int amt37 = Objects.requireNonNull(playerClickInventory.getItem(37)).getAmount();
                                Objects.requireNonNull(playerClickInventory.getItem(37)).setAmount(amt37 - 1);
                                int amt39 = Objects.requireNonNull(playerClickInventory.getItem(39)).getAmount();
                                Objects.requireNonNull(playerClickInventory.getItem(39)).setAmount(amt39 - 1);
                            }

                            for(int i = 0; i < 45; i++) {
                                if(event.getCurrentItem() != null && event.getCurrentItem().isSimilar(result) && event.getRawSlot() == 25) {
                                    if(i < 5) {
                                        if(playerClickInventory.getItem(i) != null) {
                                            int amount = Objects.requireNonNull(playerClickInventory.getItem(i)).getAmount();
                                            Objects.requireNonNull(playerClickInventory.getItem(i)).setAmount(amount - 1);
                                        } else {
                                            continue;
                                        }
                                    }
                                    if(i > 8 && i < 14) {
                                        if(playerClickInventory.getItem(i) != null) {
                                            int amount = Objects.requireNonNull(playerClickInventory.getItem(i)).getAmount();
                                            Objects.requireNonNull(playerClickInventory.getItem(i)).setAmount(amount - 1);
                                        }
                                    }
                                    if(i > 41) {
                                        playerClickInventory.setItem(25, resultBarrier);
                                    }
                                }
                            }
                        }
                    } else {
                        playerClickInventory.setItem(25, resultBarrier);
                    }
                }, 1);
            }
        }
    }

    @EventHandler
    public void elytraDrag(InventoryDragEvent event) {
        if(event.getView().getTitle().equals("§3Xtreme Quafting")) {
            Bukkit.getScheduler().runTaskLater(Main.getPlugin(), () -> {
                InventoryView playerDragInventory = event.getWhoClicked().getOpenInventory();
                if(playerDragInventory.getItem(0) != null
                        && playerDragInventory.getItem(1) != null
                        && playerDragInventory.getItem(2) != null
                        && playerDragInventory.getItem(3) != null
                        && playerDragInventory.getItem(4) != null
                        && playerDragInventory.getItem(9) != null
                        && playerDragInventory.getItem(10) != null
                        && playerDragInventory.getItem(11) != null
                        && playerDragInventory.getItem(12) != null
                        && playerDragInventory.getItem(13) != null
                        && playerDragInventory.getItem(18) != null
                        && playerDragInventory.getItem(19) != null
                        && playerDragInventory.getItem(21) != null
                        && playerDragInventory.getItem(22) != null
                        && playerDragInventory.getItem(27) != null
                        && playerDragInventory.getItem(28) != null
                        && playerDragInventory.getItem(30) != null
                        && playerDragInventory.getItem(31) != null
                        && playerDragInventory.getItem(37) != null
                        && playerDragInventory.getItem(39) != null) {

                    if (Objects.requireNonNull(Objects.requireNonNull(playerDragInventory.getItem(0)).getItemMeta()).getCustomModelData() == dragonScaleData
                            && Objects.requireNonNull(Objects.requireNonNull(playerDragInventory.getItem(0)).getItemMeta()).getCustomModelData() == dragonScaleData
                            && Objects.requireNonNull(Objects.requireNonNull(playerDragInventory.getItem(0)).getItemMeta()).getCustomModelData() == dragonScaleData
                            && Objects.requireNonNull(Objects.requireNonNull(playerDragInventory.getItem(0)).getItemMeta()).getCustomModelData() == dragonScaleData
                            && Objects.requireNonNull(Objects.requireNonNull(playerDragInventory.getItem(0)).getItemMeta()).getCustomModelData() == dragonScaleData
                            && Objects.requireNonNull(playerDragInventory.getItem(9)).isSimilar(feather)
                            && Objects.requireNonNull(playerDragInventory.getItem(10)).isSimilar(phantomMembrane)
                            && Objects.requireNonNull(playerDragInventory.getItem(11)).isSimilar(dragonEgg)
                            && Objects.requireNonNull(playerDragInventory.getItem(12)).isSimilar(phantomMembrane)
                            && Objects.requireNonNull(playerDragInventory.getItem(13)).isSimilar(feather)
                            && Objects.requireNonNull(playerDragInventory.getItem(18)).isSimilar(feather)
                            && Objects.requireNonNull(playerDragInventory.getItem(19)).isSimilar(phantomMembrane)
                            && Objects.requireNonNull(playerDragInventory.getItem(21)).isSimilar(phantomMembrane)
                            && Objects.requireNonNull(playerDragInventory.getItem(22)).isSimilar(feather)
                            && Objects.requireNonNull(playerDragInventory.getItem(27)).isSimilar(feather)
                            && Objects.requireNonNull(playerDragInventory.getItem(28)).isSimilar(phantomMembrane)
                            && Objects.requireNonNull(playerDragInventory.getItem(30)).isSimilar(phantomMembrane)
                            && Objects.requireNonNull(playerDragInventory.getItem(31)).isSimilar(feather)
                            && Objects.requireNonNull(playerDragInventory.getItem(37)).isSimilar(phantomMembrane)
                            && Objects.requireNonNull(playerDragInventory.getItem(39)).isSimilar(phantomMembrane)) {

                        playerDragInventory.setItem(25, result);
                    }
                } else {
                    playerDragInventory.setItem(25, resultBarrier);
                }
            }, 1);
        }
    }
}
