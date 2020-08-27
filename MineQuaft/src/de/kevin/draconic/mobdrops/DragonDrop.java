package de.kevin.draconic.mobdrops;

import de.kevin.draconic.items.ItemStackFactory;
import org.bukkit.entity.EnderDragon;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Pig;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;

public class DragonDrop implements Listener{

	ItemStack dragonScale = ItemStackFactory.getInstance().createDragonScale();

	@EventHandler
	public void mobDeath(EntityDeathEvent event) {

		dragonScale.setAmount(4);

		LivingEntity entity = event.getEntity();
		
		if(entity instanceof EnderDragon) {
			event.getDrops().clear();
			event.setDroppedExp(0);
			entity.getLocation().getWorld().dropItem(entity.getLocation(), dragonScale);
		}
	}
}
