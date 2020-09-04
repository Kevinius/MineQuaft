package de.kevinius.minequaft.items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class ArmorFactory {

    private static ArmorFactory instance;

    private ItemStack endiriumHelmet;
    private ItemStack endiriumChestplate;
    private ItemStack endiriumLeggings;
    private ItemStack endiriumBoots;

    private ArmorFactory(){}

    public static ArmorFactory getInstance(){
        if(instance == null) {
            instance = new ArmorFactory();
        }
        return instance;
    }

    private void createEndiriumHelmet() {

        endiriumHelmet = new ItemStack(Material.NETHERITE_HELMET, 1);

        ItemMeta endiriumHelmetMeta = endiriumHelmet.getItemMeta();
        assert endiriumHelmetMeta != null;
        endiriumHelmetMeta.setDisplayName("§6Endirium Helmet");
        endiriumHelmetMeta.setCustomModelData(110100);
        ArrayList<String> lore = new ArrayList<>();
        lore.add("§4Coming soon!");
        endiriumHelmetMeta.setLore(lore);
        endiriumHelmet.setItemMeta(endiriumHelmetMeta);
    }

    public ItemStack getEndiriumHelmet() {
        if(endiriumHelmet == null) {
            createEndiriumHelmet();
        }
        return endiriumHelmet;
    }

    private void createEndiriumChestplate() {

        endiriumChestplate = new ItemStack(Material.NETHERITE_CHESTPLATE, 1);

        ItemMeta endiriumChestplateMeta = endiriumChestplate.getItemMeta();
        assert endiriumChestplateMeta != null;
        endiriumChestplateMeta.setDisplayName("§6Endirium Chestplate");
        endiriumChestplateMeta.setCustomModelData(110101);
        ArrayList<String> lore = new ArrayList<>();
        lore.add("§4Coming soon!");
        endiriumChestplateMeta.setLore(lore);
        endiriumChestplate.setItemMeta(endiriumChestplateMeta);
    }

    public ItemStack getEndiriumChestplate() {
        if(endiriumChestplate == null) {
            createEndiriumChestplate();
        }
        return endiriumChestplate;
    }

    private void createEndiriumLeggings() {

        endiriumLeggings = new ItemStack(Material.NETHERITE_LEGGINGS, 1);

        ItemMeta endiriumLeggingsMeta = endiriumLeggings.getItemMeta();
        assert endiriumLeggingsMeta != null;
        endiriumLeggingsMeta.setDisplayName("§6Endirium Leggings");
        endiriumLeggingsMeta.setCustomModelData(110102);
        ArrayList<String> lore = new ArrayList<>();
        lore.add("§4Coming soon!");
        endiriumLeggingsMeta.setLore(lore);
        endiriumLeggings.setItemMeta(endiriumLeggingsMeta);
    }

    public ItemStack getEndiriumLeggings() {
        if(endiriumLeggings == null) {
            createEndiriumLeggings();
        }
        return endiriumLeggings;
    }

    private void createEndiriumBoots() {

        endiriumBoots = new ItemStack(Material.NETHERITE_LEGGINGS, 1);

        ItemMeta endiriumBootsMeta = endiriumBoots.getItemMeta();
        assert endiriumBootsMeta != null;
        endiriumBootsMeta.setDisplayName("§6Endirium Boots");
        endiriumBootsMeta.setCustomModelData(110103);
        ArrayList<String> lore = new ArrayList<>();
        lore.add("§4Coming soon!");
        endiriumBootsMeta.setLore(lore);
        endiriumBoots.setItemMeta(endiriumBootsMeta);
    }

    public ItemStack getEndiriumBoots() {
        if(endiriumBoots == null) {
            createEndiriumBoots();
        }
        return endiriumBoots;
    }
}
