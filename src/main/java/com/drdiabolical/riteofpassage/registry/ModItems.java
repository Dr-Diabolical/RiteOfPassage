package com.drdiabolical.riteofpassage.registry;

import com.drdiabolical.riteofpassage.RiteOfPassage;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    // Items
    public static final Item SAPPHIRE = new Item(new Item.Settings().group(RiteOfPassage.ITEM_GROUP));

    // Block Items
    public static final BlockItem SAPPHIRE_BLOCK = new BlockItem(ModBlocks.SAPPHIRE_BLOCK, new Item.Settings().group(RiteOfPassage.ITEM_GROUP));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(RiteOfPassage.MOD_ID, "sapphire"), SAPPHIRE);
        Registry.register(Registry.ITEM, new Identifier(RiteOfPassage.MOD_ID, "sapphire_block"), SAPPHIRE_BLOCK);
    }
}
