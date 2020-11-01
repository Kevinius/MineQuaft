package de.kevinius.minequaft.recipes.smithingTableRecipes;

import de.kevinius.minequaft.items.ItemStackFactory;
import de.kevinius.minequaft.items.ToolFactory;
import de.kevinius.minequaft.recipes.smithingTableRecipes.functions.ResultSlot;
import de.kevinius.minequaft.recipes.smithingTableRecipes.functions.SmithingRecipe;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.PrepareSmithingEvent;
import org.bukkit.inventory.ItemStack;

public class EndiriumShovelRecipe implements Listener {

    private final ItemStack endirium = ItemStackFactory.getInstance().getEndirium();
    private final ItemStack endiriumShovel = ToolFactory.getInstance().getEndiriumShovel();
    private final ItemStack netheriteShovel = new ItemStack(Material.NETHERITE_SHOVEL);

    @EventHandler
    public void createEndiriumShovelRecipe(PrepareSmithingEvent event) {
        new SmithingRecipe(event, netheriteShovel, endirium, endiriumShovel);
    }

    @EventHandler
    public void onClick(InventoryClickEvent event) {
        new ResultSlot(event, endiriumShovel);
    }

}
