package com.mythotix.extravanillaaddons.block;

import com.mythotix.extravanillaaddons.creativetab.CreativeTabEVA;
import com.mythotix.extravanillaaddons.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class BlockEVA extends Block
{
    public BlockEVA(Material material)
    {
        super(material);
        this.setCreativeTab(CreativeTabEVA.EVA_TAB);
    }

    public BlockEVA()
    {
        this(Material.rock);
        this.setCreativeTab(CreativeTabEVA.EVA_TAB);
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

