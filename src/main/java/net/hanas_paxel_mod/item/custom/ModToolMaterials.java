package net.hanas_paxel_mod.item.custom;

import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {
    PAXEL_STONE(250, 4.0F, 1.0F, BlockTags.INCORRECT_FOR_STONE_TOOL,  5, () -> Ingredient.ofItems(Items.COBBLESTONE)),
    PAXEL_IRON(500, 6.0F, 1.0F, BlockTags.INCORRECT_FOR_IRON_TOOL,  14, () -> Ingredient.ofItems(Items.IRON_INGOT)),
    PAXEL_DIAMOND(2000, 8.0F, 1.0F, BlockTags.INCORRECT_FOR_DIAMOND_TOOL,  10, () -> Ingredient.ofItems(Items.DIAMOND)),
    PAXEL_GOLD(64, 12.0F, 1.0F, BlockTags.INCORRECT_FOR_GOLD_TOOL,  22, () -> Ingredient.ofItems(Items.GOLD_INGOT)),
    PAXEL_NETHERITE(3000, 12.0F, 1.5F, BlockTags.INCORRECT_FOR_NETHERITE_TOOL,  22, () -> Ingredient.ofItems(Items.NETHERITE_INGOT));

    private final int durability;
    private final float miningSpeedMultiplier;
    private final float attackDamage;
    private final TagKey<Block> inverseTag;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ModToolMaterials(int durability, float miningSpeedMultiplier, float attackDamage, TagKey<Block> inverseTag, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.durability = durability;
        this.miningSpeedMultiplier = miningSpeedMultiplier;
        this.attackDamage = attackDamage;
        this.inverseTag = inverseTag;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability() {
        return durability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return miningSpeedMultiplier;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return inverseTag;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return repairIngredient.get();
    }
}
