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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FusionQuaftingInventory implements Listener {
	
	private Inventory fusionCraftingInventory;
	private final ItemStack fillItem = ItemStackFactory.getInstance().getFillItem();
	private final ItemStack loadBackground = ItemStackFactory.getInstance().getLoadBackground();
	private final ItemStack resultBarrier = ItemStackFactory.getInstance().getResultBarrier();
	private final ItemStack confirmItem = ItemStackFactory.getInstance().getConfirmItem();
	private final ItemStack quaftingBook = ItemStackFactory.getInstance().getQuaftingBook();
	private final ItemStack back = ItemStackFactory.getInstance().getBack();

	private final NoTakingItems noTakingItems = new NoTakingItems();
	private final OnCloseInventory onCloseInventory = new OnCloseInventory();

	public String fqName = "§6Fusion §5Quafting";

	public static ArrayList playersInTable = new ArrayList();
	
	//==================== INVENTORY =====================================
	
	public void createFusionCraftingInventory(Player player) {
		fusionCraftingInventory = Bukkit.createInventory(null, 9*6, fqName);
		
		ItemStack fi = fillItem;
		ItemStack lb = loadBackground;
		ItemStack rb = resultBarrier;
		ItemStack ci = confirmItem;
		ItemStack qb = quaftingBook;

		lb.setAmount(1);
		fi.setAmount(1);
		rb.setAmount(1);
		
		//=================== 1 ====================
		
		fusionCraftingInventory.setItem(0, lb);
		fusionCraftingInventory.setItem(1, lb);
		fusionCraftingInventory.setItem(2, lb);
		fusionCraftingInventory.setItem(3, lb);
		fusionCraftingInventory.setItem(4, lb);
		fusionCraftingInventory.setItem(5, lb);
		fusionCraftingInventory.setItem(6, lb);
		fusionCraftingInventory.setItem(7, lb);
		fusionCraftingInventory.setItem(8, lb);
		
		//==================== 2 =====================
		
		fusionCraftingInventory.setItem(9, lb);
		
		fusionCraftingInventory.setItem(11, fi);
		fusionCraftingInventory.setItem(12, fi);
		
		fusionCraftingInventory.setItem(14, fi);
		fusionCraftingInventory.setItem(15, fi);
		
		fusionCraftingInventory.setItem(17, lb);
		
		//===================== 3 ====================
		
		fusionCraftingInventory.setItem(18, lb);
		
		fusionCraftingInventory.setItem(20, fi);
		fusionCraftingInventory.setItem(21, fi);
		fusionCraftingInventory.setItem(22, qb);
		fusionCraftingInventory.setItem(23, fi);
		fusionCraftingInventory.setItem(24, fi);
		
		fusionCraftingInventory.setItem(26, lb);
		
		//====================== 4 ====================
		
		fusionCraftingInventory.setItem(27, lb);
		
		fusionCraftingInventory.setItem(29, fi);
		fusionCraftingInventory.setItem(30, fi);
		fusionCraftingInventory.setItem(31, ci);
		fusionCraftingInventory.setItem(32, fi);
		fusionCraftingInventory.setItem(33, fi);
		
		fusionCraftingInventory.setItem(35, lb);
		
		//====================== 5 ====================
		
		fusionCraftingInventory.setItem(36, lb);
		
		fusionCraftingInventory.setItem(38, fi);
		fusionCraftingInventory.setItem(39, fi);
		fusionCraftingInventory.setItem(40, rb);
		fusionCraftingInventory.setItem(41, fi);
		fusionCraftingInventory.setItem(42, fi);
		
		fusionCraftingInventory.setItem(44, lb);
		
		//====================== 6 ====================
		
		fusionCraftingInventory.setItem(45, lb);
		fusionCraftingInventory.setItem(46, lb);
		fusionCraftingInventory.setItem(47, lb);
		fusionCraftingInventory.setItem(48, lb);
		fusionCraftingInventory.setItem(49, lb);
		fusionCraftingInventory.setItem(50, lb);
		fusionCraftingInventory.setItem(51, lb);
		fusionCraftingInventory.setItem(52, lb);
		fusionCraftingInventory.setItem(53, lb);
		
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
	public void onPlayerCloseInventory(InventoryCloseEvent event) {
		onCloseInventory.onPlayerCloseInventory(event, fusionCraftingInventory);
	}

	@EventHandler
	public void noTakingItems(InventoryClickEvent event) {
		noTakingItems.noTakingItems(event, fusionCraftingInventory);
	}

	/*=====================GETTER & SETTER=============================*/

	public Inventory getFusionQuaftingInventory() {
		return fusionCraftingInventory;
	}

}
