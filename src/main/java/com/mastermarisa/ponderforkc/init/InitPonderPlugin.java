package com.mastermarisa.ponderforkc.init;

import com.mastermarisa.ponderforkc.PonderForKaleidoscopeCookery;
import com.mastermarisa.ponderforkc.ponder.CookeryBlockPonderScreen;
import com.mastermarisa.ponderforkc.ponder.CookeryBlockPonderTag;
import net.createmod.ponder.api.registration.PonderPlugin;
import net.createmod.ponder.api.registration.PonderSceneRegistrationHelper;
import net.createmod.ponder.api.registration.PonderTagRegistrationHelper;
import net.minecraft.resources.ResourceLocation;

public class InitPonderPlugin implements PonderPlugin {
    @Override
    public String getModId(){
        return PonderForKaleidoscopeCookery.MOD_ID;
    }

    @Override
    public void registerScenes(PonderSceneRegistrationHelper<ResourceLocation> helper){
        CookeryBlockPonderScreen.register(helper);
    }

    @Override
    public void registerTags(PonderTagRegistrationHelper<ResourceLocation> helper) {
        CookeryBlockPonderTag.register(helper);
    }
}
