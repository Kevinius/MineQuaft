package de.kevinius.minequaft.recipes.smithingTableRecipes.functions;

import org.bukkit.event.inventory.PrepareSmithingEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Objects;

public class SmithingRecipe {

    public SmithingRecipe(PrepareSmithingEvent event, ItemStack base, ItemStack addition, ItemStack result) {
        if(event.getInventory().getItem(0) != null && Objects.requireNonNull(event.getInventory().getItem(0)).isSimilar(base)) {
            if(event.getInventory().getItem(1) != null && Objects.requireNonNull(event.getInventory().getItem(1)).isSimilar(addition)) {
                event.setResult(result);
            }
        }
    }
}
