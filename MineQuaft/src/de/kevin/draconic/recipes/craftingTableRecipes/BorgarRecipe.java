package de.kevin.draconic.recipes.craftingTableRecipes;

import de.kevin.draconic.items.ItemStackFactory;
import de.kevin.draconic.main.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class BorgarRecipe {

    NamespacedKey key = new NamespacedKey(Main.getPlugin(), "BorgarRecipe");

    ItemStack borgar = ItemStackFactory.getInstance().getBorgar();

    public void createBorgarRecipe() {

        ShapedRecipe blackStoneRecipe = new ShapedRecipe(key, borgar);

        blackStoneRecipe.shape("BBB",
                               "SSS",
                               "BBB");

        blackStoneRecipe.setIngredient('S', Material.COOKED_BEEF);
        blackStoneRecipe.setIngredient('B', Material.BREAD);

        Bukkit.addRecipe(blackStoneRecipe);

    }

}
