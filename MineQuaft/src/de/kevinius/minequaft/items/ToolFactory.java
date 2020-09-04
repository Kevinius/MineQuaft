package de.kevinius.minequaft.items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class ToolFactory{

    private static ToolFactory instance;

    private ItemStack endiriumPickaxe;
    private ItemStack endiriumSword;
    private ItemStack endiriumAxe;
    private ItemStack endiriumShovel;
    private ItemStack endiriumHoe;

    private ToolFactory(){}

    public static ToolFactory getInstance(){
        if(instance == null){
            instance = new ToolFactory();
        }
        return instance;
    }

    private void createEndiriumSword() {

        endiriumSword = new ItemStack(Material.NETHERITE_SWORD);

        ItemMeta endiriumSwordMeta = endiriumSword.getItemMeta();
        assert endiriumSwordMeta != null;
        endiriumSwordMeta.setDisplayName("§6Endirium Sword");
        endiriumSwordMeta.setCustomModelData(101102);
        ArrayList<String> lore = new ArrayList<>();
        lore.add("§5Never");
        lore.add("§dNever");
        endiriumSwordMeta.setLore(lore);
        endiriumSword.setItemMeta(endiriumSwordMeta);
    }

    public ItemStack getEndiriumSword() {
        if(endiriumSword == null) {
            createEndiriumSword();
        }
        return endiriumSword;
    }

    private void createEndiriumPickaxe() {

        endiriumPickaxe = new ItemStack(Material.NETHERITE_PICKAXE);

        ItemMeta endiriumPickaxeMeta = endiriumPickaxe.getItemMeta();
        assert endiriumPickaxeMeta != null;
        endiriumPickaxeMeta.setDisplayName("§6Endirium Pickaxe");
        endiriumPickaxeMeta.setCustomModelData(101101);
        ArrayList<String> lore = new ArrayList<>();
        lore.add("§5Gonna");
        lore.add("§dGonna");
        endiriumPickaxeMeta.setLore(lore);
        endiriumPickaxe.setItemMeta(endiriumPickaxeMeta);
    }

    public ItemStack getEndiriumPickaxe() {
        if(endiriumPickaxe == null) {
            createEndiriumPickaxe();
        }
        return endiriumPickaxe;
    }

    private void createEndiriumAxe() {
        endiriumAxe = new ItemStack(Material.NETHERITE_AXE);

        ItemMeta endiriumAxeMeta = endiriumAxe.getItemMeta();
        assert endiriumAxeMeta != null;
        endiriumAxeMeta.setDisplayName("§6Endirium Axe");
        endiriumAxeMeta.setCustomModelData(101103);
        ArrayList<String> lore = new ArrayList<>();
        lore.add("§5Give");
        lore.add("§dLet");
        endiriumAxeMeta.setLore(lore);
        endiriumAxe.setItemMeta(endiriumAxeMeta);
    }

    public ItemStack getEndiriumAxe() {
        if(endiriumAxe == null) {
            createEndiriumAxe();
        }
        return endiriumAxe;
    }

    private void createEndiriumShovel() {
        endiriumShovel = new ItemStack(Material.NETHERITE_SHOVEL);

        ItemMeta endiriumShovelMeta = endiriumShovel.getItemMeta();
        assert endiriumShovelMeta != null;
        endiriumShovelMeta.setDisplayName("§6Endirium Shovel");
        endiriumShovelMeta.setCustomModelData(101104);
        ArrayList<String> lore = new ArrayList<>();
        lore.add("§5You");
        lore.add("§dYou");
        endiriumShovelMeta.setLore(lore);
        endiriumShovel.setItemMeta(endiriumShovelMeta);
    }

    public ItemStack getEndiriumShovel() {
        if(endiriumShovel == null) {
            createEndiriumShovel();
        }
        return endiriumShovel;
    }

    private void createEndiriumHoe() {
        endiriumHoe = new ItemStack(Material.NETHERITE_HOE);

        ItemMeta endiriumHoeMeta = endiriumHoe.getItemMeta();
        assert endiriumHoeMeta != null;
        endiriumHoeMeta.setDisplayName("§6Endirium Hoe");
        endiriumHoeMeta.setCustomModelData(101105);
        ArrayList<String> lore = new ArrayList<>();
        lore.add("§5Up");
        lore.add("§dDooown...");
        endiriumHoeMeta.setLore(lore);
        endiriumHoe.setItemMeta(endiriumHoeMeta);
    }

    public ItemStack getEndiriumHoe() {
        if(endiriumHoe == null) {
            createEndiriumHoe();
        }
        return endiriumHoe;
    }
}
