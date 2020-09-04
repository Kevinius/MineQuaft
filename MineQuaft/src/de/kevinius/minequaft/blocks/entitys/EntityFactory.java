package de.kevinius.minequaft.blocks.entitys;

import de.kevinius.minequaft.items.ItemStackFactory;
import org.bukkit.Location;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.Objects;

public class EntityFactory{

    private static EntityFactory instance;

    private EntityFactory(){}

    public static EntityFactory getInstance(){
        if(instance == null) {
            instance = new EntityFactory();
        }
        return instance;
    }

    public ArmorStand spawnFusionQuaftingArmorstand(Location location, Player player) {

        ItemStack lanternRed = ItemStackFactory.getInstance().getLanternRed();

        ArmorStand fusionQuaftingArmorstand = (ArmorStand) player.getWorld().spawnEntity(
                location.add(0.5, 0.3, 0.5), EntityType.ARMOR_STAND);
        fusionQuaftingArmorstand.setCustomName("Fusion Quafting Table");
        fusionQuaftingArmorstand.setCustomNameVisible(false);
        fusionQuaftingArmorstand.setInvulnerable(true);
        fusionQuaftingArmorstand.setSmall(true);
        fusionQuaftingArmorstand.setGravity(false);
        fusionQuaftingArmorstand.setVisible(false);
        fusionQuaftingArmorstand.setMarker(true);
        Objects.requireNonNull(fusionQuaftingArmorstand.getEquipment()).setHelmet(lanternRed);

        return fusionQuaftingArmorstand;
    }

    public ArmorStand spawnXtremeQuaftingArmorstand(Location location, Player player) {

        ItemStack lanternBlue = ItemStackFactory.getInstance().getLanternBlue();

        ArmorStand xtremeQuaftingArmorstand = (ArmorStand) player.getWorld().spawnEntity(
                location.add(0.5, 0.3, 0.5), EntityType.ARMOR_STAND);
        xtremeQuaftingArmorstand.setCustomName("Xtreme Quafting Table");
        xtremeQuaftingArmorstand.setCustomNameVisible(false);
        xtremeQuaftingArmorstand.setInvulnerable(true);
        xtremeQuaftingArmorstand.setSmall(true);
        xtremeQuaftingArmorstand.setGravity(false);
        xtremeQuaftingArmorstand.setVisible(false);
        xtremeQuaftingArmorstand.setMarker(true);
        Objects.requireNonNull(xtremeQuaftingArmorstand.getEquipment()).setHelmet(lanternBlue);

        return xtremeQuaftingArmorstand;
    }
}
