package de.kevin.draconic.recipes.craftingTableRecipes;

import de.kevin.draconic.items.ItemStackFactory;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapelessRecipe;

public class DragonScalePieceRecipe {

    ItemStack dragonScalePiece = ItemStackFactory.getInstance().getDragonScalePiece();

    public void createDragonScalePieceRecipe() {

        ShapelessRecipe dragonScalePieceRecipe = new ShapelessRecipe(dragonScalePiece);

        dragonScalePieceRecipe.addIngredient(Material.COMMAND_BLOCK);

        Bukkit.addRecipe(dragonScalePieceRecipe);
    }
}


