package com.mythotix.extravanillaaddons.block;

import com.mythotix.extravanillaaddons.reference.Names;
import net.minecraft.init.Blocks;

public class BlockClayStairs extends BlockStairsEVA
{
    public BlockClayStairs()
    {
        super(Blocks.hardened_clay, 0);
        this.setBlockName(Names.Blocks.CLAY_STAIRS);
        this.setHardness(1.25F);
        this.setResistance(7.0F);
    }
}