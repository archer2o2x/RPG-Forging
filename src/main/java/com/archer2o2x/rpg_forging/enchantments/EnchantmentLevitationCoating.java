package com.archer2o2x.rpg_forging.enchantments;

import com.archer2o2x.rpg_forging.RPGForging;
import net.minecraft.advancements.criterion.EntityEquipmentPredicate;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class EnchantmentLevitationCoating extends Enchantment {

    protected EnchantmentLevitationCoating() {
        super(Rarity.RARE, ModEnchantments.WEAPONS, new EquipmentSlotType[] {EquipmentSlotType.MAINHAND, EquipmentSlotType.OFFHAND});
        //this.setRegistryName(RPGForging.MODID, "enchantment_levitation_coating");
    }

    @Override
    public int getMaxLevel() {
        return 10;
    }

    @Override
    public int getMinEnchantability(int enchantmentLevel) {
        return 10;
    }

    @Override
    public int getMaxEnchantability(int enchantmentLevel) {
        return 20;
    }

    @Override
    public void onEntityDamaged(LivingEntity user, Entity target, int level) {
        ((LivingEntity) target).addPotionEffect(new EffectInstance(Effects.LEVITATION, 10 * level, level, false, true));
        //super.onEntityDamaged(user, target, level);
    }

    @Override
    public boolean isAllowedOnBooks() {
        return true;
    }
}
