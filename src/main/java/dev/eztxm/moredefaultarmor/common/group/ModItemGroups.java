package dev.eztxm.moredefaultarmor.common.group;

import dev.eztxm.moredefaultarmor.MoreDefaultArmor;
import dev.eztxm.moredefaultarmor.common.item.ModItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
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
                })
                .build());
    }

    private static RegistryKey<ItemGroup> registerItemGroup(String path) {
        return RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(MoreDefaultArmor.MOD_ID, path));
    }
}
