package de.kevin.draconic.items;

import de.kevin.draconic.skullBasement.SkullCreator;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class ItemStackFactory {

    private static ItemStackFactory instance;

    private ItemStack endirium;
    private ItemStack dragonScale;
    private ItemStack dragonScalePiece;
    private ItemStack fusionTomb;
    private ItemStack fillItem;
    private ItemStack loadBackround;
    private ItemStack resultBarrier;
    private ItemStack confirmItem;
    private ItemStack loadPurple;
    private ItemStack loadOrange;
    private ItemStack loadLightBlue;
    private ItemStack compressedEndstone;
    private ItemStack fusionQuaftingTable;
    private ItemStack xtremeQuaftingTable;

    private ItemStackFactory(){}

    public static ItemStackFactory getInstance(){
        if(instance == null) {
            instance = new ItemStackFactory();
        }
        return instance;
    }

    private ItemStack createEndirium() {

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

    private void createDragonScalePiece() {

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

    private void createFusionTomb() {

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

    private ItemStack createConfirmItem() {

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

    private ItemStack createResultBarrier() {

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

    private ItemStack createFillItem() {

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

    private ItemStack createLoadBackground() {

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

    private ItemStack createLoadLightBlue() {

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

    private ItemStack createLoadPurple() {

        loadPurple = new ItemStack(Material.PURPLE_STAINED_GLASS_PANE);

        ItemMeta loadPurpleMeta = loadPurple.getItemMeta();
        assert loadPurpleMeta != null;
        loadPurpleMeta.setDisplayName(" ");
        loadPurple.setItemMeta(loadPurpleMeta);

        return loadPurple;
    }

    public ItemStack getLoadPurple() {
        if(loadPurple == null) {
            createLoadPurple();
        }
        return loadPurple;
    }

    private ItemStack createLoadOrange() {

        loadOrange = new ItemStack(Material.ORANGE_STAINED_GLASS_PANE);

        ItemMeta loadOrangeMeta = loadOrange.getItemMeta();
        assert loadOrangeMeta != null;
        loadOrangeMeta.setDisplayName(" ");
        loadOrange.setItemMeta(loadOrangeMeta);

        return loadOrange;
    }

    public ItemStack getLoadOrange() {
        if(loadOrange == null) {
            createLoadPurple();
        }
        return loadOrange;
    }

    private ItemStack createCompressedEndstone() {

        compressedEndstone = new ItemStack(Material.CHAIN_COMMAND_BLOCK);

        ItemMeta compressedEndstoneItemMeta = compressedEndstone.getItemMeta();
        assert compressedEndstoneItemMeta != null;
        compressedEndstoneItemMeta.setDisplayName("§6compressed Endstone");
        compressedEndstone.setItemMeta(compressedEndstoneItemMeta);

        return compressedEndstone;

    }

    public ItemStack getCompressedEndstone() {
        if(compressedEndstone == null) {
            createCompressedEndstone();
        }
        return compressedEndstone;
    }

    private ItemStack createFusionQuaftingTable() {

        fusionQuaftingTable = new ItemStack(Material.SMOKER);

        ItemMeta fusionQuaftingTableMeta = fusionQuaftingTable.getItemMeta();
        fusionQuaftingTableMeta.setDisplayName("§fFusion Quafting Table");
        fusionQuaftingTable.setItemMeta(fusionQuaftingTableMeta);

        return fusionQuaftingTable;
    }

    public ItemStack getFusionQuaftingTable() {
        if(fusionQuaftingTable == null) {
            createFusionQuaftingTable();
        }
        return fusionQuaftingTable;
    }

    private ItemStack createXtremeQuaftingTable() {

        xtremeQuaftingTable = new ItemStack(Material.CRAFTING_TABLE);

        ItemMeta xtremeQuaftingTableMeta = xtremeQuaftingTable.getItemMeta();
        xtremeQuaftingTableMeta.setDisplayName("§fXtreme Quafting Table");
        xtremeQuaftingTable.setItemMeta(xtremeQuaftingTableMeta);

        return xtremeQuaftingTable;
    }

    public ItemStack getXtremeQuaftingTable() {
        if(xtremeQuaftingTable == null) {
            createXtremeQuaftingTable();
        }
        return xtremeQuaftingTable;
    }

    public ItemStack getLanternRed() {

        String base64 = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODg0OGIzMzNlMTQ3M2I5NTU3MTgyZDQ3NWI0ODZhYTc5YTA1ZTk0ZWJkMGE1MDEwMmQ3ODc3NjIzNjc5YWE2YyJ9fX0=";

        return SkullCreator.itemFromBase64(base64);
    }

    public ItemStack getLanternBlue() {

        String base64 = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzE4ODViOTE4MTA0ZTZhYTYyYjZlYzliOGU4MjAyOGRkOWRhN2QyYWNkZmU5YzIxNTVlZGQzOTIyODViNTdlMSJ9fX0=";

        return SkullCreator.itemFromBase64(base64);
    }
}
