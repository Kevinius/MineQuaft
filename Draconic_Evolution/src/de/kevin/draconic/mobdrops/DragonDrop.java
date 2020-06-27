package de.kevin.draconic.mobdrops;

import org.bukkit.Bukkit;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Pig;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

import de.kevin.draconic.items.DragonScale;

public class DragonDrop implements Listener{
	
	private DragonScale dragonScale = new DragonScale();
	
	@EventHandler
	public void mobDeath(EntityDeathEvent event) {
		
		dragonScale.createDragonScale();
		
		event.getDrops().clear();
		event.setDroppedExp(0);

		LivingEntity entity = event.getEntity();
		
		if(entity instanceof Pig) {
			entity.getLocation().getWorld().dropItem(entity.getLocation(), dragonScale.getDragonScale());
			Bukkit.broadcastMessage("§aEvent §6EntityDeathEvent §awurde geladen!");
		}
	}
}
