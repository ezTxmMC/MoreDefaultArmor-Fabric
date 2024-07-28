package dev.eztxm.moredefaultarmor.armor;

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
    STONE("stone", ModMaterial.STONE, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, () -> Ingredient.ofItems(Items.COBBLESTONE), new int[]{79, 84, 81, 68}),

    //nether
    NETHERRACK("netherrack", ModMaterial.NETHERRACK, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, () -> Ingredient.ofItems(Items.NETHERRACK), new int[]{19, 28, 32, 25});
    //end

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
        return this.name;
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
