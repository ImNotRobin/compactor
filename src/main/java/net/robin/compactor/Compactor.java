package net.robin.compactor;

import net.fabricmc.api.ModInitializer;
import net.robin.compactor.common.registry.modBlocks;
import net.robin.compactor.common.registry.modEffects;
import net.robin.compactor.common.registry.modItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Compactor implements ModInitializer {
    public static final String MOD_ID = "compactor";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing Compactor");
//        modItemGroups.registerItemGroups();
        modItems.registerItems();
        modEffects.registerAll();
        modBlocks.registerAll();
    }
}