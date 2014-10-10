package com.mythotix.extravanillaaddons.init;

import com.mythotix.extravanillaaddons.handler.ConfigurationHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Recipes{

    public static void init(){

        // Recipes
        GameRegistry.addRecipe(new ItemStack(Blocks.stonebrick, 1, 3), "SS", "SS", 'S', new ItemStack(Blocks.stonebrick));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.clayStairs, 4), "C  ", "CC ", "CCC", 'C', new ItemStack(Blocks.hardened_clay));
        GameRegistry.addRecipe(new ItemStack(Blocks.web), "SSS", "SSS", "SSS", 'S', new ItemStack(Items.string));
        GameRegistry.addRecipe(new ItemStack(Blocks.end_stone, 4), " S ", "SES", " S ", 'S', new ItemStack(Blocks.sandstone), 'E', new ItemStack(Items.ender_pearl));
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.mossy_cobblestone), new ItemStack(Blocks.cobblestone), new ItemStack(Blocks.vine));
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.stonebrick, 1, 3), new ItemStack(Blocks.stonebrick), new ItemStack(Blocks.vine));
        GameRegistry.addRecipe(new ItemStack(Items.name_tag), "  S", "PB", "IP", 'S', new ItemStack(Items.string), 'P', new ItemStack(Items.paper), 'B', new ItemStack(Items.slime_ball), 'I', new ItemStack(Items.dye, 1, 0));
        GameRegistry.addRecipe(new ItemStack(Items.saddle), "LLL", "LSL", "I I", 'L', new ItemStack(Items.leather), 'S', new ItemStack(Items.string), 'I', new ItemStack(Items.iron_ingot));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.stoneStairs, 4), "S  ", "SS ", "SSS", 'S', new ItemStack(Blocks.stone));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.whiteClayStairs, 4), "C  ", "CC ", "CCC", 'C', new ItemStack(Blocks.stained_hardened_clay, 1, 0));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.orangeClayStairs, 4), "C  ", "CC ", "CCC", 'C', new ItemStack(Blocks.stained_hardened_clay, 1, 1));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.magentaClayStairs, 4), "C  ", "CC ", "CCC", 'C', new ItemStack(Blocks.stained_hardened_clay, 1, 2));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.lightBlueClayStairs, 4), "C  ", "CC ", "CCC", 'C', new ItemStack(Blocks.stained_hardened_clay, 1, 3));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.yellowClayStairs, 4), "C  ", "CC ", "CCC", 'C', new ItemStack(Blocks.stained_hardened_clay, 1, 4));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.limeClayStairs, 4), "C  ", "CC ", "CCC", 'C', new ItemStack(Blocks.stained_hardened_clay, 1, 5));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.pinkClayStairs, 4), "C  ", "CC ", "CCC", 'C', new ItemStack(Blocks.stained_hardened_clay, 1, 6));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.grayClayStairs, 4), "C  ", "CC ", "CCC", 'C', new ItemStack(Blocks.stained_hardened_clay, 1, 7));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.lightGrayClayStairs, 4), "C  ", "CC ", "CCC", 'C', new ItemStack(Blocks.stained_hardened_clay, 1, 8));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.cyanClayStairs, 4), "C  ", "CC ", "CCC", 'C', new ItemStack(Blocks.stained_hardened_clay, 1, 9));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.purpleClayStairs, 4), "C  ", "CC ", "CCC", 'C', new ItemStack(Blocks.stained_hardened_clay, 1, 10));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.blueClayStairs, 4), "C  ", "CC ", "CCC", 'C', new ItemStack(Blocks.stained_hardened_clay, 1, 11));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.brownClayStairs, 4), "C  ", "CC ", "CCC", 'C', new ItemStack(Blocks.stained_hardened_clay, 1, 12));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.greenClayStairs, 4), "C  ", "CC ", "CCC", 'C', new ItemStack(Blocks.stained_hardened_clay, 1, 13));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.redClayStairs, 4), "C  ", "CC ", "CCC", 'C', new ItemStack(Blocks.stained_hardened_clay, 1, 14));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.blackClayStairs, 4), "C  ", "CC ", "CCC", 'C', new ItemStack(Blocks.stained_hardened_clay, 1, 15));

        // Config Conditional Recipes
        if (ConfigurationHandler.commandBlock == true){

            GameRegistry.addRecipe(new ItemStack(Blocks.command_block), "IRI", "RDR", "IRI", 'I', new ItemStack(Blocks.iron_block), 'R', new ItemStack(Blocks.redstone_block), 'D', new ItemStack(Blocks.diamond_block));
        }

        if (ConfigurationHandler.endFrame == true){

            GameRegistry.addRecipe(new ItemStack(Blocks.end_portal_frame), "EOE", "OSO", "EOE", 'E', new ItemStack(Blocks.end_stone), 'O', new ItemStack(Blocks.obsidian), '$', new ItemStack(Blocks.diamond_block));
        }

        if (ConfigurationHandler.netherStar == true){

            GameRegistry.addRecipe(new ItemStack(ModItems.netherStarFragment), " Q ", "QSQ", " Q ", 'Q', new ItemStack(Blocks.quartz_block), 'S', new ItemStack(ModItems.diamondStar));
            GameRegistry.addRecipe(new ItemStack(Items.nether_star), " N ", "NEN", " N ", 'N', new ItemStack(ModItems.netherStarFragment), 'E', new ItemStack(Items.ender_eye));
        }

        if (ConfigurationHandler.endFrame == true || ConfigurationHandler.netherStar == true){

                GameRegistry.addRecipe(new ItemStack(ModItems.diamondStar), " D ", "D D", " D ", 'D', new ItemStack(Items.diamond));
        }

    }
}
