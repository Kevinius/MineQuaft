package de.kevin.draconic.main;

import de.kevin.draconic.blocks.blockPlace.PlaceFusionQuaftingTable;
import de.kevin.draconic.blocks.blockPlace.PlaceXtremeQuaftingTable;
import de.kevin.draconic.inventorys.FusionCraftingInventory;
import de.kevin.draconic.inventorys.XtremeCraftingInventory;
import de.kevin.draconic.items.functions.PrevendFromDespawn;
import de.kevin.draconic.mobdrops.DragonDrop;
import de.kevin.draconic.recipes.craftingTableRecipes.BlackStoneRecipe;
import de.kevin.draconic.recipes.craftingTableRecipes.DragonScalePieceRecipe;
import de.kevin.draconic.recipes.craftingTableRecipes.DragonScaleRecipe;
import de.kevin.draconic.recipes.craftingTableRecipes.FusionTombRecipe;
import de.kevin.draconic.recipes.fusionCraftingRecipes.EndiriumRecipe;
import de.kevin.draconic.recipes.fusionCraftingRecipes.XtremeQuaftingTabletRecipe;
import de.kevin.draconic.recipes.xtremeCrafting.CompressedEndstoneRecipe;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	private static Main plugin;

	public void onEnable() {
		plugin = this;

		PluginManager pluginManager = Bukkit.getPluginManager();
		new DragonScalePieceRecipe().createDragonScalePieceRecipe();
		new FusionTombRecipe().createFusionTombRecipe();
		new DragonScaleRecipe().createDragonScaleRecipe();
		new BlackStoneRecipe().createBlackStoneRecipe();

		pluginManager.registerEvents(new DragonDrop(), this);
		pluginManager.registerEvents(new FusionCraftingInventory(), this);
		pluginManager.registerEvents(new EndiriumRecipe(), this);
		pluginManager.registerEvents(new PrevendFromDespawn(), this);
		pluginManager.registerEvents(new XtremeCraftingInventory(), this);
		pluginManager.registerEvents(new XtremeQuaftingTabletRecipe(), this);
		pluginManager.registerEvents(new CompressedEndstoneRecipe(), this);
		pluginManager.registerEvents(new PlaceFusionQuaftingTable(), this);
		pluginManager.registerEvents(new PlaceXtremeQuaftingTable(), this);
		saveConfig();
	}
	
	public static Main getPlugin() {
		return plugin;
	}

}
