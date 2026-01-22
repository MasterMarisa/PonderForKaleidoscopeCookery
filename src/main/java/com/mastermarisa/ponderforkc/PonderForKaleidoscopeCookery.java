package com.mastermarisa.ponderforkc;

import net.minecraft.resources.ResourceLocation;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;

@OnlyIn(Dist.CLIENT)
@Mod(PonderForKaleidoscopeCookery.MOD_ID)
public class PonderForKaleidoscopeCookery {
    public static final String MOD_ID = "ponderforkc";
    public static final Logger LOGGER = LogUtils.getLogger();

    public static ResourceLocation resourceLocation(String path) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
    }

    public PonderForKaleidoscopeCookery(IEventBus modEventBus, ModContainer modContainer, Dist dist) {

    }
}
