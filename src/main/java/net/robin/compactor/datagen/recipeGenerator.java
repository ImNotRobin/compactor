package net.robin.compactor.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.robin.compactor.common.registry.modBlocks;
import net.robin.compactor.common.registry.modItems;

import java.util.concurrent.CompletableFuture;

public class recipeGenerator extends FabricRecipeProvider {
    public recipeGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerReversibleCompactingRecipes(exporter, RecipeCategory.COMBAT, Items.ARROW, RecipeCategory.COMBAT, modItems.arrow_bundle);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.COMBAT, Items.SPECTRAL_ARROW, RecipeCategory.COMBAT, modItems.spectral_arrow_bundle);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.FOOD, Items.ROTTEN_FLESH, RecipeCategory.FOOD, modItems.flesh_pile);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.FOOD, Items.SPIDER_EYE, RecipeCategory.FOOD, modItems.spider_eye_jar);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.GUNPOWDER, RecipeCategory.COMBAT, modBlocks.gunpowder_barrel);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.SUGAR_CANE, RecipeCategory.COMBAT, modBlocks.sugar_cane_block);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.BLAZE_ROD, RecipeCategory.COMBAT, modBlocks.blaze_block);
    }
}
