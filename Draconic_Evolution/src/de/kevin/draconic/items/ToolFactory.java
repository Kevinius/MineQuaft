package de.kevin.draconic.items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ToolFactory extends ItemStack{

    private static ToolFactory instance;

    private ItemStack endiriumPickaxe;

    private ToolFactory(){}

    public static ToolFactory getInstance(){
        if(instance == null){
            instance = new ToolFactory();
        }
        return instance;
    }

    public void createEndiriumPickaxe() {

        endiriumPickaxe = new ItemStack(Material.NETHERITE_PICKAXE);

        ItemMeta endiriumPickaxeMeta = endiriumPickaxe.getItemMeta();
        endiriumPickaxeMeta.setDisplayName("§6Endirium Pickaxe");
        endiriumPickaxeMeta.setCustomModelData(135246);
        endiriumPickaxe.setItemMeta(endiriumPickaxeMeta);
    }

    public ItemStack getEndiriumPickaxe() {
        if(endiriumPickaxe == null) {
            createEndiriumPickaxe();
        }
        return endiriumPickaxe;
    }
}
