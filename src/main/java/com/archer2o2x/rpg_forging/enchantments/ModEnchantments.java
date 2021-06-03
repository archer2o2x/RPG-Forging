package com.archer2o2x.rpg_forging.enchantments;

import com.archer2o2x.rpg_forging.RPGForging;
import com.archer2o2x.rpg_forging.setup.Registration;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.item.BowItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;

public class ModEnchantments {

    public static final RegistryObject<Enchantment> COATING_LEVITATION = Registration.ENCHANTMENTS.register("coating_levitation", () ->
            new EnchantmentLevitationCoating());

    public static final RegistryObject<Enchantment> CONDUCT = Registration.ENCHANTMENTS.register("conduct", () ->
            new EnchantmentConduct());

    public static final EnchantmentType WEAPONS = EnchantmentType.create("weapons", (item) -> (item instanceof SwordItem || item instanceof BowItem));

    public static void register() {}
}
