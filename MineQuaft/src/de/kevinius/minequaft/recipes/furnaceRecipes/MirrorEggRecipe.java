package de.kevinius.minequaft.recipes.furnaceRecipes;

import de.kevinius.minequaft.items.ItemStackFactory;
import de.kevinius.minequaft.main.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.inventory.ItemStack;

public class MirrorEggRecipe {

    private final ItemStack mirrorEgg = ItemStackFactory.getInstance().getMirrorEgg();
    private final Material egg = Material.EGG;
    private final NamespacedKey key = new NamespacedKey(Main.getPlugin(), "mirrorEggRecipe");

    public void createMirrorEggRecipe() {

        FurnaceRecipe  mirroreggRecipe = new FurnaceRecipe(key, mirrorEgg, egg, (float) 0.3, 200);
        Bukkit.addRecipe(mirroreggRecipe);
    }
}
