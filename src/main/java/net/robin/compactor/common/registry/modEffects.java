package net.robin.compactor.common.registry;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.robin.compactor.Compactor;
import net.robin.compactor.common.statusEffects.lethal_poison;
import net.robin.compactor.common.statusEffects.mysterious_illness;

public class modEffects {
    public static RegistryEntry<StatusEffect> registerEffect(String id, StatusEffect statusEffect) {
        return Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(Compactor.MOD_ID, id), statusEffect);
    }

    public static final RegistryEntry<StatusEffect> mystery_illness = registerEffect("mystery_illness", new mysterious_illness(StatusEffectCategory.HARMFUL, 6847764));
    public static final RegistryEntry<StatusEffect> lethal_poison = registerEffect("lethal_poison", new lethal_poison(StatusEffectCategory.HARMFUL, 2883614));

    public static void registerAll(){

    }
}
