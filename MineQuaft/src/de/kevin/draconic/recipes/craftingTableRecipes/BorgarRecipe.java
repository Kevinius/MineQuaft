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

    ItemStack borgar = ItemStackFactory.getInstance().getBigMoq();

    public void createBorgarRecipe() {

        ShapedRecipe borgarRecipe = new ShapedRecipe(key, borgar);

        borgarRecipe.shape("*B*",
                           "*S*",
                           "*B*");

        borgarRecipe.setIngredient('S', Material.COOKED_BEEF);
        borgarRecipe.setIngredient('B', Material.BREAD);
        borgarRecipe.setIngredient('*', Material.AIR);

        Bukkit.addRecipe(borgarRecipe);

    }

}
