package de.kevinius.minequaft.items.functions.tool;

import de.kevinius.minequaft.main.Main;
import org.bukkit.Bukkit;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.enchantment.EnchantItemEvent;

import java.util.Objects;

public class ItemLore implements Listener {

    @EventHandler
    private void itemLoreOnEnchant(EnchantItemEvent event) {
        Bukkit.broadcastMessage("1");
        Bukkit.getScheduler().runTaskLater(Main.getPlugin(), () -> {
            Bukkit.broadcastMessage("2");
            if (event.getItem().getEnchantmentLevel(Enchantment.PROTECTION_ENVIRONMENTAL) == 1) {
                Bukkit.broadcastMessage("3");
                Objects.requireNonNull(Objects.requireNonNull(event.getItem().getItemMeta()).getLore()).clear();
            }
        }, 1);
    }
}
