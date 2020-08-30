package de.kevin.draconic.blocks.functions;

import de.kevin.draconic.blocks.entitys.EntityFactory;
import de.kevin.draconic.items.ItemStackFactory;
import de.kevin.draconic.main.Main;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPistonExtendEvent;
import org.bukkit.event.block.BlockPistonRetractEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.inventory.ItemStack;

import java.util.List;
import java.util.Objects;

public class XtremeQuaftingTableFunctions implements Listener {

    private final int xtremeQuaftingTableData = Objects.requireNonNull(ItemStackFactory.getInstance().getXtremeQuaftingTable().getItemMeta()).getCustomModelData();
    private final ItemStack xtremeQuaftingTable = ItemStackFactory.getInstance().getXtremeQuaftingTable();

    @EventHandler
    public void placeXtremeQuaftingTable(BlockPlaceEvent event) {

        if(Objects.requireNonNull(event.getItemInHand().getItemMeta()).getCustomModelData() == xtremeQuaftingTableData) {

            ArmorStand xtremeQuaftingArmorstand = EntityFactory.getInstance().spawnXtremeQuaftingArmorstand(
                    event.getBlockPlaced().getLocation(), event.getPlayer());

            event.getBlockPlaced().getWorld().getEntities().add(xtremeQuaftingArmorstand);
        }
    }

    @EventHandler
    public void destroyXtremeQuaftingTable(BlockBreakEvent event) {
        if(event.getBlock().getType().equals(Material.CRAFTING_TABLE)) {
            double locationX = event.getBlock().getX() + 0.5;
            double locationZ = event.getBlock().getZ() + 0.5;
            double locationY = event.getBlock().getY() + 0.3;

            for(Entity entity : event.getBlock().getWorld().getEntities()) {
                if(entity.getLocation().getX() == locationX
                        && entity.getLocation().getZ() == locationZ
                        && entity.getLocation().getY() == locationY) {
                    entity.remove();
                    if(event.getPlayer().getGameMode().equals(GameMode.SURVIVAL)) {
                        event.setCancelled(true);
                        Objects.requireNonNull(event.getBlock().getLocation().getWorld()).dropItemNaturally(event.getBlock().getLocation(), xtremeQuaftingTable);
                        Bukkit.getScheduler().runTaskLater(Main.getPlugin(), () -> {
                            if(event.isCancelled()) {
                                event.getBlock().getLocation().getBlock().setType(Material.AIR);
                            }
                        }, 1);
                    }
                }
            }
        }
    }

    @EventHandler
    public void onEntityExplode(EntityExplodeEvent event) {
        for (Block block : event.blockList().toArray(new Block[0])) {
            if (block.getType() == Material.CRAFTING_TABLE) {
                List<Entity> armorstand = block.getWorld().getEntities();
                double blockX = block.getX() + 0.5;
                double blockY = block.getY() + 0.3;
                double blockZ = block.getZ() + 0.5;
                for (Entity e : armorstand) {
                    if (e.getLocation().getX() == blockX
                     && e.getLocation().getY() == blockY
                     && e.getLocation().getZ() == blockZ) {
                        event.setCancelled(true);
                    }
                }
            }
        }
    }

    @EventHandler
    public void onMovePiston(BlockPistonExtendEvent event) {
        for(Block block : event.getBlocks()) {
            if(block.getType().equals(Material.CRAFTING_TABLE)) {
                event.setCancelled(true);
            }
        }
    }
    @EventHandler
    public void onRetractPiston(BlockPistonRetractEvent event) {
        for(Block block : event.getBlocks()) {
            if(block.getType().equals(Material.CRAFTING_TABLE)) {
                event.setCancelled(true);
            }
        }
    }
}
