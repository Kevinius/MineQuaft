package de.kevinius.minequaft.inventorys.recipeInventorys.fusionQuafting;

import de.kevinius.minequaft.items.ItemStackFactory;
import de.kevinius.minequaft.main.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class XtremeQuaftingRecipeInventory {

    private Inventory xtremeQuaftingRecipeInventory;

    //recipe ingredients
    private final ItemStack diamond = new ItemStack(Material.DIAMOND);
    private final ItemStack craftingTable = new ItemStack(Material.CRAFTING_TABLE);
    private final ItemStack xtremeQuaftingTable = ItemStackFactory.getInstance().getXtremeQuaftingTable();
    private final ItemStack dragonScale = ItemStackFactory.getInstance().getDragonScale();

    //inventory items
    private final ItemStack back = ItemStackFactory.getInstance().getBack();
    private final ItemStack close = ItemStackFactory.getInstance().getClose();
    private final ItemStack fillItem = ItemStackFactory.getInstance().getFillItem();
    private final ItemStack loadBackground = ItemStackFactory.getInstance().getLoadBackground();
    private final ItemStack confirmItem = ItemStackFactory.getInstance().getConfirmItem();
    private final ItemStack quaftingBook = ItemStackFactory.getInstance().getQuaftingBook();

    public String xtremeQuaftingRecipeInventoryName = "§6Xtreme Quafting table §arecipe";

    public void xtremeQuaftingRecipeInventory(InventoryClickEvent event) {

        event.getView().getPlayer().closeInventory();
        Bukkit.getScheduler().runTaskLater(Main.getPlugin(), () -> {

            xtremeQuaftingRecipeInventory = Bukkit.createInventory(null, 9*6, xtremeQuaftingRecipeInventoryName);

            dragonScale.setAmount(1);

            //=================== 1 ====================

            xtremeQuaftingRecipeInventory.setItem(0, loadBackground);
            xtremeQuaftingRecipeInventory.setItem(1, loadBackground);
            xtremeQuaftingRecipeInventory.setItem(2, loadBackground);
            xtremeQuaftingRecipeInventory.setItem(3, loadBackground);
            xtremeQuaftingRecipeInventory.setItem(4, loadBackground);
            xtremeQuaftingRecipeInventory.setItem(5, loadBackground);
            xtremeQuaftingRecipeInventory.setItem(6, loadBackground);
            xtremeQuaftingRecipeInventory.setItem(7, loadBackground);
            xtremeQuaftingRecipeInventory.setItem(8, loadBackground);

            //==================== 2 =====================

            xtremeQuaftingRecipeInventory.setItem(9, loadBackground);
            xtremeQuaftingRecipeInventory.setItem(10, diamond);
            xtremeQuaftingRecipeInventory.setItem(11, fillItem);
            xtremeQuaftingRecipeInventory.setItem(12, fillItem);
            xtremeQuaftingRecipeInventory.setItem(13, craftingTable);
            xtremeQuaftingRecipeInventory.setItem(14, fillItem);
            xtremeQuaftingRecipeInventory.setItem(15, fillItem);
            xtremeQuaftingRecipeInventory.setItem(16, diamond);
            xtremeQuaftingRecipeInventory.setItem(17, loadBackground);

            //===================== 3 ====================

            xtremeQuaftingRecipeInventory.setItem(18, loadBackground);
            xtremeQuaftingRecipeInventory.setItem(19, dragonScale);
            xtremeQuaftingRecipeInventory.setItem(20, fillItem);
            xtremeQuaftingRecipeInventory.setItem(21, fillItem);
            xtremeQuaftingRecipeInventory.setItem(22, quaftingBook);
            xtremeQuaftingRecipeInventory.setItem(23, fillItem);
            xtremeQuaftingRecipeInventory.setItem(24, fillItem);
            xtremeQuaftingRecipeInventory.setItem(25, dragonScale);
            xtremeQuaftingRecipeInventory.setItem(26, loadBackground);

            //====================== 4 ====================

            xtremeQuaftingRecipeInventory.setItem(27, loadBackground);
            xtremeQuaftingRecipeInventory.setItem(28, dragonScale);
            xtremeQuaftingRecipeInventory.setItem(29, fillItem);
            xtremeQuaftingRecipeInventory.setItem(30, fillItem);
            xtremeQuaftingRecipeInventory.setItem(31, confirmItem);
            xtremeQuaftingRecipeInventory.setItem(32, fillItem);
            xtremeQuaftingRecipeInventory.setItem(33, fillItem);
            xtremeQuaftingRecipeInventory.setItem(34, dragonScale);
            xtremeQuaftingRecipeInventory.setItem(35, loadBackground);

            //====================== 5 ====================

            xtremeQuaftingRecipeInventory.setItem(36, loadBackground);
            xtremeQuaftingRecipeInventory.setItem(37, diamond);
            xtremeQuaftingRecipeInventory.setItem(38, fillItem);
            xtremeQuaftingRecipeInventory.setItem(39, fillItem);
            xtremeQuaftingRecipeInventory.setItem(40, xtremeQuaftingTable);
            xtremeQuaftingRecipeInventory.setItem(41, fillItem);
            xtremeQuaftingRecipeInventory.setItem(42, fillItem);
            xtremeQuaftingRecipeInventory.setItem(43, diamond);
            xtremeQuaftingRecipeInventory.setItem(44, loadBackground);

            //====================== 6 ====================

            xtremeQuaftingRecipeInventory.setItem(45, loadBackground);
            xtremeQuaftingRecipeInventory.setItem(46, loadBackground);
            xtremeQuaftingRecipeInventory.setItem(47, loadBackground);
            xtremeQuaftingRecipeInventory.setItem(48, back);
            xtremeQuaftingRecipeInventory.setItem(49, close);
            xtremeQuaftingRecipeInventory.setItem(50, loadBackground);
            xtremeQuaftingRecipeInventory.setItem(51, loadBackground);
            xtremeQuaftingRecipeInventory.setItem(52, loadBackground);
            xtremeQuaftingRecipeInventory.setItem(53, loadBackground);

            event.getView().getPlayer().openInventory(xtremeQuaftingRecipeInventory);

        }, 1);
    }
}
