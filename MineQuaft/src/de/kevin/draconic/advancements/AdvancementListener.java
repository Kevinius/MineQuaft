package de.kevin.draconic.advancements;

import de.kevin.draconic.items.ItemStackFactory;
import de.kevin.draconic.main.Main;
import eu.endercentral.crazy_advancements.*;
import eu.endercentral.crazy_advancements.manager.AdvancementManager;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityPickupItemEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;

public class AdvancementListener implements Listener {

    private AdvancementManager manager;

    private Advancement root, draconicTimes;

    ItemStack dragonscale = ItemStackFactory.getInstance().createDragonScale(1);
    ItemStack endirium = ItemStackFactory.getInstance().getEndirium();

    public AdvancementListener() {

        manager = CrazyAdvancements.getNewAdvancementManager();

        AdvancementDisplay rootDisplay = new AdvancementDisplay(endirium, "MineQuaft-Evolution", "everything about MineQuaft", AdvancementDisplay.AdvancementFrame.TASK, false, false, AdvancementVisibility.ALWAYS);
        rootDisplay.setBackgroundTexture("textures/block/end_stone.png");
        root = new Advancement(null, new NameKey("MineQuaft", "root"), rootDisplay);

        AdvancementDisplay draconicTimesDisplay = new AdvancementDisplay(dragonscale, "Draconic times", "Pick up the powerful scales of an ender dragon", AdvancementDisplay.AdvancementFrame.GOAL, false, false, AdvancementVisibility.ALWAYS);
        draconicTimesDisplay.setCoordinates(2, 0);
        draconicTimes = new Advancement(root, new NameKey("MineQuaft", "draconicTimes"), draconicTimesDisplay);

        manager.addAdvancement(root, draconicTimes);
    }

    @EventHandler
    public void addPlayer(PlayerJoinEvent event) {
        manager.loadProgress(event.getPlayer(), "MineQuaft");

        new BukkitRunnable() {

            @Override
            public void run() {

                manager.addPlayer(event.getPlayer());
                manager.update(event.getPlayer());

            }
        }.runTaskLater(Main.getPlugin(), 2);
    }

    //Advancements

    @EventHandler
    private void draconicTimesEvent(EntityPickupItemEvent event) {

        Player player = (Player) event.getEntity();

        Bukkit.getScheduler().runTaskLater(Main.getPlugin(), () -> {
            if(event.getItem().getItemStack().isSimilar(dragonscale)) {
                if(manager.getCriteriaProgress(player, draconicTimes) < draconicTimes.getCriteria()) {
                    manager.grantAdvancement(player, draconicTimes);
                    draconicTimes.displayToast(player);
                    manager.saveProgress(player, "MineQuaft");
                    try {
                        SaveAdvancements.setDraconicTimes(player, true);
                    } catch (Exception exception) {
                        exception.printStackTrace();
                    }
                }
            }
        }, 1);
    }
}
