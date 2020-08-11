package de.kevin.draconic.recipes.xtremeCrafting;

import de.kevin.draconic.items.ItemStackFactory;
import de.kevin.draconic.main.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.ItemStack;

import java.util.Objects;

public class ElytraRecipe implements Listener {

    ItemStack dragonScale = ItemStackFactory.getInstance().createDragonScale(1);
    ItemStack resultBarrier = ItemStackFactory.getInstance().getResultBarrier();
    ItemStack phantomMembrane = new ItemStack(Material.PHANTOM_MEMBRANE);
    ItemStack feather = new ItemStack(Material.FEATHER);
    ItemStack dragonEgg = new ItemStack(Material.DRAGON_EGG);
    ItemStack result = new ItemStack(Material.ELYTRA);

    @EventHandler
    public void elytraResult(InventoryClickEvent event) {
        if(event.getView().getTitle().equals("§3Xtreme Quafting")) {
            if(event.isRightClick() && event.getRawSlot() < 45 || event.isLeftClick() && event.getRawSlot() < 45 || event.isShiftClick() && event.getRawSlot() > 45) {
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
                            && playerInventory.getItem(22) != null
                            && playerInventory.getItem(27) != null
                            && playerInventory.getItem(28) != null
                            && playerInventory.getItem(30) != null
                            && playerInventory.getItem(31) != null
                            && playerInventory.getItem(37) != null
                            && playerInventory.getItem(39) != null) {

                        if (Objects.requireNonNull(playerInventory.getItem(0)).isSimilar(dragonScale)
                                && Objects.requireNonNull(playerInventory.getItem(1)).isSimilar(dragonScale)
                                && Objects.requireNonNull(playerInventory.getItem(2)).isSimilar(dragonScale)
                                && Objects.requireNonNull(playerInventory.getItem(3)).isSimilar(dragonScale)
                                && Objects.requireNonNull(playerInventory.getItem(4)).isSimilar(dragonScale)
                                && Objects.requireNonNull(playerInventory.getItem(9)).isSimilar(feather)
                                && Objects.requireNonNull(playerInventory.getItem(10)).isSimilar(phantomMembrane)
                                && Objects.requireNonNull(playerInventory.getItem(11)).isSimilar(dragonEgg)
                                && Objects.requireNonNull(playerInventory.getItem(12)).isSimilar(phantomMembrane)
                                && Objects.requireNonNull(playerInventory.getItem(13)).isSimilar(feather)
                                && Objects.requireNonNull(playerInventory.getItem(18)).isSimilar(feather)
                                && Objects.requireNonNull(playerInventory.getItem(19)).isSimilar(phantomMembrane)
                                && Objects.requireNonNull(playerInventory.getItem(21)).isSimilar(phantomMembrane)
                                && Objects.requireNonNull(playerInventory.getItem(22)).isSimilar(feather)
                                && Objects.requireNonNull(playerInventory.getItem(27)).isSimilar(feather)
                                && Objects.requireNonNull(playerInventory.getItem(28)).isSimilar(phantomMembrane)
                                && Objects.requireNonNull(playerInventory.getItem(30)).isSimilar(phantomMembrane)
                                && Objects.requireNonNull(playerInventory.getItem(31)).isSimilar(feather)
                                && Objects.requireNonNull(playerInventory.getItem(37)).isSimilar(phantomMembrane)
                                && Objects.requireNonNull(playerInventory.getItem(39)).isSimilar(phantomMembrane)) {

                            playerInventory.setItem(25, result);

                            if(event.getCurrentItem() != null && event.getCurrentItem().isSimilar(result)) {
                                int amt18 = Objects.requireNonNull(playerInventory.getItem(18)).getAmount();
                                Objects.requireNonNull(playerInventory.getItem(18)).setAmount(amt18 - 1);
                                int amt19 = Objects.requireNonNull(playerInventory.getItem(19)).getAmount();
                                Objects.requireNonNull(playerInventory.getItem(19)).setAmount(amt19 - 1);
                                int amt21 = Objects.requireNonNull(playerInventory.getItem(21)).getAmount();
                                Objects.requireNonNull(playerInventory.getItem(21)).setAmount(amt21 - 1);
                                int amt22 = Objects.requireNonNull(playerInventory.getItem(22)).getAmount();
                                Objects.requireNonNull(playerInventory.getItem(22)).setAmount(amt22 - 1);

                                int amt27 = Objects.requireNonNull(playerInventory.getItem(27)).getAmount();
                                Objects.requireNonNull(playerInventory.getItem(27)).setAmount(amt27 - 1);
                                int amt28 = Objects.requireNonNull(playerInventory.getItem(28)).getAmount();
                                Objects.requireNonNull(playerInventory.getItem(28)).setAmount(amt28 - 1);
                                int amt30 = Objects.requireNonNull(playerInventory.getItem(30)).getAmount();
                                Objects.requireNonNull(playerInventory.getItem(30)).setAmount(amt30 - 1);
                                int amt31 = Objects.requireNonNull(playerInventory.getItem(31)).getAmount();
                                Objects.requireNonNull(playerInventory.getItem(31)).setAmount(amt31 - 1);
                                int amt37 = Objects.requireNonNull(playerInventory.getItem(37)).getAmount();
                                Objects.requireNonNull(playerInventory.getItem(37)).setAmount(amt37 - 1);
                                int amt39 = Objects.requireNonNull(playerInventory.getItem(39)).getAmount();
                                Objects.requireNonNull(playerInventory.getItem(39)).setAmount(amt39 - 1);
                            }

                            for(int i = 0; i < 45; i++) {
                                if(event.getCurrentItem() != null && event.getCurrentItem().isSimilar(result)) {
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
}
