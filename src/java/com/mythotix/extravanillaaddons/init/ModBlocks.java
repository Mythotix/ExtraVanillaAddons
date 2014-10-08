package com.mythotix.extravanillaaddons.init;

import com.mythotix.extravanillaaddons.block.BlockStoneStairs;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks
{
    public static final BlockStoneStairs stoneStairs = new BlockStoneStairs();

    public static void init()
    {
        GameRegistry.registerBlock(stoneStairs, "stoneStairs");
    }
}
