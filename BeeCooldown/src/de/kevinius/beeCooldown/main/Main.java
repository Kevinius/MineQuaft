package de.kevinius.beeCooldown.main;

import de.kevinius.beeCooldown.listener.BreedingCooldown;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * @author Kevinius
 */

public class Main extends JavaPlugin {

    private static Main plugin;

    public void onEnable() {
        plugin = this;

        PluginManager pluginManager = Bukkit.getPluginManager();

        pluginManager.registerEvents(new BreedingCooldown(), this);
    }

    public static Main getPlugin() {
        return plugin;
    }
}
