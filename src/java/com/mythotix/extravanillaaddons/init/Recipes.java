package com.mythotix.extravanillaaddons.init;

import com.mythotix.extravanillaaddons.handler.ConfigurationHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Recipes{

    public static void init(){


        GameRegistry.addRecipe(new ItemStack(Blocks.end_stone, 4), " # ", "#@#", " # ", '#', new ItemStack(Blocks.sandstone), '@', new ItemStack(Items.ender_pearl));

        if (ConfigurationHandler.commandBlock == true){

            GameRegistry.addRecipe(new ItemStack(Blocks.command_block), "@#@", "#$#", "@#@", '@', new ItemStack(Blocks.iron_block), '#', new ItemStack(Blocks.redstone_block), '$', new ItemStack(Blocks.diamond_block));
        }

        if (ConfigurationHandler.endFrame == true){

            GameRegistry.addRecipe(new ItemStack(Blocks.end_portal_frame), "#@#", "@$@", "#@#", '#', new ItemStack(Blocks.end_stone), '@', new ItemStack(Blocks.obsidian), '$', new ItemStack(Blocks.diamond_block));
        }

        if (ConfigurationHandler.netherStar == true){

            GameRegistry.addRecipe(new ItemStack(ModItems.netherStarFragment), " # ", "#@#", " # ", '#', new ItemStack(Blocks.quartz_block), '@', new ItemStack(ModItems.diamondStar));
            GameRegistry.addRecipe(new ItemStack(Items.nether_star), " # ", "#@#", " # ", '#', new ItemStack(ModItems.netherStarFragment), '@', new ItemStack(Items.ender_eye));
        }

        if (ConfigurationHandler.endFrame == true || ConfigurationHandler.netherStar == true){

                GameRegistry.addRecipe(new ItemStack(ModItems.diamondStar), " # ", "# #", " # ", '#', new ItemStack(Items.diamond));
        }

    }
}
