package de.kevin.draconic.achievements;

import de.kevin.draconic.items.ItemStackFactory;
import de.kevin.draconic.main.Main;
import org.bukkit.entity.HumanEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.inventory.ItemStack;

public class HasFusionTomb implements Listener {

    ItemStack fusionTomb = ItemStackFactory.getInstance().getFusionTomb();

    AchievementClass achievementClass = new AchievementClass(Main.getPlugin());

    @EventHandler
    public void onCraftedFusionTomb(CraftItemEvent event) {
        HumanEntity player = event.getWhoClicked();
        if(event.getInventory().getResult() != null) {
            if(event.getInventory().getResult().isSimilar(fusionTomb))
            achievementClass.giveAchievements(player, Achievements.HASFUSIONBOOK);
        }
    }
}
