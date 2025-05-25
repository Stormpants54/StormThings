package net.stormpants54.StormThings.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SmithingTransformRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.stormpants54.StormThings.StormThings;
import net.stormpants54.StormThings.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(pOutput, pRegistries);
    }

    @Override
    protected void buildRecipes(RecipeOutput pRecipeOutput) {
        SmithingTransformRecipeBuilder
                .smithing(
                        Ingredient.of(ModItems.AMETHYST_UPGRADE_TEMPLATE.get()),
                        Ingredient.of(Items.GOLDEN_SWORD),
                        Ingredient.of(Items.AMETHYST_SHARD),
                        RecipeCategory.MISC,
                        ModItems.AMETHYST_BLADE.get()
                )
                .unlocks("has_amethyst", has(Items.AMETHYST_SHARD)) // optional unlock condition
                .save(pRecipeOutput, StormThings.MOD_ID + ":amethyst_blade_smithing");
    }
}
