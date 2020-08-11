package de.kevin.draconic.commands;

import de.kevin.draconic.items.ItemStackFactory;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class GiveCommand implements CommandExecutor {

    ItemStack xtremeQuaftingTable = ItemStackFactory.getInstance().getXtremeQuaftingTable();
    ItemStack fusionQuaftingTable = ItemStackFactory.getInstance().getFusionQuaftingTable();

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {

        Player player = (Player) sender;

        if(sender != null) {
            if(sender.isOp()) {
                if(args.length == 1 && args[0].equalsIgnoreCase("xqtable")) {
                    player.getInventory().addItem(xtremeQuaftingTable);
                }
                if(args.length == 1 && args[0].equalsIgnoreCase("fstable")) {
                    player.getInventory().addItem(fusionQuaftingTable);
                }
            }
        }
        return false;
    }
}
