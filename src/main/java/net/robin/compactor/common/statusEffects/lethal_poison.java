package net.robin.compactor.common.statusEffects;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class lethal_poison extends StatusEffect {
    public lethal_poison(StatusEffectCategory statusEffectCategory, int i) {
        super(statusEffectCategory, i);
    }

    @Override
    public boolean applyUpdateEffect(LivingEntity entity, int amplifier) {
        entity.damage(entity.getDamageSources().magic(), 4.0F);

        return true;
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        int i = 25 >> amplifier;
        return i > 0 ? duration % i == 0 : true;
    }
}
