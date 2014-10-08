package com.mythotix.extravanillaaddons.block;

import net.minecraft.block.Block;

public class BlockClayStairs extends BlockStairsEVA
{
    public BlockClayStairs(Block block, int number)
    {
        super(block, number);
        this.setHardness(1.25F);
        this.setResistance(7.0F);
    }
}