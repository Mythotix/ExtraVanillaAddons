package com.mythotix.extravanillaaddons.init;

import com.mythotix.extravanillaaddons.item.ItemDiamondStar;
import com.mythotix.extravanillaaddons.item.ItemEVA;
import com.mythotix.extravanillaaddons.item.ItemNetherStarFragment;
import com.mythotix.extravanillaaddons.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemEVA diamondStar = new ItemDiamondStar();
    public static final ItemEVA netherStarFragment = new ItemNetherStarFragment();

    public static void init()
    {
        GameRegistry.registerItem(diamondStar, "diamondStar");
        GameRegistry.registerItem(netherStarFragment, "netherStarFragment");
    }
}