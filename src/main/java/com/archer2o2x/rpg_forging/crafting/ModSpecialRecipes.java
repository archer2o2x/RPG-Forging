package com.archer2o2x.rpg_forging.crafting;

import com.archer2o2x.rpg_forging.RPGForging;
import com.archer2o2x.rpg_forging.crucible.FillCrucibleRecipe;
import com.archer2o2x.rpg_forging.setup.Registration;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.SpecialRecipeSerializer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.function.Supplier;

public class ModSpecialRecipes {

    private static final Logger LOGGER = LogManager.getLogger();

    public static final RegistryObject<IRecipeSerializer<?>> FILL_CRUCIBLE = register("fill_crucible", FillCrucibleRecipe.Serializer::new);

    public static RegistryObject<IRecipeSerializer<?>> register(String name, Supplier<IRecipeSerializer<?>> serializerSupplier) {

        return Registration.RECIPE_SERIALIZERS.register(RPGForging.MODID + name, serializerSupplier);

    }

    public static void register() {}

}
