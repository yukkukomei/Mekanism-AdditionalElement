package com.yukku.mekaddelement.registries;

import com.yukku.mekaddelement.main.AdditionalChemicalConstants;
import com.yukku.mekaddelement.main.MekanismAdditionalElement;
import mekanism.api.chemical.gas.Gas;
import mekanism.api.chemical.gas.attribute.GasAttributes;
import mekanism.common.registration.impl.GasDeferredRegister;
import mekanism.common.registration.impl.GasRegistryObject;

public class MAEGases {

    private MAEGases() {
    }

    public static final GasDeferredRegister GASES = new GasDeferredRegister(MekanismAdditionalElement.MODID);

    public static final GasRegistryObject<Gas> HELIUM = GASES.register(AdditionalChemicalConstants.HELIUM, Coolants.HELIUM_COOLANT);
    public static final GasRegistryObject<Gas> SUPERHEATED_HELIUM = GASES.register(AdditionalChemicalConstants.SUPERHEATED_HELIUM, Coolants.HEATED_HELIUM_COOLANT);
    public static final GasRegistryObject<Gas> STRONTIUM = GASES.register(AdditionalChemicalConstants.STRONTIUM);
    public static final GasRegistryObject<Gas> YTTRIUM = GASES.register(AdditionalChemicalConstants.YTTRIUM);

    @SuppressWarnings("Convert2MethodRef")
    public static class Coolants {

        private Coolants() {
        }

        public static final GasAttributes.CooledCoolant HELIUM_COOLANT = new GasAttributes.CooledCoolant(() -> SUPERHEATED_HELIUM.get(), 100, 1.5);
        public static final GasAttributes.HeatedCoolant HEATED_HELIUM_COOLANT = new GasAttributes.HeatedCoolant(() -> HELIUM.get(), 100, 1.5);
    }
}
