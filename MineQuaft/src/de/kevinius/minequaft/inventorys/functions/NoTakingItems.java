package de.kevinius.minequaft.inventorys.functions;

import de.kevinius.minequaft.items.ItemStackFactory;
import de.kevinius.minequaft.main.Main;
import org.bukkit.Bukkit;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.Objects;

public class NoTakingItems {

    private final ItemStack fillItem = ItemStackFactory.getInstance().getFillItem();
    private final ItemStack loadBackground = ItemStackFactory.getInstance().getLoadBackground();
    private final ItemStack resultBarrier = ItemStackFactory.getInstance().getResultBarrier();
    private final ItemStack confirmItem = ItemStackFactory.getInstance().getConfirmItem();
    private final ItemStack loadLightBlue = ItemStackFactory.getInstance().getLoadLightBlue();
    private final ItemStack quaftingBook = ItemStackFactory.getInstance().getQuaftingBook();
    private final ItemStack back = ItemStackFactory.getInstance().getBack();
    private final ItemStack close = ItemStackFactory.getInstance().getClose();

    public void noTakingItems(InventoryClickEvent event, Inventory inventory) {
        if(event.getClickedInventory() != null) {
            if(event.getClickedInventory().equals(inventory)) {
                if(inventory.getItem(40)  != null) {
                    if(Objects.requireNonNull(inventory.getItem(40)).isSimilar(resultBarrier)) {
                        Bukkit.getScheduler().runTaskLater(Main.getPlugin(), () -> {
                            if(event.getWhoClicked().getOpenInventory().getItem(40) == null) {
                                event.getWhoClicked().getOpenInventory().setItem(40, resultBarrier);
                            }
                        }, 1);
                    }
                }
                if(inventory.getItem(25)  != null) {
                    if(Objects.requireNonNull(inventory.getItem(25)).isSimilar(resultBarrier)) {
                        Bukkit.getScheduler().runTaskLater(Main.getPlugin(), () -> {
                            if(event.getWhoClicked().getOpenInventory().getItem(25) == null) {
                                event.getWhoClicked().getOpenInventory().setItem(25, resultBarrier);
                            }
                        }, 1);
                    }
                }
            }
        }
        if (event.getCurrentItem() != null) {
            if(Objects.equals(event.getClickedInventory(), inventory)) {
                if (event.isLeftClick() && event.getCurrentItem().isSimilar(fillItem)
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

                 || event.isShiftClick() && event.getCurrentItem().isSimilar(loadBackground)
                 || event.isRightClick() && event.getCurrentItem().isSimilar(loadBackground)
                 || event.isLeftClick() && event.getCurrentItem().isSimilar(loadBackground)

                 || event.isShiftClick() && event.getCurrentItem().isSimilar(confirmItem)
                 || event.isRightClick() && event.getCurrentItem().isSimilar(confirmItem)
                 || event.isLeftClick() && event.getCurrentItem().isSimilar(confirmItem)

                 || event.isShiftClick() && event.getCurrentItem().isSimilar(quaftingBook)
                 || event.isRightClick() && event.getCurrentItem().isSimilar(quaftingBook)
                 || event.isLeftClick() && event.getCurrentItem().isSimilar(quaftingBook)

                 || event.isShiftClick() && event.getCurrentItem().isSimilar(back)
                 || event.isRightClick() && event.getCurrentItem().isSimilar(back)
                 || event.isLeftClick() && event.getCurrentItem().isSimilar(back)

                 || event.isShiftClick() && event.getCurrentItem().isSimilar(close)
                 || event.isRightClick() && event.getCurrentItem().isSimilar(close)
                 || event.isLeftClick() && event.getCurrentItem().isSimilar(close)

                 || event.getClick().isKeyboardClick()) {
                    event.setCancelled(true);
                }
            }
        }
    }
}
