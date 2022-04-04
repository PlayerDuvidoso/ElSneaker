package me.devdoso.elsneaker.ItemManager;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.LeatherArmorMeta;

import java.util.ArrayList;
import java.util.List;

public class ElSneakerItem {

    public static ItemStack ElSneakerT1;
    public static ItemStack ElSneakerT2;
    public static ItemStack ElSneakerT3;
    public static ItemStack ElSneakerT4;

    public static void init() {
        createElSneakerT1();
        createElSneakerT2();
        createElSneakerT3();
        createElSneakerT4();
    }

    private static void createElSneakerT1() {
        ItemStack item = new ItemStack(Material.LEATHER_BOOTS, 1);
        LeatherArmorMeta meta = (LeatherArmorMeta) item.getItemMeta();
        meta.setDisplayName("§eEl Sneaker T1");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add("§7El Sneaker T1 grants you:");
        lore.add("§7 - Jump Boost 1");
        meta.setLore(lore);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        meta.spigot().setUnbreakable(true);
        meta.setColor(Color.YELLOW);
        item.setItemMeta(meta);
        ElSneakerT1 = item;
    }
    private static void createElSneakerT2() {
        ItemStack item = new ItemStack(Material.LEATHER_BOOTS, 1);
        LeatherArmorMeta meta = (LeatherArmorMeta) item.getItemMeta();
        meta.setDisplayName("§eEl Sneaker T2");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add("§7El Sneaker T2 grants you:");
        lore.add("§7 - Jump Boost 2");;
        meta.setLore(lore);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        meta.spigot().setUnbreakable(true);
        meta.setColor(Color.YELLOW);
        item.setItemMeta(meta);
        ElSneakerT2 = item;
    }
    private static void createElSneakerT3() {
        ItemStack item = new ItemStack(Material.LEATHER_BOOTS, 1);
        LeatherArmorMeta meta = (LeatherArmorMeta) item.getItemMeta();
        meta.setDisplayName("§eEl Sneaker T3");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add("§7El Sneaker T3 grants you:");
        lore.add("§7 - Jump Boost 3");
        meta.setLore(lore);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        meta.spigot().setUnbreakable(true);
        meta.setColor(Color.YELLOW);
        item.setItemMeta(meta);
        ElSneakerT3 = item;
    }
    private static void createElSneakerT4() {
        ItemStack item = new ItemStack(Material.LEATHER_BOOTS, 1);
        LeatherArmorMeta meta = (LeatherArmorMeta) item.getItemMeta();
        meta.setDisplayName("§eEl Sneaker T4");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add("§7El Sneaker T4 grants you:");
        lore.add("§7 - Jump Boost 4");;
        meta.setLore(lore);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        meta.spigot().setUnbreakable(true);
        meta.setColor(Color.YELLOW);
        item.setItemMeta(meta);
        ElSneakerT4 = item;
    }
}
