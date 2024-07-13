package net.robin.compactor.common.entity;

import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.TntEntity;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.world.World;
import net.robin.compactor.Compactor;
import org.jetbrains.annotations.Nullable;

public class gunpowderBarrelEntity extends TntEntity {

    private static final TrackedData<Integer> FUSE = DataTracker.registerData(gunpowderBarrelEntity.class, TrackedDataHandlerRegistry.INTEGER);
    private static final TrackedData<BlockState> BLOCK_STATE = DataTracker.registerData(gunpowderBarrelEntity.class, TrackedDataHandlerRegistry.BLOCK_STATE);

    public gunpowderBarrelEntity(World world, double x, double y, double z, @Nullable LivingEntity igniter) {
        super(world, x, y, z, igniter);
//        this.setFuse(10);
        Compactor.LOGGER.info("this?");
    }
}
