package com.mythotix.extravanillaaddons.init;

import com.mythotix.extravanillaaddons.handler.ConfigurationHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Recipes{

    public static void init(){

        // Recipes
        GameRegistry.addRecipe(new ItemStack(Blocks.stonebrick, 1, 3), "##", "##", '#', new ItemStack(Blocks.stonebrick));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.clayStairs), "#  ", "## ", "###", '#', new ItemStack(Blocks.hardened_clay));
        GameRegistry.addRecipe(new ItemStack(Blocks.web), "###", "###", "###", '#', new ItemStack(Items.string));
        GameRegistry.addRecipe(new ItemStack(Blocks.end_stone, 4), " # ", "#@#", " # ", '#', new ItemStack(Blocks.sandstone), '@', new ItemStack(Items.ender_pearl));
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.mossy_cobblestone), new ItemStack(Blocks.cobblestone), new ItemStack(Blocks.vine));
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.stonebrick, 1, 3), new ItemStack(Blocks.stonebrick), new ItemStack(Blocks.vine));


        // Config Conditional Recipes
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
