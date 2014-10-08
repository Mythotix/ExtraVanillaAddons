package com.mythotix.extravanillaaddons.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Recipes
{
    public static void init()
    {
        GameRegistry.addRecipe(new ItemStack(ModItems.diamondStar), " # ", "# #", " # ", '#', new ItemStack(Items.diamond));
        GameRegistry.addRecipe(new ItemStack(ModItems.netherStarFragment), " # ", "#@#", " # ", '#', new ItemStack(Blocks.quartz_block), '@', new ItemStack(ModItems.diamondStar));
        GameRegistry.addRecipe(new ItemStack(Items.nether_star), " # ", "#@#", " # ", '#', new ItemStack(ModItems.netherStarFragment), '@', new ItemStack(Items.ender_eye));
    }
}
