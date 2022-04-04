package me.devdoso.elsneaker.EventManager;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class ElSneakerFastPowers implements Listener {
    @EventHandler
    public void onMove(PlayerMoveEvent e){
        Player p = e.getPlayer();

        if (p.getInventory().getBoots() != null){
            ItemStack boots = p.getInventory().getBoots();
            switch (boots.getItemMeta().getDisplayName()){
                case "§eEl Sneaker Fast T1":
                    p.removePotionEffect(PotionEffectType.SPEED);
                    p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 20*10000, 0));
                    break;
                case "§eEl Sneaker Fast T2":
                    p.removePotionEffect(PotionEffectType.SPEED);
                    p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 20*10000, 1));
                    break;
                case "§eEl Sneaker Fast T3":
                    p.removePotionEffect(PotionEffectType.SPEED);
                    p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 20*10000, 2));
                    break;

            }
        }else{
            p.removePotionEffect(PotionEffectType.SPEED);
        }
    }
}
