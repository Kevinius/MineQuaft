package de.kevin.draconic.blocks.blockPlace;

import de.kevin.draconic.blocks.entitys.EntityFactory;
import org.bukkit.Material;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

import java.util.Objects;

public class PlaceXtremeQuaftingTable implements Listener {

    @EventHandler
    public void placeXtremeQuaftingTable(BlockPlaceEvent event) {

        if(Objects.requireNonNull(event.getItemInHand().getItemMeta()).getDisplayName().equals("§fXtreme Quafting Table")) {

            ArmorStand xtremeQuaftingArmorstand = EntityFactory.getInstance().spawnXtremeQuaftingArmorstand(
                    event.getBlockPlaced().getLocation(), event.getPlayer());

            event.getBlockPlaced().getWorld().getEntities().add(xtremeQuaftingArmorstand);
        }
    }

    @EventHandler
    public void destroyFusionQuaftingTable(BlockBreakEvent event) {
        if(event.getBlock().getType().equals(Material.CRAFTING_TABLE)) {
            double locationX = event.getBlock().getX() + 0.5;
            double locationZ = event.getBlock().getZ() + 0.5;
            double locationY = event.getBlock().getY() + 0.3;

            for(Entity entity : event.getBlock().getWorld().getEntities()) {
                if(entity.getLocation().getX() == locationX
                        && entity.getLocation().getZ() == locationZ
                        && entity.getLocation().getY() == locationY) {
                    entity.remove();
                }
            }
        }
    }
}
