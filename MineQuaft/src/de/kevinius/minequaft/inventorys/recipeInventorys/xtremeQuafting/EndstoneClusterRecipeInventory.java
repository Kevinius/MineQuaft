package de.kevinius.minequaft.inventorys.recipeInventorys.xtremeQuafting;

import de.kevinius.minequaft.items.ItemStackFactory;
import de.kevinius.minequaft.main.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class EndstoneClusterRecipeInventory {

    private Inventory endstoneClusterRecipeInventory;

    //recipe ingredients
    private final ItemStack endstone = new ItemStack(Material.END_STONE);
    private final ItemStack endstoneCluster = ItemStackFactory.getInstance().getEndstoneCluster();

    //inventory items
    private final ItemStack back = ItemStackFactory.getInstance().getBack();
    private final ItemStack close = ItemStackFactory.getInstance().getClose();
    private final ItemStack loadLightBlue = ItemStackFactory.getInstance().getLoadLightBlue();
    private final ItemStack fillItem = ItemStackFactory.getInstance().getFillItem();
    private final ItemStack loadBackground = ItemStackFactory.getInstance().getLoadBackground();
    private final ItemStack quaftingBook = ItemStackFactory.getInstance().getQuaftingBook();

    public String endstoneClusterRecipeInventoryName = "§6Endstone cluster §arecipe";

    public void endstoneClusterRecipeInventory(InventoryClickEvent event) {
        event.getView().getPlayer().closeInventory();
        Bukkit.getScheduler().runTaskLater(Main.getPlugin(), () -> {

            endstone.setAmount(64);

            endstoneClusterRecipeInventory = Bukkit.createInventory(null, 9*6, endstoneClusterRecipeInventoryName);

            //===================== 1 =====================

            endstoneClusterRecipeInventory.setItem(0, endstone);
            endstoneClusterRecipeInventory.setItem(1, endstone);
            endstoneClusterRecipeInventory.setItem(2, endstone);
            endstoneClusterRecipeInventory.setItem(3, endstone);
            endstoneClusterRecipeInventory.setItem(4, endstone);
            endstoneClusterRecipeInventory.setItem(5, loadLightBlue);
            endstoneClusterRecipeInventory.setItem(6, loadBackground);
            endstoneClusterRecipeInventory.setItem(7, loadLightBlue);
            endstoneClusterRecipeInventory.setItem(8, fillItem);

            //===================== 2 =====================

            endstoneClusterRecipeInventory.setItem(9, endstone);
            endstoneClusterRecipeInventory.setItem(10, endstone);
            endstoneClusterRecipeInventory.setItem(11, endstone);
            endstoneClusterRecipeInventory.setItem(12, endstone);
            endstoneClusterRecipeInventory.setItem(13, endstone);
            endstoneClusterRecipeInventory.setItem(14, fillItem);
            endstoneClusterRecipeInventory.setItem(15, fillItem);
            endstoneClusterRecipeInventory.setItem(16, loadBackground);
            endstoneClusterRecipeInventory.setItem(17, fillItem);

            //===================== 3 =====================

            endstoneClusterRecipeInventory.setItem(18, endstone);
            endstoneClusterRecipeInventory.setItem(19, endstone);
            endstoneClusterRecipeInventory.setItem(20, endstone);
            endstoneClusterRecipeInventory.setItem(21, endstone);
            endstoneClusterRecipeInventory.setItem(22, endstone);
            endstoneClusterRecipeInventory.setItem(23, fillItem);
            endstoneClusterRecipeInventory.setItem(24, quaftingBook);
            endstoneClusterRecipeInventory.setItem(25, endstoneCluster);
            endstoneClusterRecipeInventory.setItem(26, fillItem);

            //===================== 4 =====================

            endstoneClusterRecipeInventory.setItem(27, endstone);
            endstoneClusterRecipeInventory.setItem(28, endstone);
            endstoneClusterRecipeInventory.setItem(29, endstone);
            endstoneClusterRecipeInventory.setItem(30, endstone);
            endstoneClusterRecipeInventory.setItem(31, endstone);
            endstoneClusterRecipeInventory.setItem(32, fillItem);
            endstoneClusterRecipeInventory.setItem(33, fillItem);
            endstoneClusterRecipeInventory.setItem(34, loadBackground);
            endstoneClusterRecipeInventory.setItem(35, fillItem);

            //===================== 5 =====================

            endstoneClusterRecipeInventory.setItem(36, endstone);
            endstoneClusterRecipeInventory.setItem(37, endstone);
            endstoneClusterRecipeInventory.setItem(38, endstone);
            endstoneClusterRecipeInventory.setItem(39, endstone);
            endstoneClusterRecipeInventory.setItem(40, endstone);
            endstoneClusterRecipeInventory.setItem(41, loadLightBlue);
            endstoneClusterRecipeInventory.setItem(42, loadBackground);
            endstoneClusterRecipeInventory.setItem(43, loadLightBlue);
            endstoneClusterRecipeInventory.setItem(44, fillItem);

            //===================== 6 =====================

            endstoneClusterRecipeInventory.setItem(45, fillItem);
            endstoneClusterRecipeInventory.setItem(46, fillItem);
            endstoneClusterRecipeInventory.setItem(47, fillItem);
            endstoneClusterRecipeInventory.setItem(48, back);
            endstoneClusterRecipeInventory.setItem(49, close);
            endstoneClusterRecipeInventory.setItem(50, fillItem);
            endstoneClusterRecipeInventory.setItem(51, fillItem);
            endstoneClusterRecipeInventory.setItem(52, fillItem);
            endstoneClusterRecipeInventory.setItem(53, fillItem);

            event.getView().getPlayer().openInventory(endstoneClusterRecipeInventory);

        }, 1);
    }
}
