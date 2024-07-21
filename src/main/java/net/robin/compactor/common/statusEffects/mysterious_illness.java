package net.robin.compactor.common.statusEffects;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.util.math.Vec3d;

public class mysterious_illness extends StatusEffect {
    public mysterious_illness(StatusEffectCategory statusEffectCategory, int color) {
        super(statusEffectCategory, color);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }

    // MAYBE CONVERT THE MATH FROM JAVA LIBRARIES TO MINECRAFT LIBRARIES (ALREADY IMPORTED)

    protected double wobblePath = 0;

    // determines where in the wobble (sin) you are
    private double wobblePosition = 0;

    // an extra modifier used to determine the amplitude of the wobble
    private double wobbleAmplitude = 0.5;

    // controls the speed in which the wobble is moved through
    private double wobbleSpeed() {
        return ((Math.random() * 9) + 1) * 0.005;
    }

    // used in combo with *1 and *2 to update wobble speed on cycle instead of at random
    protected boolean makeStable = false;

    private double wobbleSpeedStable = wobbleSpeed();

    @Override
    public boolean applyUpdateEffect(LivingEntity entity, int amplifier) {

        if (entity.isOnGround()) {
            // when the wobblePosition surpasses 2pi reset so value doesnt keep growing and update amplitude mod
            if (wobblePosition >= (Math.PI) * 2) {
                wobblePosition = 0;
                wobbleAmplitude = Math.random() + 0.5;

                // *1
                if (makeStable) {
                    wobbleSpeedStable = wobbleSpeed();
                }
            }
            if ((int) (wobblePosition * 100) == 3) {
                wobbleAmplitude = Math.random() + 0.5;

                // maybe add *1 here too just to see
            }

            // *2
            if (makeStable){
                // also *2
                wobblePath = (Math.sin(wobblePosition += wobbleSpeedStable)) * wobbleAmplitude;
            } else {
                wobblePath = (Math.sin(wobblePosition += wobbleSpeed())) * wobbleAmplitude;
            }

            // does da movement
            entity.travel(new Vec3d(wobblePath, 0d, (wobblePosition / 100)));
        }

//        if (entity.getHealth() > 4.0F) {
//            entity.damage(entity.getDamageSources().magic(), 4.0f);
//        }
//        else if (entity.getHealth())

        return super.applyUpdateEffect(entity, amplifier);
    }
}