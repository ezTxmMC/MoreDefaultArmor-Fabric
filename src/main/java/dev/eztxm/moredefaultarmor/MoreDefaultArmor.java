package dev.eztxm.moredefaultarmor;

import dev.eztxm.moredefaultarmor.common.group.ModItemGroups;
import dev.eztxm.moredefaultarmor.common.item.ModItems;
import net.fabricmc.api.ModInitializer;

public class MoreDefaultArmor implements ModInitializer {
    public static final String MOD_ID = "moredefaultarmor";

    @Override
    public void onInitialize() {
        ModItemGroups.registerItemGroups();
        ModItems.registerItems();
        ModItemGroups.setupItemGroups();
    }
}
