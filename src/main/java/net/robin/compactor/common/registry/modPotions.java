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

//    public static Potion potion_haste;
//    public static Potion long_potion_haste;
//    public static Potion strong_potion_haste;
//    public static Potion strong_long_potion_haste;


//    public static StatusEffect haste_copy = registerEffect("haste_copy", new StatusEffect(StatusEffectCategory.BENEFICIAL, 14270531).addAttributeModifier(EntityAttributes.GENERIC_ATTACK_SPEED, Identifier.ofVanilla("effect.haste"), 0.1F, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
//
//    public static StatusEffect registerEffect(String id, StatusEffect effect) {
//
//        return Registry.register(Registries.STATUS_EFFECT, Identifier.of(Compactor.MOD_ID), effect);
//
//    }

    public static final RegistryEntry<Potion> haste_potion = registerPotions("haste_potion", new Potion(new StatusEffectInstance(StatusEffects.HASTE, 3600)));
    public static final RegistryEntry<Potion> long_haste_potion = registerPotions("long_haste_potion", new Potion(new StatusEffectInstance(StatusEffects.HASTE, 9600)));
    public static final RegistryEntry<Potion> strong_haste_potion = registerPotions("strong_haste_potion", new Potion(new StatusEffectInstance(StatusEffects.HASTE, 3600, 1)));
//    public static final RegistryEntry<Potion> strong_long_potion_haste = registerPotions("potion_haste", new Potion(new StatusEffectInstance(StatusEffects.HASTE, 9600,1)));

    public static RegistryEntry<Potion> registerPotions(String id, Potion potion) {
        return Registry.registerReference(Registries.POTION, Identifier.of(Compactor.MOD_ID, id), potion);
    }


    public static void registerAll() {
//        potion_haste = registerPotions("potion_haste", new Potion(new StatusEffectInstance(StatusEffects.HASTE, 3600)));
//        long_potion_haste = registerPotions("long_potion_haste", new Potion(new StatusEffectInstance(StatusEffects.HASTE, 9600)));
//        strong_potion_haste = registerPotions("strong_potion_haste", new Potion(new StatusEffectInstance(StatusEffects.HASTE, 3600, 1)));
//        strong_long_potion_haste = registerPotions("strong_long_potion_haste", new Potion(new StatusEffectInstance(StatusEffects.HASTE, 9600, 1)));
    }
}