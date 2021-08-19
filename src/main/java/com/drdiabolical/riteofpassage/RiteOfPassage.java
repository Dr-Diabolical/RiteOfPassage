package com.drdiabolical.riteofpassage;

import com.drdiabolical.riteofpassage.registry.ModBlocks;
import com.drdiabolical.riteofpassage.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class RiteOfPassage implements ModInitializer {

    public static final String MOD_ID = "riteofpassage";

    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlocks();
    }
}
