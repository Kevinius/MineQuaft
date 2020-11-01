package de.kevinius.minequaft.items.functions.tool;

import de.kevinius.minequaft.items.ItemStackFactory;
import de.kevinius.minequaft.items.ToolFactory;
import org.bukkit.entity.Item;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.ItemDespawnEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Objects;

public class ItemInvincible implements Listener {

    private final int endiriumData = Objects.requireNonNull(ItemStackFactory.getInstance().getEndirium().getItemMeta()).getCustomModelData();
    private final int endiriumPickaxeData = Objects.requireNonNull(ToolFactory.getInstance().getEndiriumPickaxe().getItemMeta()).getCustomModelData();
    private final int endiriumSwordData = Objects.requireNonNull(ToolFactory.getInstance().getEndiriumSword().getItemMeta()).getCustomModelData();
    private final int endiriumAxeData = Objects.requireNonNull(ToolFactory.getInstance().getEndiriumAxe().getItemMeta()).getCustomModelData();
    private final int endiriumShovelData = Objects.requireNonNull(ToolFactory.getInstance().getEndiriumShovel().getItemMeta()).getCustomModelData();
    private final int endiriumHoeData = Objects.requireNonNull(ToolFactory.getInstance().getEndiriumHoe().getItemMeta()).getCustomModelData();

    private final ItemStack endiriumSword = ToolFactory.getInstance().getEndiriumSword();
    private final ItemStack endiriumPickaxe = ToolFactory.getInstance().getEndiriumPickaxe();
    private final ItemStack endiriumAxe = ToolFactory.getInstance().getEndiriumAxe();
    private final ItemStack endiriumShovel = ToolFactory.getInstance().getEndiriumShovel();
    private final ItemStack endiriumHoe = ToolFactory.getInstance().getEndiriumHoe();
    private final ItemStack endirium = ItemStackFactory.getInstance().getEndirium();

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

    @EventHandler
    public void onEntityDamage(EntityDamageEvent event) {
        if(event.getEntity() instanceof Item) {
            Item item = (Item) event.getEntity();
            if(item.getItemStack().isSimilar(endiriumSword)
            || item.getItemStack().isSimilar(endiriumPickaxe)
            || item.getItemStack().isSimilar(endiriumAxe)
            || item.getItemStack().isSimilar(endiriumHoe)
            || item.getItemStack().isSimilar(endiriumShovel)
            || item.getItemStack().isSimilar(endirium)) {
                event.setCancelled(true);
            }
        }
    }
}
