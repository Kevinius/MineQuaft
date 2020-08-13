package de.kevin.draconic.commands;

import de.kevin.draconic.items.ItemStackFactory;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.Objects;

public class GiveCommand implements CommandExecutor {

    ItemStack xtremeQuaftingTable = ItemStackFactory.getInstance().getXtremeQuaftingTable();
    ItemStack fusionQuaftingTable = ItemStackFactory.getInstance().getFusionQuaftingTable();

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {

        if(sender != null) {
            Player player = (Player) sender;
            if(sender.isOp()) {
                if(args.length == 1 && args[0].equalsIgnoreCase("xqtable")) {
                    player.getInventory().addItem(xtremeQuaftingTable);
                }
                if(args.length == 1 && args[0].equalsIgnoreCase("fstable")) {
                    player.getInventory().addItem(fusionQuaftingTable);
                }
            } else {
                player.sendMessage("§cSeems like you don't have the permission to perform this command");
                if(Objects.requireNonNull(Bukkit.getPlayer("Kevinius")).isOnline()) {
                    Objects.requireNonNull(Bukkit.getPlayer("Kevinius")).sendMessage("§a" + player.getName() + "§c performed the command §6/mqgive§c, but failed successfully");
                }
            }
        } else {
            System.out.println("God cannot perform commands like this, please do it as an player");
        }
        return false;
    }
}
