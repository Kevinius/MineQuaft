package de.kevinius.minequaft.items;

import de.kevinius.minequaft.skullCreator.SkullCreator;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class ItemStackFactory {

    private static ItemStackFactory instance;

    /*---------------Items---------------*/

    private ItemStack endirium;
    private ItemStack dragonScale;
    private ItemStack endstoneCluster;

    /*---------------Quafting Tables---------------*/

    private ItemStack fusionQuaftingTable;
    private ItemStack xtremeQuaftingTable;

    /*---------------Food---------------*/

    private ItemStack bigmoq;
    private ItemStack sushi;
    private ItemStack donut;
    private ItemStack chickmoq;
    private ItemStack mirrorEgg;

    /*---------------Inventory items---------------*/

    private ItemStack fillItem;
    private ItemStack loadBackround;
    private ItemStack resultBarrier;
    private ItemStack confirmItem;
    private ItemStack loadPurple;
    private ItemStack loadOrange;
    private ItemStack loadLightBlue;
    private ItemStack quaftingBook;
    private ItemStack back;
    private ItemStack close;

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
        endiriumMeta.setDisplayName("§6Endirium Ingot");
        endiriumMeta.setCustomModelData(100100);
        ArrayList<String> lore = new ArrayList<>();
        lore.add("§5Even better than Netherite D:");
        endiriumMeta.setLore(lore);
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
		ArrayList<String> lore = new ArrayList<>();
		lore.add("§5The Scales of a once powerful dragon");
		dragonScaleMeta.setLore(lore);
        dragonScale.setItemMeta(dragonScaleMeta);

    }

    public ItemStack getDragonScale() {
        if(dragonScale == null) {
            createDragonScale();
        }
        return dragonScale;
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
    public ItemStack getLoadBackground() {
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
        ArrayList<String> lore = new ArrayList<>();
        lore.add("§5Do you even have a life?");
        endstoneClusterMeta.setLore(lore);
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
        ArrayList<String> lore = new ArrayList<>();
        lore.add("§5Fuse things together :D");
        fusionQuaftingTableMeta.setLore(lore);
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
        ArrayList<String> lore = new ArrayList<>();
        lore.add("§5Big upgrade lol");
        xtremeQuaftingTableMeta.setLore(lore);
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
        ArrayList<String> lore = new ArrayList<>();
        lore.add("§5The traditional Sushi");
        lore.add(" ");
        lore.add("§aHunger: §68");
        lore.add("§aSaturation: §610.1");
        sushiMeta.setLore(lore);
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
        ArrayList<String> lore = new ArrayList<>();
        lore.add("§5Big mac MineQuaft edition :D");
        lore.add(" ");
        lore.add("§aHunger: §620");
        lore.add("§aSaturation: §620");
        bigmoqMeta.setLore(lore);
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
        ArrayList<String> lore = new ArrayList<>();
        lore.add("§5Speeeeeeeeeeeeeed");
        lore.add(" ");
        lore.add("§aHunger: §68");
        lore.add("§aSaturation: §64.8");
        lore.add(" ");
        lore.add("§eBonus Effect:");
        lore.add("§fSpeed 2 for 5 seconds");
        donutMeta.setLore(lore);
        donut.setItemMeta(donutMeta);
    }

    public ItemStack getDonut() {
        if(donut == null) {
            createDonut();
        }
        return donut;
    }

    private void createQuaftingBook() {

        quaftingBook = new ItemStack(Material.BOOK);

        ItemMeta quaftingBookMeta = quaftingBook.getItemMeta();
        assert quaftingBookMeta != null;
        quaftingBookMeta.setDisplayName("§aRecipes");
        quaftingBookMeta.setCustomModelData(100116);
        quaftingBook.setItemMeta(quaftingBookMeta);

    }
    public ItemStack getQuaftingBook() {
        if(quaftingBook == null) {
            createQuaftingBook();
        }
        return quaftingBook;
    }

    private void createBack() {

        back = new ItemStack(Material.ARROW);

        ItemMeta backMeta = back.getItemMeta();
        assert backMeta != null;
        backMeta.setDisplayName("§eback");
        backMeta.setCustomModelData(100117);
        back.setItemMeta(backMeta);

    }
    public ItemStack getBack() {
        if(back == null) {
            createBack();
        }
        return back;
    }

    private void createClose() {

        close = new ItemStack(Material.BARRIER);

        ItemMeta closeMeta = close.getItemMeta();
        assert closeMeta != null;
        closeMeta.setDisplayName("§4close");
        closeMeta.setCustomModelData(100117);
        close.setItemMeta(closeMeta);
    }

    public ItemStack getClose() {
        if(close == null) {
            createClose();
        }
        return close;
    }

    private void createChickMoq() {
        chickmoq = new ItemStack(Material.CHICKEN);

        ItemMeta chickmoqMeta = chickmoq.getItemMeta();
        assert chickmoqMeta != null;
        chickmoqMeta.setDisplayName("§fChick MoQ");
        chickmoqMeta.setCustomModelData(100118);
        ArrayList<String> lore = new ArrayList<>();
        lore.add("§5Big moq chicken edition :D");
        lore.add(" ");
        lore.add("§aHunger: §620");
        lore.add("§aSaturation: §620");
        chickmoqMeta.setLore(lore);
        chickmoq.setItemMeta(chickmoqMeta);
    }

    public ItemStack getChickmoq() {
        if(chickmoq == null) {
            createChickMoq();
        }
        return chickmoq;
    }

    private void createMirrorEgg() {
        mirrorEgg = new ItemStack(Material.COOKED_PORKCHOP);

        ItemMeta mirrorEggMeta = mirrorEgg.getItemMeta();
        assert mirrorEggMeta != null;
        mirrorEggMeta.setDisplayName("§fMirror egg");
        mirrorEggMeta.setCustomModelData(100119);
        ArrayList<String> lore = new ArrayList<>();
        lore.add("§5aka. fried egg");
        lore.add(" ");
        lore.add("§aHunger: §63");
        lore.add("§aSaturation: §64");
        mirrorEggMeta.setLore(lore);
        mirrorEgg.setItemMeta(mirrorEggMeta);
    }

    public ItemStack getMirrorEgg() {
        if(mirrorEgg == null) {
            createMirrorEgg();
        }
        return mirrorEgg;
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
