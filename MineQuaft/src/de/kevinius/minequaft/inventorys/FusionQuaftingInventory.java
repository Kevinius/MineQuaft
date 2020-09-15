package de.kevinius.minequaft.inventorys;

import de.kevinius.minequaft.advancements.SaveAdvancements;
import de.kevinius.minequaft.inventorys.functions.NoTakingItems;
import de.kevinius.minequaft.inventorys.functions.OnCloseInventory;
import de.kevinius.minequaft.items.ItemStackFactory;
import de.kevinius.minequaft.main.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.List;
import java.util.Objects;

public class FusionQuaftingInventory implements Listener {
	
	private Inventory fusionQuaftingInventory;
	private final ItemStack fillItem = ItemStackFactory.getInstance().getFillItem();
	private final ItemStack loadBackground = ItemStackFactory.getInstance().getLoadBackground();
	private final ItemStack resultBarrier = ItemStackFactory.getInstance().getResultBarrier();
	private final ItemStack confirmItem = ItemStackFactory.getInstance().getConfirmItem();
	private final ItemStack quaftingBook = ItemStackFactory.getInstance().getQuaftingBook();

	private final NoTakingItems noTakingItems = new NoTakingItems();
	private final OnCloseInventory onCloseInventory = new OnCloseInventory();

	public String fqName = "§6Fusion §5Quafting";

	//==================== INVENTORY =====================================
	
	public void createFusionCraftingInventory(Player player) {
		fusionQuaftingInventory = Bukkit.createInventory(null, 9*6, fqName);

		loadBackground.setAmount(1);
		fillItem.setAmount(1);
		resultBarrier.setAmount(1);
		
		//=================== 1 ====================
		
		fusionQuaftingInventory.setItem(0, loadBackground);
		fusionQuaftingInventory.setItem(1, loadBackground);
		fusionQuaftingInventory.setItem(2, loadBackground);
		fusionQuaftingInventory.setItem(3, loadBackground);
		fusionQuaftingInventory.setItem(4, loadBackground);
		fusionQuaftingInventory.setItem(5, loadBackground);
		fusionQuaftingInventory.setItem(6, loadBackground);
		fusionQuaftingInventory.setItem(7, loadBackground);
		fusionQuaftingInventory.setItem(8, loadBackground);
		
		//==================== 2 =====================
		
		fusionQuaftingInventory.setItem(9, loadBackground);
		
		fusionQuaftingInventory.setItem(11, fillItem);
		fusionQuaftingInventory.setItem(12, fillItem);
		
		fusionQuaftingInventory.setItem(14, fillItem);
		fusionQuaftingInventory.setItem(15, fillItem);
		
		fusionQuaftingInventory.setItem(17, loadBackground);
		
		//===================== 3 ====================
		
		fusionQuaftingInventory.setItem(18, loadBackground);
		
		fusionQuaftingInventory.setItem(20, fillItem);
		fusionQuaftingInventory.setItem(21, fillItem);
		fusionQuaftingInventory.setItem(22, quaftingBook);
		fusionQuaftingInventory.setItem(23, fillItem);
		fusionQuaftingInventory.setItem(24, fillItem);
		
		fusionQuaftingInventory.setItem(26, loadBackground);
		
		//====================== 4 ====================
		
		fusionQuaftingInventory.setItem(27, loadBackground);
		
		fusionQuaftingInventory.setItem(29, fillItem);
		fusionQuaftingInventory.setItem(30, fillItem);
		fusionQuaftingInventory.setItem(31, confirmItem);
		fusionQuaftingInventory.setItem(32, fillItem);
		fusionQuaftingInventory.setItem(33, fillItem);
		
		fusionQuaftingInventory.setItem(35, loadBackground);
		
		//====================== 5 ====================
		
		fusionQuaftingInventory.setItem(36, loadBackground);
		
		fusionQuaftingInventory.setItem(38, fillItem);
		fusionQuaftingInventory.setItem(39, fillItem);
		fusionQuaftingInventory.setItem(40, resultBarrier);
		fusionQuaftingInventory.setItem(41, fillItem);
		fusionQuaftingInventory.setItem(42, fillItem);
		
		fusionQuaftingInventory.setItem(44, loadBackground);
		
		//====================== 6 ====================
		
		fusionQuaftingInventory.setItem(45, loadBackground);
		fusionQuaftingInventory.setItem(46, loadBackground);
		fusionQuaftingInventory.setItem(47, loadBackground);
		fusionQuaftingInventory.setItem(48, loadBackground);
		fusionQuaftingInventory.setItem(49, loadBackground);
		fusionQuaftingInventory.setItem(50, loadBackground);
		fusionQuaftingInventory.setItem(51, loadBackground);
		fusionQuaftingInventory.setItem(52, loadBackground);
		fusionQuaftingInventory.setItem(53, loadBackground);
		
		//================== END ======================

		player.openInventory(fusionQuaftingInventory);

	}

	@EventHandler
	public void openInventory(PlayerInteractEvent event) {
		Player player = event.getPlayer();
		if(event.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
				if(Objects.requireNonNull(event.getClickedBlock()).getType().equals(Material.SMOKER)) {
					List<Entity> armorstand = event.getClickedBlock().getWorld().getEntities();
					double blockX = event.getClickedBlock().getX() + 0.5;
					double blockZ = event.getClickedBlock().getZ() + 0.5;
					double blockY = event.getClickedBlock().getY() + 0.3;
					for(Entity e : armorstand) {
						if(e.getLocation().getX() == blockX
						&& e.getLocation().getY() == blockY
						&& e.getLocation().getZ() == blockZ){
							if(SaveAdvancements.Config.getBoolean(player.getName() + ".Advancements.draconicTimes")) {
								Bukkit.getScheduler().runTaskLater(Main.getPlugin(), () -> createFusionCraftingInventory(player), 1);
						} else {
							event.setCancelled(true);
							event.getPlayer().sendMessage("§cIt seems like you don't have the knowledge to use this table...");
						}
					}
				}
			}
		}
	}

	@EventHandler
	public void onPlayerCloseInventory(InventoryCloseEvent event) { onCloseInventory.onPlayerCloseInventory(event, fusionQuaftingInventory); }

	@EventHandler
	public void noTakingItems(InventoryClickEvent event) {
		noTakingItems.noTakingItems(event, fusionQuaftingInventory);
	}
}
