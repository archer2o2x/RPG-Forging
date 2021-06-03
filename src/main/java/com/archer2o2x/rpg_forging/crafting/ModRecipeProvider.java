package com.archer2o2x.rpg_forging.crafting;

import com.archer2o2x.rpg_forging.RPGForging;
import com.archer2o2x.rpg_forging.blocks.ModBlocks;
import com.archer2o2x.rpg_forging.crucible.Crucible;
import com.archer2o2x.rpg_forging.items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.data.*;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider {

    public ModRecipeProvider(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {

        MetalSet(consumer, ModItems.BRONZE_NUGGET, ModItems.BRONZE_INGOT, ModBlocks.BRONZE_BLOCK, "bronze");
        MetalSet(consumer, ModItems.CHARGED_IRON_NUGGET, ModItems.CHARGED_IRON_INGOT, ModBlocks.CHARGED_IRON_BLOCK, "charged_iron");
        MetalSet(consumer, ModItems.SILVER_NUGGET, ModItems.SILVER_INGOT, ModBlocks.SILVER_BLOCK, "silver");
        MetalSet(consumer, ModItems.PURE_SILVER_NUGGET, ModItems.PURE_SILVER_INGOT, ModBlocks.PURE_SILVER_BLOCK, "pure_silver");

        // SMELTING / BLASTING RECIPES

        MetalSmelt(consumer, ModBlocks.SILVER_ORE, ModItems.SILVER_INGOT, 0.35f, "silver");
    }

    private ResourceLocation modId(String path) {

        return new ResourceLocation(RPGForging.MODID, path);

    }

    private void MetalSet(Consumer<IFinishedRecipe> consumer, RegistryObject<Item> nugget, RegistryObject<Item> ingot, RegistryObject<Block> block, String metalName) {

        // bitch basic function to add a conversion from ingot to block and ingot to nugget and vice versa

        ShapelessRecipeBuilder.shapelessRecipe(block.get().asItem())
                .addIngredient(ingot.get(), 9)
                .addCriterion("hasItem", hasItem(ingot.get()))
                .build(consumer, modId(metalName + "_ingot_to_block"));

        ShapelessRecipeBuilder.shapelessRecipe(ingot.get(), 9)
                .addIngredient(block.get().asItem())
                .addCriterion("hasItem", hasItem(block.get().asItem()))
                .build(consumer, modId(metalName + "_block_to_ingot"));

        ShapelessRecipeBuilder.shapelessRecipe(ingot.get())
                .addIngredient(nugget.get(), 9)
                .addCriterion("hasItem", hasItem(nugget.get()))
                .build(consumer, modId(metalName + "_nugget_to_ingot"));

        ShapelessRecipeBuilder.shapelessRecipe(nugget.get(), 9)
                .addIngredient(ingot.get(), 1)
                .addCriterion("hasItem", hasItem(ingot.get()))
                .build(consumer, modId(metalName + "_ingot_to_nugget"));

    }

    private void MetalSmelt(Consumer<IFinishedRecipe> consumer, RegistryObject<Block> block, RegistryObject<Item> ingot, float experience, String metalName) {

        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(block.get().asItem()), ingot.get(), experience, 200)
                .addCriterion("hasItem", hasItem(block.get().asItem()))
                .build(consumer, modId("smelting_" + metalName + "_ore_to_ingot"));

        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(block.get().asItem()), ingot.get(), experience, 100)
                .addCriterion("hasItem", hasItem(block.get().asItem()))
                .build(consumer, modId("blasting_" + metalName + "_ore_to_ingot"));

    }
}
