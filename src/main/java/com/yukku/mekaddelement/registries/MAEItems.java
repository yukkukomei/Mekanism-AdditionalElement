package com.yukku.mekaddelement.registries;

import com.yukku.mekaddelement.main.MekanismAdditionalElement;
import mekanism.api.text.EnumColor;
import mekanism.common.registration.impl.ItemDeferredRegister;
import mekanism.common.registration.impl.ItemRegistryObject;
import net.minecraft.world.item.Item;

public class MAEItems {

    private MAEItems() {
    }

    public static final ItemDeferredRegister ITEMS = new ItemDeferredRegister(MekanismAdditionalElement.MODID);

    public static final ItemRegistryObject<Item> CALCIUM_OXIDE_DUST = ITEMS.register("dust_calcium_oxide");
}
