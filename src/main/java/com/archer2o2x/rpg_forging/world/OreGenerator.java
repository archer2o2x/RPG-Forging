package com.archer2o2x.rpg_forging.world;

import com.archer2o2x.rpg_forging.blocks.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeGenerationSettings;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class OreGenerator {

    public static void generateOres(final BiomeLoadingEvent event) {

        BiomeGenerationSettingsBuilder settings = event.getGeneration();

        // Copper and tin generate same frequency as iron but with a higher max height
        generateOre(settings, OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
                ModBlocks.COPPER_ORE.get().getDefaultState(), 12, 5, 128, 12);

        generateOre(settings, OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
                ModBlocks.TIN_ORE.get().getDefaultState(), 8, 5, 128, 10);



        // Generate more silver ore when in taiga biomes
        if (event.getCategory().equals(Biome.Category.TAIGA)) {

            generateOre(settings, OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
                    ModBlocks.SILVER_ORE.get().getDefaultState(), 8, 5, 80, 20);

        } else {

            generateOre(settings, OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
                    ModBlocks.SILVER_ORE.get().getDefaultState(), 8, 5, 32, 4);

        }
    }

    private static void generateOre(BiomeGenerationSettingsBuilder settings, RuleTest fillerType, BlockState state, int veinSize, int minHeight, int maxHeight, int amount) {
        settings.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                new OreFeatureConfig(fillerType, state, veinSize))
                        .withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(minHeight, 0, maxHeight)))
                .square().func_242731_b(amount));
    }

}
