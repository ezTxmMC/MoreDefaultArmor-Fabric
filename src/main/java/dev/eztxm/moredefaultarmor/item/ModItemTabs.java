package dev.eztxm.moredefaultarmor.item;

import dev.eztxm.moredefaultarmor.MoreDefaultArmor;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemTabs {
    public static RegistryKey<ItemGroup> OVERWORLD_ARMORS_TAB;
    public static RegistryKey<ItemGroup> NETHER_ARMORS_TAB;
    public static RegistryKey<ItemGroup> END_ARMORS_TAB;

    public static void registerItemGroups() {
        OVERWORLD_ARMORS_TAB = registerItemGroup("overworldtab");
        NETHER_ARMORS_TAB = registerItemGroup("nethertab");
        END_ARMORS_TAB = registerItemGroup("endtab");
    }

    public static void setupItemGroups() {
        Registry.register(Registries.ITEM_GROUP, OVERWORLD_ARMORS_TAB, FabricItemGroup.builder()
                .icon(() -> new ItemStack(ModItems.OAK_CHESTPLATE))
                .displayName(Text.translatable("itemGroup.moredefaultarmor.overworld"))
                .entries((displayContext, entries) -> {
                    entries.add(ModItems.DIRT_HELMET);
                    entries.add(ModItems.DIRT_CHESTPLATE);
                    entries.add(ModItems.DIRT_LEGGINGS);
                    entries.add(ModItems.DIRT_BOOTS);
                    entries.add(ModItems.OAK_HELMET);
                    entries.add(ModItems.OAK_CHESTPLATE);
                    entries.add(ModItems.OAK_LEGGINGS);
                    entries.add(ModItems.OAK_BOOTS);
                    entries.add(ModItems.COBBLESTONE_HELMET);
                    entries.add(ModItems.COBBLESTONE_CHESTPLATE);
                    entries.add(ModItems.COBBLESTONE_LEGGINGS);
                    entries.add(ModItems.COBBLESTONE_BOOTS);
                    entries.add(ModItems.ANDESITE_HELMET);
                    entries.add(ModItems.ANDESITE_CHESTPLATE);
                    entries.add(ModItems.ANDESITE_LEGGINGS);
                    entries.add(ModItems.ANDESITE_BOOTS);
                    entries.add(ModItems.DIORITE_HELMET);
                    entries.add(ModItems.DIORITE_CHESTPLATE);
                    entries.add(ModItems.DIORITE_LEGGINGS);
                    entries.add(ModItems.DIORITE_BOOTS);
                    entries.add(ModItems.GRANITE_HELMET);
                    entries.add(ModItems.GRANITE_CHESTPLATE);
                    entries.add(ModItems.GRANITE_LEGGINGS);
                    entries.add(ModItems.GRANITE_BOOTS);
                })
                .build());
        Registry.register(Registries.ITEM_GROUP, NETHER_ARMORS_TAB, FabricItemGroup.builder()
                .icon(() -> new ItemStack(ModItems.NETHERRACK_CHESTPLATE))
                .displayName(Text.translatable("itemGroup.moredefaultarmor.nether"))
                .entries((displayContext, entries) -> {
                    entries.add(ModItems.NETHERRACK_HELMET);
                    entries.add(ModItems.NETHERRACK_CHESTPLATE);
                    entries.add(ModItems.NETHERRACK_LEGGINGS);
                    entries.add(ModItems.NETHERRACK_BOOTS);
                })
                .build());
        Registry.register(Registries.ITEM_GROUP, END_ARMORS_TAB, FabricItemGroup.builder()
                .icon(() -> new ItemStack(Items.BARRIER))
                .displayName(Text.translatable("itemGroup.moredefaultarmor.end"))
                .entries((displayContext, entries) -> {

                })
                .build());
    }

    private static RegistryKey<ItemGroup> registerItemGroup(String path) {
        return RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(MoreDefaultArmor.MOD_ID, path));
    }
}
