package com.archer2o2x.rpg_forging.crucible;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class Crucible extends Item {

    public Crucible(Properties properties) {

        super(properties);

    }



    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        super.addInformation(stack, worldIn, tooltip, flagIn);

        CompoundNBT nbtData = stack.getOrCreateChildTag("contents");

        int silverAmount = nbtData.getInt("amount");

        if (silverAmount > 0) {
            tooltip.add(new StringTextComponent("Silver Ingots - " + String.valueOf(silverAmount)));
        }

    }


}
