package dev.eztxm.moredefaultarmor.armor;

import dev.eztxm.moredefaultarmor.MoreDefaultArmor;
import dev.eztxm.moredefaultarmor.util.LazyValue;
import dev.eztxm.moredefaultarmor.util.ModMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public enum ModArmorTiers implements ArmorMaterial {
    //overworld
    DIRT("dirt", ModMaterial.DIRT, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, () -> Ingredient.ofItems(Items.DIRT), new int[]{19, 28, 32, 25}),
    OAK("oak", ModMaterial.OAK, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, () -> Ingredient.ofItems(Items.OAK_LOG), new int[]{45, 52, 55, 48}),
    COBBLESTONE("cobblestone", ModMaterial.STONE, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, () -> Ingredient.ofItems(Items.COBBLESTONE), new int[]{79, 84, 81, 68}),
    ANDESITE("andesite", ModMaterial.STONE, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, () -> Ingredient.ofItems(Items.ANDESITE), new int[]{79, 84, 81, 68}),
    DIORITE("diorite", ModMaterial.STONE, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, () -> Ingredient.ofItems(Items.DIORITE), new int[]{79, 84, 81, 68}),
    GRANITE("granite", ModMaterial.STONE, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, () -> Ingredient.ofItems(Items.GRANITE), new int[]{79, 84, 81, 68}),
    DEEPSLATE_COBBLE("deepslate_cobble", ModMaterial.STONE, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, () -> Ingredient.ofItems(Items.COBBLED_DEEPSLATE), new int[]{79, 84, 81, 68}),

    // Nether
    NETHERRACK("netherrack", ModMaterial.NETHERRACK, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, () -> Ingredient.ofItems(Items.NETHERRACK), new int[]{19, 28, 32, 25}),
    SMOOTH_BASALT("smooth_basalt", ModMaterial.SMOOTH_BASALT, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, () -> Ingredient.ofItems(Items.SMOOTH_BASALT), new int[]{82, 87, 84, 71}),
    NYLIUM("nylium", ModMaterial.NYLIUM, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, () -> Ingredient.ofItems(Items.CRIMSON_NYLIUM), new int[]{22, 31, 35, 27}),
    NETHER_WART("nether_wart", ModMaterial.NETHER_WART, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, () -> Ingredient.ofItems(Items.NETHER_WART_BLOCK), new int[]{34, 45, 39, 31}),
    NETHER_BRICK("nether_brick", ModMaterial.NETHER_BRICK, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, () -> Ingredient.ofItems(Items.NETHER_BRICKS), new int[]{72, 77, 74, 61}),
    WARPED("warped", ModMaterial.WARPED, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, () -> Ingredient.ofItems(Items.WARPED_NYLIUM), new int[]{22, 31, 35, 27}),

    // End
    END_STONE("end_stone", ModMaterial.END_STONE, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, () -> Ingredient.ofItems(Items.END_STONE), new int[]{79, 84, 81, 68});

    private final String name;
    private final int[] baseDurability;
    private final ModMaterial material;
    private final SoundEvent equipSound;
    private final LazyValue<Ingredient> repairMaterial;

    ModArmorTiers(String name, ModMaterial material, SoundEvent equipSound, Supplier<Ingredient> repairMaterial, int[] baseDurability) {
        this.name = name;
        this.material = material;
        this.baseDurability = baseDurability;
        this.equipSound = equipSound;
        this.repairMaterial = new LazyValue<>(repairMaterial);
    }

    @Override
    public int getDurability(ArmorItem.Type type) {
        return baseDurability[type.getEquipmentSlot().getEntitySlotId()];
    }

    @Override
    public int getProtection(ArmorItem.Type type) {
        return this.material.getProtectionAmounts()[type.getEquipmentSlot().getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return 0;
    }

    @Override
    public @NotNull SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public @NotNull Ingredient getRepairIngredient() {
        return this.repairMaterial.get();
    }

    @Override
    public @NotNull String getName() {
        return MoreDefaultArmor.MOD_ID +  ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.material.getToughness();
    }

    @Override
    public float getKnockbackResistance() {
        return this.material.getKnockbackResistance();
    }
}
