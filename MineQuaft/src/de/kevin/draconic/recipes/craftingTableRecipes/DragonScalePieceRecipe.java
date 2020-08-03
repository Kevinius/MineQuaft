package de.kevin.draconic.recipes.craftingTableRecipes;

import de.kevin.draconic.items.ItemStackFactory;
import de.kevin.draconic.main.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapelessRecipe;

public class DragonScalePieceRecipe {

    ItemStack dragonScalePiece = ItemStackFactory.getInstance().getDragonScalePiece();
    NamespacedKey key = new NamespacedKey(Main.getPlugin(), "DragonScalePieceRecipe");

    public void createDragonScalePieceRecipe() {

        ShapelessRecipe dragonScalePieceRecipe = new ShapelessRecipe(key, dragonScalePiece);

        dragonScalePieceRecipe.addIngredient(Material.COMMAND_BLOCK);

        Bukkit.addRecipe(dragonScalePieceRecipe);
    }
}


