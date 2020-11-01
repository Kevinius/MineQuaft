package de.kevinius.minequaft.recipes.fusionQaftingRecipes.functions;

import de.kevinius.minequaft.inventorys.FusionQuaftingInventory;
import de.kevinius.minequaft.items.ItemStackFactory;
import de.kevinius.minequaft.main.Main;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.ItemStack;

public class FusionQuaftingAnimation implements Listener {

    private final FusionQuaftingInventory fusionQuaftingInventory = new FusionQuaftingInventory();

    private final ItemStack confirmItem = ItemStackFactory.getInstance().getConfirmItem();

    private int i = 0;
    private int taskID;

    private final ItemStack loadBackground = ItemStackFactory.getInstance().getLoadBackground();
    private final ItemStack loadOrange = ItemStackFactory.getInstance().getLoadOrange();
    private final ItemStack loadPurple = ItemStackFactory.getInstance().getLoadPurple();

    public void animation(InventoryClickEvent event, ItemStack resultItem) {
        InventoryView playerInv = event.getView().getPlayer().getOpenInventory();
        if(playerInv.getTitle().equalsIgnoreCase(fusionQuaftingInventory.fqName)) {
            if(event.getCurrentItem() != null) {
                if(event.getCurrentItem().isSimilar(confirmItem)) {
                    if(i == 0) {
                        taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(), () -> {
                            if(i == 1) {
                                playerInv.setItem(0, loadOrange);
                                playerInv.setItem(53, loadPurple);
                            }
                            if(i == 2) {
                                playerInv.setItem(0, loadBackground);
                                playerInv.setItem(53, loadBackground);
                                playerInv.setItem(1, loadOrange);
                                playerInv.setItem(52, loadPurple);
                            }
                            if(i == 3) {
                                playerInv.setItem(1, loadBackground);
                                playerInv.setItem(52, loadBackground);
                                playerInv.setItem(2, loadOrange);
                                playerInv.setItem(51, loadPurple);
                            }
                            if(i == 4) {
                                playerInv.setItem(2, loadBackground);
                                playerInv.setItem(51, loadBackground);
                                playerInv.setItem(3, loadOrange);
                                playerInv.setItem(50, loadPurple);
                            }
                            if(i == 5) {
                                playerInv.setItem(3, loadBackground);
                                playerInv.setItem(50, loadBackground);
                                playerInv.setItem(4, loadOrange);
                                playerInv.setItem(49, loadPurple);
                            }
                            if(i == 6) {
                                playerInv.setItem(4, loadBackground);
                                playerInv.setItem(49, loadBackground);
                                playerInv.setItem(5, loadOrange);
                                playerInv.setItem(48, loadPurple);
                            }
                            if(i == 7) {
                                playerInv.setItem(5, loadBackground);
                                playerInv.setItem(48, loadBackground);
                                playerInv.setItem(6, loadOrange);
                                playerInv.setItem(47, loadPurple);
                            }
                            if(i == 8) {
                                playerInv.setItem(6, loadBackground);
                                playerInv.setItem(47, loadBackground);
                                playerInv.setItem(7, loadOrange);
                                playerInv.setItem(46, loadPurple);
                            }
                            if(i == 9) {
                                playerInv.setItem(7, loadBackground);
                                playerInv.setItem(46, loadBackground);
                                playerInv.setItem(8, loadOrange);
                                playerInv.setItem(45, loadPurple);
                            }
                            if(i == 10) {
                                playerInv.setItem(8, loadBackground);
                                playerInv.setItem(45, loadBackground);
                                playerInv.setItem(17, loadOrange);
                                playerInv.setItem(35, loadPurple);
                            }
                            if(i == 11) {
                                playerInv.setItem(17, loadBackground);
                                playerInv.setItem(35, loadBackground);
                                playerInv.setItem(26, loadOrange);
                                playerInv.setItem(27, loadPurple);
                            }
                            if(i == 12) {
                                playerInv.setItem(26, loadBackground);
                                playerInv.setItem(27, loadBackground);
                                playerInv.setItem(35, loadOrange);
                                playerInv.setItem(18, loadPurple);
                            }
                            if(i == 13) {
                                playerInv.setItem(35, loadBackground);
                                playerInv.setItem(18, loadBackground);
                                playerInv.setItem(44, loadOrange);
                                playerInv.setItem(9, loadPurple);
                            }
                            if(i == 14) {
                                playerInv.setItem(44, loadBackground);
                                playerInv.setItem(9, loadBackground);
                                playerInv.setItem(53, loadOrange);
                                playerInv.setItem(0, loadPurple);
                            }
                            if(i == 15) {
                                playerInv.setItem(53, loadBackground);
                                playerInv.setItem(0, loadBackground);
                            }
                            if(i == 16) {
                                playerInv.setItem(0, confirmItem);
                                playerInv.setItem(1, confirmItem);
                                playerInv.setItem(2, confirmItem);
                                playerInv.setItem(3, confirmItem);
                                playerInv.setItem(4, confirmItem);
                                playerInv.setItem(5, confirmItem);
                                playerInv.setItem(6, confirmItem);
                                playerInv.setItem(7, confirmItem);
                                playerInv.setItem(8, confirmItem);
                                playerInv.setItem(9, confirmItem);
                                playerInv.setItem(17, confirmItem);
                                playerInv.setItem(18, confirmItem);
                                playerInv.setItem(26, confirmItem);
                                playerInv.setItem(27, confirmItem);
                                playerInv.setItem(35, confirmItem);
                                playerInv.setItem(36, confirmItem);
                                playerInv.setItem(44, confirmItem);
                                playerInv.setItem(45, confirmItem);
                                playerInv.setItem(46, confirmItem);
                                playerInv.setItem(47, confirmItem);
                                playerInv.setItem(48, confirmItem);
                                playerInv.setItem(49, confirmItem);
                                playerInv.setItem(50, confirmItem);
                                playerInv.setItem(51, confirmItem);
                                playerInv.setItem(52, confirmItem);
                                playerInv.setItem(53, confirmItem);
                            }
                            if(i == 18) {
                                playerInv.setItem(0, loadBackground);
                                playerInv.setItem(1, loadBackground);
                                playerInv.setItem(2, loadBackground);
                                playerInv.setItem(3, loadBackground);
                                playerInv.setItem(4, loadBackground);
                                playerInv.setItem(5, loadBackground);
                                playerInv.setItem(6, loadBackground);
                                playerInv.setItem(7, loadBackground);
                                playerInv.setItem(8, loadBackground);
                                playerInv.setItem(9, loadBackground);
                                playerInv.setItem(17, loadBackground);
                                playerInv.setItem(18, loadBackground);
                                playerInv.setItem(26, loadBackground);
                                playerInv.setItem(27, loadBackground);
                                playerInv.setItem(35, loadBackground);
                                playerInv.setItem(36, loadBackground);
                                playerInv.setItem(44, loadBackground);
                                playerInv.setItem(45, loadBackground);
                                playerInv.setItem(46, loadBackground);
                                playerInv.setItem(47, loadBackground);
                                playerInv.setItem(48, loadBackground);
                                playerInv.setItem(49, loadBackground);
                                playerInv.setItem(50, loadBackground);
                                playerInv.setItem(51, loadBackground);
                                playerInv.setItem(52, loadBackground);
                                playerInv.setItem(53, loadBackground);
                            }
                            if(i == 19) {
                                playerInv.setItem(0, confirmItem);
                                playerInv.setItem(1, confirmItem);
                                playerInv.setItem(2, confirmItem);
                                playerInv.setItem(3, confirmItem);
                                playerInv.setItem(4, confirmItem);
                                playerInv.setItem(5, confirmItem);
                                playerInv.setItem(6, confirmItem);
                                playerInv.setItem(7, confirmItem);
                                playerInv.setItem(8, confirmItem);
                                playerInv.setItem(9, confirmItem);
                                playerInv.setItem(17, confirmItem);
                                playerInv.setItem(18, confirmItem);
                                playerInv.setItem(26, confirmItem);
                                playerInv.setItem(27, confirmItem);
                                playerInv.setItem(35, confirmItem);
                                playerInv.setItem(36, confirmItem);
                                playerInv.setItem(44, confirmItem);
                                playerInv.setItem(45, confirmItem);
                                playerInv.setItem(46, confirmItem);
                                playerInv.setItem(47, confirmItem);
                                playerInv.setItem(48, confirmItem);
                                playerInv.setItem(49, confirmItem);
                                playerInv.setItem(50, confirmItem);
                                playerInv.setItem(51, confirmItem);
                                playerInv.setItem(52, confirmItem);
                                playerInv.setItem(53, confirmItem);
                            }
                            if(i == 20) {
                                playerInv.setItem(0, loadBackground);
                                playerInv.setItem(1, loadBackground);
                                playerInv.setItem(2, loadBackground);
                                playerInv.setItem(3, loadBackground);
                                playerInv.setItem(4, loadBackground);
                                playerInv.setItem(5, loadBackground);
                                playerInv.setItem(6, loadBackground);
                                playerInv.setItem(7, loadBackground);
                                playerInv.setItem(8, loadBackground);
                                playerInv.setItem(9, loadBackground);
                                playerInv.setItem(17, loadBackground);
                                playerInv.setItem(18, loadBackground);
                                playerInv.setItem(26, loadBackground);
                                playerInv.setItem(27, loadBackground);
                                playerInv.setItem(35, loadBackground);
                                playerInv.setItem(36, loadBackground);
                                playerInv.setItem(44, loadBackground);
                                playerInv.setItem(45, loadBackground);
                                playerInv.setItem(46, loadBackground);
                                playerInv.setItem(47, loadBackground);
                                playerInv.setItem(48, loadBackground);
                                playerInv.setItem(49, loadBackground);
                                playerInv.setItem(50, loadBackground);
                                playerInv.setItem(51, loadBackground);
                                playerInv.setItem(52, loadBackground);
                                playerInv.setItem(53, loadBackground);

                                CraftItem craftItem = new CraftItem();
                                craftItem.onCraftFusionItem(event, resultItem);
                            }
                            if(i >= 21) {
                                i = 0;
                                Bukkit.getScheduler().cancelTask(taskID);
                            } else {
                                i++;
                            }
                        }, 2, 2);
                        if(Bukkit.getScheduler().isCurrentlyRunning(taskID)) {
                            event.setCancelled(true);
                        }
                    }
                }
            }
        }
    }
}
