package de.kevin.draconic.recipes.anvilRecipes;

import de.kevin.draconic.items.ItemStackFactory;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareAnvilEvent;
import org.bukkit.inventory.ItemStack;

public class FusionCraftinTablet implements Listener {

    ItemStack dragonScale = ItemStackFactory.getInstance().getDragonScale();
    ItemStack endirium = ItemStackFactory.getInstance().getEndirium();
    ItemStack fusionCraftingTablet = ItemStackFactory.getInstance().createCraftingTablets(Material.KNOWLEDGE_BOOK,
            "§dFusion crafting tablet", "nicht existend");

    @EventHandler
    public void fusionCraftingRecipe(PrepareAnvilEvent event) {

        if(event.getInventory().getItem(0).isSimilar(endirium)) {
            if(event.getInventory().getItem(1).isSimilar(dragonScale)) {
                event.getInventory().setRepairCost(0);
                event.setResult(fusionCraftingTablet);
            }
        }
    }
}
