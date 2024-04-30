package com.yukku.mekaddelement.main;

import com.yukku.mekaddelement.registries.MAEFluids;
import com.yukku.mekaddelement.registries.MAEGases;
import com.yukku.mekaddelement.registries.MAEItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(MekanismAdditionalElement.MODID)
public class MekanismAdditionalElement {

    public static final String MODID = "mekaddelement";

    public MekanismAdditionalElement() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register the Deferred Registers
        MAEGases.GASES.register(modEventBus);
        MAEFluids.FLUIDS.register(modEventBus);
        MAEItems.ITEMS.register(modEventBus);
    }
}