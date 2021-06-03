package com.archer2o2x.rpg_forging.blocks;

import com.archer2o2x.rpg_forging.RPGForging;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, RPGForging.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        //simpleBlock(ModBlocks.COPPER_BLOCK.get()); copper_block.png not added yet.
        simpleBlock(ModBlocks.COPPER_ORE.get());

        simpleBlock(ModBlocks.SILVER_ORE.get());
        simpleBlock(ModBlocks.SILVER_BLOCK.get());

        //simpleBlock(ModBlocks.TIN_BLOCK.get()); tin_block.png not added yet
        simpleBlock(ModBlocks.TIN_ORE.get());

        simpleBlock(ModBlocks.BRONZE_BLOCK.get());
        simpleBlock(ModBlocks.CHARGED_IRON_BLOCK.get());
        simpleBlock(ModBlocks.PURE_SILVER_BLOCK.get());
    }
}
