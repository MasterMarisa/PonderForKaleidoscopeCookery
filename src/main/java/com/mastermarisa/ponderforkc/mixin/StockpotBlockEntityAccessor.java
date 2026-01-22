package com.mastermarisa.ponderforkc.mixin;

import com.github.ysbbbbbb.kaleidoscopecookery.blockentity.kitchen.StockpotBlockEntity;
import com.github.ysbbbbbb.kaleidoscopecookery.crafting.container.StockpotInput;
import com.github.ysbbbbbb.kaleidoscopecookery.crafting.recipe.StockpotRecipe;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.item.crafting.RecipeManager;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(value = {StockpotBlockEntity.class},remap = false)
public interface StockpotBlockEntityAccessor {
    @Accessor("status")
    void setStatus(int status);

    @Accessor("quickCheck")
    RecipeManager.CachedCheck<StockpotInput, StockpotRecipe> getQuickCheck();

    @Invoker("applyRecipe")
    void invokeApplyRecipe(Level level, StockpotInput container, RecipeHolder<StockpotRecipe> recipe);
}
