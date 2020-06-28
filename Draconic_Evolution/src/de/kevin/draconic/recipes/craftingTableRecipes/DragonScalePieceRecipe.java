package de.kevin.draconic.recipes.craftingTableRecipes;

import de.kevin.draconic.items.ItemStackFactory;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class DragonScalePieceRecipe {

    ItemStack dragonScalePiece = ItemStackFactory.getInstance().getDragonScalePiece();

    public void createDragonScalePieceRecipe() {

        ShapedRecipe dragonScalePieceRecipe = new ShapedRecipe(dragonScalePiece);

        dragonScalePieceRecipe.shape("***",
                                     "*O*",
                                     "***");
        dragonScalePieceRecipe.setIngredient('*', Material.AIR);
        dragonScalePieceRecipe.setIngredient('O', Material.COMMAND_BLOCK);

        Bukkit.addRecipe(dragonScalePieceRecipe);
    }
}


