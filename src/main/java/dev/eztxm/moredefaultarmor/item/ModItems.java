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

    //overworld
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

    //nether
    public static Item NETHERRACK_HELMET;
    public static Item NETHERRACK_CHESTPLATE;
    public static Item NETHERRACK_LEGGINGS;
    public static Item NETHERRACK_BOOTS;
    //end

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
    }

    private static Item registerItem(String name, ArmorMaterial material, ArmorItem.Type type, Rarity rarity) {
        Item item = new ArmorItem(material, type, new Item.Settings().maxCount(1).rarity(rarity));
        Registry.register(Registries.ITEM, new Identifier(MoreDefaultArmor.MOD_ID, name), item);
        return item;
    }
}
