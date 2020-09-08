package de.kevinius.minequaft.main;

import de.kevinius.minequaft.advancements.AdvancementListener;
import de.kevinius.minequaft.advancements.SaveAdvancements;
import de.kevinius.minequaft.blocks.functions.FusionQuaftingTableFunctions;
import de.kevinius.minequaft.blocks.functions.XtremeQuaftingTableFunctions;
import de.kevinius.minequaft.commands.GiveCommand;
import de.kevinius.minequaft.inventorys.FusionQuaftingInventory;
import de.kevinius.minequaft.inventorys.XtremeQuaftingInventory;
import de.kevinius.minequaft.inventorys.recipeInventorys.fusionQuafting.Root;
import de.kevinius.minequaft.items.functions.food.Food;
import de.kevinius.minequaft.items.functions.tool.PreventDestroying;
import de.kevinius.minequaft.mobdrops.DragonDrop;
import de.kevinius.minequaft.recipes.craftingTableRecipes.*;
import de.kevinius.minequaft.recipes.fusionQaftingRecipes.DragonEggRecipe;
import de.kevinius.minequaft.recipes.fusionQaftingRecipes.EndiriumRecipe;
import de.kevinius.minequaft.recipes.fusionQaftingRecipes.XtremeQuaftingTabletRecipe;
import de.kevinius.minequaft.recipes.xtremeQaftingRecipes.EndstoneClusterRecipe;
import de.kevinius.minequaft.recipes.xtremeQaftingRecipes.ElytraRecipe;
import de.kevinius.minequaft.recipes.xtremeQaftingRecipes.ShulkerShellRecipe;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.IOException;
import java.util.Objects;

/**
 *
 * @author Kevinius
 *
 */

public class Main extends JavaPlugin {

	private static Main plugin;

	public void onEnable() {
		plugin = this;
		
		PluginManager pluginManager = Bukkit.getPluginManager();

		//Recipes
		new BlackStoneRecipe().createBlackStoneRecipe();
		new BorgarRecipe().createBorgarRecipe();
		new SushiRecipe().createSalmonSushiRecipe();
		new SushiRecipe().createCodSushiRecipe();
		new DonutRecipe().createDonutRecipe();
		new FusionQuaftingTableRecipe().fusionQuaftingTableRecipe();

		//Events
		pluginManager.registerEvents(new DragonDrop(), this);
		pluginManager.registerEvents(new FusionQuaftingTableRecipe(), this);
		pluginManager.registerEvents(new FusionQuaftingInventory(), this);
		pluginManager.registerEvents(new EndiriumRecipe(), this);
		pluginManager.registerEvents(new PreventDestroying(), this);
		pluginManager.registerEvents(new XtremeQuaftingInventory(), this);
		pluginManager.registerEvents(new XtremeQuaftingTabletRecipe(), this);
		pluginManager.registerEvents(new EndstoneClusterRecipe(), this);
		pluginManager.registerEvents(new FusionQuaftingTableFunctions(), this);
		pluginManager.registerEvents(new XtremeQuaftingTableFunctions(), this);
		pluginManager.registerEvents(new AdvancementListener(), this);
		pluginManager.registerEvents(new DragonEggRecipe(), this);
		pluginManager.registerEvents(new Food(), this);
		pluginManager.registerEvents(new ElytraRecipe(), this);
		pluginManager.registerEvents(new ShulkerShellRecipe(), this);
		pluginManager.registerEvents(new Root(), this);

		//commands
		Objects.requireNonNull(this.getCommand("MineQuaft-give")).setExecutor(new GiveCommand());

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
