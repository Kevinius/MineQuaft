package de.kevinius.minequaft.recipes.smithingTableRecipes.functions;

import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.ItemStack;

import java.util.Objects;

public class ResultSlot implements Listener {

    public ResultSlot(InventoryClickEvent event, ItemStack resultItem) {
        if(event.getClickedInventory() != null) {
            if(event.getClickedInventory().getType().equals(InventoryType.SMITHING)) {
                if(event.getSlotType().equals(InventoryType.SlotType.RESULT)) {
                    if(event.getCurrentItem() != null && event.getCurrentItem().isSimilar(resultItem)) {
                        event.setCancelled(true);
                        event.getWhoClicked().setItemOnCursor(resultItem);
                        Objects.requireNonNull(event.getClickedInventory().getItem(0)).setAmount(Objects.requireNonNull(event.getClickedInventory().getItem(0)).getAmount() - 1);
                        Objects.requireNonNull(event.getClickedInventory().getItem(1)).setAmount(Objects.requireNonNull(event.getClickedInventory().getItem(1)).getAmount() - 1);
                    }
                }
            }
        }
    }
}
