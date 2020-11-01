package de.kevinius.minequaft.items;

import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.UUID;

public class ArmorFactory {

    private static ArmorFactory instance;

    private ItemStack endiriumHelmet;
    private ItemStack endiriumChestplate;
    private ItemStack endiriumLeggings;
    private ItemStack endiriumBoots;
    private ItemStack dragonHelmet;

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
        endiriumHelmetMeta.setDisplayName("§fEndirium Helmet");
        endiriumHelmetMeta.setCustomModelData(110100);

        AttributeModifier speedModifier = new AttributeModifier(UUID.randomUUID(), "generic.movementSpeed", 0.04, AttributeModifier.Operation.ADD_SCALAR, EquipmentSlot.HEAD);
        endiriumHelmetMeta.addAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED, speedModifier);
        AttributeModifier armorModifier = new AttributeModifier(UUID.randomUUID(), "generic.armor", 4, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD);
        endiriumHelmetMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, armorModifier);
        AttributeModifier armortoughnessModifier = new AttributeModifier(UUID.randomUUID(), "generic.armorToughness", 4, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD);
        endiriumHelmetMeta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, armortoughnessModifier);
        AttributeModifier knockbackResistanceModifier = new AttributeModifier(UUID.randomUUID(), "generic.knockbackResistance", 1, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD);
        endiriumHelmetMeta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, knockbackResistanceModifier);

        ArrayList<String> lore = new ArrayList<>();
        lore.add("");
        lore.add("§5Useless");
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
        endiriumChestplateMeta.setDisplayName("§fEndirium Chestplate");
        endiriumChestplateMeta.setCustomModelData(110101);

        AttributeModifier speedModifier = new AttributeModifier(UUID.randomUUID(), "generic.movementSpeed", 0.03, AttributeModifier.Operation.ADD_SCALAR, EquipmentSlot.CHEST);
        endiriumChestplateMeta.addAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED, speedModifier);
        AttributeModifier armorModifier = new AttributeModifier(UUID.randomUUID(), "generic.armor", 9, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST);
        endiriumChestplateMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, armorModifier);
        AttributeModifier armortoughnessModifier = new AttributeModifier(UUID.randomUUID(), "generic.armorToughness", 4, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST);
        endiriumChestplateMeta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, armortoughnessModifier);
        AttributeModifier knockbackResistanceModifier = new AttributeModifier(UUID.randomUUID(), "generic.knockbackResistance", 2, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST);
        endiriumChestplateMeta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, knockbackResistanceModifier);

        ArrayList<String> lore = new ArrayList<>();
        lore.add("");
        lore.add("§5Useless");
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
        endiriumLeggingsMeta.setDisplayName("§fEndirium Leggings");
        endiriumLeggingsMeta.setCustomModelData(110102);

        AttributeModifier speedModifier = new AttributeModifier(UUID.randomUUID(), "generic.movementSpeed", 0.03, AttributeModifier.Operation.ADD_SCALAR, EquipmentSlot.LEGS);
        endiriumLeggingsMeta.addAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED, speedModifier);
        AttributeModifier armorModifier = new AttributeModifier(UUID.randomUUID(), "generic.armor", 7, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.LEGS);
        endiriumLeggingsMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, armorModifier);
        AttributeModifier armortoughnessModifier = new AttributeModifier(UUID.randomUUID(), "generic.armorToughness", 4, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.LEGS);
        endiriumLeggingsMeta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, armortoughnessModifier);
        AttributeModifier knockbackResistanceModifier = new AttributeModifier(UUID.randomUUID(), "generic.knockbackResistance", 1, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.LEGS);
        endiriumLeggingsMeta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, knockbackResistanceModifier);

        ArrayList<String> lore = new ArrayList<>();
        lore.add("");
        lore.add("§5Useless");
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

        endiriumBoots = new ItemStack(Material.NETHERITE_BOOTS, 1);

        ItemMeta endiriumBootsMeta = endiriumBoots.getItemMeta();
        assert endiriumBootsMeta != null;
        endiriumBootsMeta.setDisplayName("§fEndirium Boots");
        endiriumBootsMeta.setCustomModelData(110103);

        AttributeModifier speedModifier = new AttributeModifier(UUID.randomUUID(), "generic.movementSpeed", 0.04, AttributeModifier.Operation.ADD_SCALAR, EquipmentSlot.FEET);
        endiriumBootsMeta.addAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED, speedModifier);
        AttributeModifier armorModifier = new AttributeModifier(UUID.randomUUID(), "generic.armor", 4, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.FEET);
        endiriumBootsMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, armorModifier);
        AttributeModifier armortoughnessModifier = new AttributeModifier(UUID.randomUUID(), "generic.armorToughness", 4, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.FEET);
        endiriumBootsMeta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, armortoughnessModifier);
        AttributeModifier knockbackResistanceModifier = new AttributeModifier(UUID.randomUUID(), "generic.knockbackResistance", 1, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.FEET);
        endiriumBootsMeta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, knockbackResistanceModifier);

        ArrayList<String> lore = new ArrayList<>();
        lore.add("");
        lore.add("§5Useless");
        endiriumBootsMeta.setLore(lore);
        endiriumBoots.setItemMeta(endiriumBootsMeta);
    }

    public ItemStack getEndiriumBoots() {
        if(endiriumBoots == null) {
            createEndiriumBoots();
        }
        return endiriumBoots;
    }

    private void createDragonHelmet() {

        dragonHelmet = new ItemStack(Material.TURTLE_HELMET, 1);

        ItemMeta dragonHelmetMeta = dragonHelmet.getItemMeta();
        assert dragonHelmetMeta != null;
        dragonHelmetMeta.setDisplayName("§fDragon Helmet");
        dragonHelmetMeta.setCustomModelData(110104);

        AttributeModifier armorModifier = new AttributeModifier(UUID.randomUUID(), "generic.armor", 3, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD);
        dragonHelmetMeta.addAttributeModifier(Attribute.GENERIC_ARMOR, armorModifier);
        AttributeModifier armortoughnessModifier = new AttributeModifier(UUID.randomUUID(), "generic.armorToughness", 2, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD);
        dragonHelmetMeta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, armortoughnessModifier);

        ArrayList<String> lore = new ArrayList<>();
        lore.add("");
        lore.add("§5Don't let da Enderman hurt u :D");
        dragonHelmetMeta.setLore(lore);
        dragonHelmet.setItemMeta(dragonHelmetMeta);
    }

    public ItemStack getDragonHelmet() {
        if(dragonHelmet == null) {
            createDragonHelmet();
        }
        return dragonHelmet;
    }
}
