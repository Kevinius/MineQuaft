package de.kevin.draconic.achievements;

import de.kevin.draconic.items.ItemStackFactory;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class AchievementClass {

    Plugin plugin = null;

    public AchievementClass(Plugin plugin) {
        this.plugin = plugin;
    }

    public boolean hasAchievement(Player player, Achievements achievements) {
        return plugin.getConfig().get(player.getName() + ".Achievements." + achievements.getName()) != null ? true : false;
    }

    public void giveAchievements(Player player, Achievements achievements) {
        if(!hasAchievement(player, achievements)){
            plugin.getConfig().set(player.getName() + ".Achievements." + achievements.getName(), true);
            plugin.saveConfig();
            player.sendMessage("§6Du hast das Achievement \'§b" + achievements.getName() + "§6\' freigeschaltet!");
            player.getInventory().addItem(ItemStackFactory.getInstance().getEndirium());
            player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1, 1);
        }
    }
}
