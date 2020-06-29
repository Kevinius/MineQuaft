package de.kevin.draconic.recipes.craftingTableRecipes;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class BlackStoneRecipe {

    ItemStack blackStone = new ItemStack(Material.BLACKSTONE);

    public void createBlackStoneRecipe() {

        ShapedRecipe blackStoneRecipe = new ShapedRecipe(blackStone);

        blackStoneRecipe.shape("BSB",
                               "SBS",
                               "BSB");

        blackStoneRecipe.setIngredient('S', Material.COBBLESTONE);
        blackStoneRecipe.setIngredient('B', Material.BASALT);

        Bukkit.addRecipe(blackStoneRecipe);

    }

}
