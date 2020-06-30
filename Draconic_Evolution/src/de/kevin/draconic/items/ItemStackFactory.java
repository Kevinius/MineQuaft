package de.kevin.draconic.items;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.Arrays;

public class ItemStackFactory {

    private static ItemStackFactory instance;

    private ItemStack endirium;
    private ItemStack dragonScale;
    private ItemStack dragonScalePiece;
    private ItemStack fusionTomb;
    public ItemStack fillItem;
    public ItemStack loadBackround;
    public ItemStack resultBarrier;
    public ItemStack confirmItem;
    public ItemStack loadPurple;
    public ItemStack loadOrange;
    public ItemStack loadLightBlue;

    private ItemStackFactory(){}

    public static ItemStackFactory getInstance(){
        if(instance == null) {
            instance = new ItemStackFactory();
        }
        return instance;
    }

    public ItemStack createEndirium() {

        endirium = new ItemStack(Material.REPEATING_COMMAND_BLOCK, 1);

        ItemMeta endiriumMeta = endirium.getItemMeta();
        assert endiriumMeta != null;
        endiriumMeta.setDisplayName("§6Endirium");
        endiriumMeta.setCustomModelData(12321);
        endirium.setItemMeta(endiriumMeta);
        return endirium;
    }

    public ItemStack getEndirium() {
        if(endirium == null) {
            createEndirium();
        }
        return endirium;
    }

    public ItemStack createDragonScale(int amount) {

        dragonScale = new ItemStack(Material.COMMAND_BLOCK, amount);

        ItemMeta dragonScaleMeta = dragonScale.getItemMeta();
        assert dragonScaleMeta != null;
        dragonScaleMeta.setDisplayName("§dDragon Scale");
		dragonScaleMeta.addEnchant(Enchantment.KNOCKBACK, 1, true);
		dragonScaleMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		dragonScaleMeta.setCustomModelData(123456);
		dragonScale.setItemMeta(dragonScaleMeta);

		return dragonScale;
}

    public ItemStack createCraftingTablets(Material material, String displayname, String lore) {

        ItemStack craftingTablets = new ItemStack(material);

        ItemMeta craftingTabletsMeta = craftingTablets.getItemMeta();
        if(craftingTabletsMeta != null) {
            craftingTabletsMeta.setDisplayName(displayname);
            ArrayList<String> loreList = new ArrayList<>();
            loreList.add(lore);
            craftingTabletsMeta.setLore(loreList);
            craftingTabletsMeta.setCustomModelData(32123);
        }
        craftingTablets.setItemMeta(craftingTabletsMeta);
        return craftingTablets;
    }

    public void createDragonScalePiece() {

        dragonScalePiece = new ItemStack(Material.CHAIN_COMMAND_BLOCK, 9);

        ItemMeta dragonScalePieceMeta = dragonScalePiece.getItemMeta();
        assert dragonScalePieceMeta != null;
        dragonScalePieceMeta.setDisplayName("§dDragon Scale Piece");
        dragonScalePieceMeta.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
        dragonScalePieceMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        dragonScalePieceMeta.setCustomModelData(654321);
        dragonScalePiece.setItemMeta(dragonScalePieceMeta);
    }

    public ItemStack getDragonScalePiece() {
        if(dragonScalePiece == null) {
            createDragonScalePiece();
        }
        return dragonScalePiece;
    }

    public void createFusionTomb() {

        fusionTomb = new ItemStack(Material.WRITTEN_BOOK);

        BookMeta fusionTombMeta = (BookMeta)fusionTomb.getItemMeta();
        fusionTombMeta.setTitle("Quafting guide");
        fusionTombMeta.setAuthor("§4The new Civilization");
        fusionTombMeta.setLore(Arrays.asList("§5Gives you the knowledge to craft a §6[Fusion Crafting Tablet] §5!"));
        fusionTombMeta.setDisplayName("§eQuafting guide");
        fusionTombMeta.setPages("Hallo lul §5Lila?", "Seite 2 ist das, oder?\n\nNeue Zeile?", "Seite 3, hier kommt nichts rein hehe");
        fusionTomb.setItemMeta(fusionTombMeta);
    }

