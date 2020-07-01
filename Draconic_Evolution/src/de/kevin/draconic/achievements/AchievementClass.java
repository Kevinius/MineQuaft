package de.kevin.draconic.achievements;

import de.kevin.draconic.items.ItemStackFactory;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.HumanEntity;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

public class AchievementClass {

    Plugin plugin;

    ItemStack fusionCraftingTablet = ItemStackFactory.getInstance().createCraftingTablets(Material.KNOWLEDGE_BOOK,
            "§dFusion Quafting Tablet", "§7Quaft really powerful items with it!");

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
            Bukkit.broadcastMessage(player.getName() + " has made the advancement §a[The Beginning]");
            if(player.getInventory().firstEmpty() != -1) {
                player.getInventory().addItem(fusionCraftingTablet);
            } else {
                player.getWorld().dropItemNaturally(player.getLocation(), fusionCraftingTablet);
            }
        }
    }
}
