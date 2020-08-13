package de.kevin.draconic.main;

import de.kevin.draconic.advancements.AdvancementListener;
import de.kevin.draconic.advancements.SaveAdvancements;
import de.kevin.draconic.blocks.functions.FusionQuaftingTableFunctions;
import de.kevin.draconic.blocks.functions.XtremeQuaftingTableFunctions;
import de.kevin.draconic.commands.GiveCommand;
import de.kevin.draconic.inventorys.FusionCraftingInventory;
import de.kevin.draconic.inventorys.XtremeCraftingInventory;
import de.kevin.draconic.items.functions.food.Food;
import de.kevin.draconic.items.functions.tool.PrevendFromDespawn;
import de.kevin.draconic.mobdrops.DragonDrop;
import de.kevin.draconic.recipes.craftingTableRecipes.*;
import de.kevin.draconic.recipes.craftingTableRecipes.SushiRecipe;
import de.kevin.draconic.recipes.fusionCraftingRecipes.DragonEggRecipe;
import de.kevin.draconic.recipes.fusionCraftingRecipes.EndiriumRecipe;
import de.kevin.draconic.recipes.fusionCraftingRecipes.XtremeQuaftingTabletRecipe;
import de.kevin.draconic.recipes.xtremeCrafting.CompressedEndstoneRecipe;
import de.kevin.draconic.recipes.xtremeCrafting.ElytraRecipe;
import de.kevin.draconic.recipes.xtremeCrafting.ShulkerShellRecipe;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.IOException;
import java.util.Objects;

/**
 *
 * @author Kevinius
 *
 */

public class Main extends JavaPlugin implements Listener {
	private static Main plugin;

	public void onEnable() {
		plugin = this;

		PluginManager pluginManager = Bukkit.getPluginManager();

		//Recipes
		new DragonScalePieceRecipe().createDragonScalePieceRecipe();
		new DragonScaleRecipe().createDragonScaleRecipe();
		new BlackStoneRecipe().createBlackStoneRecipe();
		new BorgarRecipe().createBorgarRecipe();
		new SushiRecipe().createSalmonSushiRecipe();
		new SushiRecipe().createCodSushiRecipe();
		new DonutRecipe().createDonutRecipe();

		//Events
		pluginManager.registerEvents(new DragonDrop(), this);
		pluginManager.registerEvents(new FusionCraftingInventory(), this);
		pluginManager.registerEvents(new EndiriumRecipe(), this);
		pluginManager.registerEvents(new PrevendFromDespawn(), this);
		pluginManager.registerEvents(new XtremeCraftingInventory(), this);
		pluginManager.registerEvents(new XtremeQuaftingTabletRecipe(), this);
		pluginManager.registerEvents(new CompressedEndstoneRecipe(), this);
		pluginManager.registerEvents(new FusionQuaftingTableFunctions(), this);
		pluginManager.registerEvents(new XtremeQuaftingTableFunctions(), this);
		pluginManager.registerEvents(new AdvancementListener(), this);
		pluginManager.registerEvents(new DragonEggRecipe(), this);
		pluginManager.registerEvents(new Food(), this);
		pluginManager.registerEvents(new ElytraRecipe(), this);
		pluginManager.registerEvents(new ShulkerShellRecipe(), this);

		//commands
		Objects.requireNonNull(this.getCommand("mqgive")).setExecutor(new GiveCommand());

		//Configs
		try {
			SaveAdvancements.save();
		} catch (IOException exception) {
			exception.printStackTrace();
		}
	}
	
	public static Main getPlugin() {
		return plugin;
	}

}
