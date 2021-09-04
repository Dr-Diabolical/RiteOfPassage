package com.drdiabolical.riteofpassage.registry;

import com.drdiabolical.riteofpassage.RiteOfPassage;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.heightprovider.UniformHeightProvider;

public class ModGeneration {
    // Custom world generation features
    public static ConfiguredFeature<?, ?> BISMUTH_ORE_OVERWORLD = Feature.ORE
        .configure(new OreFeatureConfig(
            OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
            ModBlocks.BISMUTH_ORE.getDefaultState(),
            8))
        .range(new RangeDecoratorConfig(
            UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(20))))
            .spreadHorizontally()
            .repeat(1);

    // registerGeneration - Adds custom generation settings to the fabric registry
    public static void registerGeneration() {
        RegistryKey<ConfiguredFeature <?, ?>> bismuthOreOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
            new Identifier(RiteOfPassage.MOD_ID, "bismuth_ore"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, bismuthOreOverworld.getValue(), BISMUTH_ORE_OVERWORLD);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, bismuthOreOverworld);
    }
}
