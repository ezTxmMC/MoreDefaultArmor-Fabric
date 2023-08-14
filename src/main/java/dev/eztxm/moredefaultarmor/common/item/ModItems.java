package dev.eztxm.moredefaultarmor.common.item;

import dev.eztxm.moredefaultarmor.MoreDefaultArmor;
import dev.eztxm.moredefaultarmor.common.armor.DirtArmorMaterial;
import dev.eztxm.moredefaultarmor.common.armor.OakArmorMaterial;
import dev.eztxm.moredefaultarmor.common.armor.StoneArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {
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

    public static void registerItems() {
        //region Dirt
        DIRT_HELMET = registerItem("dirt_helmet.json", new DirtArmorMaterial(), ArmorItem.Type.HELMET, Rarity.COMMON);
        DIRT_CHESTPLATE = registerItem("dirt_chestplate", new DirtArmorMaterial(), ArmorItem.Type.CHESTPLATE, Rarity.COMMON);
        DIRT_LEGGINGS = registerItem("dirt_leggings", new DirtArmorMaterial(), ArmorItem.Type.LEGGINGS, Rarity.COMMON);
        DIRT_BOOTS = registerItem("dirt_boots", new DirtArmorMaterial(), ArmorItem.Type.BOOTS, Rarity.COMMON);
        //endregion
        //region Oak Wood
        OAK_HELMET = registerItem("oak_helmet", new OakArmorMaterial(), ArmorItem.Type.HELMET, Rarity.COMMON);
        OAK_CHESTPLATE = registerItem("oak_chestplate", new OakArmorMaterial(), ArmorItem.Type.CHESTPLATE, Rarity.COMMON);
        OAK_LEGGINGS = registerItem("oak_leggings", new OakArmorMaterial(), ArmorItem.Type.LEGGINGS, Rarity.COMMON);
        OAK_BOOTS = registerItem("oak_boots", new OakArmorMaterial(), ArmorItem.Type.BOOTS, Rarity.COMMON);
        //endregion
        //region Stone
        COBBLESTONE_HELMET = registerItem("cobblestone_helmet", new StoneArmorMaterial(), ArmorItem.Type.HELMET, Rarity.COMMON);
        COBBLESTONE_CHESTPLATE = registerItem("cobblestone_chestplate", new StoneArmorMaterial(), ArmorItem.Type.CHESTPLATE, Rarity.COMMON);
        COBBLESTONE_LEGGINGS = registerItem("cobblestone_leggings", new StoneArmorMaterial(), ArmorItem.Type.LEGGINGS, Rarity.COMMON);
        COBBLESTONE_BOOTS = registerItem("cobblestone_boots", new StoneArmorMaterial(), ArmorItem.Type.BOOTS, Rarity.COMMON);
        ANDESITE_HELMET = registerItem("andesite_helmet", new StoneArmorMaterial(), ArmorItem.Type.HELMET, Rarity.COMMON);
        ANDESITE_CHESTPLATE = registerItem("andesite_chestplate", new StoneArmorMaterial(), ArmorItem.Type.CHESTPLATE, Rarity.COMMON);
        ANDESITE_LEGGINGS = registerItem("andesite_leggings", new StoneArmorMaterial(), ArmorItem.Type.LEGGINGS, Rarity.COMMON);
        ANDESITE_BOOTS = registerItem("andesite_boots", new StoneArmorMaterial(), ArmorItem.Type.BOOTS, Rarity.COMMON);
        DIORITE_HELMET = registerItem("diorite_helmet", new StoneArmorMaterial(), ArmorItem.Type.HELMET, Rarity.COMMON);
        DIORITE_CHESTPLATE = registerItem("diorite_chestplate", new StoneArmorMaterial(), ArmorItem.Type.CHESTPLATE, Rarity.COMMON);
        DIORITE_LEGGINGS = registerItem("diorite_leggings", new StoneArmorMaterial(), ArmorItem.Type.LEGGINGS, Rarity.COMMON);
        DIORITE_BOOTS = registerItem("diorite_boots", new StoneArmorMaterial(), ArmorItem.Type.BOOTS, Rarity.COMMON);
        GRANITE_HELMET = registerItem("granite_helmet", new StoneArmorMaterial(), ArmorItem.Type.HELMET, Rarity.COMMON);
        GRANITE_CHESTPLATE = registerItem("granite_chestplate", new StoneArmorMaterial(), ArmorItem.Type.CHESTPLATE, Rarity.COMMON);
        GRANITE_LEGGINGS = registerItem("granite_leggings", new StoneArmorMaterial(), ArmorItem.Type.LEGGINGS, Rarity.COMMON);
        GRANITE_BOOTS = registerItem("granite_boots", new StoneArmorMaterial(), ArmorItem.Type.BOOTS, Rarity.COMMON);
        //endregion
    }

    private static Item registerItem(String name, ArmorMaterial material, ArmorItem.Type type, Rarity rarity) {
        Item item = new ArmorItem(material, type, new Item.Settings().maxCount(1).rarity(rarity));
        Registry.register(Registries.ITEM, new Identifier(MoreDefaultArmor.MOD_ID, name), item);
        return item;
    }
}
