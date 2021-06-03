package com.archer2o2x.rpg_forging.enchantments;

import net.minecraft.command.arguments.EntityAnchorArgument;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.potion.Potion;
import net.minecraft.stats.Stat;
import net.minecraft.util.math.vector.Vector3d;

public class EnchantmentConduct extends Enchantment {

    protected EnchantmentConduct() {
        super(Rarity.VERY_RARE, ModEnchantments.WEAPONS, new EquipmentSlotType[] {EquipmentSlotType.MAINHAND, EquipmentSlotType.OFFHAND});
    }

    @Override
    public int getMaxLevel() {
        return 10;
    }

    @Override
    public int getMinEnchantability(int enchantmentLevel) {
        return 50;
    }

    @Override
    public int getMaxEnchantability(int enchantmentLevel) {
        return 80;
    }

    @Override
    public void onEntityDamaged(LivingEntity user, Entity target, int level) {
        //super.onEntityDamaged(user, target, level);

        /*Vector3d targetPos = target.getPositionVec();
        Vector3d targetLook = target.getLookVec();

        Vector3d userPos = user.getPositionVec();


        target.setPosition(userPos.x, userPos.y, userPos.z);
        target.lookAt(EntityAnchorArgument.Type.EYES, userLook);

        user.setPosition(targetPos.x, targetPos.y, targetPos.z);
        user.lookAt(EntityAnchorArgument.Type.EYES, targetLook);*/

        if (!(user instanceof PlayerEntity)) { return; }

        Vector3d userLook = user.getLookVec().normalize().mul(level * 0.3,level * 0.3,level * 0.3);

        ((PlayerEntity) user).addPotionEffect(new EffectInstance(Effects.HASTE, 2, 3, false, true));
    }

    @Override
    public boolean isAllowedOnBooks() {
        return true;
    }
}
