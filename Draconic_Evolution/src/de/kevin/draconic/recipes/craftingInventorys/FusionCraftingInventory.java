package de.kevin.draconic.recipes.craftingInventorys;

import de.kevin.draconic.items.CraftingTablets;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class FusionCraftingInventory implements Listener {
	
	public Inventory inventory;
	public ItemStack fillItem;
	public ItemStack loadBackround;
	public ItemStack resultBarrier;
	public ItemStack confirmItem;
	public ItemStack loadPurple;
	public ItemStack loadOrange;

	CraftingTablets craftingTablets = new CraftingTablets();
	
	public final String fcName = "§6Fusion §5Quafting";
	
	//=========================== ITEMS ====================================
	
	public ItemStack createConfirmItem() {
		
		confirmItem = new ItemStack(Material.GREEN_STAINED_GLASS_PANE);
		
		ItemMeta confirmItemMeta = confirmItem.getItemMeta();
		confirmItemMeta.setDisplayName("§2Craft item!");
		confirmItem.setItemMeta(confirmItemMeta);
		
		return confirmItem;
	}
	
	public ItemStack createResultBarrier() {
		
		resultBarrier = new ItemStack(Material.BARRIER);
		
		ItemMeta resultBarrierMeta = resultBarrier.getItemMeta();
		resultBarrierMeta.setDisplayName("§4No Result!");
		resultBarrier.setItemMeta(resultBarrierMeta);
		
		return resultBarrier;
	}
	
	public ItemStack createFillItem() {
		
		fillItem = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
		
		ItemMeta fillItemMeta = fillItem.getItemMeta();
		fillItemMeta.setDisplayName(" ");
		fillItem.setItemMeta(fillItemMeta);
		
		return fillItem;
		
	}
	
	public ItemStack createLoadBackground() {
		
		loadBackround = new ItemStack(Material.BLUE_STAINED_GLASS_PANE);
		
		ItemMeta loadBackgroundMeta = loadBackround.getItemMeta();
		loadBackgroundMeta.setDisplayName(" ");
		loadBackround.setItemMeta(loadBackgroundMeta);
		
		return loadBackround;
		
	}
	
	public ItemStack createLoadPurple() {
		
		loadPurple = new ItemStack(Material.PURPLE_STAINED_GLASS_PANE);
		
		ItemMeta loadPurpleMeta = loadPurple.getItemMeta();
		loadPurpleMeta.setDisplayName(" ");
		loadPurple.setItemMeta(loadPurpleMeta);
		
		return loadPurple;
		
	}
	
	public ItemStack createLoadOrange() {
		
		loadOrange = new ItemStack(Material.ORANGE_STAINED_GLASS_PANE);
		
		ItemMeta loadOrangeMeta = loadOrange.getItemMeta();
		loadOrangeMeta.setDisplayName(" ");
		loadOrange.setItemMeta(loadOrangeMeta);
		
		return loadOrange;
		
	}
	
	//==================== INVENTORY =====================================
	
	public void createInventory(Player player) {
		inventory = Bukkit.createInventory(null, 9*6, fcName);
		
		ItemStack fi = createFillItem();
		ItemStack lb = createLoadBackground();
		ItemStack rb = createResultBarrier();
		ItemStack ci = createConfirmItem();
		
		lb.setAmount(1);
		fi.setAmount(1);
		rb.setAmount(1);
		
		//=================== 1 ====================
		
		inventory.setItem(0, lb);
		inventory.setItem(1, lb);
		inventory.setItem(2, lb);
		inventory.setItem(3, lb);
		inventory.setItem(4, lb);
		inventory.setItem(5, lb);
		inventory.setItem(6, lb);
		inventory.setItem(7, lb);
		inventory.setItem(8, lb);
		
		//==================== 2 =====================
		
		inventory.setItem(9, lb);
		
		inventory.setItem(11, fi);
		inventory.setItem(12, fi);
		
		inventory.setItem(14, fi);
		inventory.setItem(15, fi);
		
		inventory.setItem(17, lb);
		
		//===================== 3 ====================
		
		inventory.setItem(18, lb);
		
		inventory.setItem(20, fi);
		inventory.setItem(21, fi);
		inventory.setItem(22, fi);
		inventory.setItem(23, fi);
		inventory.setItem(24, fi);
		
		inventory.setItem(26, lb);
		
		//====================== 4 ====================
		
		inventory.setItem(27, lb);
		
		inventory.setItem(29, fi);
		inventory.setItem(30, fi);
		inventory.setItem(31, ci);
		inventory.setItem(32, fi);
		inventory.setItem(33, fi);
		
		inventory.setItem(35, lb);
		
		//====================== 5 ====================
		
		inventory.setItem(36, lb);
		
		inventory.setItem(38, fi);
		inventory.setItem(39, fi);
		inventory.setItem(40, rb);
		inventory.setItem(41, fi);
		inventory.setItem(42, fi);
		
		inventory.setItem(44, lb);
		
		//====================== 6 ====================
		
		inventory.setItem(45, lb);
		inventory.setItem(46, lb);
		inventory.setItem(47, lb);
		inventory.setItem(48, lb);
		inventory.setItem(49, lb);
		inventory.setItem(50, lb);
		inventory.setItem(51, lb);
		inventory.setItem(52, lb);
		inventory.setItem(53, lb);
		
		//================== END ======================
		
		player.openInventory(inventory);
	}

	@EventHandler
	public void openInventory(PlayerInteractEvent event) {
		
		Player player = event.getPlayer();
		
		if(event.getAction() == Action.RIGHT_CLICK_AIR) {
			if(event.getItem().isSimilar(new ItemStack(Material.COMPASS))) {
				createInventory(player);
			}
		}
	}
	
	public Inventory getInventory() {
		return inventory;
	}
	
	@EventHandler
	public void noTakingItems(InventoryClickEvent event) {
		
		
		if(event.getWhoClicked().getOpenInventory().getItem(40) == null) {
			event.getWhoClicked().getOpenInventory().setItem(40, resultBarrier);
		}

		
		if(inventory != null) {
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
						
						|| event.getClick().equals(ClickType.DROP)) {
							event.setCancelled(true);
					}
				}
			}
		}
	}
	
	//================== GETTER & SETTER ======================
	
	public ItemStack getFillItem() {
		return fillItem;
	}

	public ItemStack getResultBarrier() {
		if(resultBarrier == null) {
			createConfirmItem();
		}
		return resultBarrier;
	}

	public ItemStack getConfirmItem() {
		if(confirmItem == null) {
			createConfirmItem();
		}
		return confirmItem;
	}
	
	public ItemStack getLoadPurple() {
		if(loadPurple == null) {
			createLoadPurple();
		}
		return loadPurple;
	}

	public ItemStack getLoadOrange() {
		if(loadOrange == null) {
			createLoadOrange();
		}
		return loadOrange;
	}

}
