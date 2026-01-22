package com.mastermarisa.ponderforkc.ponder;

import com.github.ysbbbbbb.kaleidoscopecookery.KaleidoscopeCookery;
import com.github.ysbbbbbb.kaleidoscopecookery.init.ModItems;
import com.mastermarisa.ponderforkc.PonderForKaleidoscopeCookery;
import net.createmod.catnip.registry.RegisteredObjectsHelper;
import net.createmod.ponder.api.registration.PonderTagRegistrationHelper;
import net.minecraft.core.RegistryAccess;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.registries.DeferredHolder;

public class CookeryBlockPonderTag {
    public static final ResourceLocation KITCHEN_BLOCKS = ResourceLocation.fromNamespaceAndPath(PonderForKaleidoscopeCookery.MOD_ID,"kitchen_blocks");

    public static void register(PonderTagRegistrationHelper<ResourceLocation> helper){
        helper.registerTag(KITCHEN_BLOCKS).addToIndex().item((ItemLike) ModItems.KITCHEN_SHOVEL.get(),true,false).title("").description("").register();
        helper.addToTag(KITCHEN_BLOCKS).add(ModItems.STOCKPOT.getId()).add(ModItems.POT.getId()).add(ModItems.RECIPE_ITEM.getId()).add(ModItems.STEAMER.getId()).add(ModItems.ENAMEL_BASIN.getId()).add(ModItems.MILLSTONE.getId()).add(ModItems.SHAWARMA_SPIT.getId());
    }
}
