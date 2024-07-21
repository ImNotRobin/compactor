package net.robin.compactor;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.robin.compactor.datagen.recipeGenerator;
import net.robin.compactor.datagen.lootTableGenerator;

public class CompactorDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(recipeGenerator::new);
		pack.addProvider(lootTableGenerator::new);
	}
}
