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

    private final ItemStack xtremeQuaftingTable = ItemStackFactory.getInstance().getXtremeQuaftingTable();
    private final ItemStack fusionQuaftingTable = ItemStackFactory.getInstance().getFusionQuaftingTable();

    private final ItemStack endiriumHoe = ToolFactory.getInstance().getEndiriumHoe();
    private final ItemStack endiriumShovel = ToolFactory.getInstance().getEndiriumShovel();
    private final ItemStack endiriumSword = ToolFactory.getInstance().getEndiriumSword();
    private final ItemStack endiriumPickaxe = ToolFactory.getInstance().getEndiriumPickaxe();
    private final ItemStack endiriumAxe = ToolFactory.getInstance().getEndiriumAxe();

    private final ItemStack endirium = ItemStackFactory.getInstance().getEndirium();
    private final ItemStack dragonScale = ItemStackFactory.getInstance().getDragonScale();
    private final ItemStack endstoneCluster = ItemStackFactory.getInstance().getEndstoneCluster();

    private final ItemStack donut = ItemStackFactory.getInstance().getDonut();
    private final ItemStack bigMoq = ItemStackFactory.getInstance().getBigMoq();
    private final ItemStack sushi = ItemStackFactory.getInstance().getSushi();


    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String s, String[] args) {

        Player player = (Player) sender;
        if(sender.isOp()) {

            /*---------------Quafting Tables---------------*/

            if(args.length == 1 && args[0].equalsIgnoreCase("xqtable"))
            {
                player.getInventory().addItem(xtremeQuaftingTable);
            }
            if(args.length == 1 && args[0].equalsIgnoreCase("fqtable"))
            {
                player.getInventory().addItem(fusionQuaftingTable);
            }

            /*---------------Endirium Tools---------------*/

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

            /*---------------Items---------------*/

            if(args.length == 1 && args[0].equalsIgnoreCase("endirium"))
            {
                player.getInventory().addItem(endirium);
            }
            if(args.length == 1 && args[0].equalsIgnoreCase("dragon_scale"))
            {
                player.getInventory().addItem(dragonScale);
            }
            if(args.length == 1 && args[0].equalsIgnoreCase("endstone_cluster"))
            {
                player.getInventory().addItem(endstoneCluster);
            }

            /*---------------Food---------------*/

            if(args.length == 1 && args[0].equalsIgnoreCase("donut"))
            {
                player.getInventory().addItem(donut);
            }
            if(args.length == 1 && args[0].equalsIgnoreCase("big_moq"))
            {
                player.getInventory().addItem(bigMoq);
            }
            if(args.length == 1 && args[0].equalsIgnoreCase("sushi"))
            {
                player.getInventory().addItem(sushi);
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
