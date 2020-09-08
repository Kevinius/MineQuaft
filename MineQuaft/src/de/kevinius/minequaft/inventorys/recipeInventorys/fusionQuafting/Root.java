package de.kevinius.minequaft.inventorys.recipeInventorys.fusionQuafting;

import de.kevinius.minequaft.inventorys.FusionQuaftingInventory;
import de.kevinius.minequaft.inventorys.recipeInventorys.RootClass;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class Root implements Listener {

    private final FusionQuaftingInventory fusionQuaftingInventory = new FusionQuaftingInventory();

    private final RootClass rootClass = new RootClass();

    @EventHandler
    private void rootInventory(InventoryClickEvent event) {
        rootClass.createRoot(fusionQuaftingInventory.fqName, event);
    }
}
