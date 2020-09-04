package de.kevinius.minequaft.recipes.craftingTableRecipes;

import de.kevinius.minequaft.items.ItemStackFactory;
import de.kevinius.minequaft.main.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class SushiRecipe {

    NamespacedKey salmonKey = new NamespacedKey(Main.getPlugin(), "SushiSalmonRecipe");

    ItemStack sushi = ItemStackFactory.getInstance().getSushi();

    public void createSalmonSushiRecipe() {

        ShapedRecipe sushiRecipe = new ShapedRecipe(salmonKey, sushi);

        sushiRecipe.shape("*K*",
                          "KSK",
                          "*K*");

        sushiRecipe.setIngredient('S', Material.SALMON);
        sushiRecipe.setIngredient('K', Material.DRIED_KELP);

        Bukkit.addRecipe(sushiRecipe);

    }

    NamespacedKey codKey = new NamespacedKey(Main.getPlugin(), "SushiCodRecipe");

    public void createCodSushiRecipe() {

        ShapedRecipe sushiRecipe = new ShapedRecipe(codKey, sushi);

        sushiRecipe.shape("*K*",
                          "KCK",
                          "*K*");

        sushiRecipe.setIngredient('C', Material.COD);
        sushiRecipe.setIngredient('K', Material.DRIED_KELP);

        Bukkit.addRecipe(sushiRecipe);

    }
}
