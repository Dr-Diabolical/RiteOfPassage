package com.drdiabolical.riteofpassage.registry;

import com.drdiabolical.riteofpassage.*;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    // Custom items
    public static final Item SAPPHIRE = new Item(new Item.Settings().group(RiteOfPassage.ITEM_GROUP));

    // Custom tool items
    public static final ToolItem SAPPHIRE_PICKAXE = new CustomPickaxeItem(ToolMaterialSapphire.INSTANCE, -1, -2.2f, new Item.Settings().group(RiteOfPassage.ITEM_GROUP));
    public static final ToolItem SAPPHIRE_SHOVEL = new ShovelItem(ToolMaterialSapphire.INSTANCE, -1, -2.2f, new Item.Settings().group(RiteOfPassage.ITEM_GROUP));
    public static final ToolItem SAPPHIRE_SWORD = new SwordItem(ToolMaterialSapphire.INSTANCE, 5, -1f, new Item.Settings().group(RiteOfPassage.ITEM_GROUP));
    public static final ToolItem SAPPHIRE_AXE = new CustomAxeItem(ToolMaterialSapphire.INSTANCE, 3, -2f, new Item.Settings().group(RiteOfPassage.ITEM_GROUP));
    public static final ToolItem SAPPHIRE_HOE = new CustomHoeItem(ToolMaterialSapphire.INSTANCE, -1, -0.3f, new Item.Settings().group(RiteOfPassage.ITEM_GROUP));

    // Custom block items
    public static final BlockItem SAPPHIRE_BLOCK = new BlockItem(ModBlocks.SAPPHIRE_BLOCK, new Item.Settings().group(RiteOfPassage.ITEM_GROUP));
    public static final BlockItem SAPPHIRE_ORE = new BlockItem(ModBlocks.SAPPHIRE_ORE, new Item.Settings().group(RiteOfPassage.ITEM_GROUP));

    // registerItems - Adds each custom item to the fabric registry
    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(RiteOfPassage.MOD_ID, "sapphire"), SAPPHIRE);
        Registry.register(Registry.ITEM, new Identifier(RiteOfPassage.MOD_ID, "sapphire_pickaxe"), SAPPHIRE_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(RiteOfPassage.MOD_ID, "sapphire_shovel"), SAPPHIRE_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(RiteOfPassage.MOD_ID, "sapphire_sword"), SAPPHIRE_SWORD);
        Registry.register(Registry.ITEM, new Identifier(RiteOfPassage.MOD_ID, "sapphire_axe"), SAPPHIRE_AXE);
        Registry.register(Registry.ITEM, new Identifier(RiteOfPassage.MOD_ID, "sapphire_hoe"), SAPPHIRE_HOE);
        Registry.register(Registry.ITEM, new Identifier(RiteOfPassage.MOD_ID, "sapphire_block"), SAPPHIRE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(RiteOfPassage.MOD_ID, "sapphire_ore"), SAPPHIRE_ORE);
    }
}
