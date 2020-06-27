package de.kevin.draconic.items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ItemStackFactory {

    private static ItemStackFactory instance;

    private ItemStack endirium;

    private ItemStackFactory(){}

    public static ItemStackFactory getInstance(){
        if(instance == null){
            instance = new ItemStackFactory();
        }
        return instance;
    }

    public ItemStack createEndirium() {

        endirium = new ItemStack(Material.REPEATING_COMMAND_BLOCK, 1);

        ItemMeta endiriumMeta = endirium.getItemMeta();
        endiriumMeta.setDisplayName("§6Endirium");
        endiriumMeta.setCustomModelData(12321);
        endirium.setItemMeta(endiriumMeta);
        return endirium;
    }

    public ItemStack getEndirium() {
        if(endirium == null) {
            createEndirium();
        }
        return endirium;
    }

}
