package com.mastermarisa.ponderforkc.mixin;

import com.github.ysbbbbbb.kaleidoscopecookery.blockentity.kitchen.PotBlockEntity;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(value = {PotBlockEntity.class},remap = false)
public interface PotBlockEntityAccessor {
    @Invoker("startCooking")
    void invokeStartCooking(Level level);
}
