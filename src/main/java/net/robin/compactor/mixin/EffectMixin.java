//package net.robin.compactor.mixin;
//
//import net.minecraft.entity.attribute.EntityAttributeModifier;
//import net.minecraft.entity.effect.StatusEffect;
//import net.minecraft.entity.effect.StatusEffectCategory;
//import net.minecraft.entity.effect.StatusEffects;
//import net.minecraft.registry.entry.RegistryEntry;
//import net.minecraft.util.Identifier;
//import org.spongepowered.asm.mixin.Mixin;
//import org.spongepowered.asm.mixin.Shadow;
//import org.spongepowered.asm.mixin.gen.Accessor;
//
//@Mixin(StatusEffects.class)
//public abstract class EffectMixin {
//    @Shadow
//    private static RegistryEntry<StatusEffect> register(String id, StatusEffect statusEffect) {
//        return null;
//    }
//
//    @Override
//    private static final RegistryEntry<StatusEffect> HASTE = register(
//            "haste",
//            new StatusEffect(StatusEffectCategory.BENEFICIAL, 14270531)
//                    .EntityAttributes.GENERIC_ATTACK_SPEED, Identifier.ofVanilla("effect.haste"), 0.1F, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL
//    );
//}
