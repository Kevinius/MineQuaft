package de.kevinius.minequaft.inventorys;

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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class XtremeQuaftingInventory implements Listener {

    public Inventory xtremeQuaftingInventory;
    public static ArrayList playersInTable = new ArrayList();

    ItemStack loadLightBlue = ItemStackFactory.getInstance().getLoadLightBlue();
    ItemStack loadBackground = ItemStackFactory.getInstance().getLoadBackground();
    ItemStack fillItem = ItemStackFactory.getInstance().getFillItem();
    ItemStack resultBarrier = ItemStackFactory.getInstance().getResultBarrier();

    private final String xcname = "§3Xtreme Quafting";

    public void createXtremeCraftingInventory(Player player) {
        xtremeQuaftingInventory = Bukkit.createInventory(null, 9*5, xcname);

        ItemStack llb = loadLightBlue;
        ItemStack lb = loadBackground;
        ItemStack fl = fillItem;
        ItemStack rb = resultBarrier;

        llb.setAmount(1);
        lb.setAmount(1);
        fl.setAmount(1);
        rb.setAmount(1);

        //===================== 1 =====================

        xtremeQuaftingInventory.setItem(5, llb);
        xtremeQuaftingInventory.setItem(6, lb);
        xtremeQuaftingInventory.setItem(7, llb);
        xtremeQuaftingInventory.setItem(8, fl);

        //===================== 2 =====================

        xtremeQuaftingInventory.setItem(14, fl);
        xtremeQuaftingInventory.setItem(15, fl);
        xtremeQuaftingInventory.setItem(16, lb);
        xtremeQuaftingInventory.setItem(17, fl);

        //===================== 3 =====================

        xtremeQuaftingInventory.setItem(23, fl);
        xtremeQuaftingInventory.setItem(24, fl);
        xtremeQuaftingInventory.setItem(25, rb);
        xtremeQuaftingInventory.setItem(26, fl);

        //===================== 4 =====================

        xtremeQuaftingInventory.setItem(32, fl);
        xtremeQuaftingInventory.setItem(33, fl);
        xtremeQuaftingInventory.setItem(34, lb);
        xtremeQuaftingInventory.setItem(35, fl);

        //===================== 5 =====================

        xtremeQuaftingInventory.setItem(41, llb);
        xtremeQuaftingInventory.setItem(42, lb);
        xtremeQuaftingInventory.setItem(43, llb);
        xtremeQuaftingInventory.setItem(44, fl);

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
    public void resultSlot(InventoryClickEvent event) {
        if(event.getClickedInventory() != null) {
            if(event.getClickedInventory().equals(xtremeQuaftingInventory)) {
                Bukkit.getServer().getScheduler().runTaskLater(Main.getPlugin(), () -> {
                    if(event.getWhoClicked().getOpenInventory().getItem(25) == null) {
                        event.getWhoClicked().getOpenInventory().setItem(25, resultBarrier);
                    }
                }, 2);
            }
        }

        if(xtremeQuaftingInventory != null) {
            if(event.getView().getTitle().equals(xcname)) {
                if(event.getCurrentItem() != null) {
                    event.getClick();
                    if(event.isLeftClick() && event.getCurrentItem().isSimilar(fillItem)
                            || event.isRightClick() && event.getCurrentItem().isSimilar(fillItem)
                            || event.isShiftClick() && event.getCurrentItem().isSimilar(fillItem)

                            || event.isRightClick() && event.getCurrentItem().isSimilar(loadBackground)
                            || event.isLeftClick() && event.getCurrentItem().isSimilar(loadBackground)
                            || event.isShiftClick() && event.getCurrentItem().isSimilar(loadBackground)

                            || event.isShiftClick() && event.getCurrentItem().isSimilar(resultBarrier)
                            || event.isRightClick() && event.getCurrentItem().isSimilar(resultBarrier)
                            || event.isLeftClick() && event.getCurrentItem().isSimilar(resultBarrier)

                            || event.isShiftClick() && event.getCurrentItem().isSimilar(loadLightBlue)
                            || event.isRightClick() && event.getCurrentItem().isSimilar(loadLightBlue)
                            || event.isLeftClick() && event.getCurrentItem().isSimilar(loadLightBlue)

                            || event.getClick().isKeyboardClick()) {
                        event.setCancelled(true);
                    }
                }
            }
        }
    }

    @EventHandler
    public void onPlayerCloseInventory(InventoryCloseEvent event) {
        playersInTable.remove(event.getPlayer().getName());
        event.getView().getTitle();
        if (event.getView().getTitle().equals(xcname)) {
            ItemStack[] arrayOfItemStack;
            int j = (arrayOfItemStack = event.getInventory().getContents()).length;
            for (int i = 0; i < j; i++) {
                ItemStack item = arrayOfItemStack[i];
                if (item != null && !item.isSimilar(loadLightBlue)
                                 && !item.isSimilar(loadBackground)
                                 && !item.isSimilar(fillItem)
                                 && !item.isSimilar(resultBarrier)) {
                    event.getPlayer().getWorld().dropItem(event.getPlayer().getLocation(), item);
                }
            }
        }
    }
}
