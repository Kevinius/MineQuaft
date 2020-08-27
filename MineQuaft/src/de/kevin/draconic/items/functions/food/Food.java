package de.kevin.draconic.items.functions.food;

import de.kevin.draconic.items.ItemStackFactory;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Food implements Listener {

    ItemStack borgar = ItemStackFactory.getInstance().getBigMoq();
    ItemStack sushi = ItemStackFactory.getInstance().getSushi();
    ItemStack donut = ItemStackFactory.getInstance().getDonut();

    @EventHandler
    private void onConsume(PlayerItemConsumeEvent event) {
        if(event.getItem().isSimilar(borgar)) {
            event.getPlayer().setFoodLevel(20);
            event.getPlayer().setSaturation(20);
        }
        if(event.getItem().isSimilar(sushi)) {
            event.getPlayer().setFoodLevel(event.getPlayer().getFoodLevel() + 2);
            event.getPlayer().setSaturation(event.getPlayer().getSaturation() + 1);
        }
        if(event.getItem().isSimilar(donut)) {
            event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 100, 1));
        }
    }
}
