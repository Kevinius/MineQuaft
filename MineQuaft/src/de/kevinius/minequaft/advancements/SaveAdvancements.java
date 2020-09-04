package de.kevinius.minequaft.advancements;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import java.io.File;
import java.io.IOException;

public class SaveAdvancements {

    public static File ConfigFile = new File("plugins/MineQuaft", "config.yml");
    public static FileConfiguration Config = YamlConfiguration.loadConfiguration(ConfigFile);

    public static void save() throws IOException {
        Config.save(ConfigFile);
    }

    //DraconicTimes
    public static void setDraconicTimes(Player player, Boolean advancementDone) throws IOException {
        Config.set(player.getName() + ".Advancements.draconicTimes", advancementDone);
        save();
    }

    static Boolean getDraconicTimes(Player player) {
        return Config.getBoolean(player.getName() + ".Advancements.draconicTimes");
    }
}
