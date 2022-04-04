package me.devdoso.elsneaker;

import me.devdoso.elsneaker.CommandManager.ElSneakerFastCmd;
import me.devdoso.elsneaker.CommandManager.ElSneakerCmd;
import me.devdoso.elsneaker.EventManager.ElSneakerFastPowers;
import me.devdoso.elsneaker.EventManager.ElSneakerPowers;
import me.devdoso.elsneaker.ItemManager.ElSneakerFastItem;
import me.devdoso.elsneaker.ItemManager.ElSneakerItem;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class ElSneaker extends JavaPlugin {

    @Override
    public void onEnable() {
        ElSneakerItem.init();
        ElSneakerFastItem.init();

        getServer().getPluginManager().registerEvents(new ElSneakerPowers(), this);
        getServer().getPluginManager().registerEvents(new ElSneakerFastPowers(), this);

        getCommand("givesneaker").setExecutor(new ElSneakerCmd());
        getCommand("givesneakerfast").setExecutor(new ElSneakerFastCmd());

        Bukkit.getServer().getConsoleSender().sendMessage("§a[ElSneaker]: Plugin Started!");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
