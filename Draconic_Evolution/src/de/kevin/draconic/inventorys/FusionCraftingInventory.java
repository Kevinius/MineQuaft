package de.kevin.draconic.inventorys;

import de.kevin.draconic.items.ItemStackFactory;
import de.kevin.draconic.main.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.Objects;

public class FusionCraftingInventory implements Listener {
	
	public Inventory fusionCraftingInventory;
	ItemStack createFillItem = ItemStackFactory.getInstance().getFillItem();
	ItemStack createLoadBackground = ItemStackFactory.getInstance().getLoadBackround();
	ItemStack createResultBarrier = ItemStackFactory.getInstance().getResultBarrier();
	ItemStack createConfirmItem = ItemStackFactory.getInstance().getConfirmItem();
	ItemStack fusionCraftingTablet = ItemStackFactory.getInstance().createCraftingTablets(Material.KNOWLEDGE_BOOK,
			"§dFusion Quafting Tablet", "§7Quaft really powerful items with it!");
;
	public final String fcName = "§6Fusion §5Quafting";
	
	//==================== INVENTORY =====================================
	
	public void createFusionCraftingInventory(Player player) {
		fusionCraftingInventory = Bukkit.createInventory(null, 9*6, fcName);
		
		ItemStack fi = createFillItem;
		ItemStack lb = createLoadBackground;
		ItemStack rb = createResultBarrier;
		ItemStack ci = createConfirmItem;
		
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
		
		if(event.getAction() == Action.RIGHT_CLICK_AIR) {
			if(event.getItem().isSimilar(fusionCraftingTablet)) {
				createFusionCraftingInventory(player);
			}
		}
	}

	@EventHandler
	public void closeFusionCraftingInventory(InventoryCloseEvent event) {
		HumanEntity player = event.getPlayer();

		if(player.getOpenInventory().getTopInventory() == fusionCraftingInventory) {
			if(player.getInventory().firstEmpty() != -1) {
				if(player.getOpenInventory().getItem(10) != null) {
					player.getInventory().addItem(player.getOpenInventory().getItem(10));
				}
				if(player.getOpenInventory().getItem(13) != null) {
					player.getInventory().addItem(player.getOpenInventory().getItem(13));
				}
				if(player.getOpenInventory().getItem(16) != null) {
					player.getInventory().addItem(player.getOpenInventory().getItem(16));
				}
				if(player.getOpenInventory().getItem(19) != null) {
					player.getInventory().addItem(player.getOpenInventory().getItem(19));
				}
				if(player.getOpenInventory().getItem(25) != null) {
					player.getInventory().addItem(player.getOpenInventory().getItem(25));
				}
				if(player.getOpenInventory().getItem(28) != null) {
					player.getInventory().addItem(player.getOpenInventory().getItem(28));
				}
				if(player.getOpenInventory().getItem(34) != null) {
					player.getInventory().addItem(player.getOpenInventory().getItem(34));
				}
				if(player.getOpenInventory().getItem(37) != null) {
					player.getInventory().addItem(player.getOpenInventory().getItem(37));
				}
				if(player.getOpenInventory().getItem(40) != null &&
						!Objects.requireNonNull(player.getOpenInventory().getItem(40)).isSimilar(createResultBarrier)) {
					player.getInventory().addItem(player.getOpenInventory().getItem(40));
				}
				if(player.getOpenInventory().getItem(43) != null) {
					player.getInventory().addItem(player.getOpenInventory().getItem(43));
				}
			} else {
				if(player.getOpenInventory().getItem(10) != null) {
					player.getWorld().dropItemNaturally(player.getLocation(), Objects.requireNonNull(event.getPlayer().getOpenInventory().getItem(10)));
				}
				if(player.getOpenInventory().getItem(13) != null) {
					player.getWorld().dropItemNaturally(player.getLocation(), Objects.requireNonNull(event.getPlayer().getOpenInventory().getItem(13)));
				}
				if(player.getOpenInventory().getItem(16) != null) {
					player.getWorld().dropItemNaturally(player.getLocation(), Objects.requireNonNull(event.getPlayer().getOpenInventory().getItem(16)));
				}
				if(player.getOpenInventory().getItem(19) != null) {
					player.getWorld().dropItemNaturally(player.getLocation(), Objects.requireNonNull(event.getPlayer().getOpenInventory().getItem(19)));
				}
				if(player.getOpenInventory().getItem(25) != null) {
					player.getWorld().dropItemNaturally(player.getLocation(), Objects.requireNonNull(event.getPlayer().getOpenInventory().getItem(25)));
				}
				if(player.getOpenInventory().getItem(28) != null) {
					player.getWorld().dropItemNaturally(player.getLocation(), Objects.requireNonNull(event.getPlayer().getOpenInventory().getItem(28)));
				}
				if(player.getOpenInventory().getItem(34) != null) {
					player.getWorld().dropItemNaturally(player.getLocation(), Objects.requireNonNull(event.getPlayer().getOpenInventory().getItem(34)));
				}
				if(player.getOpenInventory().getItem(37) != null) {
					player.getWorld().dropItemNaturally(player.getLocation(), Objects.requireNonNull(event.getPlayer().getOpenInventory().getItem(37)));
				}
				if(player.getOpenInventory().getItem(43) != null) {
					player.getWorld().dropItemNaturally(player.getLocation(), Objects.requireNonNull(event.getPlayer().getOpenInventory().getItem(43)));
				}
				if(player.getOpenInventory().getItem(40) != null &&
						!Objects.requireNonNull(player.getOpenInventory().getItem(40)).isSimilar(createResultBarrier)) {
					player.getWorld().dropItemNaturally(player.getLocation(), Objects.requireNonNull(event.getPlayer().getOpenInventory().getItem(40)));
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
				Bukkit.getServer().getScheduler().runTaskLater(Main.getPlugin(), () -> {
					if(event.getWhoClicked().getOpenInventory().getItem(40) == null) {
						event.getWhoClicked().getOpenInventory().setItem(40, createResultBarrier);
					}
				}, 1);
			}
		}
		
		if(fusionCraftingInventory != null) {
			if(event.getView().getTitle().equals(fcName)) {
				if(event.getCurrentItem() != null) {
					event.getClick();
					if(event.isLeftClick() && event.getCurrentItem().isSimilar(createFillItem)
						|| event.isRightClick() && event.getCurrentItem().isSimilar(createFillItem)
						|| event.isShiftClick() && event.getCurrentItem().isSimilar(createFillItem)
						
						|| event.isRightClick() && event.getCurrentItem().isSimilar(createLoadBackground)
						|| event.isLeftClick() && event.getCurrentItem().isSimilar(createLoadBackground)
						|| event.isShiftClick() && event.getCurrentItem().isSimilar(createLoadBackground)
						
						|| event.isShiftClick() && event.getCurrentItem().isSimilar(createResultBarrier)
						|| event.isRightClick() && event.getCurrentItem().isSimilar(createResultBarrier)
						|| event.isLeftClick() && event.getCurrentItem().isSimilar(createResultBarrier)
						
						|| event.isShiftClick() && event.getCurrentItem().isSimilar(createConfirmItem)
						|| event.isRightClick() && event.getCurrentItem().isSimilar(createConfirmItem)
						|| event.isLeftClick() && event.getCurrentItem().isSimilar(createConfirmItem)
						
						|| event.getClick().equals(ClickType.DROP)) {
							event.setCancelled(true);
					}
				}
			}
		}
	}
}
