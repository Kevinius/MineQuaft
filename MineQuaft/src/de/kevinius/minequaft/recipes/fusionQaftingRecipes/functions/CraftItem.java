package de.kevinius.minequaft.recipes.fusionQaftingRecipes.functions;

import de.kevinius.minequaft.inventorys.FusionQuaftingInventory;
import de.kevinius.minequaft.items.ItemStackFactory;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.ItemStack;

import java.util.Objects;

public class CraftItem {

    private final FusionQuaftingInventory fusionQuaftingInventory = new FusionQuaftingInventory();

    public void onCraftFusionItem(InventoryClickEvent event, ItemStack resultItem) {
        InventoryView playerInventory= event.getView().getPlayer().getOpenInventory();
        if(playerInventory.getTitle().equalsIgnoreCase(fusionQuaftingInventory.fqName)) {
            int resultamount = Objects.requireNonNull(event.getInventory().getItem(40)).getAmount();
            if(Objects.requireNonNull(event.getInventory().getItem(40)).isSimilar(ItemStackFactory.getInstance().getResultBarrier())) {
                event.getInventory().setItem(40, resultItem);
                ((Player) event.getView().getPlayer()).playSound(event.getView().getPlayer().getLocation(), Sound.BLOCK_FIRE_EXTINGUISH, 0.7F, 0.7F);
            } else if (Objects.requireNonNull(event.getInventory().getItem(40)).isSimilar(resultItem)) {
                event.getInventory().addItem(resultItem).put(resultamount + 1, resultItem);
                ((Player) event.getView().getPlayer()).playSound(event.getView().getPlayer().getLocation(), Sound.BLOCK_FIRE_EXTINGUISH, 0.7F, 0.7F);
            } else {
                event.setCancelled(true);
            }
        }
    }
}
