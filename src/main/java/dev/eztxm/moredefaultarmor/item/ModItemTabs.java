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
    public static RegistryKey<ItemGroup> WORLD_ARMORS_GROUP;

    public static void registerItemGroups() {
        WORLD_ARMORS_GROUP = registerItemGroup("world_armors");
    }

    public static void setupItemGroups() {
        Registry.register(Registries.ITEM_GROUP, WORLD_ARMORS_GROUP, FabricItemGroup.builder()
                .icon(() -> new ItemStack(ModItems.OAK_CHESTPLATE))
                .displayName(Text.of("MoreDefaultArmor - Overworld"))
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
    }

    private static RegistryKey<ItemGroup> registerItemGroup(String path) {
        return RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(MoreDefaultArmor.MOD_ID, path));
    }
}
