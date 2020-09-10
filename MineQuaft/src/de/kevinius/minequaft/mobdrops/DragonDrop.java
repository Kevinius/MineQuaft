package de.kevinius.minequaft.mobdrops;

import de.kevinius.minequaft.items.ItemStackFactory;
import org.bukkit.entity.EnderDragon;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Pig;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Objects;

public class DragonDrop implements Listener{

	ItemStack dragonScale = ItemStackFactory.getInstance().getDragonScale();

	@EventHandler
	public void mobDeath(EntityDeathEvent event) {

		dragonScale.setAmount(4);

		LivingEntity entity = event.getEntity();
		
		if(entity instanceof EnderDragon) {
			event.getDrops().clear();
			event.setDroppedExp(0);
			Objects.requireNonNull(entity.getLocation().getWorld()).dropItem(entity.getLocation(), dragonScale);
		}
	}
}
