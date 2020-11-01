package de.kevinius.minequaft.inventorys.functions;

import de.kevinius.minequaft.items.ItemStackFactory;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;

public class OnCloseInventory {

    private final ItemStack fillItem = ItemStackFactory.getInstance().getFillItem();
    private final ItemStack loadBackground = ItemStackFactory.getInstance().getLoadBackground();
    private final ItemStack resultBarrier = ItemStackFactory.getInstance().getResultBarrier();
    private final ItemStack quaftingBook = ItemStackFactory.getInstance().getQuaftingBook();
    private final ItemStack loadLightBlue = ItemStackFactory.getInstance().getLoadLightBlue();
    private final ItemStack loadOrange = ItemStackFactory.getInstance().getLoadOrange();
    private final ItemStack loadPurple = ItemStackFactory.getInstance().getLoadPurple();
    private final ItemStack confirmItem = ItemStackFactory.getInstance().getConfirmItem();

    public static ArrayList playersInTable = new ArrayList();

    public void onPlayerCloseInventory(InventoryCloseEvent event, Inventory inventory) {
        playersInTable.remove(event.getPlayer().getName());
        if (event.getInventory().equals(inventory)) {
            ItemStack[] arrayOfItemStack;
            int j = (arrayOfItemStack = event.getInventory().getContents()).length;
            for (int i = 0; i < j; i++) {
                ItemStack item = arrayOfItemStack[i];
                if (item != null && !item.isSimilar(loadLightBlue)
                                 && !item.isSimilar(loadBackground)
                                 && !item.isSimilar(fillItem)
                                 && !item.isSimilar(resultBarrier)
                                 && !item.isSimilar(loadOrange)
                                 && !item.isSimilar(loadPurple)
                                 && !item.isSimilar(quaftingBook)
                                 && !item.isSimilar(confirmItem)) {
                    event.getPlayer().getWorld().dropItem(event.getPlayer().getLocation(), item);
                }
            }
        }
    }

}
