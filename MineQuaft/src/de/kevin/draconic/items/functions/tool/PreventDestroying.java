package de.kevin.draconic.items.functions.tool;

import de.kevin.draconic.items.ItemStackFactory;
import de.kevin.draconic.items.ToolFactory;
import org.bukkit.Bukkit;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.ItemDespawnEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Objects;

public class PreventDestroying implements Listener {

    ItemStack endirium = ItemStackFactory.getInstance().getEndirium();
    ItemStack endiriumPickaxe = ToolFactory.getInstance().getEndiriumPickaxe();
    ItemStack endiriumSword = ToolFactory.getInstance().getEndiriumSword();
    ItemStack endiriumAxe = ToolFactory.getInstance().getEndiriumAxe();
    ItemStack endiriumShovel = ToolFactory.getInstance().getEndiriumShovel();
    ItemStack endiriumHoe = ToolFactory.getInstance().getEndiriumHoe();

    @EventHandler
    public void onDespawn(ItemDespawnEvent event) {

        if(event.getEntity().getItemStack().isSimilar(endirium)
        || event.getEntity().getItemStack().isSimilar(endiriumPickaxe)
        || event.getEntity().getItemStack().isSimilar(endiriumSword)
        || event.getEntity().getItemStack().isSimilar(endiriumAxe)
        || event.getEntity().getItemStack().isSimilar(endiriumShovel)
        || event.getEntity().getItemStack().isSimilar(endiriumHoe)){
            event.setCancelled(true);
        }
    }
}
