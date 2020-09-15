package de.kevinius.minequaft.inventorys.recipeInventorys.xtremeQuafting;

import de.kevinius.minequaft.items.ItemStackFactory;
import de.kevinius.minequaft.main.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class ShulkerShellRecipeInventory {

    private Inventory shulkerShellRecipeInventory;

    //recipe ingredients
    private final ItemStack blazerod = new ItemStack(Material.BLAZE_ROD);
    private final ItemStack chorusfruit = new ItemStack(Material.CHORUS_FRUIT);
    private final ItemStack shulkerShell = new ItemStack(Material.SHULKER_SHELL);
    private final ItemStack dragonScale = ItemStackFactory.getInstance().getDragonScale();

    //inventory items
    private final ItemStack back = ItemStackFactory.getInstance().getBack();
    private final ItemStack close = ItemStackFactory.getInstance().getClose();
    private final ItemStack loadLightBlue = ItemStackFactory.getInstance().getLoadLightBlue();
    private final ItemStack fillItem = ItemStackFactory.getInstance().getFillItem();
    private final ItemStack loadBackground = ItemStackFactory.getInstance().getLoadBackground();
    private final ItemStack quaftingBook = ItemStackFactory.getInstance().getQuaftingBook();

    public String shulkerShellRecipeInventoryName = "§Shulker shell §arecipe";

    public void shulkerShellRecipeInventory(InventoryClickEvent event) {
        event.getView().getPlayer().closeInventory();
        Bukkit.getScheduler().runTaskLater(Main.getPlugin(), () -> {

            dragonScale.setAmount(1);

            shulkerShellRecipeInventory = Bukkit.createInventory(null, 9*6, shulkerShellRecipeInventoryName);

            //===================== 1 =====================

            shulkerShellRecipeInventory.setItem(0, dragonScale);
            shulkerShellRecipeInventory.setItem(1, blazerod);
            shulkerShellRecipeInventory.setItem(2, blazerod);
            shulkerShellRecipeInventory.setItem(3, blazerod);
            shulkerShellRecipeInventory.setItem(4, dragonScale);
            shulkerShellRecipeInventory.setItem(5, loadLightBlue);
            shulkerShellRecipeInventory.setItem(6, loadBackground);
            shulkerShellRecipeInventory.setItem(7, loadLightBlue);
            shulkerShellRecipeInventory.setItem(8, fillItem);

            //===================== 2 =====================

            shulkerShellRecipeInventory.setItem(9, blazerod);
            shulkerShellRecipeInventory.setItem(10, chorusfruit);
            shulkerShellRecipeInventory.setItem(11, chorusfruit);
            shulkerShellRecipeInventory.setItem(12, chorusfruit);
            shulkerShellRecipeInventory.setItem(13, blazerod);
            shulkerShellRecipeInventory.setItem(14, fillItem);
            shulkerShellRecipeInventory.setItem(15, fillItem);
            shulkerShellRecipeInventory.setItem(16, loadBackground);
            shulkerShellRecipeInventory.setItem(17, fillItem);

            //===================== 3 =====================

            shulkerShellRecipeInventory.setItem(18, blazerod);
            shulkerShellRecipeInventory.setItem(19, chorusfruit);

            shulkerShellRecipeInventory.setItem(21, chorusfruit);
            shulkerShellRecipeInventory.setItem(22, blazerod);
            shulkerShellRecipeInventory.setItem(23, fillItem);
            shulkerShellRecipeInventory.setItem(24, quaftingBook);
            shulkerShellRecipeInventory.setItem(25, shulkerShell);
            shulkerShellRecipeInventory.setItem(26, fillItem);

            //===================== 4 =====================

            shulkerShellRecipeInventory.setItem(32, fillItem);
            shulkerShellRecipeInventory.setItem(33, fillItem);
            shulkerShellRecipeInventory.setItem(34, loadBackground);
            shulkerShellRecipeInventory.setItem(35, fillItem);

            //===================== 5 =====================

            shulkerShellRecipeInventory.setItem(41, loadLightBlue);
            shulkerShellRecipeInventory.setItem(42, loadBackground);
            shulkerShellRecipeInventory.setItem(43, loadLightBlue);
            shulkerShellRecipeInventory.setItem(44, fillItem);

            //===================== 6 =====================

            shulkerShellRecipeInventory.setItem(45, fillItem);
            shulkerShellRecipeInventory.setItem(46, fillItem);
            shulkerShellRecipeInventory.setItem(47, fillItem);
            shulkerShellRecipeInventory.setItem(48, back);
            shulkerShellRecipeInventory.setItem(49, close);
            shulkerShellRecipeInventory.setItem(50, fillItem);
            shulkerShellRecipeInventory.setItem(51, fillItem);
            shulkerShellRecipeInventory.setItem(52, fillItem);
            shulkerShellRecipeInventory.setItem(53, fillItem);

            event.getView().getPlayer().openInventory(shulkerShellRecipeInventory);

        }, 1);
    }
}
