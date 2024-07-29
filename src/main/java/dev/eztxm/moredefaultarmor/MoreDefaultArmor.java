package dev.eztxm.moredefaultarmor;

import dev.eztxm.moredefaultarmor.item.ModItemTabs;
import dev.eztxm.moredefaultarmor.item.ModItems;
import dev.eztxm.moredefaultarmor.util.UpdateChecker;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.minecraft.server.network.ServerPlayerEntity;
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
        modContainer.ifPresent(container -> updateChecker = new UpdateChecker(container.getMetadata().getVersion().getFriendlyString()));
        ServerLifecycleEvents.SERVER_STARTED.register(server -> {
            server.getPlayerManager().getPlayerList().forEach(this::onPlayerJoin);
        });
    }

    private void onPlayerJoin(ServerPlayerEntity player) {
        if (!updateChecker.latestVersion()) {
            player.sendMessage(Text.translatable("message.moredefaultarmor.update"));
        }
    }
}
