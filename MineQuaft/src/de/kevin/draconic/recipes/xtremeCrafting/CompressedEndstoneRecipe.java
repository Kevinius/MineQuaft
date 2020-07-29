package de.kevin.draconic.recipes.xtremeCrafting;

import de.kevin.draconic.items.ItemStackFactory;
import de.kevin.draconic.main.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Objects;

public class CompressedEndstoneRecipe implements Listener {

    ItemStack endstone = new ItemStack(Material.END_STONE);
    ItemStack compressedEndstone = ItemStackFactory.getInstance().getCompressedEndstone();
    ItemStack resultBarrier = ItemStackFactory.getInstance().getResultBarrier();
    ItemStack fillItem = ItemStackFactory.getInstance().getFillItem();
    ItemStack loadLightBlue = ItemStackFactory.getInstance().getLoadLightBlue();
    ItemStack loadBackground = ItemStackFactory.getInstance().getLoadBackround();


    @EventHandler
    public void compressedEndstoneResult(InventoryClickEvent event) {
        if(event.getView().getTitle().equals("§3Xtreme Quafting")) {
            if(event.isRightClick() && event.getRawSlot() < 45 || event.isLeftClick() && event.getRawSlot() < 45 || event.isShiftClick() && event.getRawSlot() > 45) {
                Bukkit.getScheduler().runTaskLater(Main.getPlugin(), () -> {
                    for(int i = 0; i < 45; i++) {
                        if(event.getCurrentItem() != null && event.getCurrentItem().isSimilar(compressedEndstone)
                                && event.getRawSlot() == 25) {
                            if(i == 25) {
                                event.getView().getTopInventory().setItem(25, resultBarrier);
                            }
                            if(i < 5) {
                                int amount = Objects.requireNonNull(event.getView().getTopInventory().getItem(i)).getAmount();
                                Objects.requireNonNull(event.getView().getTopInventory().getItem(i)).setAmount(amount - 64);
                            }
                            if(i > 8 && i < 14) {
                                int amount = Objects.requireNonNull(event.getView().getTopInventory().getItem(i)).getAmount();
                                Objects.requireNonNull(event.getView().getTopInventory().getItem(i)).setAmount(amount - 64);
                            }
                            if(i > 17 && i < 23) {
                                int amount = Objects.requireNonNull(event.getView().getTopInventory().getItem(i)).getAmount();
                                Objects.requireNonNull(event.getView().getTopInventory().getItem(i)).setAmount(amount - 64);
                            }
                            if(i > 27 && i < 32) {
                                int amount = Objects.requireNonNull(event.getView().getTopInventory().getItem(i)).getAmount();
                                Objects.requireNonNull(event.getView().getTopInventory().getItem(i)).setAmount(amount - 64);
                            }
                            if(i > 35 && i < 41) {
                                int amount = Objects.requireNonNull(event.getView().getTopInventory().getItem(i)).getAmount();
                                Objects.requireNonNull(event.getView().getTopInventory().getItem(i)).setAmount(amount - 64);
                            }
                        }
                    }
                }, 1);
            }
        }
    }
}


