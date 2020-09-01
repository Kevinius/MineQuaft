package de.kevin.draconic.items.functions.tool;

import de.kevin.draconic.items.ItemStackFactory;
import de.kevin.draconic.items.ToolFactory;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ItemDespawnEvent;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Objects;

public class PreventDestroying implements Listener {

    private final int endiriumData = Objects.requireNonNull(ItemStackFactory.getInstance().getEndirium().getItemMeta()).getCustomModelData();
    private final int endiriumPickaxeData = Objects.requireNonNull(ToolFactory.getInstance().getEndiriumPickaxe().getItemMeta()).getCustomModelData();
    private final int endiriumSwordData = Objects.requireNonNull(ToolFactory.getInstance().getEndiriumSword().getItemMeta()).getCustomModelData();
    private final int endiriumAxeData = Objects.requireNonNull(ToolFactory.getInstance().getEndiriumAxe().getItemMeta()).getCustomModelData();
    private final int endiriumShovelData = Objects.requireNonNull(ToolFactory.getInstance().getEndiriumShovel().getItemMeta()).getCustomModelData();
    private final int endiriumHoeData = Objects.requireNonNull(ToolFactory.getInstance().getEndiriumHoe().getItemMeta()).getCustomModelData();

    @EventHandler
    public void onDespawn(ItemDespawnEvent event) {

        ItemMeta itemMeta = event.getEntity().getItemStack().getItemMeta();

        assert itemMeta != null;
        if(itemMeta.hasCustomModelData() && itemMeta.getCustomModelData() == endiriumData
        || itemMeta.hasCustomModelData() && itemMeta.getCustomModelData() == endiriumPickaxeData
        || itemMeta.hasCustomModelData() && itemMeta.getCustomModelData() == endiriumSwordData
        || itemMeta.hasCustomModelData() && itemMeta.getCustomModelData() == endiriumAxeData
        || itemMeta.hasCustomModelData() && itemMeta.getCustomModelData() == endiriumShovelData
        || itemMeta.hasCustomModelData() && itemMeta.getCustomModelData() == endiriumHoeData) {
            event.setCancelled(true);
        }
    }
}
