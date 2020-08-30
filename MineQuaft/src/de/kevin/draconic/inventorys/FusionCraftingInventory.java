package de.kevin.draconic.inventorys;

import de.kevin.draconic.advancements.SaveAdvancements;
import de.kevin.draconic.items.ItemStackFactory;
import de.kevin.draconic.main.Main;
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

public class FusionCraftingInventory implements Listener {
	
	public Inventory fusionCraftingInventory;
	ItemStack fillItem = ItemStackFactory.getInstance().getFillItem();
	ItemStack loadBackround = ItemStackFactory.getInstance().getLoadBackround();
	ItemStack resultBarrier = ItemStackFactory.getInstance().getResultBarrier();
	ItemStack confirmItem = ItemStackFactory.getInstance().getConfirmItem();

	public final String fcName = "§6Fusion §5Quafting";

	public static ArrayList playersInTable = new ArrayList();
	
	//==================== INVENTORY =====================================
	
	public void createFusionCraftingInventory(Player player) {
		fusionCraftingInventory = Bukkit.createInventory(null, 9*6, fcName);
		
		ItemStack fi = fillItem;
		ItemStack lb = loadBackround;
		ItemStack rb = resultBarrier;
		ItemStack ci = confirmItem;
		
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
		fusionCraftingInventory.setItem(22, fi);
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
		playersInTable.remove(event.getPlayer().getName());
		event.getView().getTitle();
		if (event.getView().getTitle().equals(fcName)) {
			ItemStack[] arrayOfItemStack;
			int j = (arrayOfItemStack = event.getInventory().getContents()).length;
			for (int i = 0; i < j; i++) {
				ItemStack item = arrayOfItemStack[i];
				if (item != null && !item.isSimilar(fillItem)
				 && !item.isSimilar(resultBarrier)
				 && !item.isSimilar(loadBackround)
				 && !item.isSimilar(confirmItem)) {
					event.getPlayer().getWorld().dropItem(event.getPlayer().getLocation(), item);
				}
			}
		}
	}
	
	public Inventory getFusionCraftingInventory() {
		return fusionCraftingInventory;
	}
	
	@EventHandler
	public void noTakingItems(InventoryClickEvent event) {
		if(event.getClickedInventory() != null) {
			if(event.getClickedInventory().equals(fusionCraftingInventory)) {
				Bukkit.getScheduler().runTaskLater(Main.getPlugin(), () -> {
					if(event.getWhoClicked().getOpenInventory().getItem(40) == null) {
						event.getWhoClicked().getOpenInventory().setItem(40, resultBarrier);
					}
				}, 1);
			}
		}
		
		if(fusionCraftingInventory != null) {
			if(event.getView().getTitle().equals(fcName)) {
				if(event.getCurrentItem() != null) {
					event.getClick();
					if(event.isLeftClick() && event.getCurrentItem().isSimilar(fillItem)
						|| event.isRightClick() && event.getCurrentItem().isSimilar(fillItem)
						|| event.isShiftClick() && event.getCurrentItem().isSimilar(fillItem)
						
						|| event.isRightClick() && event.getCurrentItem().isSimilar(loadBackround)
						|| event.isLeftClick() && event.getCurrentItem().isSimilar(loadBackround)
						|| event.isShiftClick() && event.getCurrentItem().isSimilar(loadBackround)
						
						|| event.isShiftClick() && event.getCurrentItem().isSimilar(resultBarrier)
						|| event.isRightClick() && event.getCurrentItem().isSimilar(resultBarrier)
						|| event.isLeftClick() && event.getCurrentItem().isSimilar(resultBarrier)
						
						|| event.isShiftClick() && event.getCurrentItem().isSimilar(confirmItem)
						|| event.isRightClick() && event.getCurrentItem().isSimilar(confirmItem)
						|| event.isLeftClick() && event.getCurrentItem().isSimilar(confirmItem)
						
						|| event.getClick().isKeyboardClick()) {
							event.setCancelled(true);
					}
				}
			}
		}
	}
}
