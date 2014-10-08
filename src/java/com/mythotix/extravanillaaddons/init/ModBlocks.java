package com.mythotix.extravanillaaddons.init;

import com.mythotix.extravanillaaddons.block.BlockStoneStairs;
import com.mythotix.extravanillaaddons.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockStoneStairs stoneStairs = new BlockStoneStairs();

    public static void init()
    {
        GameRegistry.registerBlock(stoneStairs, "stoneStairs");
    }
}
