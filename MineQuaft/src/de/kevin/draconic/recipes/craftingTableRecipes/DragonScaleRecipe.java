package de.kevin.draconic.recipes.craftingTableRecipes;

import de.kevin.draconic.items.ItemStackFactory;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class DragonScaleRecipe {

    ItemStack dragonScale = ItemStackFactory.getInstance().createDragonScale(1);

    public void createDragonScaleRecipe() {

            ShapedRecipe dragonScaleRecipe = new ShapedRecipe(dragonScale);

            dragonScaleRecipe.shape("DDD",
                                    "DDD",
                                    "DDD");
            dragonScaleRecipe.setIngredient('D', Material.CHAIN_COMMAND_BLOCK);

            Bukkit.addRecipe(dragonScaleRecipe);

    }
}
