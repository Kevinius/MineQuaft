package de.kevin.draconic.commands;

import de.kevin.draconic.items.ItemStackFactory;
import de.kevin.draconic.items.ToolFactory;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class GiveCommand implements CommandExecutor {

    ItemStack xtremeQuaftingTable = ItemStackFactory.getInstance().getXtremeQuaftingTable();
    ItemStack fusionQuaftingTable = ItemStackFactory.getInstance().getFusionQuaftingTable();
    ItemStack endirium = ItemStackFactory.getInstance().getEndirium();
    ItemStack dragonScale = ItemStackFactory.getInstance().createDragonScale();

    ItemStack endiriumHoe = ToolFactory.getInstance().getEndiriumHoe();
    ItemStack endiriumShovel = ToolFactory.getInstance().getEndiriumShovel();
    ItemStack endiriumSword = ToolFactory.getInstance().getEndiriumSword();
    ItemStack endiriumPickaxe = ToolFactory.getInstance().getEndiriumPickaxe();
    ItemStack endiriumAxe = ToolFactory.getInstance().getEndiriumAxe();


    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String s, String[] args) {

        Player player = (Player) sender;
        if(sender.isOp()) {
            if(args.length == 1 && args[0].equalsIgnoreCase("xqtable"))
            {
                player.getInventory().addItem(xtremeQuaftingTable);
            }
            if(args.length == 1 && args[0].equalsIgnoreCase("fqtable"))
            {
                player.getInventory().addItem(fusionQuaftingTable);
            }
            if(args.length == 1 && args[0].equalsIgnoreCase("endirium_sword"))
            {
                player.getInventory().addItem(endiriumSword);
            }
            if(args.length == 1 && args[0].equalsIgnoreCase("endirium_pickaxe"))
            {
                player.getInventory().addItem(endiriumPickaxe);
            }
            if(args.length == 1 && args[0].equalsIgnoreCase("endirium_axe"))
            {
                player.getInventory().addItem(endiriumAxe);
            }
            if(args.length == 1 && args[0].equalsIgnoreCase("endirium_shovel"))
            {
                player.getInventory().addItem(endiriumShovel);
            }
            if(args.length == 1 && args[0].equalsIgnoreCase("endirium_hoe"))
            {
                player.getInventory().addItem(endiriumHoe);
            }
            if(args.length == 1 && args[0].equalsIgnoreCase("endirium"))
            {
                player.getInventory().addItem(endirium);
            }
            if(args.length == 1 && args[0].equalsIgnoreCase("dragon_scale"))
            {
                player.getInventory().addItem(dragonScale);
            }
        } else {
            player.sendMessage("§cSeems like you don't have the permission to perform this command");
            if(Objects.requireNonNull(Bukkit.getPlayer("Kevinius")).isOnline()) {
                Objects.requireNonNull(Bukkit.getPlayer("Kevinius")).sendMessage("§a" + player.getName() + "§c performed the command §6/mqgive§c, but failed successfully");
            }
        }
        return false;
    }
}
