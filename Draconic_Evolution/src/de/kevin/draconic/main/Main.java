package de.kevin.draconic.main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import de.kevin.draconic.mobdrops.DragonDrop;
import de.kevin.draconic.recipes.ElytraRecipe;
import de.kevin.draconic.recipes.EndiriumRecipe;
import de.kevin.draconic.recipes.FusionCraftingTabletRecipe;
import de.kevin.draconic.recipes.ShulkerShellRecipe;
import de.kevin.draconic.recipes.craftingInventorys.FusionCraftingInventory;

public class Main extends JavaPlugin{
	private static Main plugin;
	
	public void onEnable() {
		plugin = this;
		PluginManager pluginManager = Bukkit.getPluginManager();
		
		pluginManager.registerEvents(new DragonDrop(), this);
		pluginManager.registerEvents(new ElytraRecipe(), this);
		pluginManager.registerEvents(new ShulkerShellRecipe(), this);
		pluginManager.registerEvents(new FusionCraftingInventory(), this);
		pluginManager.registerEvents(new EndiriumRecipe(), this);
		pluginManager.registerEvents(new FusionCraftingTabletRecipe(), this);

	}
	
	public static Main getPlugin() {
		return plugin;
	}

}
