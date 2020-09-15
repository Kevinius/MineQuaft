package de.kevinius.minequaft.inventorys.recipeInventorys.xtremeQuafting;

import de.kevinius.minequaft.inventorys.XtremeQuaftingInventory;
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

public class XtremeQuaftingRoot implements Listener {

    private final XtremeQuaftingInventory xtremeQuaftingInventory = new XtremeQuaftingInventory();
    private final ElytraRecipeInventory elytraRecipeInventory = new ElytraRecipeInventory();
    private final EndstoneClusterRecipeInventory endstoneClusterRecipeInventory = new EndstoneClusterRecipeInventory();
    private final ShulkerShellRecipeInventory shulkerShellRecipeInventory = new ShulkerShellRecipeInventory();
    private final ButtonFunctions buttonFunctions = new ButtonFunctions();

    private final ItemStack elytra = new ItemStack(Material.ELYTRA);
    private final ItemStack shulkerShell = new ItemStack(Material.SHULKER_SHELL);
    private final ItemStack endstoneCluster = ItemStackFactory.getInstance().getEndstoneCluster();

    private final RootClass rootClass = new RootClass();

    @EventHandler
    private void rootInventory(InventoryClickEvent event) {
        String rootTitle = "§6Xtreme Quafting §arecipes";
        rootClass.createRoot(xtremeQuaftingInventory.xqname, rootTitle, event, elytra, endstoneCluster, shulkerShell);
        HumanEntity player = event.getView().getPlayer();
        if(player.getOpenInventory().getTitle().equalsIgnoreCase(rootTitle)) {
            if(event.getCurrentItem() != null && Objects.requireNonNull(event.getCurrentItem()).isSimilar(elytra)) {
                elytraRecipeInventory.elytraQuaftingRecipeInventory(event);
            }
            if(event.getCurrentItem() != null && Objects.requireNonNull(event.getCurrentItem()).isSimilar(endstoneCluster)) {
                endstoneClusterRecipeInventory.endstoneClusterRecipeInventory(event);
            }
            if(event.getCurrentItem() != null && Objects.requireNonNull(event.getCurrentItem()).isSimilar(shulkerShell)) {
                shulkerShellRecipeInventory.shulkerShellRecipeInventory(event);
            }
        }

        buttonFunctions.pressedButton(event, shulkerShellRecipeInventory.shulkerShellRecipeInventoryName, rootClass.createRoot(xtremeQuaftingInventory.xqname, rootTitle, event, elytra, endstoneCluster, shulkerShell));
        buttonFunctions.pressedButton(event, endstoneClusterRecipeInventory.endstoneClusterRecipeInventoryName, rootClass.createRoot(xtremeQuaftingInventory.xqname, rootTitle, event, elytra, endstoneCluster, shulkerShell));
        buttonFunctions.pressedButton(event, elytraRecipeInventory.elytraRecipeInventoryName, rootClass.createRoot(xtremeQuaftingInventory.xqname, rootTitle, event, elytra, endstoneCluster, shulkerShell));
        if(player.getOpenInventory().getTitle().equalsIgnoreCase(rootTitle)) {
            if(event.getRawSlot() == 48) {
                player.closeInventory();
                Bukkit.getScheduler().runTaskLater(Main.getPlugin(), () -> xtremeQuaftingInventory.createXtremeCraftingInventory((Player) player), 1);
            }
            if(event.getRawSlot() == 49) {
                player.closeInventory();
            }
        }

        if(player.getOpenInventory().getTitle().equalsIgnoreCase(elytraRecipeInventory.elytraRecipeInventoryName)) {
            event.setCancelled(true);
        }
        if(player.getOpenInventory().getTitle().equalsIgnoreCase(endstoneClusterRecipeInventory.endstoneClusterRecipeInventoryName)) {
            event.setCancelled(true);
        }
        if(player.getOpenInventory().getTitle().equalsIgnoreCase(shulkerShellRecipeInventory.shulkerShellRecipeInventoryName)) {
            event.setCancelled(true);
        }
        if(player.getOpenInventory().getTitle().equalsIgnoreCase(rootTitle)) {
            event.setCancelled(true);
        }
    }
}
