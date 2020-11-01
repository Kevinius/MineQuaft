package de.kevinius.minequaft.items.functions.food;

import de.kevinius.minequaft.items.ItemStackFactory;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Objects;

public class Food implements Listener {

    private final int bigMoqData = Objects.requireNonNull(ItemStackFactory.getInstance().getBigMoq().getItemMeta()).getCustomModelData();
    private final int sushiData = Objects.requireNonNull(ItemStackFactory.getInstance().getSushi().getItemMeta()).getCustomModelData();
    private final int donutData = Objects.requireNonNull(ItemStackFactory.getInstance().getDonut().getItemMeta()).getCustomModelData();
    private final int chickMoqData = Objects.requireNonNull(ItemStackFactory.getInstance().getChickmoq().getItemMeta()).getCustomModelData();
    private final int mirrorEggData = Objects.requireNonNull(ItemStackFactory.getInstance().getMirrorEgg().getItemMeta()).getCustomModelData();

    @EventHandler
    private void onConsume(PlayerItemConsumeEvent event) {

        if(event.getItem().hasItemMeta() && Objects.requireNonNull(event.getItem().getItemMeta()).hasCustomModelData()) {
            if(Objects.requireNonNull(event.getItem().getItemMeta()).getCustomModelData() == bigMoqData) {
                event.getPlayer().setFoodLevel(20);
                event.getPlayer().setSaturation(20);
            }
        }
        if(event.getItem().hasItemMeta() && Objects.requireNonNull(event.getItem().getItemMeta()).hasCustomModelData()) {
            if(Objects.requireNonNull(event.getItem().getItemMeta()).getCustomModelData() == chickMoqData) {
                event.getPlayer().setFoodLevel(20);
                event.getPlayer().setSaturation(20);
            }
        }
        if(event.getItem().hasItemMeta() && Objects.requireNonNull(event.getItem().getItemMeta()).hasCustomModelData()) {
            if(Objects.requireNonNull(event.getItem().getItemMeta()).getCustomModelData() == sushiData) {
                event.getPlayer().setFoodLevel(event.getPlayer().getFoodLevel() + 2);
                event.getPlayer().setSaturation(event.getPlayer().getSaturation() + 1);
            }
        }

        if(event.getItem().hasItemMeta() && Objects.requireNonNull(event.getItem().getItemMeta()).hasCustomModelData()) {
            if(Objects.requireNonNull(event.getItem().getItemMeta()).getCustomModelData() == mirrorEggData) {
                event.getPlayer().setFoodLevel(event.getPlayer().getFoodLevel() - 4);
                event.getPlayer().setSaturation(event.getPlayer().getSaturation() - (float)8.8);
            }
        }
        if(event.getItem().hasItemMeta() && Objects.requireNonNull(event.getItem().getItemMeta()).hasCustomModelData()) {
            if(Objects.requireNonNull(event.getItem().getItemMeta()).getCustomModelData() == donutData) {
                event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 100, 1));
            }
        }
    }
}
