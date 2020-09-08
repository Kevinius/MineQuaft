package de.kevinius.minequaft.inventorys;

import de.kevinius.minequaft.inventorys.functions.NoTakingItems;
import de.kevinius.minequaft.inventorys.functions.OnCloseInventory;
import de.kevinius.minequaft.items.ItemStackFactory;
import de.kevinius.minequaft.main.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.List;
import java.util.Objects;

public class XtremeQuaftingInventory implements Listener {

    public Inventory xtremeQuaftingInventory;

    private final ItemStack loadLightBlue = ItemStackFactory.getInstance().getLoadLightBlue();
    private final ItemStack loadBackground = ItemStackFactory.getInstance().getLoadBackground();
    private final ItemStack fillItem = ItemStackFactory.getInstance().getFillItem();
    private final ItemStack resultBarrier = ItemStackFactory.getInstance().getResultBarrier();
    private final ItemStack quaftingBook = ItemStackFactory.getInstance().getQuaftingBook();

    private final NoTakingItems noTakingItems = new NoTakingItems();
    private final OnCloseInventory onCloseInventory = new OnCloseInventory();

    public final String xqname = "§3Xtreme Quafting";

    public void createXtremeCraftingInventory(Player player) {
        xtremeQuaftingInventory = Bukkit.createInventory(null, 9*5, xqname);

        loadLightBlue.setAmount(1);
        loadBackground.setAmount(1);
        fillItem.setAmount(1);
        resultBarrier.setAmount(1);

        //===================== 1 =====================

        xtremeQuaftingInventory.setItem(5, loadLightBlue);
        xtremeQuaftingInventory.setItem(6, loadBackground);
        xtremeQuaftingInventory.setItem(7, loadLightBlue);
        xtremeQuaftingInventory.setItem(8, fillItem);

        //===================== 2 =====================

        xtremeQuaftingInventory.setItem(14, fillItem);
        xtremeQuaftingInventory.setItem(15, fillItem);
        xtremeQuaftingInventory.setItem(16, loadBackground);
        xtremeQuaftingInventory.setItem(17, fillItem);

        //===================== 3 =====================

        xtremeQuaftingInventory.setItem(23, fillItem);
        xtremeQuaftingInventory.setItem(24, quaftingBook);
        xtremeQuaftingInventory.setItem(25, resultBarrier);
        xtremeQuaftingInventory.setItem(26, fillItem);

        //===================== 4 =====================

        xtremeQuaftingInventory.setItem(32, fillItem);
        xtremeQuaftingInventory.setItem(33, fillItem);
        xtremeQuaftingInventory.setItem(34, loadBackground);
        xtremeQuaftingInventory.setItem(35, fillItem);

        //===================== 5 =====================

        xtremeQuaftingInventory.setItem(41, loadLightBlue);
        xtremeQuaftingInventory.setItem(42, loadBackground);
        xtremeQuaftingInventory.setItem(43, loadLightBlue);
        xtremeQuaftingInventory.setItem(44, fillItem);

        //==================== END =====================

        player.openInventory(xtremeQuaftingInventory);
    }

    @EventHandler
    public void openInventory(PlayerInteractEvent event) {
        if(event.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
            if(Objects.requireNonNull(event.getClickedBlock()).getType().equals(Material.CRAFTING_TABLE)) {
                List<Entity> armorstand = event.getClickedBlock().getWorld().getEntities();
                double blockX = event.getClickedBlock().getX() + 0.5;
                double blockZ = event.getClickedBlock().getZ() + 0.5;
                double blockY = event.getClickedBlock().getY() + 0.3;
                for(Entity e : armorstand) {
                    if(e.getLocation().getX() == blockX
                    && e.getLocation().getY() == blockY
                    && e.getLocation().getZ() == blockZ){
                        Bukkit.getScheduler().runTaskLater(Main.getPlugin(), () -> createXtremeCraftingInventory(event.getPlayer()), 1);
                    }
                }
            }
        }
    }

    @EventHandler
    public void noTakingItems(InventoryClickEvent event) {
        noTakingItems.noTakingItems(event, xtremeQuaftingInventory);
    }

    @EventHandler
    public void onPlayerCloseInventory(InventoryCloseEvent event) {
        onCloseInventory.onPlayerCloseInventory(event, xtremeQuaftingInventory);
    }

    /*=====================GETTER & SETTER=============================*/

    public Inventory getXtremeQuaftingInventory() {
        return xtremeQuaftingInventory;
    }
}
