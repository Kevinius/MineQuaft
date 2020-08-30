package de.kevin.draconic.items;

import de.kevin.draconic.skullCreator.SkullCreator;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ItemStackFactory {

    private static ItemStackFactory instance;

    private ItemStack endirium;
    private ItemStack dragonScalePiece;
    private ItemStack dragonScale;
    private ItemStack fillItem;
    private ItemStack loadBackround;
    private ItemStack resultBarrier;
    private ItemStack confirmItem;
    private ItemStack loadPurple;
    private ItemStack loadOrange;
    private ItemStack loadLightBlue;
    private ItemStack endstoneCluster;
    private ItemStack fusionQuaftingTable;
    private ItemStack xtremeQuaftingTable;
    private ItemStack bigmoq;
    private ItemStack sushi;
    private ItemStack donut;

    private ItemStackFactory(){}

    public static ItemStackFactory getInstance(){
        if(instance == null) {
            instance = new ItemStackFactory();
        }
        return instance;
    }

    private void createEndirium() {

        endirium = new ItemStack(Material.REPEATING_COMMAND_BLOCK, 1);

        ItemMeta endiriumMeta = endirium.getItemMeta();
        assert endiriumMeta != null;
        endiriumMeta.setDisplayName("§6Endirium");
        endiriumMeta.setCustomModelData(100100);
        endirium.setItemMeta(endiriumMeta);
    }

    public ItemStack getEndirium() {
        if(endirium == null) {
            createEndirium();
        }
        return endirium;
    }

    private void createDragonScale() {

        dragonScale = new ItemStack(Material.COMMAND_BLOCK);

        ItemMeta dragonScaleMeta = dragonScale.getItemMeta();
        assert dragonScaleMeta != null;
        dragonScaleMeta.setDisplayName("§dDragon Scale");
		dragonScaleMeta.addEnchant(Enchantment.KNOCKBACK, 1, true);
		dragonScaleMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        dragonScaleMeta.setCustomModelData(100101);
        dragonScale.setItemMeta(dragonScaleMeta);

    }

    public ItemStack getDragonScale() {
        if(dragonScale == null) {
            createDragonScale();
        }
        return dragonScale;
    }

    private void createDragonScalePiece() {

        dragonScalePiece = new ItemStack(Material.CHAIN_COMMAND_BLOCK, 9);

        ItemMeta dragonScalePieceMeta = dragonScalePiece.getItemMeta();
        assert dragonScalePieceMeta != null;
        dragonScalePieceMeta.setDisplayName("§dDragon Scale Piece");
        dragonScalePieceMeta.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
        dragonScalePieceMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        dragonScalePieceMeta.setCustomModelData(100102);
        dragonScalePiece.setItemMeta(dragonScalePieceMeta);
    }

    public ItemStack getDragonScalePiece() {
        if(dragonScalePiece == null) {
            createDragonScalePiece();
        }
        return dragonScalePiece;
    }

    private void createConfirmItem() {

        confirmItem = new ItemStack(Material.GREEN_STAINED_GLASS_PANE);

        ItemMeta confirmItemMeta = confirmItem.getItemMeta();
        assert confirmItemMeta != null;
        confirmItemMeta.setDisplayName("§2Craft item!");
        confirmItemMeta.setCustomModelData(100103);
        confirmItem.setItemMeta(confirmItemMeta);

    }
    public ItemStack getConfirmItem() {
        if(confirmItem == null) {
            createConfirmItem();
        }
        return confirmItem;
    }

    private void createResultBarrier() {

        resultBarrier = new ItemStack(Material.BARRIER);

        ItemMeta resultBarrierMeta = resultBarrier.getItemMeta();
        assert resultBarrierMeta != null;
        resultBarrierMeta.setDisplayName("§4No Result!");
        resultBarrierMeta.setCustomModelData(100104);
        resultBarrier.setItemMeta(resultBarrierMeta);

    }
    public ItemStack getResultBarrier() {
        if(resultBarrier == null) {
            createResultBarrier();
        }
        return resultBarrier;
    }

    private void createFillItem() {

        fillItem = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);

        ItemMeta fillItemMeta = fillItem.getItemMeta();
        assert fillItemMeta != null;
        fillItemMeta.setDisplayName(" ");
        fillItemMeta.setCustomModelData(100105);
        fillItem.setItemMeta(fillItemMeta);

    }
    public ItemStack getFillItem() {
        if(fillItem == null) {
            createFillItem();
        }
        return fillItem;
    }

    private void createLoadBackground() {

        loadBackround = new ItemStack(Material.BLUE_STAINED_GLASS_PANE);

        ItemMeta loadBackgroundMeta = loadBackround.getItemMeta();
        assert loadBackgroundMeta != null;
        loadBackgroundMeta.setDisplayName(" ");
        loadBackgroundMeta.setCustomModelData(100106);
        loadBackround.setItemMeta(loadBackgroundMeta);

    }
    public ItemStack getLoadBackround() {
        if(loadBackround == null) {
            createLoadBackground();
        }
        return loadBackround;
    }

    private void createLoadLightBlue() {

        loadLightBlue = new ItemStack(Material.LIGHT_BLUE_STAINED_GLASS_PANE);

        ItemMeta loadLightBlueMeta = loadLightBlue.getItemMeta();
        assert loadLightBlueMeta != null;
        loadLightBlueMeta.setDisplayName(" ");
        loadLightBlueMeta.setCustomModelData(100107);
        loadLightBlue.setItemMeta(loadLightBlueMeta);

    }
    public ItemStack getLoadLightBlue() {
        if(loadLightBlue == null) {
            createLoadLightBlue();
        }
        return loadLightBlue;
    }

    private void createLoadPurple() {

        loadPurple = new ItemStack(Material.PURPLE_STAINED_GLASS_PANE);

        ItemMeta loadPurpleMeta = loadPurple.getItemMeta();
        assert loadPurpleMeta != null;
        loadPurpleMeta.setDisplayName(" ");
        loadPurpleMeta.setCustomModelData(100108);
        loadPurple.setItemMeta(loadPurpleMeta);

    }

    public ItemStack getLoadPurple() {
        if(loadPurple == null) {
            createLoadPurple();
        }
        return loadPurple;
    }

    private void createLoadOrange() {

        loadOrange = new ItemStack(Material.ORANGE_STAINED_GLASS_PANE);

        ItemMeta loadOrangeMeta = loadOrange.getItemMeta();
        assert loadOrangeMeta != null;
        loadOrangeMeta.setDisplayName(" ");
        loadOrangeMeta.setCustomModelData(100109);
        loadOrange.setItemMeta(loadOrangeMeta);

    }

    public ItemStack getLoadOrange() {
        if(loadOrange == null) {
            createLoadOrange();
        }
        return loadOrange;
    }

    private void createEndstoneCluster() {

        endstoneCluster = new ItemStack(Material.CHAIN_COMMAND_BLOCK);

        ItemMeta endstoneClusterMeta = endstoneCluster.getItemMeta();
        assert endstoneClusterMeta != null;
        endstoneClusterMeta.setDisplayName("§6Endstone cluster");
        endstoneClusterMeta.setCustomModelData(100110);
        endstoneCluster.setItemMeta(endstoneClusterMeta);

    }

    public ItemStack getEndstoneCluster() {
        if(endstoneCluster == null) {
            createEndstoneCluster();
        }
        return endstoneCluster;
    }

    private void createFusionQuaftingTable() {

        fusionQuaftingTable = new ItemStack(Material.SMOKER);

        ItemMeta fusionQuaftingTableMeta = fusionQuaftingTable.getItemMeta();
        assert fusionQuaftingTableMeta != null;
        fusionQuaftingTableMeta.setDisplayName("§fFusion Quafting Table");
        fusionQuaftingTableMeta.setCustomModelData(100111);
        fusionQuaftingTable.setItemMeta(fusionQuaftingTableMeta);

    }

    public ItemStack getFusionQuaftingTable() {
        if(fusionQuaftingTable == null) {
            createFusionQuaftingTable();
        }
        return fusionQuaftingTable;
    }

    private void createXtremeQuaftingTable() {

        xtremeQuaftingTable = new ItemStack(Material.CRAFTING_TABLE);

        ItemMeta xtremeQuaftingTableMeta = xtremeQuaftingTable.getItemMeta();
        assert xtremeQuaftingTableMeta != null;
        xtremeQuaftingTableMeta.setDisplayName("§fXtreme Quafting Table");
        xtremeQuaftingTableMeta.setCustomModelData(100112);
        xtremeQuaftingTable.setItemMeta(xtremeQuaftingTableMeta);

    }

    public ItemStack getXtremeQuaftingTable() {
        if(xtremeQuaftingTable == null) {
            createXtremeQuaftingTable();
        }
        return xtremeQuaftingTable;
    }

    private void createSushi() {
        sushi = new ItemStack(Material.COOKED_SALMON);

        ItemMeta sushiMeta = sushi.getItemMeta();
        assert sushiMeta != null;
        sushiMeta.setDisplayName("§fSushi");
        sushiMeta.setCustomModelData(100113);
        sushi.setItemMeta(sushiMeta);

    }

    public ItemStack getSushi() {
        if(sushi == null) {
            createSushi();
        }
        return sushi;
    }

    private void createBigMoq() {
        bigmoq = new ItemStack(Material.COOKED_BEEF);

        ItemMeta bigmoqMeta = bigmoq.getItemMeta();
        assert bigmoqMeta != null;
        bigmoqMeta.setDisplayName("§fBig MoQ");
        bigmoqMeta.setCustomModelData(100114);
        bigmoq.setItemMeta(bigmoqMeta);

    }

    public ItemStack getBigMoq() {
        if(bigmoq == null) {
            createBigMoq();
        }
        return bigmoq;
    }

    private void createDonut() {
        donut = new ItemStack(Material.PUMPKIN_PIE);

        ItemMeta donutMeta = donut.getItemMeta();
        assert donutMeta != null;
        donutMeta.setDisplayName("§fDonut");
        donutMeta.setCustomModelData(100115);
        donut.setItemMeta(donutMeta);

    }

    public ItemStack getDonut() {
        if(donut == null) {
            createDonut();
        }
        return donut;
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
