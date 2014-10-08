package com.mythotix.extravanillaaddons.block;

import com.mythotix.extravanillaaddons.reference.Names;
import net.minecraft.init.Blocks;

public class BlockStoneStairs extends BlockStairsEVA
{
    public BlockStoneStairs()
    {
        super(Blocks.stone, 0);
        this.setBlockName(Names.Blocks.STONE_STAIRS);
        this.setHardness(1.5F);
        this.setResistance(10.0F);
    }
}
