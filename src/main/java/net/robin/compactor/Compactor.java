package net.robin.compactor;

import net.fabricmc.api.ModInitializer;
import net.robin.compactor.common.registry.modEffects;
import net.robin.compactor.common.registry.modItems;
import net.robin.compactor.common.registry.modPotions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Compactor implements ModInitializer {
    // This logger is used to write text to the console and the log file.
    // It is considered best practice to use your mod id as the logger's name.
    // That way, it's clear which mod wrote info, warnings, and errors.
    public static final String MOD_ID = "compactor";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        LOGGER.info("Initializing Compactor");
//        modItemGroups.registerItemGroups();
        modItems.registerModItems();
        modPotions.registerAll();
        modEffects.registerAll();
    }
}