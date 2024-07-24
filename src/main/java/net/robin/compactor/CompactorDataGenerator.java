package net.robin.compactor;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.robin.compactor.datagen.recipeGenerator;
import net.robin.compactor.datagen.lootTableGenerator;
import net.robin.compactor.datagen.modelGenerator;

public class CompactorDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack dataGens = fabricDataGenerator.createPack();

		dataGens.addProvider(recipeGenerator::new);
		dataGens.addProvider(lootTableGenerator::new);
		dataGens.addProvider(modelGenerator::new);
	}
}
