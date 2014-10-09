package com.mythotix.extravanillaaddons.creativetab;

import com.mythotix.extravanillaaddons.init.ModItems;
import com.mythotix.extravanillaaddons.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabEVA{

    public static final CreativeTabs EVA_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()){

        @Override
        public Item getTabIconItem()
        {
            return ModItems.diamondStar;
        }
    };
}
