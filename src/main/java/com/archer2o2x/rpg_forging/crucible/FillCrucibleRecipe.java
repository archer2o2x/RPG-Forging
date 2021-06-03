package com.archer2o2x.rpg_forging.crucible;

import com.archer2o2x.rpg_forging.crafting.ModSpecialRecipes;
import com.archer2o2x.rpg_forging.items.ModItems;
import com.google.gson.JsonObject;
import net.minecraft.inventory.CraftingInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.crafting.SpecialRecipe;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.registries.ForgeRegistryEntry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FillCrucibleRecipe extends SpecialRecipe {

    private static final Logger LOGGER = LogManager.getLogger();

    public Ingredient INGREDIENT_SILVER_INGOT = Ingredient.fromItems(ModItems.SILVER_INGOT.get());
    //public Ingredient INGREDIENT_CRUCIBLE = Ingredient.fromItems(ModItems.CRUCIBLE.get());

    public FillCrucibleRecipe(ResourceLocation idIn) {
        super(idIn);
    }

    @Override
    public ResourceLocation getId() {
        return ModSpecialRecipes.FILL_CRUCIBLE.getId();
    }

    @Override
    public ItemStack getRecipeOutput() {
        return ModItems.CRUCIBLE.get().getDefaultInstance();
    }

    @Override
    public boolean matches(CraftingInventory inv, World worldIn) {

        boolean isCrucibleThere = false;
        int silverNuggetCount = 0;

        for (int i = 0; i < inv.getSizeInventory(); i++) {

            ItemStack item = inv.getStackInSlot(i);

            if (item.getItem() instanceof Crucible) {

                isCrucibleThere = true;
            }

            if (INGREDIENT_SILVER_INGOT.test(item)) {
                silverNuggetCount += item.getCount();
            }

        }

        return isCrucibleThere && silverNuggetCount > 0;
    }

    @Override
    public ItemStack getCraftingResult(CraftingInventory inv) {

        Crucible crucible = new Crucible(new Item.Properties());
        CompoundNBT nbtData = crucible.getDefaultInstance().getOrCreateChildTag("contents");
        int silver_amount = 0;

        for (int i = 0; i < inv.getSizeInventory(); i++) {

            ItemStack item = inv.getStackInSlot(i);

            if (!item.isEmpty()) {

                if (INGREDIENT_SILVER_INGOT.test(item)) {

                    silver_amount++;

                }

            }

        }

        nbtData.putInt("amount", silver_amount);

        crucible.updateItemStackNBT(nbtData);

        LOGGER.info("Added " + String.valueOf(silver_amount) + " to crucible.");

        return crucible.getDefaultInstance();

    }

    @Override
    public boolean canFit(int width, int height) {
        return width * height >= 2;
    }

    @Override
    public IRecipeSerializer<?> getSerializer() {
        return ModSpecialRecipes.FILL_CRUCIBLE.get();
    }

    public static final class Serializer extends ForgeRegistryEntry<IRecipeSerializer<?>> implements IRecipeSerializer<FillCrucibleRecipe> {
        @Override
        public FillCrucibleRecipe read(ResourceLocation recipeId, JsonObject json) {
            return new FillCrucibleRecipe(recipeId);
        }

        @Override
        public FillCrucibleRecipe read(ResourceLocation recipeId, PacketBuffer buffer) {
            return new FillCrucibleRecipe(recipeId);
        }

        @Override
        public void write(PacketBuffer buffer, FillCrucibleRecipe recipe) {}
    }
}
