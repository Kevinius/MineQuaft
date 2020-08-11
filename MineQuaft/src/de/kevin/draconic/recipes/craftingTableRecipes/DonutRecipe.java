package de.kevin.draconic.recipes.craftingTableRecipes;

import de.kevin.draconic.items.ItemStackFactory;
import de.kevin.draconic.main.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class DonutRecipe {

    ItemStack donut = ItemStackFactory.getInstance().getDonut();

    NamespacedKey key = new NamespacedKey(Main.getPlugin(), "DonutRecipe");

    public void createDonutRecipe() {

        ShapedRecipe sushiRecipe = new ShapedRecipe(key, donut);

        sushiRecipe.shape("SWS",
                          "W*W",
                          "SWS");

        sushiRecipe.setIngredient('S', Material.SUGAR);
        sushiRecipe.setIngredient('W', Material.WHEAT);

        Bukkit.addRecipe(sushiRecipe);

    }

}
