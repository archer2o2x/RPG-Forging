package com.archer2o2x.rpg_forging.blocks;

import com.archer2o2x.rpg_forging.setup.Registration;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    public static final RegistryObject<Block> COPPER_ORE = register("copper_ore", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(3, 2)
                    .harvestLevel(1)
                    .harvestTool(ToolType.PICKAXE)
                    .sound(SoundType.STONE)));

    /*public static final RegistryObject<Block> COPPER_BLOCK = register("copper_block", () -> // Texture not yet added.
            new Block(AbstractBlock.Properties.create(Material.IRON)
                    .hardnessAndResistance(5, 4)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .sound(SoundType.METAL)));*/



    public static final RegistryObject<Block> SILVER_ORE = register("silver_ore", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(3, 3)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> SILVER_BLOCK = register("silver_block", () ->
            new Block(AbstractBlock.Properties.create(Material.IRON)
                    .hardnessAndResistance(5, 6)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .sound(SoundType.METAL)));



    public static final RegistryObject<Block> TIN_ORE = register("tin_ore", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(3, 2)
                    .harvestLevel(1)
                    .harvestTool(ToolType.PICKAXE)
                    .sound(SoundType.STONE)));

    /*public static final RegistryObject<Block> TIN_BLOCK = register("tin_block", () -> // Texture not yet added.
            new Block(AbstractBlock.Properties.create(Material.IRON)
                    .hardnessAndResistance(5, 4)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .sound(SoundType.METAL)));*/



    public static final RegistryObject<Block> BRONZE_BLOCK = register("bronze_block", () ->
            new Block(AbstractBlock.Properties.create(Material.IRON)
                    .hardnessAndResistance(5, 3)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<Block> CHARGED_IRON_BLOCK = register("charged_iron_block", () ->
            new Block(AbstractBlock.Properties.create(Material.IRON)
                    .hardnessAndResistance(5, 6)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<Block> PURE_SILVER_BLOCK = register("pure_silver_block", () ->
            new Block(AbstractBlock.Properties.create(Material.IRON)
                    .hardnessAndResistance(10, 3)
                    .harvestLevel(1)
                    .harvestTool(ToolType.PICKAXE)
                    .sound(SoundType.METAL)));



    public static void register() {}

    private static <T extends Block> RegistryObject<T> registerNoItem(String name, Supplier<T> block) {
        return Registration.BLOCKS.register(name, block);
    }

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
        RegistryObject<T> ret = registerNoItem(name, block);
        Registration.ITEMS.register(name, () -> new BlockItem(ret.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
        return ret;
    }
}
