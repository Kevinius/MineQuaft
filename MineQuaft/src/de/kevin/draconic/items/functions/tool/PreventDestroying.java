package de.kevin.draconic.items.functions.tool;

import de.kevin.draconic.items.ItemStackFactory;
import de.kevin.draconic.items.ToolFactory;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ItemDespawnEvent;

import java.util.Objects;

public class PreventDestroying implements Listener {

    private final int endiriumData = Objects.requireNonNull(ItemStackFactory.getInstance().getEndirium().getItemMeta()).getCustomModelData();
    private final int endiriumPickaxeData = Objects.requireNonNull(ToolFactory.getInstance().getEndiriumPickaxe().getItemMeta()).getCustomModelData();
    private final int endiriumSwordData = Objects.requireNonNull(ToolFactory.getInstance().getEndiriumSword().getItemMeta()).getCustomModelData();
    private final int endiriumAxeData = Objects.requireNonNull(ToolFactory.getInstance().getEndiriumAxe().getItemMeta()).getCustomModelData();
    private final int endiriumShovelData = Objects.requireNonNull(ToolFactory.getInstance().getEndiriumAxe().getItemMeta()).getCustomModelData();
    private final int endiriumHoeData = Objects.requireNonNull(ToolFactory.getInstance().getEndiriumAxe().getItemMeta()).getCustomModelData();

    @EventHandler
    public void onDespawn(ItemDespawnEvent event) {

        if(Objects.requireNonNull(event.getEntity().getItemStack().getItemMeta()).getCustomModelData() == endiriumData
        || Objects.requireNonNull(event.getEntity().getItemStack().getItemMeta()).getCustomModelData() == endiriumPickaxeData
        || Objects.requireNonNull(event.getEntity().getItemStack().getItemMeta()).getCustomModelData() == endiriumSwordData
        || Objects.requireNonNull(event.getEntity().getItemStack().getItemMeta()).getCustomModelData() == endiriumAxeData
        || Objects.requireNonNull(event.getEntity().getItemStack().getItemMeta()).getCustomModelData() == endiriumShovelData
        || Objects.requireNonNull(event.getEntity().getItemStack().getItemMeta()).getCustomModelData() == endiriumHoeData){
            event.setCancelled(true);
        }
    }
}