    public ItemStack getFusionTomb() {
        if(fusionTomb == null) {
            createFusionTomb();
        }
        return fusionTomb;
    }

    public ItemStack createConfirmItem() {

        confirmItem = new ItemStack(Material.GREEN_STAINED_GLASS_PANE);

        ItemMeta confirmItemMeta = confirmItem.getItemMeta();
        assert confirmItemMeta != null;
        confirmItemMeta.setDisplayName("§2Craft item!");
        confirmItem.setItemMeta(confirmItemMeta);

        return confirmItem;
    }
    public ItemStack getConfirmItem() {
        if(confirmItem == null) {
            createConfirmItem();
        }
        return confirmItem;
    }

    public ItemStack createResultBarrier() {

        resultBarrier = new ItemStack(Material.BARRIER);

        ItemMeta resultBarrierMeta = resultBarrier.getItemMeta();
        assert resultBarrierMeta != null;
        resultBarrierMeta.setDisplayName("§4No Result!");
        resultBarrier.setItemMeta(resultBarrierMeta);

        return resultBarrier;
    }
    public ItemStack getResultBarrier() {
        if(resultBarrier == null) {
            createResultBarrier();
        }
        return resultBarrier;
    }

    public ItemStack createFillItem() {

        fillItem = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);

        ItemMeta fillItemMeta = fillItem.getItemMeta();
        assert fillItemMeta != null;
        fillItemMeta.setDisplayName(" ");
        fillItem.setItemMeta(fillItemMeta);

        return fillItem;
    }
    public ItemStack getFillItem() {
        if(fillItem == null) {
            createFillItem();
        }
        return fillItem;
    }

    public ItemStack createLoadBackground() {

        loadBackround = new ItemStack(Material.BLUE_STAINED_GLASS_PANE);

        ItemMeta loadBackgroundMeta = loadBackround.getItemMeta();
        assert loadBackgroundMeta != null;
        loadBackgroundMeta.setDisplayName(" ");
        loadBackround.setItemMeta(loadBackgroundMeta);

        return loadBackround;

    }
    public ItemStack getLoadBackround() {
        if(loadBackround == null) {
            createLoadBackground();
        }
        return loadBackround;
    }

    public ItemStack createLoadLightBlue() {

        loadLightBlue = new ItemStack(Material.LIGHT_BLUE_STAINED_GLASS_PANE);

        ItemMeta loadLightBlueMeta = loadLightBlue.getItemMeta();
        assert loadLightBlueMeta != null;
        loadLightBlueMeta.setDisplayName(" ");
        loadLightBlue.setItemMeta(loadLightBlueMeta);

        return loadLightBlue;

    }
    public ItemStack getLoadLightBlue() {
        if(loadLightBlue == null) {
            createLoadLightBlue();
        }
        return loadLightBlue;
    }

    public ItemStack createLoadPurple() {

        loadPurple = new ItemStack(Material.PURPLE_STAINED_GLASS_PANE);

        ItemMeta loadPurpleMeta = loadPurple.getItemMeta();
        assert loadPurpleMeta != null;
        loadPurpleMeta.setDisplayName(" ");
        loadPurple.setItemMeta(loadPurpleMeta);

        return loadPurple;

    }
    public ItemStack getLoadPurple() {
        return loadPurple;
    }

    public ItemStack createLoadOrange() {

        loadOrange = new ItemStack(Material.ORANGE_STAINED_GLASS_PANE);

        ItemMeta loadOrangeMeta = loadOrange.getItemMeta();
        assert loadOrangeMeta != null;
        loadOrangeMeta.setDisplayName(" ");
        loadOrange.setItemMeta(loadOrangeMeta);

        return loadOrange;

    }

    public ItemStack getLoadOrange() {
        return loadOrange;
    }
}
