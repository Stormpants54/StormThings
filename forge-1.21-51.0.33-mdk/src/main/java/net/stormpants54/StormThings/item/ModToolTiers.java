package net.stormpants54.StormThings.item;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.stormpants54.StormThings.util.ModTags;

public class ModToolTiers {
    public static final Tier AMETHYST = new ForgeTier(1400, 4, 3f, 20,
            ModTags.Blocks.NEEDS_AMETHYST_TOOL, () -> Ingredient.of(Items.AMETHYST_SHARD),
            ModTags.Blocks.INCORRECT_FOR_AMETHYST_TOOL);
}
