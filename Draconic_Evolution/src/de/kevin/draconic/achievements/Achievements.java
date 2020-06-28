package de.kevin.draconic.achievements;

import de.kevin.draconic.items.ItemStackFactory;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public enum Achievements {

    FIRSTJOIN("FirstJoin", "The Beginning of everything",
            ItemStackFactory.getInstance().createCraftingTablets(Material.KNOWLEDGE_BOOK,
                    "Fusion Quafting Tablet", "Fusioniere Sachen um noch besser Sachen zu machen :D"));

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
