package com.mythotix.extravanillaaddons.handler;

import com.mythotix.extravanillaaddons.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;
import java.io.File;

public class ConfigurationHandler{

    public static Configuration configuration;

    public static boolean commandBlock = false;
    public static boolean endFrame = true;
    public static boolean netherStar = true;

    public static void init(File configFile){

        if (configuration == null){

            configuration = new Configuration(configFile);
            loadConfiguration();
        }
    }

    public static void loadConfiguration(){

        commandBlock = configuration.getBoolean("Command Block", Configuration.CATEGORY_GENERAL, false, "Set this to 'false' to disable the Command Block recipe");
        endFrame = configuration.getBoolean("End Portal Frame", Configuration.CATEGORY_GENERAL, true, "Set this to 'false' to disable the End Portal Frame recipe");
        netherStar = configuration.getBoolean("Nether Star", Configuration.CATEGORY_GENERAL, true, "Set this to 'false' to disable the Nether Star recipe");

        if (configuration.hasChanged()){

            configuration.save();
        }

    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event){

        if (event.modID.equalsIgnoreCase(Reference.MOD_ID)){

            loadConfiguration();
        }
    }
}
