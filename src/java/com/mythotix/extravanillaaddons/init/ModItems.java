package com.mythotix.extravanillaaddons.init;

import com.mythotix.extravanillaaddons.item.ItemDiamondStar;
import com.mythotix.extravanillaaddons.item.ItemEVA;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemEVA diamondStar = new ItemDiamondStar();

    public static void init()
    {
        GameRegistry.registerItem(diamondStar, "diamondStar");
    }
}