package com.archer2o2x.rpg_forging.items;

import com.archer2o2x.rpg_forging.RPGForging;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(DataGenerator gen, ExistingFileHelper existingFileHelper) {
        super(gen, RPGForging.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        //withExistingParent("copper_block", modLoc("block/copper_block"));
        withExistingParent("copper_ore", modLoc("block/copper_ore"));

        withExistingParent("silver_block", modLoc("block/silver_block"));
        withExistingParent("silver_ore", modLoc("block/silver_ore"));

        //withExistingParent("tin_block", modLoc("block/tin_block"));
        withExistingParent("tin_ore", modLoc("block/tin_ore"));

        withExistingParent("bronze_block", modLoc("block/bronze_block"));
        withExistingParent("charged_iron_block", modLoc("block/charged_iron_block"));
        withExistingParent("pure_silver_block", modLoc("block/pure_silver_block"));



        ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));
        ModelFile itemHandheld = getExistingFile(mcLoc("item/handheld"));



        builder(itemGenerated, "bronze_dust");
        builder(itemGenerated, "bronze_ingot");
        builder(itemGenerated, "bronze_nugget");

        builder(itemGenerated, "charged_iron_dust");
        builder(itemGenerated, "charged_iron_ingot");
        builder(itemGenerated, "charged_iron_nugget");

        builder(itemGenerated, "copper_dust");
        builder(itemGenerated, "copper_ingot");
        builder(itemGenerated, "copper_nugget");

        builder(itemGenerated, "pure_silver_dust");
        builder(itemGenerated, "pure_silver_ingot");
        builder(itemGenerated, "pure_silver_nugget");

        builder(itemGenerated, "silver_dust");
        builder(itemGenerated, "silver_ingot");
        builder(itemGenerated, "silver_nugget");

        builder(itemGenerated, "tin_dust");
        builder(itemGenerated, "tin_ingot");
        builder(itemGenerated, "tin_nugget");

        builder(itemHandheld, "silver_axe");
        builder(itemHandheld, "silver_hoe");
        builder(itemHandheld, "silver_pickaxe");
        builder(itemHandheld, "silver_shovel");
        builder(itemHandheld, "silver_sword");

        builder(itemGenerated, "silver_boots");
        builder(itemGenerated, "silver_chestplate");
        builder(itemGenerated, "silver_helmet");
        builder(itemGenerated, "silver_leggings");

        builder(itemGenerated, "flute");
        builder(itemGenerated, "lyre");

    }

    private ItemModelBuilder builder(ModelFile itemGenerated, String name) {
        return getBuilder(name).parent(itemGenerated).texture("layer0", "item/" + name);
    }
}
