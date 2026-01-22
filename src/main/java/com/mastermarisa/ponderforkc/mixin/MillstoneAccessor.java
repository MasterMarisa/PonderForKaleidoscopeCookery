package com.mastermarisa.ponderforkc.mixin;

import com.github.ysbbbbbb.kaleidoscopecookery.blockentity.kitchen.MillstoneBlockEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value = {MillstoneBlockEntity.class},remap = false)
public interface MillstoneAccessor {
    @Accessor("cacheRot")
    void setCacheRot(float cacheRot);
}
