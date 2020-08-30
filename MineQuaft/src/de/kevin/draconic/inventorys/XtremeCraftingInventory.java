package de.kevin.draconic.inventorys;

import de.kevin.draconic.items.ItemStackFactory;
import de.kevin.draconic.main.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class XtremeCraftingInventory implements Listener {

    public Inventory xtremeCraftingInventory;
    public static ArrayList playersInTable = new ArrayList();

    ItemStack loadLightBlue = ItemStackFactory.getInstance().getLoadLightBlue();
    ItemStack loadBackground = ItemStackFactory.getInstance().getLoadBackround();
    ItemStack fillItem = ItemStackFactory.getInstance().getFillItem();
    ItemStack resultBarrier = ItemStackFactory.getInstance().getResultBarrier();

    private final String xcname = "§3Xtreme Quafting";

    public void createXtremeCraftingInventory(Player player) {
        xtremeCraftingInventory = Bukkit.createInventory(null, 9*5, xcname);

        ItemStack llb = loadLightBlue;
        ItemStack lb = loadBackground;
        ItemStack fl = fillItem;
        ItemStack rb = resultBarrier;

        llb.setAmount(1);
        lb.setAmount(1);
        fl.setAmount(1);
        rb.setAmount(1);

        //===================== 1 =====================

        xtremeCraftingInventory.setItem(5, llb);
        xtremeCraftingInventory.setItem(6, lb);
        xtremeCraftingInventory.setItem(7, llb);
        xtremeCraftingInventory.setItem(8, fl);

        //===================== 2 =====================

        xtremeCraftingInventory.setItem(14, fl);
        xtremeCraftingInventory.setItem(15, fl);
        xtremeCraftingInventory.setItem(16, lb);
        xtremeCraftingInventory.setItem(17, fl);

        //===================== 3 =====================

        xtremeCraftingInventory.setItem(23, fl);
        xtremeCraftingInventory.setItem(24, fl);
        xtremeCraftingInventory.setItem(25, rb);
        xtremeCraftingInventory.setItem(26, fl);

        //===================== 4 =====================

        xtremeCraftingInventory.setItem(32, fl);
        xtremeCraftingInventory.setItem(33, fl);
        xtremeCraftingInventory.setItem(34, lb);
        xtremeCraftingInventory.setItem(35, fl);

        //===================== 5 =====================

        xtremeCraftingInventory.setItem(41, llb);
        xtremeCraftingInventory.setItem(42, lb);
        xtremeCraftingInventory.setItem(43, llb);
        xtremeCraftingInventory.setItem(44, fl);

        //==================== END =====================

        player.openInventory(xtremeCraftingInventory);
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
            if(event.getClickedInventory().equals(xtremeCraftingInventory)) {
                Bukkit.getServer().getScheduler().runTaskLater(Main.getPlugin(), () -> {
                    if(event.getWhoClicked().getOpenInventory().getItem(25) == null) {
                        event.getWhoClicked().getOpenInventory().setItem(25, resultBarrier);
                    }
                }, 2);
            }
        }

        if(xtremeCraftingInventory != null) {
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
