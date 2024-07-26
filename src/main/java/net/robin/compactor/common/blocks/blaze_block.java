package net.robin.compactor.common.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.PillarBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

public class blaze_block extends PillarBlock {
    public blaze_block(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(AXIS, Direction.Axis.Y));
    }

    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        if (!entity.bypassesSteppingEffects() && entity instanceof LivingEntity) {
            entity.damage(world.getDamageSources().hotFloor(), 2.0F);
        }

        super.onSteppedOn(world, pos, state, entity);
    }
}
