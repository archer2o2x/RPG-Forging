package com.archer2o2x.rpg_forging.items;

import com.archer2o2x.rpg_forging.crucible.Crucible;
import com.archer2o2x.rpg_forging.setup.Registration;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {

    public static final RegistryObject<Item> BRONZE_DUST = Registration.ITEMS.register("bronze_dust", ()->
            new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> BRONZE_INGOT = Registration.ITEMS.register("bronze_ingot", () ->
            new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> BRONZE_NUGGET = Registration.ITEMS.register("bronze_nugget", () ->
            new Item(new Item.Properties().group(ItemGroup.MATERIALS)));



    public static final RegistryObject<Item> CHARGED_IRON_DUST = Registration.ITEMS.register("charged_iron_dust", ()->
            new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> CHARGED_IRON_INGOT = Registration.ITEMS.register("charged_iron_ingot", () ->
            new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> CHARGED_IRON_NUGGET = Registration.ITEMS.register("charged_iron_nugget", () ->
            new Item(new Item.Properties().group(ItemGroup.MATERIALS)));



    public static final RegistryObject<Item> COPPER_DUST = Registration.ITEMS.register("copper_dust", ()->
            new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> COPPER_INGOT = Registration.ITEMS.register("copper_ingot", () ->
            new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> COPPER_NUGGET = Registration.ITEMS.register("copper_nugget", () ->
            new Item(new Item.Properties().group(ItemGroup.MATERIALS)));



    public static final RegistryObject<Item> PURE_SILVER_DUST = Registration.ITEMS.register("pure_silver_dust", ()->
            new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> PURE_SILVER_INGOT = Registration.ITEMS.register("pure_silver_ingot", () ->
            new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> PURE_SILVER_NUGGET = Registration.ITEMS.register("pure_silver_nugget", () ->
            new Item(new Item.Properties().group(ItemGroup.MATERIALS)));



    public static final RegistryObject<Item> SILVER_DUST = Registration.ITEMS.register("silver_dust", ()->
            new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> SILVER_INGOT = Registration.ITEMS.register("silver_ingot", () ->
            new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> SILVER_NUGGET = Registration.ITEMS.register("silver_nugget", () ->
            new Item(new Item.Properties().group(ItemGroup.MATERIALS)));



    public static final RegistryObject<Item> TIN_DUST = Registration.ITEMS.register("tin_dust", ()->
            new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> TIN_INGOT = Registration.ITEMS.register("tin_ingot", () ->
            new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> TIN_NUGGET = Registration.ITEMS.register("tin_nugget", () ->
            new Item(new Item.Properties().group(ItemGroup.MATERIALS)));




    public static final RegistryObject<Item> SILVER_AXE = Registration.ITEMS.register("silver_axe", () ->
            new AxeItem(ItemTier.IRON, 3, -0.9f, new Item.Properties().group(ItemGroup.TOOLS)));

    public static final RegistryObject<Item> SILVER_HOE = Registration.ITEMS.register("silver_hoe", () ->
            new HoeItem(ItemTier.IRON, 2, -2f, new Item.Properties().group(ItemGroup.TOOLS)));

    public static final RegistryObject<Item> SILVER_PICKAXE = Registration.ITEMS.register("silver_pickaxe", () ->
            new PickaxeItem(ItemTier.IRON, 3, -1.2f, new Item.Properties().group(ItemGroup.TOOLS)));

    public static final RegistryObject<Item> SILVER_SHOVEL = Registration.ITEMS.register("silver_shovel", () ->
            new ShovelItem(ItemTier.IRON, 3, -1.6f, new Item.Properties().group(ItemGroup.TOOLS)));

    public static final RegistryObject<Item> SILVER_SWORD = Registration.ITEMS.register("silver_sword", () ->
            new SwordItem(ItemTier.IRON, 3, -2.2f, new Item.Properties().group(ItemGroup.COMBAT)));



    public static final RegistryObject<Item> SILVER_HELMET = Registration.ITEMS.register("silver_helmet", () ->
            new ArmorItem(ArmorMaterial.IRON, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT)));

    public static final RegistryObject<Item> SILVER_CHESTPLATE = Registration.ITEMS.register("silver_chestplate", () ->
            new ArmorItem(ArmorMaterial.IRON, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT)));

    public static final RegistryObject<Item> SILVER_LEGGINGS = Registration.ITEMS.register("silver_leggings", () ->
            new ArmorItem(ArmorMaterial.IRON, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT)));

    public static final RegistryObject<Item> SILVER_BOOTS = Registration.ITEMS.register("silver_boots", () ->
            new ArmorItem(ArmorMaterial.IRON, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.COMBAT)));



    public static final RegistryObject<Item> FLUTE = Registration.ITEMS.register("flute", () ->
            new Item(new Item.Properties().group(ItemGroup.COMBAT)));

    public static final RegistryObject<Item> LYRE = Registration.ITEMS.register("lyre", () ->
            new Item(new Item.Properties().group(ItemGroup.COMBAT)));



    public static final RegistryObject<Crucible> CRUCIBLE = Registration.ITEMS.register("crucible", () -> // doesn't work, and probs wont. this do-do stain will stay until i can be bothered to remove it.
            new Crucible(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static void register() {}

}
