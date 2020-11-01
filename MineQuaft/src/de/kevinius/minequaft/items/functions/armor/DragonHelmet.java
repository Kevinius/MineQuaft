package de.kevinius.minequaft.items.functions.armor;

import de.kevinius.minequaft.items.ArmorFactory;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityTargetEvent;

import java.util.Objects;

public class DragonHelmet implements Listener {

    private final int dragonHelmetData = Objects.requireNonNull(ArmorFactory.getInstance().getDragonHelmet().getItemMeta()).getCustomModelData();

    @EventHandler
    public void functions(EntityTargetEvent event) {
        if(event.getEntity().getType().equals(EntityType.ENDERMAN)) {
            if(event.getTarget() instanceof Player) {
                Player player = (Player) event.getTarget();
                try {
                    if(Objects.requireNonNull(player.getInventory().getHelmet()).hasItemMeta()
                            && Objects.requireNonNull(player.getInventory().getHelmet().getItemMeta()).hasCustomModelData()) {
                        if(Objects.requireNonNull(Objects.requireNonNull(player.getInventory().getHelmet()).getItemMeta()).getCustomModelData() == dragonHelmetData) {
                            event.setCancelled(true);
                        }
                    }
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        }
    }
}
