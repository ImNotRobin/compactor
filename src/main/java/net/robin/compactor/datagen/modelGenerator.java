package net.robin.compactor.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.robin.compactor.common.registry.modBlocks;

public class modelGenerator extends FabricModelProvider {
    public modelGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator bsmg) {
        bsmg.registerSimpleCubeAll(modBlocks.blaze_block);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        // Integrate current items into this later
    }
}
