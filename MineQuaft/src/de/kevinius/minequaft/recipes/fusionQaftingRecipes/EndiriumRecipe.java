package de.kevinius.minequaft.recipes.fusionQaftingRecipes;

import de.kevinius.minequaft.inventorys.FusionQuaftingInventory;
import de.kevinius.minequaft.items.ItemStackFactory;
import de.kevinius.minequaft.recipes.fusionQaftingRecipes.functions.CraftItem;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.ItemStack;

import java.util.Objects;

public class EndiriumRecipe implements Listener{
	
	private final int endstoneClusterData = Objects.requireNonNull(ItemStackFactory.getInstance().getEndstoneCluster().getItemMeta()).getCustomModelData();
	private final ItemStack dragonEgg = new ItemStack(Material.DRAGON_EGG);
	private final ItemStack netherStar = new ItemStack(Material.NETHER_STAR);
	private final ItemStack endirium = ItemStackFactory.getInstance().getEndirium();

	private final FusionQuaftingInventory fusionQuaftingInventory = new FusionQuaftingInventory();
	private final CraftItem craftItem = new CraftItem();
	
	@EventHandler
	public void endiriumResult(InventoryClickEvent event) {

		if(event.getView().getPlayer().getOpenInventory().getTitle().equalsIgnoreCase(fusionQuaftingInventory.fqName)) {
			if(event.getInventory().getSize() > 43) {
				if(event.isLeftClick() && event.getSlot() == 31
				|| event.isRightClick() && event.getSlot() == 31
				|| event.isShiftClick() && event.getSlot() == 31) {

					InventoryView playerInventory= event.getWhoClicked().getOpenInventory();

					if(playerInventory.getItem(10) != null
					&& playerInventory.getItem(13) != null
					&& playerInventory.getItem(16) != null
					&& playerInventory.getItem(19) != null
					&& playerInventory.getItem(25) != null
					&& playerInventory.getItem(28) != null
					&& playerInventory.getItem(34) != null
					&& playerInventory.getItem(37) != null
					&& playerInventory.getItem(43) != null) {

						if(Objects.requireNonNull(Objects.requireNonNull(playerInventory.getItem(10)).getItemMeta()).hasCustomModelData() && Objects.requireNonNull(Objects.requireNonNull(playerInventory.getItem(10)).getItemMeta()).getCustomModelData() == endstoneClusterData
						&& Objects.requireNonNull(playerInventory.getItem(13)).isSimilar(new ItemStack(Material.IRON_INGOT))
						&& Objects.requireNonNull(Objects.requireNonNull(playerInventory.getItem(16)).getItemMeta()).getCustomModelData() == endstoneClusterData
						&& Objects.requireNonNull(playerInventory.getItem(19)).isSimilar(dragonEgg)
						&& Objects.requireNonNull(playerInventory.getItem(25)).isSimilar(dragonEgg)
						&& Objects.requireNonNull(playerInventory.getItem(28)).isSimilar(netherStar)
						&& Objects.requireNonNull(playerInventory.getItem(34)).isSimilar(netherStar)
						&& Objects.requireNonNull(Objects.requireNonNull(playerInventory.getItem(37)).getItemMeta()).getCustomModelData() == endstoneClusterData
						&& Objects.requireNonNull(Objects.requireNonNull(playerInventory.getItem(43)).getItemMeta()).getCustomModelData() == endstoneClusterData) {

							int resultamount = Objects.requireNonNull(event.getInventory().getItem(40)).getAmount();

							if(resultamount < 64) {
								int amt10 = Objects.requireNonNull(playerInventory.getItem(10)).getAmount();
								Objects.requireNonNull(playerInventory.getItem(10)).setAmount(amt10 - 1);
								int amt13 = Objects.requireNonNull(playerInventory.getItem(13)).getAmount();
								Objects.requireNonNull(playerInventory.getItem(13)).setAmount(amt13 - 1);
								int amt16 = Objects.requireNonNull(playerInventory.getItem(16)).getAmount();
								Objects.requireNonNull(playerInventory.getItem(16)).setAmount(amt16 - 1);
								int amt19 = Objects.requireNonNull(playerInventory.getItem(19)).getAmount();
								Objects.requireNonNull(playerInventory.getItem(19)).setAmount(amt19 - 1);
								int amt25 = Objects.requireNonNull(playerInventory.getItem(25)).getAmount();
								Objects.requireNonNull(playerInventory.getItem(25)).setAmount(amt25 - 1);
								int amt28 = Objects.requireNonNull(playerInventory.getItem(28)).getAmount();
								Objects.requireNonNull(playerInventory.getItem(28)).setAmount(amt28 - 1);
								int amt32 = Objects.requireNonNull(playerInventory.getItem(34)).getAmount();
								Objects.requireNonNull(playerInventory.getItem(34)).setAmount(amt32 - 1);
								int amt35 = Objects.requireNonNull(playerInventory.getItem(37)).getAmount();
								Objects.requireNonNull(playerInventory.getItem(37)).setAmount(amt35 - 1);
								int amt39 = Objects.requireNonNull(playerInventory.getItem(43)).getAmount();
								Objects.requireNonNull(playerInventory.getItem(43)).setAmount(amt39 - 1);

								craftItem.onCraftFusionItem(event, endirium);

							}
						}
					}
				}
			}
		}
	}
}


	


