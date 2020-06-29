package de.kevin.draconic.items.functions;

import de.kevin.draconic.items.ItemStackFactory;
import de.kevin.draconic.items.ToolFactory;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ItemDespawnEvent;
import org.bukkit.inventory.ItemStack;

public class PrevendFromDespawn implements Listener {

    ItemStack endirium = ItemStackFactory.getInstance().getEndirium();
    ItemStack endiriumPickaxe = ToolFactory.getInstance().getEndiriumPickaxe();

    @EventHandler
    public void onDespawn(ItemDespawnEvent event) {

        if(event.getEntity().getItemStack().isSimilar(endirium)) {
            event.setCancelled(true);
        }

        if(event.getEntity().getItemStack().isSimilar(endiriumPickaxe)) {
            event.setCancelled(true);
        }
    }
}
