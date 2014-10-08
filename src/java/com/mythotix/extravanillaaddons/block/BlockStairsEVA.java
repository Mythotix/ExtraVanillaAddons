package com.mythotix.extravanillaaddons.block;

import com.mythotix.extravanillaaddons.creativetab.CreativeTabEVA;
import com.mythotix.extravanillaaddons.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.client.renderer.texture.IIconRegister;

public class BlockStairsEVA extends BlockStairs
{
    public BlockStairsEVA(Block p_i45428_1_, int p_i45428_2_)
    {
        super(p_i45428_1_, p_i45428_2_);
        this.setCreativeTab(CreativeTabEVA.EVA_TAB);
        this.setStepSound(soundTypeStone);
        this.setLightOpacity(0);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
