package de.kevinius.minequaft.inventorys.recipeInventorys;

import de.kevinius.minequaft.items.ItemStackFactory;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.ItemStack;

public class RootClass {

    private final ItemStack fillItem = ItemStackFactory.getInstance().getFillItem();
    private final ItemStack back = ItemStackFactory.getInstance().getBack();

    public void createRoot(String inventoryTitle, InventoryClickEvent event) {

        InventoryView inventoryView = event.getView().getPlayer().getOpenInventory();
        if(inventoryView.getTitle().equalsIgnoreCase(inventoryTitle)) {
            if(event.getRawSlot() == 22) {

                /*-----------------1-----------------*/

                inventoryView.setItem(0, fillItem);
                inventoryView.setItem(1, fillItem);
                inventoryView.setItem(2, fillItem);
                inventoryView.setItem(3, fillItem);
                inventoryView.setItem(4, fillItem);
                inventoryView.setItem(5, fillItem);
                inventoryView.setItem(6, fillItem);
                inventoryView.setItem(7, fillItem);
                inventoryView.setItem(8, fillItem);

                /*-----------------2-----------------*/

                inventoryView.setItem(9, fillItem);
                inventoryView.setItem(17, fillItem);

                /*-----------------3-----------------*/

                inventoryView.setItem(18, fillItem);
                inventoryView.setItem(26, fillItem);

                /*-----------------4-----------------*/

                inventoryView.setItem(27, fillItem);
                inventoryView.setItem(35, fillItem);

                /*-----------------5-----------------*/

                inventoryView.setItem(36, fillItem);
                inventoryView.setItem(44, fillItem);

                /*-----------------6-----------------*/

                inventoryView.setItem(45, fillItem);
                inventoryView.setItem(46, fillItem);
                inventoryView.setItem(47, fillItem);
                inventoryView.setItem(48, back);
                inventoryView.setItem(49, fillItem);
                inventoryView.setItem(50, fillItem);
                inventoryView.setItem(51, fillItem);
                inventoryView.setItem(52, fillItem);
                inventoryView.setItem(53, fillItem);
            }
        }
    }
}
