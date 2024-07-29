package dev.eztxm.moredefaultarmor.util;

public enum ModMaterial {

    // Overworld
    DIRT(1, 1, 1, 1, 0, 0, 0),
    OAK(1, 2, 2, 1, 0, 0, 0),
    STONE(2, 3, 4, 1, 0, 0, 0),

    // Nether
    NETHERRACK(1, 1, 1, 1, 0, 0, 0),
    SMOOTH_BASALT(2, 4, 4, 2, 0, 0, 0),
    NYLIUM(1, 2, 2, 1, 0, 0, 0),

    // End
    END_STONE(2, 3, 4, 1, 0, 0, 0);

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

    public int getEnchantmentValue() {
        return enchantmentValue;
    }

    public int[] getProtectionAmounts() {
        return protectionAmounts;
    }

    public float getToughness() {
        return toughness;
    }

    public float getKnockbackResistance() {
        return knockbackResistance;
    }
}
