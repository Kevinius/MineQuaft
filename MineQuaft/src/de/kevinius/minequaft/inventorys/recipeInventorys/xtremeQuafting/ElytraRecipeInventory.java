package de.kevinius.minequaft.inventorys.recipeInventorys.xtremeQuafting;

import de.kevinius.minequaft.items.ItemStackFactory;
import de.kevinius.minequaft.main.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class ElytraRecipeInventory {

    private Inventory elytraRecipeInventory;

    //recipe ingredients
    private final ItemStack feather = new ItemStack(Material.FEATHER);
    private final ItemStack phantomMembrane = new ItemStack(Material.PHANTOM_MEMBRANE);
    private final ItemStack dragonEgg = new ItemStack(Material.DRAGON_EGG);
    private final ItemStack elytra = new ItemStack(Material.ELYTRA);
    private final ItemStack dragonScale = ItemStackFactory.getInstance().getDragonScale();

    //inventory items
    private final ItemStack back = ItemStackFactory.getInstance().getBack();
    private final ItemStack close = ItemStackFactory.getInstance().getClose();
    private final ItemStack loadLightBlue = ItemStackFactory.getInstance().getLoadLightBlue();
    private final ItemStack fillItem = ItemStackFactory.getInstance().getFillItem();
    private final ItemStack loadBackground = ItemStackFactory.getInstance().getLoadBackground();
    private final ItemStack quaftingBook = ItemStackFactory.getInstance().getQuaftingBook();

    public String elytraRecipeInventoryName = "§6Elytra §arecipe";

    public void elytraQuaftingRecipeInventory(InventoryClickEvent event) {
        event.getView().getPlayer().closeInventory();
        Bukkit.getScheduler().runTaskLater(Main.getPlugin(), () -> {

            elytraRecipeInventory = Bukkit.createInventory(null, 9*6, elytraRecipeInventoryName);

            dragonScale.setAmount(1);

            //===================== 1 =====================

            elytraRecipeInventory.setItem(0, dragonScale);
            elytraRecipeInventory.setItem(1, dragonScale);
            elytraRecipeInventory.setItem(2, dragonScale);
            elytraRecipeInventory.setItem(3, dragonScale);
            elytraRecipeInventory.setItem(4, dragonScale);
            elytraRecipeInventory.setItem(5, loadLightBlue);
            elytraRecipeInventory.setItem(6, loadBackground);
            elytraRecipeInventory.setItem(7, loadLightBlue);
            elytraRecipeInventory.setItem(8, fillItem);

            //===================== 2 =====================

            elytraRecipeInventory.setItem(9, feather);
            elytraRecipeInventory.setItem(10, phantomMembrane);
            elytraRecipeInventory.setItem(11, dragonEgg);
            elytraRecipeInventory.setItem(12, phantomMembrane);
            elytraRecipeInventory.setItem(13, feather);
            elytraRecipeInventory.setItem(14, fillItem);
            elytraRecipeInventory.setItem(15, fillItem);
            elytraRecipeInventory.setItem(16, loadBackground);
            elytraRecipeInventory.setItem(17, fillItem);

            //===================== 3 =====================

            elytraRecipeInventory.setItem(18, feather);
            elytraRecipeInventory.setItem(19, phantomMembrane);

            elytraRecipeInventory.setItem(21, phantomMembrane);
            elytraRecipeInventory.setItem(22, feather);
            elytraRecipeInventory.setItem(23, fillItem);
            elytraRecipeInventory.setItem(24, quaftingBook);
            elytraRecipeInventory.setItem(25, elytra);
            elytraRecipeInventory.setItem(26, fillItem);

            //===================== 4 =====================

            elytraRecipeInventory.setItem(27, feather);
            elytraRecipeInventory.setItem(28, phantomMembrane);

            elytraRecipeInventory.setItem(30, phantomMembrane);
            elytraRecipeInventory.setItem(31, feather);
            elytraRecipeInventory.setItem(32, fillItem);
            elytraRecipeInventory.setItem(33, fillItem);
            elytraRecipeInventory.setItem(34, loadBackground);
            elytraRecipeInventory.setItem(35, fillItem);

            //===================== 5 =====================

            elytraRecipeInventory.setItem(37, phantomMembrane);

            elytraRecipeInventory.setItem(39, phantomMembrane);

            elytraRecipeInventory.setItem(41, loadLightBlue);
            elytraRecipeInventory.setItem(42, loadBackground);
            elytraRecipeInventory.setItem(43, loadLightBlue);
            elytraRecipeInventory.setItem(44, fillItem);

            //===================== 6 =====================

            elytraRecipeInventory.setItem(45, fillItem);
            elytraRecipeInventory.setItem(46, fillItem);
            elytraRecipeInventory.setItem(47, fillItem);
            elytraRecipeInventory.setItem(48, back);
            elytraRecipeInventory.setItem(49, close);
            elytraRecipeInventory.setItem(50, fillItem);
            elytraRecipeInventory.setItem(51, fillItem);
            elytraRecipeInventory.setItem(52, fillItem);
            elytraRecipeInventory.setItem(53, fillItem);

            event.getView().getPlayer().openInventory(elytraRecipeInventory);

        }, 1);
    }
}
