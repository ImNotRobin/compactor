package net.robin.compactor.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.robin.compactor.common.registry.modItems;

public class modelGenerator extends FabricModelProvider {
    public modelGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator bsmg) {
//        bsmg.registerSimpleCubeAll(modBlocks.example);
    }

    @Override
    public void generateItemModels(ItemModelGenerator img) {
        img.register(modItems.spectral_arrow_bundle, Models.GENERATED);
        img.register(modItems.spider_eye_jar, Models.GENERATED);
    }
}
