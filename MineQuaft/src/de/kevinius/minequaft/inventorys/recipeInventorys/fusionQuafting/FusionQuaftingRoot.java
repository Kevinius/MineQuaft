package de.kevinius.minequaft.inventorys.recipeInventorys.fusionQuafting;

import de.kevinius.minequaft.inventorys.FusionQuaftingInventory;
import de.kevinius.minequaft.inventorys.recipeInventorys.ButtonFunctions;
import de.kevinius.minequaft.inventorys.recipeInventorys.RootClass;
import de.kevinius.minequaft.items.ItemStackFactory;
import de.kevinius.minequaft.main.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Objects;

public class FusionQuaftingRoot implements Listener {

    private final FusionQuaftingInventory fusionQuaftingInventory = new FusionQuaftingInventory();
    private final EndiriumRecipeInventory endiriumRecipeInventory = new EndiriumRecipeInventory();
    private final XtremeQuaftingRecipeInventory xtremeQuaftingRecipeInventory = new XtremeQuaftingRecipeInventory();
    private final DragonEggRecipeInventory dragonEggRecipeInventory = new DragonEggRecipeInventory();
    private final ButtonFunctions buttonFunctions = new ButtonFunctions();

    private final ItemStack dragonEgg = new ItemStack(Material.DRAGON_EGG);
    private final ItemStack endirium = ItemStackFactory.getInstance().getEndirium();
    private final ItemStack xtremeQuaftingTable = ItemStackFactory.getInstance().getXtremeQuaftingTable();

    private final RootClass rootClass = new RootClass();

    @EventHandler
    private void rootInventory(InventoryClickEvent event) {
        String rootTitle = "§6Fusion Quafting §arecipes";
        rootClass.createRoot(fusionQuaftingInventory.fqName, rootTitle, event, dragonEgg, endirium, xtremeQuaftingTable);
        HumanEntity player = event.getView().getPlayer();
        if(player.getOpenInventory().getTitle().equalsIgnoreCase(rootTitle)) {
            if(Objects.requireNonNull(event.getCurrentItem()).isSimilar(dragonEgg)) {
                dragonEggRecipeInventory.dragonEggRecipeInventory(event);
            }
        }
        if(player.getOpenInventory().getTitle().equalsIgnoreCase(rootTitle)) {
            if(Objects.requireNonNull(event.getCurrentItem()).isSimilar(endirium)) {
                endiriumRecipeInventory.endiriumRecipeInventory(event);
            }
        }
        if(player.getOpenInventory().getTitle().equalsIgnoreCase(rootTitle)) {
            if(Objects.requireNonNull(event.getCurrentItem()).isSimilar(xtremeQuaftingTable)) {
                xtremeQuaftingRecipeInventory.xtremeQuaftingRecipeInventory(event);
            }
        }

        buttonFunctions.pressedButton(event, dragonEggRecipeInventory.dragonEggRecipeInventoryName, rootClass.createRoot(fusionQuaftingInventory.fqName, rootTitle, event, dragonEgg, endirium, xtremeQuaftingTable));
        buttonFunctions.pressedButton(event, xtremeQuaftingRecipeInventory.xtremeQuaftingRecipeInventoryName,  rootClass.createRoot(fusionQuaftingInventory.fqName, rootTitle, event, dragonEgg, endirium, xtremeQuaftingTable));
        buttonFunctions.pressedButton(event, endiriumRecipeInventory.endiriumRecipeInventoryName, rootClass.createRoot(fusionQuaftingInventory.fqName, rootTitle, event, dragonEgg, endirium, xtremeQuaftingTable));
        if(player.getOpenInventory().getTitle().equalsIgnoreCase(rootTitle)) {
            if(event.getRawSlot() == 48) {
                player.closeInventory();
                Bukkit.getScheduler().runTaskLater(Main.getPlugin(), () -> fusionQuaftingInventory.createFusionCraftingInventory((Player) player), 1);
            }
            if(event.getRawSlot() == 49) {
                player.closeInventory();
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
        if(event.getView().getPlayer().getOpenInventory().getTitle().equalsIgnoreCase(rootTitle)) {
            event.setCancelled(true);
        }
    }
}
