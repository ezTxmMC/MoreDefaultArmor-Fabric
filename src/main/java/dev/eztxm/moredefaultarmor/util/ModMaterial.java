package dev.eztxm.moredefaultarmor.util;

import lombok.Getter;

@Getter
public enum ModMaterial {
    DIRT(1, 1, 1, 1, 0, 0, 0),
    OAK(1, 2, 2, 1, 0, 0, 0),
    STONE(2, 3, 4, 1, 0, 0, 0);

    private final int[] protectionAmounts;
    private final int enchantmentValue;
    private final float toughness;
    private final float knockbackResistance;

    ModMaterial(int headReduction, int chestReduction, int leggingsReduction, int bootsReduction, int enchantmentValue, float toughness, float knockbackResistance) {
        this.protectionAmounts = new int[]{bootsReduction, leggingsReduction, chestReduction, headReduction};
        this.enchantmentValue = enchantmentValue;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
    }
}
