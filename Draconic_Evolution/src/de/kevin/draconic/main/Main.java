package de.kevin.draconic.main;

import de.kevin.draconic.achievements.AchievementClass;
import de.kevin.draconic.achievements.HasFusionTomb;
import de.kevin.draconic.inventorys.craftingInventorys.FusionCraftingInventory;
import de.kevin.draconic.items.functions.PrevendFromDespawn;
import de.kevin.draconic.mobdrops.DragonDrop;
import de.kevin.draconic.recipes.craftingTableRecipes.DragonScalePieceRecipe;
import de.kevin.draconic.recipes.craftingTableRecipes.FusionTombRecipe;
import de.kevin.draconic.recipes.fusionCraftingRecipes.EndiriumRecipe;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	private static Main plugin;

	AchievementClass achievementClass = null;

	public void onEnable() {
		plugin = this;
		PluginManager pluginManager = Bukkit.getPluginManager();
		new DragonScalePieceRecipe().createDragonScalePieceRecipe();
		new FusionTombRecipe().createFusionTombRecipe();
		
		pluginManager.registerEvents(new DragonDrop(), this);
		pluginManager.registerEvents(new FusionCraftingInventory(), this);
		pluginManager.registerEvents(new EndiriumRecipe(), this);
		pluginManager.registerEvents(new PrevendFromDespawn(), this);
		pluginManager.registerEvents(new HasFusionTomb(), this);
		saveConfig();

		achievementClass = new AchievementClass(this);
	}
	
	public static Main getPlugin() {
		return plugin;
	}

}
