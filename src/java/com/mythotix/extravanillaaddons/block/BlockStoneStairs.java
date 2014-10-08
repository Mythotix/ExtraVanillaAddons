package com.mythotix.extravanillaaddons.block;

import com.mythotix.extravanillaaddons.creativetab.CreativeTabEVA;
import com.mythotix.extravanillaaddons.reference.Names;
import net.minecraft.block.BlockStone;
import net.minecraft.init.Blocks;

public class BlockStoneStairs extends BlockStairsEVA
{
    public BlockStoneStairs()
    {
        super(Blocks.stone, 0);
        this.setBlockName(Names.Blocks.STONE_STAIRS);
    }
}
