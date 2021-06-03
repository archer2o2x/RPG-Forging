package com.archer2o2x.rpg_forging.blocks;

import com.archer2o2x.rpg_forging.setup.Registration;
import net.minecraft.block.Block;
import net.minecraft.data.loot.BlockLootTables;
import net.minecraftforge.fml.RegistryObject;

import java.util.stream.Collectors;

public class ModBlockLootTables extends BlockLootTables {
    @Override
    protected void addTables() {
        //registerDropSelfLootTable(ModBlocks.COPPER_BLOCK.get()); see ModBlockStateProvider for more
        registerDropSelfLootTable(ModBlocks.COPPER_ORE.get());

        registerDropSelfLootTable(ModBlocks.SILVER_ORE.get());
        registerDropSelfLootTable(ModBlocks.SILVER_BLOCK.get());

        //registerDropSelfLootTable(ModBlocks.TIN_BLOCK.get()); ditto.
        registerDropSelfLootTable(ModBlocks.TIN_ORE.get());

        registerDropSelfLootTable(ModBlocks.BRONZE_BLOCK.get());
        registerDropSelfLootTable(ModBlocks.CHARGED_IRON_BLOCK.get());
        registerDropSelfLootTable(ModBlocks.PURE_SILVER_BLOCK.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return Registration.BLOCKS.getEntries().stream()
                .map(RegistryObject::get)
                .collect(Collectors.toList());
    }
}
