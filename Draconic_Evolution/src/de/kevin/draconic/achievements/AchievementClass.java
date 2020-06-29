package de.kevin.draconic.achievements;

import org.bukkit.Bukkit;
import org.bukkit.entity.HumanEntity;
import org.bukkit.plugin.Plugin;

public class AchievementClass {

    Plugin plugin = null;

    public AchievementClass(Plugin plugin) {
        this.plugin = plugin;
    }

    public boolean hasAchievement(HumanEntity player, Achievements achievements) {
        return plugin.getConfig().get(player.getName() + ".Achievements." + achievements.getName()) != null ? true : false;
    }

    public void giveAchievements(HumanEntity player, Achievements achievements) {
        if(!hasAchievement(player, achievements)){
            plugin.getConfig().set(player.getName() + ".Achievements." + achievements.getName(), true);
            plugin.saveConfig();
            Bukkit.broadcastMessage("§b" + player.getName() + " §6 has unlocked the Achievement: §b[" + achievements.getName() + "]§6!");
        }
    }
}
