package dev.eztxm.moredefaultarmor;

import dev.eztxm.moredefaultarmor.item.ModItemTabs;
import dev.eztxm.moredefaultarmor.item.ModItems;
import net.fabricmc.api.ModInitializer;

public class MoreDefaultArmor implements ModInitializer {
    public static final String MOD_ID = "moredefaultarmor";

    @Override
    public void onInitialize() {
        ModItemTabs.registerItemGroups();
        ModItems.registerItems();
        ModItemTabs.setupItemGroups();
    }
}
