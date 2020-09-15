package de.kevinius.minequaft.inventorys.recipeInventorys;

import de.kevinius.minequaft.items.ItemStackFactory;
import de.kevinius.minequaft.main.Main;
import org.bukkit.Bukkit;
import org.bukkit.entity.HumanEntity;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.Objects;

public class ButtonFunctions {

    private final ItemStack back = ItemStackFactory.getInstance().getBack();
    private final ItemStack close = ItemStackFactory.getInstance().getClose();
    public void pressedButton(InventoryClickEvent event, String inventoryName, Inventory inventory) {
        HumanEntity player = event.getView().getPlayer();
        if(player.getOpenInventory().getTitle().equalsIgnoreCase(inventoryName)) {
            if(event.getCurrentItem() != null) {
                if(Objects.requireNonNull(event.getCurrentItem()).isSimilar(back)) {
                    player.closeInventory();
                    Bukkit.getScheduler().runTaskLater(Main.getPlugin(), () -> player.openInventory(inventory), 1);
                }
                if(event.getCurrentItem().isSimilar(close)) {
                    player.closeInventory();
                }
            }
        }
    }
}
