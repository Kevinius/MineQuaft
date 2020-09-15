package de.kevinius.minequaft.blocks.functions;

import de.kevinius.minequaft.blocks.entitys.EntityFactory;
import de.kevinius.minequaft.items.ItemStackFactory;
import de.kevinius.minequaft.main.Main;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;
import java.util.Objects;

public class FusionQuaftingTableFunctions implements Listener {

    private final int fusionQuaftingTableData = Objects.requireNonNull(ItemStackFactory.getInstance().getFusionQuaftingTable().getItemMeta()).getCustomModelData();
    private final ItemStack fusionQuaftingTable = ItemStackFactory.getInstance().getFusionQuaftingTable();

    @EventHandler
    public void placeFusionQuaftingTable(BlockPlaceEvent event) {

        ItemMeta itemMeta = event.getItemInHand().getItemMeta();

        assert itemMeta != null;
        if(itemMeta.hasCustomModelData() && itemMeta.getCustomModelData() == fusionQuaftingTableData) {

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
                    entity.remove();
                    if(event.getPlayer().getGameMode().equals(GameMode.SURVIVAL)) {
                        event.setCancelled(true);
                        Objects.requireNonNull(event.getBlock().getLocation().getWorld()).dropItemNaturally(event.getBlock().getLocation(), fusionQuaftingTable);
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
            if (block.getType() == Material.SMOKER) {
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
}
