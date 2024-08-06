package dev.eztxm.moredefaultarmor.item;

import dev.eztxm.moredefaultarmor.MoreDefaultArmor;
import dev.eztxm.moredefaultarmor.armor.*;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {

    // Overworld
    public static Item DIRT_HELMET;
    public static Item DIRT_CHESTPLATE;
    public static Item DIRT_LEGGINGS;
    public static Item DIRT_BOOTS;
    public static Item OAK_HELMET;
    public static Item OAK_CHESTPLATE;
    public static Item OAK_LEGGINGS;
    public static Item OAK_BOOTS;
    public static Item COBBLESTONE_HELMET;
    public static Item COBBLESTONE_CHESTPLATE;
    public static Item COBBLESTONE_LEGGINGS;
    public static Item COBBLESTONE_BOOTS;
    public static Item ANDESITE_HELMET;
    public static Item ANDESITE_CHESTPLATE;
    public static Item ANDESITE_LEGGINGS;
    public static Item ANDESITE_BOOTS;
    public static Item DIORITE_HELMET;
    public static Item DIORITE_CHESTPLATE;
    public static Item DIORITE_LEGGINGS;
    public static Item DIORITE_BOOTS;
    public static Item GRANITE_HELMET;
    public static Item GRANITE_CHESTPLATE;
    public static Item GRANITE_LEGGINGS;
    public static Item GRANITE_BOOTS;
    public static Item DEEPSLATE_COBBLE_HELMET;
    public static Item DEEPSLATE_COBBLE_CHESTPLATE;
    public static Item DEEPSLATE_COBBLE_LEGGINGS;
    public static Item DEEPSLATE_COBBLE_BOOTS;

    // Nether
    public static Item NETHERRACK_HELMET;
    public static Item NETHERRACK_CHESTPLATE;
    public static Item NETHERRACK_LEGGINGS;
    public static Item NETHERRACK_BOOTS;

    public static Item SMOOTH_BASALT_HELMET;
    public static Item SMOOTH_BASALT_CHESTPLATE;
    public static Item SMOOTH_BASALT_LEGGINGS;
    public static Item SMOOTH_BASALT_BOOTS;

    public static Item NYLIUM_HELMET;
    public static Item NYLIUM_CHESTPLATE;
    public static Item NYLIUM_LEGGINGS;
    public static Item NYLIUM_BOOTS;

    public static Item NETHER_WART_HELMET;
    public static Item NETHER_WART_CHESTPLATE;
    public static Item NETHER_WART_LEGGINGS;
    public static Item NETHER_WART_BOOTS;

    public static Item NETHER_BRICK_HELMET;
    public static Item NETHER_BRICK_CHESTPLATE;
    public static Item NETHER_BRICK_LEGGINGS;
    public static Item NETHER_BRICK_BOOTS;

    public static Item WARPED_HELMET;
    public static Item WARPED_CHESTPLATE;
    public static Item WARPED_LEGGINGS;
    public static Item WARPED_BOOTS;

    // End
    public static Item END_STONE_HELMET;
    public static Item END_STONE_CHESTPLATE;
    public static Item END_STONE_LEGGINGS;
    public static Item END_STONE_BOOTS;

    public static void registerItems() {
        DIRT_HELMET = registerItem("dirt_helmet", ModArmorTiers.DIRT, ArmorItem.Type.HELMET, Rarity.COMMON);
        DIRT_CHESTPLATE = registerItem("dirt_chestplate", ModArmorTiers.DIRT, ArmorItem.Type.CHESTPLATE, Rarity.COMMON);
        DIRT_LEGGINGS = registerItem("dirt_leggings", ModArmorTiers.DIRT, ArmorItem.Type.LEGGINGS, Rarity.COMMON);
        DIRT_BOOTS = registerItem("dirt_boots", ModArmorTiers.DIRT, ArmorItem.Type.BOOTS, Rarity.COMMON);

        OAK_HELMET = registerItem("oak_helmet", ModArmorTiers.OAK, ArmorItem.Type.HELMET, Rarity.COMMON);
        OAK_CHESTPLATE = registerItem("oak_chestplate", ModArmorTiers.OAK, ArmorItem.Type.CHESTPLATE, Rarity.COMMON);
        OAK_LEGGINGS = registerItem("oak_leggings", ModArmorTiers.OAK, ArmorItem.Type.LEGGINGS, Rarity.COMMON);
        OAK_BOOTS = registerItem("oak_boots", ModArmorTiers.OAK, ArmorItem.Type.BOOTS, Rarity.COMMON);

        COBBLESTONE_HELMET = registerItem("cobblestone_helmet", ModArmorTiers.COBBLESTONE, ArmorItem.Type.HELMET, Rarity.COMMON);
        COBBLESTONE_CHESTPLATE = registerItem("cobblestone_chestplate", ModArmorTiers.COBBLESTONE, ArmorItem.Type.CHESTPLATE, Rarity.COMMON);
        COBBLESTONE_LEGGINGS = registerItem("cobblestone_leggings", ModArmorTiers.COBBLESTONE, ArmorItem.Type.LEGGINGS, Rarity.COMMON);
        COBBLESTONE_BOOTS = registerItem("cobblestone_boots", ModArmorTiers.COBBLESTONE, ArmorItem.Type.BOOTS, Rarity.COMMON);

        ANDESITE_HELMET = registerItem("andesite_helmet", ModArmorTiers.ANDESITE, ArmorItem.Type.HELMET, Rarity.COMMON);
        ANDESITE_CHESTPLATE = registerItem("andesite_chestplate", ModArmorTiers.ANDESITE, ArmorItem.Type.CHESTPLATE, Rarity.COMMON);
        ANDESITE_LEGGINGS = registerItem("andesite_leggings", ModArmorTiers.ANDESITE, ArmorItem.Type.LEGGINGS, Rarity.COMMON);
        ANDESITE_BOOTS = registerItem("andesite_boots", ModArmorTiers.ANDESITE, ArmorItem.Type.BOOTS, Rarity.COMMON);

        DIORITE_HELMET = registerItem("diorite_helmet", ModArmorTiers.DIORITE, ArmorItem.Type.HELMET, Rarity.COMMON);
        DIORITE_CHESTPLATE = registerItem("diorite_chestplate", ModArmorTiers.DIORITE, ArmorItem.Type.CHESTPLATE, Rarity.COMMON);
        DIORITE_LEGGINGS = registerItem("diorite_leggings", ModArmorTiers.DIORITE, ArmorItem.Type.LEGGINGS, Rarity.COMMON);
        DIORITE_BOOTS = registerItem("diorite_boots", ModArmorTiers.DIORITE, ArmorItem.Type.BOOTS, Rarity.COMMON);

        GRANITE_HELMET = registerItem("granite_helmet", ModArmorTiers.GRANITE, ArmorItem.Type.HELMET, Rarity.COMMON);
        GRANITE_CHESTPLATE = registerItem("granite_chestplate", ModArmorTiers.GRANITE, ArmorItem.Type.CHESTPLATE, Rarity.COMMON);
        GRANITE_LEGGINGS = registerItem("granite_leggings", ModArmorTiers.GRANITE, ArmorItem.Type.LEGGINGS, Rarity.COMMON);
        GRANITE_BOOTS = registerItem("granite_boots", ModArmorTiers.GRANITE, ArmorItem.Type.BOOTS, Rarity.COMMON);

        DEEPSLATE_COBBLE_HELMET = registerItem("deepslate_cobble_helmet", ModArmorTiers.DEEPSLATE_COBBLE, ArmorItem.Type.HELMET, Rarity.COMMON);
        DEEPSLATE_COBBLE_CHESTPLATE = registerItem("deepslate_cobble_chestplate", ModArmorTiers.DEEPSLATE_COBBLE, ArmorItem.Type.CHESTPLATE, Rarity.COMMON);
        DEEPSLATE_COBBLE_LEGGINGS = registerItem("deepslate_cobble_leggings", ModArmorTiers.DEEPSLATE_COBBLE, ArmorItem.Type.LEGGINGS, Rarity.COMMON);
        DEEPSLATE_COBBLE_BOOTS = registerItem("deepslate_cobble_boots", ModArmorTiers.DEEPSLATE_COBBLE, ArmorItem.Type.BOOTS, Rarity.COMMON);

        NETHERRACK_HELMET = registerItem("netherrack_helmet", ModArmorTiers.NETHERRACK, ArmorItem.Type.HELMET, Rarity.COMMON);
        NETHERRACK_CHESTPLATE = registerItem("netherrack_chestplate", ModArmorTiers.NETHERRACK, ArmorItem.Type.CHESTPLATE, Rarity.COMMON);
        NETHERRACK_LEGGINGS = registerItem("netherrack_leggings", ModArmorTiers.NETHERRACK, ArmorItem.Type.LEGGINGS, Rarity.COMMON);
        NETHERRACK_BOOTS = registerItem("netherrack_boots", ModArmorTiers.NETHERRACK, ArmorItem.Type.BOOTS, Rarity.COMMON);

        END_STONE_HELMET = registerItem("end_stone_helmet", ModArmorTiers.END_STONE, ArmorItem.Type.HELMET, Rarity.COMMON);
        END_STONE_CHESTPLATE = registerItem("end_stone_chestplate", ModArmorTiers.END_STONE, ArmorItem.Type.CHESTPLATE, Rarity.COMMON);
        END_STONE_LEGGINGS = registerItem("end_stone_leggings", ModArmorTiers.END_STONE, ArmorItem.Type.LEGGINGS, Rarity.COMMON);
        END_STONE_BOOTS = registerItem("end_stone_boots", ModArmorTiers.END_STONE, ArmorItem.Type.BOOTS, Rarity.COMMON);

        SMOOTH_BASALT_HELMET = registerItem("smooth_basalt_helmet", ModArmorTiers.SMOOTH_BASALT, ArmorItem.Type.HELMET, Rarity.COMMON);
        SMOOTH_BASALT_CHESTPLATE = registerItem("smooth_basalt_chestplate", ModArmorTiers.SMOOTH_BASALT, ArmorItem.Type.CHESTPLATE, Rarity.COMMON);
        SMOOTH_BASALT_LEGGINGS = registerItem("smooth_basalt_leggings", ModArmorTiers.SMOOTH_BASALT, ArmorItem.Type.LEGGINGS, Rarity.COMMON);
        SMOOTH_BASALT_BOOTS = registerItem("smooth_basalt_boots", ModArmorTiers.SMOOTH_BASALT, ArmorItem.Type.BOOTS, Rarity.COMMON);

        NYLIUM_HELMET = registerItem("nylium_helmet", ModArmorTiers.NYLIUM, ArmorItem.Type.HELMET, Rarity.COMMON);
        NYLIUM_CHESTPLATE = registerItem("nylium_chestplate", ModArmorTiers.NYLIUM, ArmorItem.Type.CHESTPLATE, Rarity.COMMON);
        NYLIUM_LEGGINGS = registerItem("nylium_leggings", ModArmorTiers.NYLIUM, ArmorItem.Type.LEGGINGS, Rarity.COMMON);
        NYLIUM_BOOTS = registerItem("nylium_boots", ModArmorTiers.NYLIUM, ArmorItem.Type.BOOTS, Rarity.COMMON);

        NETHER_WART_HELMET = registerItem("nether_wart_helmet", ModArmorTiers.NETHER_WART, ArmorItem.Type.HELMET, Rarity.COMMON);
        NETHER_WART_CHESTPLATE = registerItem("nether_wart_chestplate", ModArmorTiers.NETHER_WART, ArmorItem.Type.CHESTPLATE, Rarity.COMMON);
        NETHER_WART_LEGGINGS = registerItem("nether_wart_leggings", ModArmorTiers.NETHER_WART, ArmorItem.Type.LEGGINGS, Rarity.COMMON);
        NETHER_WART_BOOTS = registerItem("nether_wart_boots", ModArmorTiers.NETHER_WART, ArmorItem.Type.BOOTS, Rarity.COMMON);

        NETHER_BRICK_HELMET = registerItem("nether_brick_helmet", ModArmorTiers.NETHER_BRICK, ArmorItem.Type.HELMET, Rarity.COMMON);
        NETHER_BRICK_CHESTPLATE = registerItem("nether_brick_chestplate", ModArmorTiers.NETHER_BRICK, ArmorItem.Type.CHESTPLATE, Rarity.COMMON);
        NETHER_BRICK_LEGGINGS = registerItem("nether_brick_leggings", ModArmorTiers.NETHER_BRICK, ArmorItem.Type.LEGGINGS, Rarity.COMMON);
        NETHER_BRICK_BOOTS = registerItem("nether_brick_boots", ModArmorTiers.NETHER_BRICK, ArmorItem.Type.BOOTS, Rarity.COMMON);

        WARPED_HELMET = registerItem("warped_helmet", ModArmorTiers.WARPED, ArmorItem.Type.HELMET, Rarity.COMMON);
        WARPED_CHESTPLATE = registerItem("warped_chestplate", ModArmorTiers.WARPED, ArmorItem.Type.CHESTPLATE, Rarity.COMMON);
        WARPED_LEGGINGS = registerItem("warped_leggings", ModArmorTiers.WARPED, ArmorItem.Type.LEGGINGS, Rarity.COMMON);
        WARPED_BOOTS = registerItem("warped_boots", ModArmorTiers.WARPED, ArmorItem.Type.BOOTS, Rarity.COMMON);

    }

    private static Item registerItem(String name, ArmorMaterial material, ArmorItem.Type type, Rarity rarity) {
        Item item = new ArmorItem(material, type, new Item.Settings().maxCount(1).rarity(rarity));
        Registry.register(Registries.ITEM, new Identifier(MoreDefaultArmor.MOD_ID, name), item);
        return item;
    }
}
