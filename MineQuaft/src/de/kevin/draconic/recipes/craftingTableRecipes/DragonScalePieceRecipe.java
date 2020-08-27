package de.kevin.draconic.recipes.craftingTableRecipes;

import org.bukkit.event.Listener;

public class DragonScalePieceRecipe implements Listener {

/*
    ItemStack dragonScalePiece = ItemStackFactory.getInstance().getDragonScalePiece();
    ItemStack dragonScale = ItemStackFactory.getInstance().createDragonScale();

    @EventHandler
    public void onPlayerCraftItem1(PrepareItemCraftEvent event) {

        checkCraft(dragonScalePiece, event.getInventory(), new HashMap<Integer, ItemStack>() {{
            put(0, dragonScale);
        }});
    }

    private void checkCraft(ItemStack result, CraftingInventory inventory, HashMap<Integer, ItemStack> ingredients) {
        ItemStack[] matrix = inventory.getMatrix();
        for(int i = 0; i < 9; i++) {
            if(ingredients.containsKey(i)) {
                if(matrix[i] == null) {
                    assert matrix[i] != null;
                    if (!matrix[i].equals(ingredients.get(i))) {
                        return;
                    }
                }
            } else {
                if(matrix[i] != null) {
                    return;
                }
            }
        }
        inventory.setResult(result);
    }
*/
}


