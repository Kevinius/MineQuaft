package de.kevin.draconic.items.functions.food;

import de.kevin.draconic.items.ItemStackFactory;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.inventory.ItemStack;

public class Food implements Listener {

    ItemStack borgar = ItemStackFactory.getInstance().getBorgar();

    @EventHandler
    private void onConsume(PlayerItemConsumeEvent event) {
        if(event.getItem().isSimilar(borgar)) {
            event.getPlayer().setFoodLevel(20);
            event.getPlayer().setSaturation(20);
        }
    }
}
