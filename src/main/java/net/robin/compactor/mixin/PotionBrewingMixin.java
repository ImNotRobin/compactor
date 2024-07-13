package net.robin.compactor.mixin;

import net.minecraft.item.Items;
import net.minecraft.potion.Potions;
import net.minecraft.recipe.BrewingRecipeRegistry;
import org.spongepowered.asm.mixin.Mixin;

import net.robin.compactor.common.registry.modPotions;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(BrewingRecipeRegistry.class)
public abstract class PotionBrewingMixin {
    @Inject(method = "registerDefaults", at = @At("TAIL"))
    private static void registerCustomRecipe(BrewingRecipeRegistry.Builder builder, CallbackInfo ci){
        builder.registerPotionRecipe(Potions.SWIFTNESS, Items.AMETHYST_SHARD, modPotions.haste_potion);
        builder.registerPotionRecipe(modPotions.haste_potion, Items.REDSTONE, modPotions.long_haste_potion);
        builder.registerPotionRecipe(modPotions.haste_potion, Items.GLOWSTONE_DUST, modPotions.strong_haste_potion);
        builder.registerPotionRecipe(Potions.LONG_SWIFTNESS, Items.AMETHYST_SHARD, modPotions.long_haste_potion);
    }
}
