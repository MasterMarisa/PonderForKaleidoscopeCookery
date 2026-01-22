package com.mastermarisa.ponderforkc;

import com.mastermarisa.ponderforkc.init.InitPonderPlugin;
import net.createmod.ponder.foundation.PonderIndex;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.ModList;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.gui.ConfigurationScreen;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;

@Mod(value = PonderForKaleidoscopeCookery.MOD_ID, dist = Dist.CLIENT)
@EventBusSubscriber(modid = PonderForKaleidoscopeCookery.MOD_ID, value = Dist.CLIENT)
public class PonderForKaleidoscopeCookeryClient {
    public static final boolean PONDER_LOADED = ModList.get().isLoaded("ponder");

    public PonderForKaleidoscopeCookeryClient(ModContainer container){
        if (PONDER_LOADED)
            container.registerExtensionPoint(IConfigScreenFactory.class, ConfigurationScreen::new);
    }

    @SubscribeEvent
    static void onClientSetup(FMLClientSetupEvent event){
        if (PONDER_LOADED)
            PonderIndex.addPlugin(new InitPonderPlugin());
    }
}
