package de.kevinius.minequaft.recipes.craftingTableRecipes;

import de.kevinius.minequaft.items.ItemStackFactory;
import de.kevinius.minequaft.main.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class FusionQuaftingTableRecipe implements Listener {

    ItemStack fusionQuaftingTable = ItemStackFactory.getInstance().getFusionQuaftingTable();

    NamespacedKey key = new NamespacedKey(Main.getPlugin(), "fusionQuaftingTableRecipe");

    public void fusionQuaftingTableRecipe() {

        ShapedRecipe fusionQuaftingRecipe = new ShapedRecipe(key, fusionQuaftingTable);

        fusionQuaftingRecipe.shape("DSD",
                                   "SCS",
                                   "DSD");

        fusionQuaftingRecipe.setIngredient('S', Material.COMMAND_BLOCK);
        fusionQuaftingRecipe.setIngredient('D', Material.DIAMOND);
        fusionQuaftingRecipe.setIngredient('C', Material.END_CRYSTAL);
        Bukkit.addRecipe(fusionQuaftingRecipe);
    }

/*    ItemStack fusionQuaftingTable = ItemStackFactory.getInstance().getFusionQuaftingTable();

    @EventHandler
    public void onPlayerCraftItem(PrepareItemCraftEvent event) {
        if(event.getInventory().getMatrix().length < 9) {
            return;
        }

        checkCraft(fusionQuaftingTable, event.getInventory(), new HashMap<Integer, ItemStack>() {{
            put(0, diamond);
            put(1, dragonScale);
            put(2, diamond);
            put(3, dragonScale);
            put(4, endCrystal);
            put(5, dragonScale);
            put(6, diamond);
            put(7, dragonScale);
            put(8, diamond);
        }});
    }

    public void checkCraft(ItemStack result, CraftingInventory inventory, HashMap<Integer, ItemStack> ingredients) {
        ItemStack[] matrix = inventory.getMatrix();
        for(int i = 0; i < 9; i++) {
            if(ingredients.containsKey(i)) {
                if(matrix[i] == null || !matrix[i].isSimilar(ingredients.get(i))) {
                    return;
                }
            } else {
                if(matrix[i] != null) {
                    return;
                }
            }
        }
        inventory.setResult(result);
    }*/
}
