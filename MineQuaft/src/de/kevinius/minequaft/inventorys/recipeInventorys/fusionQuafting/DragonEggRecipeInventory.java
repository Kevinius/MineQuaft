package de.kevinius.minequaft.inventorys.recipeInventorys.fusionQuafting;

import de.kevinius.minequaft.items.ItemStackFactory;
import de.kevinius.minequaft.main.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class DragonEggRecipeInventory {

    private Inventory dragonEggRecipeInventory;

    //recipe ingredients
    private final ItemStack egg = new ItemStack(Material.EGG);
    private final ItemStack dragonEgg = new ItemStack(Material.DRAGON_EGG);
    private final ItemStack dragonScale = ItemStackFactory.getInstance().getDragonScale();

    //inventory items
    private final ItemStack back = ItemStackFactory.getInstance().getBack();
    private final ItemStack close = ItemStackFactory.getInstance().getClose();
    private final ItemStack fillItem = ItemStackFactory.getInstance().getFillItem();
    private final ItemStack loadBackground = ItemStackFactory.getInstance().getLoadBackground();
    private final ItemStack confirmItem = ItemStackFactory.getInstance().getConfirmItem();
    private final ItemStack quaftingBook = ItemStackFactory.getInstance().getQuaftingBook();

    public String dragonEggRecipeInventoryName = "§6Dragon Egg §arecipe";

    public void dragonEggRecipeInventory(InventoryClickEvent event) {

        event.getView().getPlayer().closeInventory();
        Bukkit.getScheduler().runTaskLater(Main.getPlugin(), () -> {

            dragonEggRecipeInventory = Bukkit.createInventory(null, 9*6, dragonEggRecipeInventoryName);

            dragonScale.setAmount(1);

            //=================== 1 ====================

            dragonEggRecipeInventory.setItem(0, loadBackground);
            dragonEggRecipeInventory.setItem(1, loadBackground);
            dragonEggRecipeInventory.setItem(2, loadBackground);
            dragonEggRecipeInventory.setItem(3, loadBackground);
            dragonEggRecipeInventory.setItem(4, loadBackground);
            dragonEggRecipeInventory.setItem(5, loadBackground);
            dragonEggRecipeInventory.setItem(6, loadBackground);
            dragonEggRecipeInventory.setItem(7, loadBackground);
            dragonEggRecipeInventory.setItem(8, loadBackground);

            //==================== 2 =====================

            dragonEggRecipeInventory.setItem(9, loadBackground);
            dragonEggRecipeInventory.setItem(10, dragonScale);
            dragonEggRecipeInventory.setItem(11, fillItem);
            dragonEggRecipeInventory.setItem(12, fillItem);
            dragonEggRecipeInventory.setItem(13, egg);
            dragonEggRecipeInventory.setItem(14, fillItem);
            dragonEggRecipeInventory.setItem(15, fillItem);
            dragonEggRecipeInventory.setItem(16, dragonScale);
            dragonEggRecipeInventory.setItem(17, loadBackground);

            //===================== 3 ====================

            dragonEggRecipeInventory.setItem(18, loadBackground);
            dragonEggRecipeInventory.setItem(19, dragonScale);
            dragonEggRecipeInventory.setItem(20, fillItem);
            dragonEggRecipeInventory.setItem(21, fillItem);
            dragonEggRecipeInventory.setItem(22, quaftingBook);
            dragonEggRecipeInventory.setItem(23, fillItem);
            dragonEggRecipeInventory.setItem(24, fillItem);
            dragonEggRecipeInventory.setItem(25, dragonScale);
            dragonEggRecipeInventory.setItem(26, loadBackground);

            //====================== 4 ====================

            dragonEggRecipeInventory.setItem(27, loadBackground);
            dragonEggRecipeInventory.setItem(28, dragonScale);
            dragonEggRecipeInventory.setItem(29, fillItem);
            dragonEggRecipeInventory.setItem(30, fillItem);
            dragonEggRecipeInventory.setItem(31, confirmItem);
            dragonEggRecipeInventory.setItem(32, fillItem);
            dragonEggRecipeInventory.setItem(33, fillItem);
            dragonEggRecipeInventory.setItem(34, dragonScale);
            dragonEggRecipeInventory.setItem(35, loadBackground);

            //====================== 5 ====================

            dragonEggRecipeInventory.setItem(36, loadBackground);
            dragonEggRecipeInventory.setItem(37, dragonScale);
            dragonEggRecipeInventory.setItem(38, fillItem);
            dragonEggRecipeInventory.setItem(39, fillItem);
            dragonEggRecipeInventory.setItem(40, dragonEgg);
            dragonEggRecipeInventory.setItem(41, fillItem);
            dragonEggRecipeInventory.setItem(42, fillItem);
            dragonEggRecipeInventory.setItem(43, dragonScale);
            dragonEggRecipeInventory.setItem(44, loadBackground);

            //====================== 6 ====================

            dragonEggRecipeInventory.setItem(45, loadBackground);
            dragonEggRecipeInventory.setItem(46, loadBackground);
            dragonEggRecipeInventory.setItem(47, loadBackground);
            dragonEggRecipeInventory.setItem(48, back);
            dragonEggRecipeInventory.setItem(49, close);
            dragonEggRecipeInventory.setItem(50, loadBackground);
            dragonEggRecipeInventory.setItem(51, loadBackground);
            dragonEggRecipeInventory.setItem(52, loadBackground);
            dragonEggRecipeInventory.setItem(53, loadBackground);

            event.getView().getPlayer().openInventory(dragonEggRecipeInventory);

        }, 1);
    }

}
