package com.mythotix.extravanillaaddons;

import com.mythotix.extravanillaaddons.Utility.LogHelper;
import com.mythotix.extravanillaaddons.client.handler.KeyInputEventHandler;
import com.mythotix.extravanillaaddons.handler.ConfigurationHandler;
import com.mythotix.extravanillaaddons.init.ModBlocks;
import com.mythotix.extravanillaaddons.init.ModItems;
import com.mythotix.extravanillaaddons.init.Recipes;
import com.mythotix.extravanillaaddons.proxy.IProxy;
import com.mythotix.extravanillaaddons.reference.Reference;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class ExtraVanillaAddons{

   @Mod.Instance(Reference.MOD_ID)
   public static ExtraVanillaAddons instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){

        ConfigurationHandler.init(event.getSuggestedConfigurationFile());

        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        //proxy.registerKeyBindings();

        ModItems.init();

        ModBlocks.init();

        LogHelper.info("Pre Initialization Complete!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){

        //FMLCommonHandler.instance().bus().register(new KeyInputEventHandler());

        Recipes.init();

        LogHelper.info("Initialization Complete!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post Initialization Complete!");
    }
}
