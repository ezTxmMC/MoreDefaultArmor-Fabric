package dev.eztxm.moredefaultarmor;

import dev.eztxm.moredefaultarmor.item.ModItemTabs;
import dev.eztxm.moredefaultarmor.item.ModItems;
import dev.eztxm.moredefaultarmor.util.UpdateChecker;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.minecraft.text.Text;

import java.util.Optional;

public class MoreDefaultArmor implements ModInitializer {
    public static final String MOD_ID = "moredefaultarmor";

    private static UpdateChecker updateChecker;

    @Override
    public void onInitialize() {
        ModItemTabs.registerItemGroups();
        ModItems.registerItems();
        ModItemTabs.setupItemGroups();

        Optional<ModContainer> modContainer = FabricLoader.getInstance().getModContainer(MOD_ID);
        modContainer.ifPresent(container -> {
            updateChecker = new UpdateChecker(container.getMetadata().getVersion().getFriendlyString());
            updateChecker.getLatestVersion();
        });

        ClientPlayConnectionEvents.JOIN.register((handler, sender, client) -> {
            if (updateChecker != null && !updateChecker.latestVersion()) {
                if (client.player != null) {
                    client.player.sendMessage(Text.translatable("message.moredefaultarmor.update"));
                }
            }
        });
    }
}
