package net.robin.compactor.common.registry;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.potion.Potion;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.robin.compactor.Compactor;

public class modPotions {

    public static final RegistryEntry<Potion> haste_potion = registerPotions("haste_potion", new Potion(new StatusEffectInstance(StatusEffects.HASTE, 3600)));
    public static final RegistryEntry<Potion> long_haste_potion = registerPotions("long_haste_potion", new Potion(new StatusEffectInstance(StatusEffects.HASTE, 9600)));
    public static final RegistryEntry<Potion> strong_haste_potion = registerPotions("strong_haste_potion", new Potion(new StatusEffectInstance(StatusEffects.HASTE, 3600, 1)));

    public static RegistryEntry<Potion> registerPotions(String id, Potion potion) {
        return Registry.registerReference(Registries.POTION, Identifier.of(Compactor.MOD_ID, id), potion);
    }


    public static void registerAll() {}
}