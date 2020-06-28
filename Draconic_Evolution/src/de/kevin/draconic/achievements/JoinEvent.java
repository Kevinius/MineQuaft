package de.kevin.draconic.achievements;

import de.kevin.draconic.main.Main;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinEvent implements Listener {

    AchievementClass achievementClass = new AchievementClass(Main.getPlugin());

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        achievementClass.giveAchievements(event.getPlayer(), Achievements.FIRSTJOIN);
    }

}
