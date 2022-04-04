package me.devdoso.elsneaker.ItemManager;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.LeatherArmorMeta;

import java.util.ArrayList;
import java.util.List;

public class ElSneakerFastItem {
    public static ItemStack ElSneakerFastT1;
    public static ItemStack ElSneakerFastT2;
    public static ItemStack ElSneakerFastT3;

    public static void init() {
        createElSneakerFastT1();
        createElSneakerFastT2();
        createElSneakerFastT3();
    }

    private static void createElSneakerFastT1() {
        ItemStack item = new ItemStack(Material.LEATHER_BOOTS, 1);
        LeatherArmorMeta meta = (LeatherArmorMeta) item.getItemMeta();
        meta.setDisplayName("§eEl Sneaker Fast T1");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add("§7El Sneaker Fast T1 grants you:");
        lore.add("§7 - Speed 1");
        meta.setLore(lore);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        meta.spigot().setUnbreakable(true);
        meta.setColor(Color.GREEN);
        item.setItemMeta(meta);
        ElSneakerFastT1 = item;
    }
    private static void createElSneakerFastT2() {
        ItemStack item = new ItemStack(Material.LEATHER_BOOTS, 1);
        LeatherArmorMeta meta = (LeatherArmorMeta) item.getItemMeta();
        meta.setDisplayName("§eEl Sneaker Fast T2");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add("§7El Sneaker Fast T2 grants you:");
        lore.add("§7 - Speed 2");
        meta.setLore(lore);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        meta.spigot().setUnbreakable(true);
        meta.setColor(Color.GREEN);
        item.setItemMeta(meta);
        ElSneakerFastT2 = item;
    }
    private static void createElSneakerFastT3() {
        ItemStack item = new ItemStack(Material.LEATHER_BOOTS, 1);
        LeatherArmorMeta meta = (LeatherArmorMeta) item.getItemMeta();
        meta.setDisplayName("§eEl Sneaker Fast T3");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add("§7El Sneaker Fast T3 grants you:");
        lore.add("§7 - Speed 3");
        meta.setLore(lore);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        meta.spigot().setUnbreakable(true);
        meta.setColor(Color.GREEN);
        item.setItemMeta(meta);
        ElSneakerFastT3 = item;
    }
}
