package de.kevin.draconic.recipes.craftingTableRecipes;

import de.kevin.draconic.main.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class BlackStoneRecipe {

    ItemStack blackStone = new ItemStack(Material.BLACKSTONE);
    NamespacedKey key = new NamespacedKey(Main.getPlugin(), "BlackStoneRecipe");

    public void createBlackStoneRecipe() {

        ShapedRecipe blackStoneRecipe = new ShapedRecipe(key, blackStone);

        blackStoneRecipe.shape("BSB",
                               "SBS",
                               "BSB");

        blackStoneRecipe.setIngredient('S', Material.COBBLESTONE);
        blackStoneRecipe.setIngredient('B', Material.BASALT);

        Bukkit.addRecipe(blackStoneRecipe);

    }

}
