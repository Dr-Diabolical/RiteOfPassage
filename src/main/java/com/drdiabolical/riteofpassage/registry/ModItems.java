package com.drdiabolical.riteofpassage.registry;

import com.drdiabolical.riteofpassage.*;
import com.drdiabolical.riteofpassage.customtoolitems.CustomAxeItem;
import com.drdiabolical.riteofpassage.customtoolitems.CustomHoeItem;
import com.drdiabolical.riteofpassage.customtoolitems.CustomPickaxeItem;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    // Custom items
    public static final Item BISMUTH = new Item(new Item.Settings().group(RiteOfPassage.ITEM_GROUP));

    // Custom tool items
    public static final ToolItem BISMUTH_PICKAXE = new CustomPickaxeItem(ToolMaterialBismuth.INSTANCE, -1, -2.2f, new Item.Settings().group(RiteOfPassage.ITEM_GROUP));
    public static final ToolItem BISMUTH_SHOVEL = new ShovelItem(ToolMaterialBismuth.INSTANCE, -1, -2.2f, new Item.Settings().group(RiteOfPassage.ITEM_GROUP));
    public static final ToolItem BISMUTH_SWORD = new SwordItem(ToolMaterialBismuth.INSTANCE, 5, -1f, new Item.Settings().group(RiteOfPassage.ITEM_GROUP));
    public static final ToolItem BISMUTH_AXE = new CustomAxeItem(ToolMaterialBismuth.INSTANCE, 3, -2f, new Item.Settings().group(RiteOfPassage.ITEM_GROUP));
    public static final ToolItem BISMUTH_HOE = new CustomHoeItem(ToolMaterialBismuth.INSTANCE, -1, -0.3f, new Item.Settings().group(RiteOfPassage.ITEM_GROUP));

    // Custom block items
    public static final BlockItem BISMUTH_BLOCK = new BlockItem(ModBlocks.BISMUTH_BLOCK, new Item.Settings().group(RiteOfPassage.ITEM_GROUP));
    public static final BlockItem BISMUTH_ORE = new BlockItem(ModBlocks.BISMUTH_ORE, new Item.Settings().group(RiteOfPassage.ITEM_GROUP));

    // registerItems - Adds each custom item to the fabric registry
    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(RiteOfPassage.MOD_ID, "bismuth"), BISMUTH);
        Registry.register(Registry.ITEM, new Identifier(RiteOfPassage.MOD_ID, "bismuth_pickaxe"), BISMUTH_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(RiteOfPassage.MOD_ID, "bismuth_shovel"), BISMUTH_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(RiteOfPassage.MOD_ID, "bismuth_sword"), BISMUTH_SWORD);
        Registry.register(Registry.ITEM, new Identifier(RiteOfPassage.MOD_ID, "bismuth_axe"), BISMUTH_AXE);
        Registry.register(Registry.ITEM, new Identifier(RiteOfPassage.MOD_ID, "bismuth_hoe"), BISMUTH_HOE);
        Registry.register(Registry.ITEM, new Identifier(RiteOfPassage.MOD_ID, "bismuth_block"), BISMUTH_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(RiteOfPassage.MOD_ID, "bismuth_ore"), BISMUTH_ORE);
    }
}
