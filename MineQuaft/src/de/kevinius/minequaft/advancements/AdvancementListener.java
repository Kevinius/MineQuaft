package de.kevinius.minequaft.advancements;

import de.kevinius.minequaft.items.ItemStackFactory;
import de.kevinius.minequaft.main.Main;
import eu.endercentral.crazy_advancements.*;
import eu.endercentral.crazy_advancements.manager.AdvancementManager;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityPickupItemEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.Objects;

public class AdvancementListener implements Listener {

    private final AdvancementManager manager;

    private final Advancement draconicTimes;
    private final Advancement upgradesPeople;

    public AdvancementListener() {

        manager = CrazyAdvancements.getNewAdvancementManager();

        ItemStack endirium = ItemStackFactory.getInstance().getEndirium();
        AdvancementDisplay rootDisplay = new AdvancementDisplay(endirium, "MineQuaft-Evolution", "everything about MineQuaft", AdvancementDisplay.AdvancementFrame.TASK, false, false, AdvancementVisibility.ALWAYS);
        rootDisplay.setBackgroundTexture("textures/block/end_stone.png");
        Advancement root = new Advancement(null, new NameKey("MineQuaft", "root"), rootDisplay);

        ItemStack dragonscale = ItemStackFactory.getInstance().getDragonScale();
        AdvancementDisplay draconicTimesDisplay = new AdvancementDisplay(dragonscale, "Draconic times", "Pick up the powerful scales of an ender dragon", AdvancementDisplay.AdvancementFrame.GOAL, false, false, AdvancementVisibility.ALWAYS);
        draconicTimesDisplay.setCoordinates(1, 0);
        draconicTimes = new Advancement(root, new NameKey("MineQuaft", "draconicTimes"), draconicTimesDisplay);

        AdvancementDisplay upgradesPeopleDisplay = new AdvancementDisplay(Material.CRAFTING_TABLE, "Upgrades people, upgrades!", "Craft a Xtreme Quafting table", AdvancementDisplay.AdvancementFrame.GOAL, false, false, AdvancementVisibility.ALWAYS);
        upgradesPeopleDisplay.setCoordinates(2, -1);
        upgradesPeople = new Advancement(draconicTimes, new NameKey("MineQuaft", "upgradesPeople"), upgradesPeopleDisplay);

        manager.addAdvancement(root, draconicTimes, upgradesPeople);
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

    /*-------------- Draconic Times ------------------*/
    @EventHandler
    private void draconicTimesEvent(EntityPickupItemEvent event) {

        int dragonScaleData = Objects.requireNonNull(ItemStackFactory.getInstance().getDragonScale().getItemMeta()).getCustomModelData();

        Bukkit.getScheduler().runTaskLater(Main.getPlugin(), () -> {
            if(event.getEntity() instanceof Player) {
                Player player = (Player) event.getEntity();
                if(Objects.requireNonNull(event.getItem().getItemStack().getItemMeta()).hasCustomModelData() && Objects.requireNonNull(event.getItem().getItemStack().getItemMeta()).getCustomModelData() == dragonScaleData) {
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
            }
        }, 1);
    }

    /*-------------- Upgrades people, upgrades ------------------*/
}
