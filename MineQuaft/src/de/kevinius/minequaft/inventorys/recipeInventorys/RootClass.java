package de.kevinius.minequaft.inventorys.recipeInventorys;

import de.kevinius.minequaft.items.ItemStackFactory;
import de.kevinius.minequaft.main.Main;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.ItemStack;

public class RootClass implements Listener {

    Inventory rootInventory;

    private final ItemStack fillItem = ItemStackFactory.getInstance().getFillItem();
    private final ItemStack back = ItemStackFactory.getInstance().getBack();
    private final ItemStack close = ItemStackFactory.getInstance().getClose();

    public String rootName = "§aRecipes";

    public void createRoot(String inventoryTitle, InventoryClickEvent event, ItemStack item1, ItemStack item2, ItemStack item3) {

        InventoryView inventoryView = event.getView().getPlayer().getOpenInventory();
        if(inventoryView.getTitle().equalsIgnoreCase(inventoryTitle)) {
            if(event.getRawSlot() == 22) {
                event.getView().getPlayer().closeInventory();
                Bukkit.getScheduler().runTaskLater(Main.getPlugin(), () -> {

                    rootInventory = Bukkit.createInventory(null, 9*6, rootName);

                    /*-----------------1-----------------*/

                    rootInventory.setItem(0, fillItem);
                    rootInventory.setItem(1, fillItem);
                    rootInventory.setItem(2, fillItem);
                    rootInventory.setItem(3, fillItem);
                    rootInventory.setItem(4, fillItem);
                    rootInventory.setItem(5, fillItem);
                    rootInventory.setItem(6, fillItem);
                    rootInventory.setItem(7, fillItem);
                    rootInventory.setItem(8, fillItem);

                    /*-----------------2-----------------*/

                    rootInventory.setItem(9, fillItem);
                    rootInventory.setItem(10, fillItem);
                    rootInventory.setItem(11, fillItem);
                    rootInventory.setItem(12, fillItem);
                    rootInventory.setItem(13, fillItem);
                    rootInventory.setItem(14, fillItem);
                    rootInventory.setItem(15, fillItem);
                    rootInventory.setItem(16, fillItem);
                    rootInventory.setItem(17, fillItem);

                    /*-----------------3-----------------*/

                    rootInventory.setItem(18, fillItem);
                    rootInventory.setItem(19, fillItem);
                    rootInventory.setItem(20, item1);
                    rootInventory.setItem(21, fillItem);
                    rootInventory.setItem(22, item2);
                    rootInventory.setItem(23, fillItem);
                    rootInventory.setItem(24, item3);
                    rootInventory.setItem(25, fillItem);
                    rootInventory.setItem(26, fillItem);

                    /*-----------------4-----------------*/

                    rootInventory.setItem(27, fillItem);
                    rootInventory.setItem(28, fillItem);
                    rootInventory.setItem(29, fillItem);
                    rootInventory.setItem(30, fillItem);
                    rootInventory.setItem(31, fillItem);
                    rootInventory.setItem(32, fillItem);
                    rootInventory.setItem(33, fillItem);
                    rootInventory.setItem(34, fillItem);
                    rootInventory.setItem(35, fillItem);

                    /*-----------------5-----------------*/

                    rootInventory.setItem(36, fillItem);
                    rootInventory.setItem(37, fillItem);
                    rootInventory.setItem(38, fillItem);
                    rootInventory.setItem(39, fillItem);
                    rootInventory.setItem(40, fillItem);
                    rootInventory.setItem(41, fillItem);
                    rootInventory.setItem(42, fillItem);
                    rootInventory.setItem(43, fillItem);
                    rootInventory.setItem(44, fillItem);

                    /*-----------------6-----------------*/

                    rootInventory.setItem(45, fillItem);
                    rootInventory.setItem(46, fillItem);
                    rootInventory.setItem(47, fillItem);
                    rootInventory.setItem(48, back);
                    rootInventory.setItem(49, close);
                    rootInventory.setItem(50, fillItem);
                    rootInventory.setItem(51, fillItem);
                    rootInventory.setItem(52, fillItem);
                    rootInventory.setItem(53, fillItem);

                    event.getView().getPlayer().openInventory(rootInventory);
                }, 1);
            }
        }
    }
}
