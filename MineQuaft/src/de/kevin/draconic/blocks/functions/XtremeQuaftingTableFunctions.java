package de.kevin.draconic.blocks.functions;

import de.kevin.draconic.blocks.entitys.EntityFactory;
import de.kevin.draconic.items.ItemStackFactory;
import de.kevin.draconic.main.Main;
import net.minecraft.server.v1_16_R1.DoubleBlockFinder;
import net.minecraft.server.v1_16_R1.PistonExtendsChecker;
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
import org.bukkit.inventory.ItemStack;

import java.util.Objects;

public class XtremeQuaftingTableFunctions implements Listener {

    ItemStack xtremeQuaftingTable = ItemStackFactory.getInstance().getXtremeQuaftingTable();

    @EventHandler
    public void placeXtremeQuaftingTable(BlockPlaceEvent event) {

        if(Objects.requireNonNull(event.getItemInHand().getItemMeta()).getDisplayName().equals("§fXtreme Quafting Table")) {

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
                        Bukkit.getScheduler().runTaskLater(Main.getPlugin(), new Runnable() {
                            @Override
                            public void run() {
                                if(event.isCancelled()) {
                                    event.getBlock().getLocation().getBlock().setType(Material.AIR);
                                }
                            }
                        }, 1);
                    }
                }
            }
        }
    }

    @EventHandler
    public void onMovePiston(BlockPistonExtendEvent event) {
        for(Block block : event.getBlocks()) {
            double locationX = event.getBlock().getX() + 0.5;
            double locationZ = event.getBlock().getZ() + 0.5;
            double locationY = event.getBlock().getY() + 0.3;
            if(block.getType().equals(Material.CRAFTING_TABLE)) {
                event.setCancelled(true);
            }
        }
    }
    @EventHandler
    public void onRetractPiston(BlockPistonRetractEvent event) {
        for(Block block : event.getBlocks()) {
            double locationX = event.getBlock().getX() + 0.5;
            double locationZ = event.getBlock().getZ() + 0.5;
            double locationY = event.getBlock().getY() + 0.3;
            if(block.getType().equals(Material.CRAFTING_TABLE)) {
                event.setCancelled(true);
            }
        }
    }
}
