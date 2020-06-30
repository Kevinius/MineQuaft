package de.kevin.draconic.achievements;

import de.kevin.draconic.items.ItemStackFactory;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public enum Achievements {

    HASFUSIONBOOK("The Beginning", "The Beginning of the end",
            ItemStackFactory.getInstance().createCraftingTablets(Material.KNOWLEDGE_BOOK,
                    "§6Fusion Quafting Tablet", "§7Quaft really powerful items with it!"));

    String name;
    String description;
    ItemStack itemStack;

    Achievements(String name, String description, ItemStack itemStack) {
        this.name = name;
        this.description = description;
        this.itemStack = itemStack;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public ItemStack getItemStack() {
        return itemStack;
    }
}
