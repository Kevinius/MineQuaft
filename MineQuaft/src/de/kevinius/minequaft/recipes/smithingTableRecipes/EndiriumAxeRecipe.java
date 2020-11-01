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

public class EndiriumAxeRecipe implements Listener {

    private final ItemStack endirium = ItemStackFactory.getInstance().getEndirium();
    private final ItemStack endiriumAxe = ToolFactory.getInstance().getEndiriumAxe();
    private final ItemStack netheriteAxe = new ItemStack(Material.NETHERITE_AXE);

    @EventHandler
    public void createEndiriumAxeRecipe(PrepareSmithingEvent event) {
        new SmithingRecipe(event, netheriteAxe, endirium, endiriumAxe);
    }

    @EventHandler
    public void onClick(InventoryClickEvent event) {
        new ResultSlot(event, endiriumAxe);
    }
}
