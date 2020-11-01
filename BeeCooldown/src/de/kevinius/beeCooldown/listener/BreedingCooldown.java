package de.kevinius.beeCooldown.listener;

import de.kevinius.beeCooldown.main.Main;
import org.bukkit.Bukkit;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityBreedEvent;

public class BreedingCooldown implements Listener {

    private int cooldown = 30;
    private int taskID;

    @EventHandler
    public void onBreed(EntityBreedEvent event) {
        if(event.getEntity().getType().equals(EntityType.BEE)) {
            taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(), () -> {
                cooldown--;
                if(cooldown <= 0) {
                    Bukkit.broadcastMessage("cooldown");
                    Bukkit.getScheduler().cancelTask(taskID);
                }
            }, 0, 20);
        }
    }
}
