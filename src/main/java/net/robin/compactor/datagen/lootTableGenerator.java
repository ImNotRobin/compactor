package net.robin.compactor.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;
import net.robin.compactor.common.registry.modBlocks;

import java.util.concurrent.CompletableFuture;

public class lootTableGenerator extends FabricBlockLootTableProvider {

    public lootTableGenerator(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        // drops itself
        addDrop(modBlocks.gunpowder_barrel);
        addDrop(modBlocks.sugar_cane_bundle);
        addDrop(modBlocks.blaze_block);
    }
}
