package de.kevinius.minequaft.inventorys.recipeInventorys.fusionQuafting;

import de.kevinius.minequaft.items.ItemStackFactory;
import de.kevinius.minequaft.main.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class EndiriumRecipeInventory {

    Inventory endiriumrecipeInventory;

    //recipe ingredients
    private final ItemStack endirium = ItemStackFactory.getInstance().getEndirium();
    private final ItemStack endstoneCluster = ItemStackFactory.getInstance().getEndstoneCluster();
    private final ItemStack ironIngot = new ItemStack(Material.IRON_INGOT);
    private final ItemStack dragonEgg = new ItemStack(Material.DRAGON_EGG);
    private final ItemStack netherStar = new ItemStack(Material.NETHER_STAR);

    //inventory items
    private final ItemStack back = ItemStackFactory.getInstance().getBack();
    private final  ItemStack close = ItemStackFactory.getInstance().getClose();
    private final ItemStack fillItem = ItemStackFactory.getInstance().getFillItem();
    private final ItemStack loadBackground = ItemStackFactory.getInstance().getLoadBackground();
    private final ItemStack confirmItem = ItemStackFactory.getInstance().getConfirmItem();
    private final ItemStack quaftingBook = ItemStackFactory.getInstance().getQuaftingBook();

    public String endiriumRecipeInventoryName = "§6Endirium §aRecipe";

    public void endiriumRecipeInventory(InventoryClickEvent event) {

        event.getView().getPlayer().closeInventory();
        Bukkit.getScheduler().runTaskLater(Main.getPlugin(), () -> {

            endiriumrecipeInventory = Bukkit.createInventory(null, 9*6, endiriumRecipeInventoryName);

            //=================== 1 ====================

            endiriumrecipeInventory.setItem(0, loadBackground);
            endiriumrecipeInventory.setItem(1, loadBackground);
            endiriumrecipeInventory.setItem(2, loadBackground);
            endiriumrecipeInventory.setItem(3, loadBackground);
            endiriumrecipeInventory.setItem(4, loadBackground);
            endiriumrecipeInventory.setItem(5, loadBackground);
            endiriumrecipeInventory.setItem(6, loadBackground);
            endiriumrecipeInventory.setItem(7, loadBackground);
            endiriumrecipeInventory.setItem(8, loadBackground);

            //==================== 2 =====================

            endiriumrecipeInventory.setItem(9, loadBackground);
            endiriumrecipeInventory.setItem(10, endstoneCluster);
            endiriumrecipeInventory.setItem(11, fillItem);
            endiriumrecipeInventory.setItem(12, fillItem);
            endiriumrecipeInventory.setItem(13, ironIngot);
            endiriumrecipeInventory.setItem(14, fillItem);
            endiriumrecipeInventory.setItem(15, fillItem);
            endiriumrecipeInventory.setItem(16, endstoneCluster);
            endiriumrecipeInventory.setItem(17, loadBackground);

            //===================== 3 ====================

            endiriumrecipeInventory.setItem(18, loadBackground);
            endiriumrecipeInventory.setItem(19, dragonEgg);
            endiriumrecipeInventory.setItem(20, fillItem);
            endiriumrecipeInventory.setItem(21, fillItem);
            endiriumrecipeInventory.setItem(22, quaftingBook);
            endiriumrecipeInventory.setItem(23, fillItem);
            endiriumrecipeInventory.setItem(24, fillItem);
            endiriumrecipeInventory.setItem(25, dragonEgg);
            endiriumrecipeInventory.setItem(26, loadBackground);

            //====================== 4 ====================

            endiriumrecipeInventory.setItem(27, loadBackground);
            endiriumrecipeInventory.setItem(28, netherStar);
            endiriumrecipeInventory.setItem(29, fillItem);
            endiriumrecipeInventory.setItem(30, fillItem);
            endiriumrecipeInventory.setItem(31, confirmItem);
            endiriumrecipeInventory.setItem(32, fillItem);
            endiriumrecipeInventory.setItem(33, fillItem);
            endiriumrecipeInventory.setItem(34, netherStar);
            endiriumrecipeInventory.setItem(35, loadBackground);

            //====================== 5 ====================

            endiriumrecipeInventory.setItem(36, loadBackground);
            endiriumrecipeInventory.setItem(37, endstoneCluster);
            endiriumrecipeInventory.setItem(38, fillItem);
            endiriumrecipeInventory.setItem(39, fillItem);
            endiriumrecipeInventory.setItem(40, endirium);
            endiriumrecipeInventory.setItem(41, fillItem);
            endiriumrecipeInventory.setItem(42, fillItem);
            endiriumrecipeInventory.setItem(43, endstoneCluster);
            endiriumrecipeInventory.setItem(44, loadBackground);

            //====================== 6 ====================

            endiriumrecipeInventory.setItem(45, loadBackground);
            endiriumrecipeInventory.setItem(46, loadBackground);
            endiriumrecipeInventory.setItem(47, loadBackground);
            endiriumrecipeInventory.setItem(48, back);
            endiriumrecipeInventory.setItem(49, close);
            endiriumrecipeInventory.setItem(50, loadBackground);
            endiriumrecipeInventory.setItem(51, loadBackground);
            endiriumrecipeInventory.setItem(52, loadBackground);
            endiriumrecipeInventory.setItem(53, loadBackground);

            event.getView().getPlayer().openInventory(endiriumrecipeInventory);

        }, 1);
    }
}
