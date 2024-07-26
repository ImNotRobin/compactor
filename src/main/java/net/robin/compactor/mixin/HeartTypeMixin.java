package net.robin.compactor.mixin;

import net.minecraft.client.gui.hud.InGameHud;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(InGameHud.class)
public class HeartTypeMixin {
    // Give lethal poison the same heart effect as regular poison
}
