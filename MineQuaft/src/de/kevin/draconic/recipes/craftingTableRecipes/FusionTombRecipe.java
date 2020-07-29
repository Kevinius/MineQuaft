package de.kevin.draconic.recipes.craftingTableRecipes;

import de.kevin.draconic.items.ItemStackFactory;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class FusionTombRecipe {

    ItemStack fusiontomb = ItemStackFactory.getInstance().getFusionTomb();

    public void createFusionTombRecipe() {

        ShapedRecipe fusionTombRecipe = new ShapedRecipe(fusiontomb);

        fusionTombRecipe.shape("DSD",
                               "SBS",
                               "DSD");
        fusionTombRecipe.setIngredient('D', Material.DIAMOND);
        fusionTombRecipe.setIngredient('S', Material.COMMAND_BLOCK);
        fusionTombRecipe.setIngredient('B', Material.BOOK);

        Bukkit.addRecipe(fusionTombRecipe);

    }

}
