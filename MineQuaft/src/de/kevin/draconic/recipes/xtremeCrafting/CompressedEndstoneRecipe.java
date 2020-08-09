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

public class CompressedEndstoneRecipe implements Listener {

    ItemStack compressedEndstone = ItemStackFactory.getInstance().getCompressedEndstone();
    ItemStack resultBarrier = ItemStackFactory.getInstance().getResultBarrier();
    ItemStack endstone = new ItemStack(Material.END_STONE);


    @EventHandler
    public void compressedEndstoneResult(InventoryClickEvent event) {
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
                    && playerInventory.getItem(20) != null
                    && playerInventory.getItem(21) != null
                    && playerInventory.getItem(22) != null
                    && playerInventory.getItem(27) != null
                    && playerInventory.getItem(28) != null
                    && playerInventory.getItem(39) != null
                    && playerInventory.getItem(30) != null
                    && playerInventory.getItem(31) != null
                    && playerInventory.getItem(36) != null
                    && playerInventory.getItem(37) != null
                    && playerInventory.getItem(38) != null
                    && playerInventory.getItem(39) != null
                    && playerInventory.getItem(40) != null) {

                        if ((Objects.requireNonNull(playerInventory.getItem(0))).getAmount() == 64
                                && (Objects.requireNonNull(playerInventory.getItem(1))).getAmount() == 64
                                && (Objects.requireNonNull(playerInventory.getItem(2))).getAmount() == 64
                                && (Objects.requireNonNull(playerInventory.getItem(3))).getAmount() == 64
                                && (Objects.requireNonNull(playerInventory.getItem(4))).getAmount() == 64
                                && Objects.requireNonNull(playerInventory.getItem(9)).getAmount() == 64
                                && Objects.requireNonNull(playerInventory.getItem(10)).getAmount() == 64
                                && Objects.requireNonNull(playerInventory.getItem(11)).getAmount() == 64
                                && Objects.requireNonNull(playerInventory.getItem(12)).getAmount() == 64
                                && Objects.requireNonNull(playerInventory.getItem(13)).getAmount() == 64
                                && Objects.requireNonNull(playerInventory.getItem(18)).getAmount() == 64
                                && Objects.requireNonNull(playerInventory.getItem(19)).getAmount() == 64
                                && Objects.requireNonNull(playerInventory.getItem(20)).getAmount() == 64
                                && Objects.requireNonNull(playerInventory.getItem(21)).getAmount() == 64
                                && Objects.requireNonNull(playerInventory.getItem(22)).getAmount() == 64
                                && Objects.requireNonNull(playerInventory.getItem(27)).getAmount() == 64
                                && Objects.requireNonNull(playerInventory.getItem(28)).getAmount() == 64
                                && Objects.requireNonNull(playerInventory.getItem(29)).getAmount() == 64
                                && Objects.requireNonNull(playerInventory.getItem(30)).getAmount() == 64
                                && Objects.requireNonNull(playerInventory.getItem(31)).getAmount() == 64
                                && Objects.requireNonNull(playerInventory.getItem(36)).getAmount() == 64
                                && Objects.requireNonNull(playerInventory.getItem(37)).getAmount() == 64
                                && Objects.requireNonNull(playerInventory.getItem(38)).getAmount() == 64
                                && Objects.requireNonNull(playerInventory.getItem(39)).getAmount() == 64
                                && Objects.requireNonNull(playerInventory.getItem(40)).getAmount() == 64) {

                            if (Objects.requireNonNull(playerInventory.getItem(0)).isSimilar(endstone)
                                    && Objects.requireNonNull(playerInventory.getItem(1)).isSimilar(endstone)
                                    && Objects.requireNonNull(playerInventory.getItem(2)).isSimilar(endstone)
                                    && Objects.requireNonNull(playerInventory.getItem(3)).isSimilar(endstone)
                                    && Objects.requireNonNull(playerInventory.getItem(4)).isSimilar(endstone)
                                    && Objects.requireNonNull(playerInventory.getItem(9)).isSimilar(endstone)
                                    && Objects.requireNonNull(playerInventory.getItem(10)).isSimilar(endstone)
                                    && Objects.requireNonNull(playerInventory.getItem(11)).isSimilar(endstone)
                                    && Objects.requireNonNull(playerInventory.getItem(12)).isSimilar(endstone)
                                    && Objects.requireNonNull(playerInventory.getItem(13)).isSimilar(endstone)
                                    && Objects.requireNonNull(playerInventory.getItem(18)).isSimilar(endstone)
                                    && Objects.requireNonNull(playerInventory.getItem(19)).isSimilar(endstone)
                                    && Objects.requireNonNull(playerInventory.getItem(20)).isSimilar(endstone)
                                    && Objects.requireNonNull(playerInventory.getItem(21)).isSimilar(endstone)
                                    && Objects.requireNonNull(playerInventory.getItem(22)).isSimilar(endstone)
                                    && Objects.requireNonNull(playerInventory.getItem(27)).isSimilar(endstone)
                                    && Objects.requireNonNull(playerInventory.getItem(28)).isSimilar(endstone)
                                    && Objects.requireNonNull(playerInventory.getItem(29)).isSimilar(endstone)
                                    && Objects.requireNonNull(playerInventory.getItem(30)).isSimilar(endstone)
                                    && Objects.requireNonNull(playerInventory.getItem(31)).isSimilar(endstone)
                                    && Objects.requireNonNull(playerInventory.getItem(36)).isSimilar(endstone)
                                    && Objects.requireNonNull(playerInventory.getItem(37)).isSimilar(endstone)
                                    && Objects.requireNonNull(playerInventory.getItem(38)).isSimilar(endstone)
                                    && Objects.requireNonNull(playerInventory.getItem(39)).isSimilar(endstone)
                                    && Objects.requireNonNull(playerInventory.getItem(40)).isSimilar(endstone)) {

                                playerInventory.setItem(25, compressedEndstone);

                                for(int i = 0; i < 45; i++) {
                                    if(event.getCurrentItem() != null && event.getCurrentItem().isSimilar(compressedEndstone)) {
                                        if(i > 26 && i < 32) {
                                            Bukkit.broadcastMessage("-4");
                                            int amount = Objects.requireNonNull(playerInventory.getItem(i)).getAmount();
                                            Objects.requireNonNull(playerInventory.getItem(i)).setAmount(amount - 64);
                                        }
                                        if(i > 35 && i < 41) {
                                            Bukkit.broadcastMessage("-5");
                                            int amount = Objects.requireNonNull(playerInventory.getItem(i)).getAmount();
                                            Objects.requireNonNull(playerInventory.getItem(i)).setAmount(amount - 64);
                                        }
                                        if(i < 5) {
                                            Bukkit.broadcastMessage("-1");
                                            int amount = Objects.requireNonNull(playerInventory.getItem(i)).getAmount();
                                            Objects.requireNonNull(playerInventory.getItem(i)).setAmount(amount - 64);
                                        }
                                        if(i > 8 && i < 14) {
                                            Bukkit.broadcastMessage("-2");
                                            int amount = Objects.requireNonNull(playerInventory.getItem(i)).getAmount();
                                            Objects.requireNonNull(playerInventory.getItem(i)).setAmount(amount - 64);
                                        }
                                        if(i > 17 && i < 23) {
                                            Bukkit.broadcastMessage("-3");
                                            int amount = Objects.requireNonNull(playerInventory.getItem(i)).getAmount();
                                            Objects.requireNonNull(playerInventory.getItem(i)).setAmount(amount - 64);
                                        }
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


