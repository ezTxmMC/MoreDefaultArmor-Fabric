package dev.eztxm.moredefaultarmor.item;

import dev.eztxm.moredefaultarmor.MoreDefaultArmor;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
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
        OVERWORLD_ARMORS_TAB = registerItemGroup("moredefaultarmor1overworldtab");
        NETHER_ARMORS_TAB = registerItemGroup("moredefaultarmor2nethertab");
        END_ARMORS_TAB = registerItemGroup("moredefaultarmor3endtab");
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
                    entries.add(ModItems.DEEPSLATE_COBBLE_HELMET);
                    entries.add(ModItems.DEEPSLATE_COBBLE_CHESTPLATE);
                    entries.add(ModItems.DEEPSLATE_COBBLE_LEGGINGS);
                    entries.add(ModItems.DEEPSLATE_COBBLE_BOOTS);
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

                    entries.add(ModItems.SMOOTH_BASALT_HELMET);
                    entries.add(ModItems.SMOOTH_BASALT_CHESTPLATE);
                    entries.add(ModItems.SMOOTH_BASALT_LEGGINGS);
                    entries.add(ModItems.SMOOTH_BASALT_BOOTS);

                    entries.add(ModItems.NYLIUM_HELMET);
                    entries.add(ModItems.NYLIUM_CHESTPLATE);
                    entries.add(ModItems.NYLIUM_LEGGINGS);
                    entries.add(ModItems.NYLIUM_BOOTS);

                    entries.add(ModItems.NETHER_WART_HELMET);
                    entries.add(ModItems.NETHER_WART_CHESTPLATE);
                    entries.add(ModItems.NETHER_WART_LEGGINGS);
                    entries.add(ModItems.NETHER_WART_BOOTS);

                    entries.add(ModItems.NETHER_BRICK_HELMET);
                    entries.add(ModItems.NETHER_BRICK_CHESTPLATE);
                    entries.add(ModItems.NETHER_BRICK_LEGGINGS);
                    entries.add(ModItems.NETHER_BRICK_BOOTS);

                    entries.add(ModItems.WARPED_HELMET);
                    entries.add(ModItems.WARPED_CHESTPLATE);
                    entries.add(ModItems.WARPED_LEGGINGS);
                    entries.add(ModItems.WARPED_BOOTS);

                    entries.add(ModItems.NETHER_QUARTZ_HELMET);
                    entries.add(ModItems.NETHER_QUARTZ_CHESTPLATE);
                    entries.add(ModItems.NETHER_QUARTZ_LEGGINGS);
                    entries.add(ModItems.NETHER_QUARTZ_BOOTS);

                    entries.add(ModItems.BLACKSTONE_HELMET);
                    entries.add(ModItems.BLACKSTONE_CHESTPLATE);
                    entries.add(ModItems.BLACKSTONE_LEGGINGS);
                    entries.add(ModItems.BLACKSTONE_BOOTS);
                })
                .build());
        Registry.register(Registries.ITEM_GROUP, END_ARMORS_TAB, FabricItemGroup.builder()
                .icon(() -> new ItemStack(ModItems.END_STONE_CHESTPLATE))
                .displayName(Text.translatable("itemGroup.moredefaultarmor.end"))
                .entries((displayContext, entries) -> {
                    entries.add(ModItems.END_STONE_HELMET);
                    entries.add(ModItems.END_STONE_CHESTPLATE);
                    entries.add(ModItems.END_STONE_LEGGINGS);
                    entries.add(ModItems.END_STONE_BOOTS);
                })
                .build());
    }

    private static RegistryKey<ItemGroup> registerItemGroup(String path) {
        return RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(MoreDefaultArmor.MOD_ID, path));
    }
}
