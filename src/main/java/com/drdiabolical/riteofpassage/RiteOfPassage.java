package com.drdiabolical.riteofpassage;

import com.drdiabolical.riteofpassage.registry.ModBlocks;
import com.drdiabolical.riteofpassage.registry.ModGeneration;
import com.drdiabolical.riteofpassage.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class RiteOfPassage implements ModInitializer {
    // Stores the MOD ID for referencing
    public static final String MOD_ID = "riteofpassage";

    // Creates the item group for all mod items (and makes custom creative mode menu tab)
    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
        new Identifier(MOD_ID, "general"), // Tab title
        () -> new ItemStack(ModItems.BISMUTH) // Tab icon
    );

    // Override onInitialize - Called upon initialization of the mod
    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlocks();
        ModGeneration.registerGeneration();
    }
}
