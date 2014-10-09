package com.mythotix.extravanillaaddons.init;

import com.mythotix.extravanillaaddons.block.BlockClayStairs;
import com.mythotix.extravanillaaddons.block.BlockStoneStairs;
import com.mythotix.extravanillaaddons.reference.Names;
import com.mythotix.extravanillaaddons.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks{

    public static final BlockStoneStairs stoneStairs = new BlockStoneStairs();
    public static final BlockClayStairs clayStairs = (BlockClayStairs) new BlockClayStairs(Blocks.hardened_clay, 0).setBlockName(Names.Blocks.CLAY_STAIRS);
    public static final BlockClayStairs whiteClayStairs = (BlockClayStairs) new BlockClayStairs(Blocks.stained_hardened_clay, 0).setBlockName(Names.Blocks.WHITE_CLAY_STAIRS);
    public static final BlockClayStairs orangeClayStairs = (BlockClayStairs) new BlockClayStairs(Blocks.stained_hardened_clay, 1).setBlockName(Names.Blocks.ORANGE_CLAY_STAIRS);
    public static final BlockClayStairs magentaClayStairs = (BlockClayStairs) new BlockClayStairs(Blocks.stained_hardened_clay, 2).setBlockName(Names.Blocks.MAGENTA_CLAY_STAIRS);
    public static final BlockClayStairs lightBlueClayStairs = (BlockClayStairs) new BlockClayStairs(Blocks.stained_hardened_clay, 3).setBlockName(Names.Blocks.LIGHT_BLUE_CLAY_STAIRS);
    public static final BlockClayStairs yellowClayStairs = (BlockClayStairs) new BlockClayStairs(Blocks.stained_hardened_clay, 4).setBlockName(Names.Blocks.YELLOW_CLAY_STAIRS);
    public static final BlockClayStairs limeClayStairs = (BlockClayStairs) new BlockClayStairs(Blocks.stained_hardened_clay, 5).setBlockName(Names.Blocks.LIME_CLAY_STAIRS);
    public static final BlockClayStairs pinkClayStairs = (BlockClayStairs) new BlockClayStairs(Blocks.stained_hardened_clay, 6).setBlockName(Names.Blocks.PINK_CLAY_STAIRS);
    public static final BlockClayStairs grayClayStairs = (BlockClayStairs) new BlockClayStairs(Blocks.stained_hardened_clay, 7).setBlockName(Names.Blocks.GRAY_CLAY_STAIRS);
    public static final BlockClayStairs lightGrayClayStairs = (BlockClayStairs) new BlockClayStairs(Blocks.stained_hardened_clay, 8).setBlockName(Names.Blocks.LIGHT_GRAY_CLAY_STAIRS);
    public static final BlockClayStairs cyanClayStairs = (BlockClayStairs) new BlockClayStairs(Blocks.stained_hardened_clay, 9).setBlockName(Names.Blocks.CYAN_CLAY_STAIRS);
    public static final BlockClayStairs purpleClayStairs = (BlockClayStairs) new BlockClayStairs(Blocks.stained_hardened_clay, 10).setBlockName(Names.Blocks.PURPLE_CLAY_STAIRS);
    public static final BlockClayStairs blueClayStairs = (BlockClayStairs) new BlockClayStairs(Blocks.stained_hardened_clay, 11).setBlockName(Names.Blocks.BLUE_CLAY_STAIRS);
    public static final BlockClayStairs brownClayStairs = (BlockClayStairs) new BlockClayStairs(Blocks.stained_hardened_clay, 12).setBlockName(Names.Blocks.BROWN_CLAY_STAIRS);
    public static final BlockClayStairs greenClayStairs = (BlockClayStairs) new BlockClayStairs(Blocks.stained_hardened_clay, 13).setBlockName(Names.Blocks.GREEN_CLAY_STAIRS);
    public static final BlockClayStairs redClayStairs = (BlockClayStairs) new BlockClayStairs(Blocks.stained_hardened_clay, 14).setBlockName(Names.Blocks.RED_CLAY_STAIRS);
    public static final BlockClayStairs blackClayStairs = (BlockClayStairs) new BlockClayStairs(Blocks.stained_hardened_clay, 15).setBlockName(Names.Blocks.BLACK_CLAY_STAIRS);

    public static void init(){

        GameRegistry.registerBlock(stoneStairs, Names.Blocks.STONE_STAIRS);
        GameRegistry.registerBlock(clayStairs, Names.Blocks.CLAY_STAIRS);
        GameRegistry.registerBlock(whiteClayStairs, Names.Blocks.WHITE_CLAY_STAIRS);
        GameRegistry.registerBlock(orangeClayStairs, Names.Blocks.ORANGE_CLAY_STAIRS);
        GameRegistry.registerBlock(magentaClayStairs, Names.Blocks.MAGENTA_CLAY_STAIRS);
        GameRegistry.registerBlock(lightBlueClayStairs, Names.Blocks.LIGHT_BLUE_CLAY_STAIRS);
        GameRegistry.registerBlock(yellowClayStairs, Names.Blocks.YELLOW_CLAY_STAIRS);
        GameRegistry.registerBlock(limeClayStairs, Names.Blocks.LIME_CLAY_STAIRS);
        GameRegistry.registerBlock(pinkClayStairs, Names.Blocks.PINK_CLAY_STAIRS);
        GameRegistry.registerBlock(grayClayStairs, Names.Blocks.GRAY_CLAY_STAIRS);
        GameRegistry.registerBlock(lightGrayClayStairs, Names.Blocks.LIGHT_GRAY_CLAY_STAIRS);
        GameRegistry.registerBlock(cyanClayStairs, Names.Blocks.CYAN_CLAY_STAIRS);
        GameRegistry.registerBlock(purpleClayStairs, Names.Blocks.PURPLE_CLAY_STAIRS);
        GameRegistry.registerBlock(blueClayStairs, Names.Blocks.BLUE_CLAY_STAIRS);
        GameRegistry.registerBlock(brownClayStairs, Names.Blocks.BROWN_CLAY_STAIRS);
        GameRegistry.registerBlock(greenClayStairs, Names.Blocks.GREEN_CLAY_STAIRS);
        GameRegistry.registerBlock(redClayStairs, Names.Blocks.RED_CLAY_STAIRS);
        GameRegistry.registerBlock(blackClayStairs, Names.Blocks.BLACK_CLAY_STAIRS);
    }
}
