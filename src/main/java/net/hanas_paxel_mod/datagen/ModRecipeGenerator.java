package net.hanas_paxel_mod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.hanas_paxel_mod.item.ModItems;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STONE_PAXEL)
                .pattern("SAP")
                .pattern(" K ")
                .pattern(" K ")
                .input('S', Items.STONE_SHOVEL)
                .input('A', Items.STONE_AXE)
                .input('P', Items.STONE_PICKAXE)
                .input('K', Items.STICK)
                .criterion(hasItem(Items.STONE_SHOVEL), conditionsFromItem(Items.STONE_SHOVEL))
                .criterion(hasItem(Items.STONE_AXE), conditionsFromItem(Items.STONE_AXE))
                .criterion(hasItem(Items.STONE_PICKAXE), conditionsFromItem(Items.STONE_PICKAXE))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.IRON_PAXEL)
                .pattern("SAP")
                .pattern(" K ")
                .pattern(" K ")
                .input('S', Items.IRON_SHOVEL)
                .input('A', Items.IRON_AXE)
                .input('P', Items.IRON_PICKAXE)
                .input('K', Items.STICK)
                .criterion(hasItem(Items.IRON_SHOVEL), conditionsFromItem(Items.IRON_SHOVEL))
                .criterion(hasItem(Items.IRON_AXE), conditionsFromItem(Items.IRON_AXE))
                .criterion(hasItem(Items.IRON_PICKAXE), conditionsFromItem(Items.IRON_PICKAXE))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.GOLDEN_PAXEL)
                .pattern("SAP")
                .pattern(" K ")
                .pattern(" K ")
                .input('S', Items.GOLDEN_SHOVEL)
                .input('A', Items.GOLDEN_AXE)
                .input('P', Items.GOLDEN_PICKAXE)
                .input('K', Items.STICK)
                .criterion(hasItem(Items.GOLDEN_SHOVEL), conditionsFromItem(Items.GOLDEN_SHOVEL))
                .criterion(hasItem(Items.GOLDEN_AXE), conditionsFromItem(Items.GOLDEN_AXE))
                .criterion(hasItem(Items.GOLDEN_PICKAXE), conditionsFromItem(Items.GOLDEN_PICKAXE))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.DIAMOND_PAXEL)
                .pattern("SAP")
                .pattern(" K ")
                .pattern(" K ")
                .input('S', Items.DIAMOND_SHOVEL)
                .input('A', Items.DIAMOND_AXE)
                .input('P', Items.DIAMOND_PICKAXE)
                .input('K', Items.STICK)
                .criterion(hasItem(Items.DIAMOND_SHOVEL), conditionsFromItem(Items.DIAMOND_SHOVEL))
                .criterion(hasItem(Items.DIAMOND_AXE), conditionsFromItem(Items.DIAMOND_AXE))
                .criterion(hasItem(Items.DIAMOND_PICKAXE), conditionsFromItem(Items.DIAMOND_PICKAXE))
                .offerTo(exporter);

        offerNetheriteUpgradeRecipe(exporter, ModItems.DIAMOND_PAXEL, RecipeCategory.TOOLS, ModItems.NETHERITE_PAXEL);
    }
}