package com.drdiabolical.riteofpassage.registry;

import com.drdiabolical.riteofpassage.RiteOfPassage;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block SAPPHIRE_BLOCK = new Block(FabricBlockSettings
        .of(Material.METAL)
        .breakByTool(FabricToolTags.PICKAXES, 2)
        .requiresTool()
        .strength(4.0f, 30.0f)
        .sounds(BlockSoundGroup.METAL));

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(RiteOfPassage.MOD_ID, "sapphire_block"), SAPPHIRE_BLOCK);
    }
}
