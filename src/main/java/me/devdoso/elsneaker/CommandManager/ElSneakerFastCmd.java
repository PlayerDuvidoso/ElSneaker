package me.devdoso.elsneaker.CommandManager;

import me.devdoso.elsneaker.utils.IntegerCheck;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static me.devdoso.elsneaker.ItemManager.ElSneakerFastItem.*;

public class ElSneakerFastCmd implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("givesneakerfast")) {
            Player player = (Player) sender;
            if (args.length > 1 && IntegerCheck.isInteger(args[0])) {
                Player target = Bukkit.getPlayerExact(args[1]);
                if (target != null) {
                    int tier = Integer.parseInt(args[0]);

                    switch (tier) {
                        case 1:
                            target.getInventory().addItem(ElSneakerFastT1);
                            break;
                        case 2:
                            target.getInventory().addItem(ElSneakerFastT2);
                            break;
                        case 3:
                            target.getInventory().addItem(ElSneakerFastT3);
                            break;
                    }

                } else {
                    sender.sendMessage("§cUsage: /givesneakerfast <Tier 1-4> <Player>");
                }
            } else {
                sender.sendMessage("§cUsage: /givesneakerfast <Tier 1-4> <Player>");
            }
        }
        return true;
    }
}
