package com.archer2o2x.rpg_forging.data;

import com.archer2o2x.rpg_forging.RPGForging;
import com.archer2o2x.rpg_forging.items.ModItems;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemTagsProvider extends ItemTagsProvider {
    public ModItemTagsProvider(DataGenerator dataGenerator, BlockTagsProvider blockTagProvider, ExistingFileHelper existingFileHelper) {
        super(dataGenerator, blockTagProvider, RPGForging.MODID, existingFileHelper);
    }


    @Override
    protected void registerTags() {
        copy(ModTags.Blocks.ORES_SILVER, ModTags.Items.ORES_SILVER);
        copy(Tags.Blocks.ORES, Tags.Items.ORES);
        copy(ModTags.Blocks.STORAGE_BLOCKS_SILVER, ModTags.Items.STORAGE_BLOCKS_SILVER);
        copy(Tags.Blocks.STORAGE_BLOCKS, Tags.Items.STORAGE_BLOCKS);

        getOrCreateBuilder(ModTags.Items.INGOTS_SILVER).add(ModItems.SILVER_INGOT.get());
        getOrCreateBuilder(Tags.Items.INGOTS).addTag(ModTags.Items.INGOTS_SILVER);

        getOrCreateBuilder(ItemTags.BEACON_PAYMENT_ITEMS).add(ModItems.SILVER_INGOT.get());

        getOrCreateBuilder(ModTags.Items.NUGGETS_SILVER).add(ModItems.SILVER_NUGGET.get());
        getOrCreateBuilder(Tags.Items.NUGGETS).addTag(ModTags.Items.NUGGETS_SILVER);

        getOrCreateBuilder(ModTags.Items.DUSTS_SILVER).add(ModItems.SILVER_DUST.get());
        getOrCreateBuilder(Tags.Items.DUSTS).addTag(ModTags.Items.DUSTS_SILVER);
    }
}
