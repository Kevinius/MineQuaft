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
	
	private Inventory fusionCraftingInventory;
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
		fusionCraftingInventory = Bukkit.createInventory(null, 9*6, fqName);

		loadBackground.setAmount(1);
		fillItem.setAmount(1);
		resultBarrier.setAmount(1);
		
		//=================== 1 ====================
		
		fusionCraftingInventory.setItem(0, loadBackground);
		fusionCraftingInventory.setItem(1, loadBackground);
		fusionCraftingInventory.setItem(2, loadBackground);
		fusionCraftingInventory.setItem(3, loadBackground);
		fusionCraftingInventory.setItem(4, loadBackground);
		fusionCraftingInventory.setItem(5, loadBackground);
		fusionCraftingInventory.setItem(6, loadBackground);
		fusionCraftingInventory.setItem(7, loadBackground);
		fusionCraftingInventory.setItem(8, loadBackground);
		
		//==================== 2 =====================
		
		fusionCraftingInventory.setItem(9, loadBackground);
		
		fusionCraftingInventory.setItem(11, fillItem);
		fusionCraftingInventory.setItem(12, fillItem);
		
		fusionCraftingInventory.setItem(14, fillItem);
		fusionCraftingInventory.setItem(15, fillItem);
		
		fusionCraftingInventory.setItem(17, loadBackground);
		
		//===================== 3 ====================
		
		fusionCraftingInventory.setItem(18, loadBackground);
		
		fusionCraftingInventory.setItem(20, fillItem);
		fusionCraftingInventory.setItem(21, fillItem);
		fusionCraftingInventory.setItem(22, quaftingBook);
		fusionCraftingInventory.setItem(23, fillItem);
		fusionCraftingInventory.setItem(24, fillItem);
		
		fusionCraftingInventory.setItem(26, loadBackground);
		
		//====================== 4 ====================
		
		fusionCraftingInventory.setItem(27, loadBackground);
		
		fusionCraftingInventory.setItem(29, fillItem);
		fusionCraftingInventory.setItem(30, fillItem);
		fusionCraftingInventory.setItem(31, confirmItem);
		fusionCraftingInventory.setItem(32, fillItem);
		fusionCraftingInventory.setItem(33, fillItem);
		
		fusionCraftingInventory.setItem(35, loadBackground);
		
		//====================== 5 ====================
		
		fusionCraftingInventory.setItem(36, loadBackground);
		
		fusionCraftingInventory.setItem(38, fillItem);
		fusionCraftingInventory.setItem(39, fillItem);
		fusionCraftingInventory.setItem(40, resultBarrier);
		fusionCraftingInventory.setItem(41, fillItem);
		fusionCraftingInventory.setItem(42, fillItem);
		
		fusionCraftingInventory.setItem(44, loadBackground);
		
		//====================== 6 ====================
		
		fusionCraftingInventory.setItem(45, loadBackground);
		fusionCraftingInventory.setItem(46, loadBackground);
		fusionCraftingInventory.setItem(47, loadBackground);
		fusionCraftingInventory.setItem(48, loadBackground);
		fusionCraftingInventory.setItem(49, loadBackground);
		fusionCraftingInventory.setItem(50, loadBackground);
		fusionCraftingInventory.setItem(51, loadBackground);
		fusionCraftingInventory.setItem(52, loadBackground);
		fusionCraftingInventory.setItem(53, loadBackground);
		
		//================== END ======================
		
		player.openInventory(fusionCraftingInventory);
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
	public void onPlayerCloseInventory(InventoryCloseEvent event) { onCloseInventory.onPlayerCloseInventory(event, fusionCraftingInventory); }

	@EventHandler
	public void noTakingItems(InventoryClickEvent event) {
		noTakingItems.noTakingItems(event, fusionCraftingInventory);
	}

	/*=====================GETTER & SETTER=============================*/

	public Inventory getFusionQuaftingInventory() {
		return fusionCraftingInventory;
	}

}
