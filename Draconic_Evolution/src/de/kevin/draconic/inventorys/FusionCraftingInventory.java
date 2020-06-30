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
	
	public Inventory FusionCraftinInventory;
	ItemStack createFillItem = ItemStackFactory.getInstance().getFillItem();
	ItemStack createLoadBackground = ItemStackFactory.getInstance().getLoadBackround();
	ItemStack createResultBarrier = ItemStackFactory.getInstance().getResultBarrier();
	ItemStack createConfirmItem = ItemStackFactory.getInstance().getConfirmItem();
	ItemStack fusionCraftingTablet = ItemStackFactory.getInstance().createCraftingTablets(Material.KNOWLEDGE_BOOK,
			"§6Fusion Quafting Tablet", "§7Quaft really powerful items with it!");
;
	public final String fcName = "§6Fusion §5Quafting";
	
	//==================== INVENTORY =====================================
	
	public void createFusionCraftingInventory(Player player) {
		FusionCraftinInventory = Bukkit.createInventory(null, 9*6, fcName);
		
		ItemStack fi = createFillItem;
		ItemStack lb = createLoadBackground;
		ItemStack rb = createResultBarrier;
		ItemStack ci = createConfirmItem;
		
		lb.setAmount(1);
		fi.setAmount(1);
		rb.setAmount(1);
		
		//=================== 1 ====================
		
		FusionCraftinInventory.setItem(0, lb);
		FusionCraftinInventory.setItem(1, lb);
		FusionCraftinInventory.setItem(2, lb);
		FusionCraftinInventory.setItem(3, lb);
		FusionCraftinInventory.setItem(4, lb);
		FusionCraftinInventory.setItem(5, lb);
		FusionCraftinInventory.setItem(6, lb);
		FusionCraftinInventory.setItem(7, lb);
		FusionCraftinInventory.setItem(8, lb);
		
		//==================== 2 =====================
		
		FusionCraftinInventory.setItem(9, lb);
		
		FusionCraftinInventory.setItem(11, fi);
		FusionCraftinInventory.setItem(12, fi);
		
		FusionCraftinInventory.setItem(14, fi);
		FusionCraftinInventory.setItem(15, fi);
		
		FusionCraftinInventory.setItem(17, lb);
		
		//===================== 3 ====================
		
		FusionCraftinInventory.setItem(18, lb);
		
		FusionCraftinInventory.setItem(20, fi);
		FusionCraftinInventory.setItem(21, fi);
		FusionCraftinInventory.setItem(22, fi);
		FusionCraftinInventory.setItem(23, fi);
		FusionCraftinInventory.setItem(24, fi);
		
		FusionCraftinInventory.setItem(26, lb);
		
		//====================== 4 ====================
		
		FusionCraftinInventory.setItem(27, lb);
		
		FusionCraftinInventory.setItem(29, fi);
		FusionCraftinInventory.setItem(30, fi);
		FusionCraftinInventory.setItem(31, ci);
		FusionCraftinInventory.setItem(32, fi);
		FusionCraftinInventory.setItem(33, fi);
		
		FusionCraftinInventory.setItem(35, lb);
		
		//====================== 5 ====================
		
		FusionCraftinInventory.setItem(36, lb);
		
		FusionCraftinInventory.setItem(38, fi);
		FusionCraftinInventory.setItem(39, fi);
		FusionCraftinInventory.setItem(40, rb);
		FusionCraftinInventory.setItem(41, fi);
		FusionCraftinInventory.setItem(42, fi);
		
		FusionCraftinInventory.setItem(44, lb);
		
		//====================== 6 ====================
		
		FusionCraftinInventory.setItem(45, lb);
		FusionCraftinInventory.setItem(46, lb);
		FusionCraftinInventory.setItem(47, lb);
		FusionCraftinInventory.setItem(48, lb);
		FusionCraftinInventory.setItem(49, lb);
		FusionCraftinInventory.setItem(50, lb);
		FusionCraftinInventory.setItem(51, lb);
		FusionCraftinInventory.setItem(52, lb);
		FusionCraftinInventory.setItem(53, lb);
		
		//================== END ======================
		
		player.openInventory(FusionCraftinInventory);
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
	public void onClose(InventoryCloseEvent event) {
		HumanEntity player = event.getPlayer();

		if(event.getPlayer().getOpenInventory() == FusionCraftinInventory) {
			if(event.getPlayer().getInventory().firstEmpty() != -1) {
				if(event.getPlayer().getOpenInventory().getItem(10) != null) {
					event.getPlayer().getInventory().addItem(event.getPlayer().getOpenInventory().getItem(10));
				}
				if(event.getPlayer().getOpenInventory().getItem(13) != null) {
					event.getPlayer().getInventory().addItem(event.getPlayer().getOpenInventory().getItem(13));
				}
				if(event.getPlayer().getOpenInventory().getItem(16) != null) {
					event.getPlayer().getInventory().addItem(event.getPlayer().getOpenInventory().getItem(16));
				}
				if(event.getPlayer().getOpenInventory().getItem(19) != null) {
					event.getPlayer().getInventory().addItem(event.getPlayer().getOpenInventory().getItem(19));
				}
				if(event.getPlayer().getOpenInventory().getItem(25) != null) {
					event.getPlayer().getInventory().addItem(event.getPlayer().getOpenInventory().getItem(25));
				}
				if(event.getPlayer().getOpenInventory().getItem(28) != null) {
					event.getPlayer().getInventory().addItem(event.getPlayer().getOpenInventory().getItem(28));
				}
				if(event.getPlayer().getOpenInventory().getItem(34) != null) {
					event.getPlayer().getInventory().addItem(event.getPlayer().getOpenInventory().getItem(34));
				}
				if(event.getPlayer().getOpenInventory().getItem(37) != null) {
					event.getPlayer().getInventory().addItem(event.getPlayer().getOpenInventory().getItem(37));
				}
				if(event.getPlayer().getOpenInventory().getItem(40) != null &&
						!Objects.requireNonNull(event.getPlayer().getOpenInventory().getItem(40)).isSimilar(createResultBarrier)) {
					event.getPlayer().getInventory().addItem(event.getPlayer().getOpenInventory().getItem(40));
				}
				if(event.getPlayer().getOpenInventory().getItem(43) != null) {
					event.getPlayer().getInventory().addItem(event.getPlayer().getOpenInventory().getItem(43));
				}
			} else {
				player.sendMessage("§6No empty slots!");
				if(event.getPlayer().getOpenInventory().getItem(10) != null) {
					player.getWorld().dropItemNaturally(player.getLocation(), Objects.requireNonNull(event.getPlayer().getOpenInventory().getItem(10)));
				}
				if(event.getPlayer().getOpenInventory().getItem(13) != null) {
					player.getWorld().dropItemNaturally(player.getLocation(), Objects.requireNonNull(event.getPlayer().getOpenInventory().getItem(13)));
				}
				if(event.getPlayer().getOpenInventory().getItem(16) != null) {
					player.getWorld().dropItemNaturally(player.getLocation(), Objects.requireNonNull(event.getPlayer().getOpenInventory().getItem(16)));
				}
				if(event.getPlayer().getOpenInventory().getItem(19) != null) {
					player.getWorld().dropItemNaturally(player.getLocation(), Objects.requireNonNull(event.getPlayer().getOpenInventory().getItem(19)));
				}
				if(event.getPlayer().getOpenInventory().getItem(25) != null) {
					player.getWorld().dropItemNaturally(player.getLocation(), Objects.requireNonNull(event.getPlayer().getOpenInventory().getItem(25)));
				}
				if(event.getPlayer().getOpenInventory().getItem(28) != null) {
					player.getWorld().dropItemNaturally(player.getLocation(), Objects.requireNonNull(event.getPlayer().getOpenInventory().getItem(28)));
				}
				if(event.getPlayer().getOpenInventory().getItem(34) != null) {
					player.getWorld().dropItemNaturally(player.getLocation(), Objects.requireNonNull(event.getPlayer().getOpenInventory().getItem(34)));
				}
				if(event.getPlayer().getOpenInventory().getItem(37) != null) {
					player.getWorld().dropItemNaturally(player.getLocation(), Objects.requireNonNull(event.getPlayer().getOpenInventory().getItem(37)));
				}
				if(event.getPlayer().getOpenInventory().getItem(43) != null) {
					player.getWorld().dropItemNaturally(player.getLocation(), Objects.requireNonNull(event.getPlayer().getOpenInventory().getItem(43)));
				}
				if(event.getPlayer().getOpenInventory().getItem(40) != null &&
						!Objects.requireNonNull(event.getPlayer().getOpenInventory().getItem(40)).isSimilar(createResultBarrier)) {
					player.getWorld().dropItemNaturally(player.getLocation(), Objects.requireNonNull(event.getPlayer().getOpenInventory().getItem(40)));
				}
			}
		}
	}
	
	public Inventory getFusionCraftinInventory() {
		return FusionCraftinInventory;
	}
	
	@EventHandler
	public void noTakingItems(InventoryClickEvent event) {
		if(event.getClickedInventory() != null) {
			if(event.getClickedInventory().equals(FusionCraftinInventory)) {
				Bukkit.getServer().getScheduler().runTaskLater(Main.getPlugin(), () -> {
					if(event.getWhoClicked().getOpenInventory().getItem(40) == null) {
						event.getWhoClicked().getOpenInventory().setItem(40, createResultBarrier);
					}
				}, 1);
			}
		}
		
		if(FusionCraftinInventory != null) {
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
