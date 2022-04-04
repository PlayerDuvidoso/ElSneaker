package me.devdoso.elsneaker.CommandManager;

import me.devdoso.elsneaker.utils.IntegerCheck;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static me.devdoso.elsneaker.ItemManager.ElSneakerItem.*;

public class ElSneakerCmd implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (command.getName().equalsIgnoreCase("givesneaker")) {
            Player player = (Player) sender;
            if (args.length > 1 && IntegerCheck.isInteger(args[0])) {
                Player target = Bukkit.getPlayerExact(args[1]);
                if (target != null) {
                    int tier = Integer.parseInt(args[0]);

                    switch (tier) {
                        case 1:
                            target.getInventory().addItem(ElSneakerT1);
                            break;
                        case 2:
                            target.getInventory().addItem(ElSneakerT2);
                            break;
                        case 3:
                            target.getInventory().addItem(ElSneakerT3);
                            break;
                        case 4:
                            target.getInventory().addItem(ElSneakerT4);
                            break;
                    }

                } else {
                    sender.sendMessage("§cUsage: /givesneaker <Tier 1-4> <Player>");
                }
            } else {
                sender.sendMessage("§cUsage: /givesneaker <Tier 1-4> <Player>");
            }
        }
        return true;
    }
}
