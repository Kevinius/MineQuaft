package de.kevin.draconic.mobdrops;

import de.kevin.draconic.items.ItemStackFactory;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Pig;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;

public class DragonDrop implements Listener{

	ItemStack dragonScale = ItemStackFactory.getInstance().createDragonScale(4);

	@EventHandler
	public void mobDeath(EntityDeathEvent event) {
		
		event.getDrops().clear();
		event.setDroppedExp(0);

		LivingEntity entity = event.getEntity();
		
		if(entity instanceof Pig) {
			entity.getLocation().getWorld().dropItem(entity.getLocation(), dragonScale);
		}
	}
}
