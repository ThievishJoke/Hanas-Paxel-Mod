package net.hanas_paxel_mod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.hanas_paxel_mod.item.ModItems;

import net.hanas_paxel_mod.util.ModTags;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(ModTags.Items.PAXELS)
                .add(ModItems.STONE_PAXEL)
                .add(ModItems.IRON_PAXEL)
                .add(ModItems.DIAMOND_PAXEL)
                .add(ModItems.GOLDEN_PAXEL)
                .add(ModItems.NETHERITE_PAXEL)
        ;

        getOrCreateTagBuilder(ItemTags.CLUSTER_MAX_HARVESTABLES)
                .add(ModItems.STONE_PAXEL)
                .add(ModItems.IRON_PAXEL)
                .add(ModItems.DIAMOND_PAXEL)
                .add(ModItems.GOLDEN_PAXEL)
                .add(ModItems.NETHERITE_PAXEL)
        ;

        getOrCreateTagBuilder(ItemTags.BREAKS_DECORATED_POTS)
                .add(ModItems.STONE_PAXEL)
                .add(ModItems.IRON_PAXEL)
                .add(ModItems.DIAMOND_PAXEL)
                .add(ModItems.GOLDEN_PAXEL)
                .add(ModItems.NETHERITE_PAXEL)
        ;

        getOrCreateTagBuilder(ItemTags.MINING_ENCHANTABLE)
                .add(ModItems.STONE_PAXEL)
                .add(ModItems.IRON_PAXEL)
                .add(ModItems.DIAMOND_PAXEL)
                .add(ModItems.GOLDEN_PAXEL)
                .add(ModItems.NETHERITE_PAXEL)
        ;

        getOrCreateTagBuilder(ItemTags.MINING_LOOT_ENCHANTABLE)
                .add(ModItems.STONE_PAXEL)
                .add(ModItems.IRON_PAXEL)
                .add(ModItems.DIAMOND_PAXEL)
                .add(ModItems.GOLDEN_PAXEL)
                .add(ModItems.NETHERITE_PAXEL)
        ;

        getOrCreateTagBuilder(ItemTags.DURABILITY_ENCHANTABLE)
                .add(ModItems.STONE_PAXEL)
                .add(ModItems.IRON_PAXEL)
                .add(ModItems.DIAMOND_PAXEL)
                .add(ModItems.GOLDEN_PAXEL)
                .add(ModItems.NETHERITE_PAXEL)
        ;
    }
}
