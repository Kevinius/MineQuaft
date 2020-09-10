package de.kevinius.minequaft.inventorys.recipeInventorys.fusionQuafting;

import de.kevinius.minequaft.inventorys.FusionQuaftingInventory;
import de.kevinius.minequaft.inventorys.recipeInventorys.RootClass;
import de.kevinius.minequaft.items.ItemStackFactory;
import org.bukkit.Material;
import org.bukkit.entity.HumanEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class Root implements Listener {

    private final FusionQuaftingInventory fusionQuaftingInventory = new FusionQuaftingInventory();
    private final EndiriumRecipeInventory endiriumRecipeInventory = new EndiriumRecipeInventory();
    private final XtremeQuaftingRecipeInventory xtremeQuaftingRecipeInventory = new XtremeQuaftingRecipeInventory();
    private final DragonEggRecipeInventory dragonEggRecipeInventory = new DragonEggRecipeInventory();

    private final ItemStack dragonEgg = new ItemStack(Material.DRAGON_EGG);
    private final ItemStack endirium = ItemStackFactory.getInstance().getEndirium();
    private final ItemStack xtremeQuaftingTable = ItemStackFactory.getInstance().getXtremeQuaftingTable();

    private final RootClass rootClass = new RootClass();

    @EventHandler
    private void rootInventory(InventoryClickEvent event) {
        rootClass.createRoot(fusionQuaftingInventory.fqName, event, dragonEgg, endirium, xtremeQuaftingTable);
        HumanEntity player = event.getView().getPlayer();
        if(player.getOpenInventory().getTitle().equalsIgnoreCase(rootClass.rootName)) {
            if(event.getRawSlot() == 20) {
                dragonEggRecipeInventory.dragonEggRecipeInventory(event);
            }
        }
        if(player.getOpenInventory().getTitle().equalsIgnoreCase(rootClass.rootName)) {
            if(event.getRawSlot() == 22) {
                endiriumRecipeInventory.endiriumRecipeInventory(event);
            }
        }
        if(player.getOpenInventory().getTitle().equalsIgnoreCase(rootClass.rootName)) {
            if(event.getRawSlot() == 24) {
                xtremeQuaftingRecipeInventory.xtremeQuaftingRecipeInventory(event);
            }
        }

        if(event.getView().getPlayer().getOpenInventory().getTitle().equalsIgnoreCase(dragonEggRecipeInventory.dragonEggRecipeInventoryName)) {
            event.setCancelled(true);
        }
        if(event.getView().getPlayer().getOpenInventory().getTitle().equalsIgnoreCase(endiriumRecipeInventory.endiriumRecipeInventoryName)) {
            event.setCancelled(true);
        }
        if(event.getView().getPlayer().getOpenInventory().getTitle().equalsIgnoreCase(xtremeQuaftingRecipeInventory.xtremeQuaftingRecipeInventoryName)) {
            event.setCancelled(true);
        }
        if(event.getView().getPlayer().getOpenInventory().getTitle().equalsIgnoreCase(rootClass.rootName)) {
            event.setCancelled(true);
        }
    }
}
