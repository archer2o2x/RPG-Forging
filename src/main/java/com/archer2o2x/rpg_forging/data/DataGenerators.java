package com.archer2o2x.rpg_forging.data;


import com.archer2o2x.rpg_forging.RPGForging;
import com.archer2o2x.rpg_forging.blocks.ModBlockStateProvider;
import com.archer2o2x.rpg_forging.crafting.ModRecipeProvider;
import com.archer2o2x.rpg_forging.enchantments.ModEnchantments;
import com.archer2o2x.rpg_forging.items.ModItemModelProvider;
import net.minecraft.enchantment.Enchantment;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;
import net.minecraft.data.DataGenerator;

import java.rmi.registry.Registry;

@Mod.EventBusSubscriber(modid = RPGForging.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {

        DataGenerator gen = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        gen.addProvider(new ModBlockStateProvider(gen, existingFileHelper));
        gen.addProvider(new ModItemModelProvider(gen, existingFileHelper));

        ModBlockTagsProvider blockTags = new ModBlockTagsProvider(gen, existingFileHelper);
        gen.addProvider(blockTags);
        gen.addProvider(new ModItemTagsProvider(gen, blockTags, existingFileHelper));

        gen.addProvider(new ModLootTableProvider(gen));

        gen.addProvider(new ModRecipeProvider(gen));

    }

}
