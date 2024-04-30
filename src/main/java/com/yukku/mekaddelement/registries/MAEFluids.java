package com.yukku.mekaddelement.registries;

import com.yukku.mekaddelement.main.AdditionalChemicalConstants;
import com.yukku.mekaddelement.main.MekanismAdditionalElement;
import mekanism.common.registration.impl.FluidDeferredRegister;
import mekanism.common.registration.impl.FluidRegistryObject;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraftforge.fluids.ForgeFlowingFluid.Flowing;
import net.minecraftforge.fluids.ForgeFlowingFluid.Source;

public class MAEFluids {

    private MAEFluids() {
    }

    public static final FluidDeferredRegister FLUIDS = new FluidDeferredRegister(MekanismAdditionalElement.MODID);

    public static final FluidRegistryObject<Source, Flowing, LiquidBlock, BucketItem> HELIUM = FLUIDS.registerLiquidChemical(AdditionalChemicalConstants.HELIUM);
    public static final FluidRegistryObject<Source, Flowing, LiquidBlock, BucketItem> SUPERHEATED_HELIUM = FLUIDS.registerLiquidChemical(AdditionalChemicalConstants.SUPERHEATED_HELIUM);
    public static final FluidRegistryObject<Source, Flowing, LiquidBlock, BucketItem> STRONTIUM = FLUIDS.registerLiquidChemical(AdditionalChemicalConstants.STRONTIUM);
    public static final FluidRegistryObject<Source, Flowing, LiquidBlock, BucketItem> YTTRIUM = FLUIDS.registerLiquidChemical(AdditionalChemicalConstants.YTTRIUM);
}
