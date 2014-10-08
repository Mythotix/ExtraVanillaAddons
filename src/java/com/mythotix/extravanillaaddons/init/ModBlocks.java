package com.mythotix.extravanillaaddons.init;

import com.mythotix.extravanillaaddons.block.BlockClayStairs;
import com.mythotix.extravanillaaddons.block.BlockStoneStairs;
import com.mythotix.extravanillaaddons.reference.Names;
import com.mythotix.extravanillaaddons.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockClayStairs clayStairs = new BlockClayStairs();
    public static final BlockStoneStairs stoneStairs = new BlockStoneStairs();

    public static void init()
    {
        GameRegistry.registerBlock(clayStairs, Names.Blocks.CLAY_STAIRS);
        GameRegistry.registerBlock(stoneStairs, Names.Blocks.STONE_STAIRS);
    }
}
