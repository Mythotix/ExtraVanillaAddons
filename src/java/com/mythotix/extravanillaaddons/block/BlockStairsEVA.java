package com.mythotix.extravanillaaddons.block;

import com.mythotix.extravanillaaddons.creativetab.CreativeTabEVA;
import com.mythotix.extravanillaaddons.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;

public class BlockStairsEVA extends BlockStairs{

    public BlockStairsEVA(Block block, int number){

        super(block, number);
        this.setCreativeTab(CreativeTabEVA.EVA_TAB);
        this.setStepSound(soundTypeStone);
        this.setLightOpacity(0);
    }

    @Override
    public String getUnlocalizedName(){

        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName){

        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
