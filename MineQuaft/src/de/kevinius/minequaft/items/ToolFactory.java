package de.kevinius.minequaft.items;

import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.UUID;

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
        endiriumSwordMeta.setDisplayName("§fEndirium Sword");
        endiriumSwordMeta.setCustomModelData(101102);
        AttributeModifier attackDamagemodifier = new AttributeModifier(UUID.randomUUID(), "generic.attackDamage", 8, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
        endiriumSwordMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, attackDamagemodifier);
        AttributeModifier attackSpeedModifier = new AttributeModifier(UUID.randomUUID(), "generic.attackSpeed", -2.3, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
        endiriumSwordMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, attackSpeedModifier);
        endiriumSwordMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        ArrayList<String> lore = new ArrayList<>();
        lore.add("");
        lore.add("§7When in Main Hand:");
        lore.add(" §29 Attack Damage");
        lore.add(" §21.7 Attack Speed");
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
        endiriumPickaxeMeta.setDisplayName("§fEndirium Pickaxe");
        endiriumPickaxeMeta.setCustomModelData(101101);
        ArrayList<String> lore = new ArrayList<>();
        endiriumPickaxeMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        lore.add("");
        lore.add("§7When in Main Hand:");
        lore.add(" §26 Attack Damage");
        lore.add(" §21.2 Attack Speed");
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
        endiriumAxeMeta.setDisplayName("§fEndirium Axe");
        endiriumAxeMeta.setCustomModelData(101103);
        ArrayList<String> lore = new ArrayList<>();
        endiriumAxeMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        lore.add("");
        lore.add("§7When in Main Hand:");
        lore.add(" §210 Attack Damage");
        lore.add(" §21 Attack Speed");
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
        endiriumShovelMeta.setDisplayName("§fEndirium Shovel");
        endiriumShovelMeta.setCustomModelData(101104);
        endiriumShovelMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        ArrayList<String> lore = new ArrayList<>();
        lore.add("");
        lore.add("§7When in Main Hand:");
        lore.add(" §26.5 Attack Damage");
        lore.add(" §21 Attack Speed");
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
        endiriumHoeMeta.setDisplayName("§fEndirium Hoe");
        endiriumHoeMeta.setCustomModelData(101105);
        ArrayList<String> lore = new ArrayList<>();
        endiriumHoeMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        lore.add("");
        lore.add("§7When in Main Hand:");
        lore.add(" §21 Attack Damage");
        lore.add(" §24 Attack Speed");
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
