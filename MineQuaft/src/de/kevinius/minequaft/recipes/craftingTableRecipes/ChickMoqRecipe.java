package de.kevinius.minequaft.recipes.craftingTableRecipes;

import de.kevinius.minequaft.items.ItemStackFactory;
import de.kevinius.minequaft.main.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class ChickMoqRecipe {

    private final ItemStack chickMoq = ItemStackFactory.getInstance().getChickmoq();
    NamespacedKey key = new NamespacedKey(Main.getPlugin(), "chickMoqRecipe");

    public void createChickMoqRecipe() {

        ShapedRecipe chickMoqRecipe = new ShapedRecipe(key, chickMoq);

        chickMoqRecipe.shape(" B ",
                             "CEC",
                             " B ");

        chickMoqRecipe.setIngredient('E', Material.EGG);
        chickMoqRecipe.setIngredient('C', Material.COOKED_CHICKEN);
        chickMoqRecipe.setIngredient('B', Material.BREAD);

        Bukkit.addRecipe(chickMoqRecipe);

    }

}
