package de.kevin.draconic.blocks.blockPlace;

import de.kevin.draconic.blocks.entitys.EntityFactory;
import org.bukkit.Material;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PlaceFusionQuaftingTable implements Listener {

    @EventHandler
    public void placeFusionQuaftingTable(BlockPlaceEvent event) {

        if(Objects.requireNonNull(event.getItemInHand().getItemMeta()).getDisplayName().equals("§fFusion Quafting Table")) {

            ArmorStand fusionQuaftingArmorstand = EntityFactory.getInstance().spawnFusionQuaftingArmorstand(
                    event.getBlockPlaced().getLocation(), event.getPlayer());

            event.getBlockPlaced().getWorld().getEntities().add(fusionQuaftingArmorstand);
        }
    }

    @EventHandler
    public void destroyFusionQuaftingTable(BlockBreakEvent event) {
        if(event.getBlock().getType().equals(Material.SMOKER)) {
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
