package com.mythotix.extravanillaaddons.client.handler;

import com.mythotix.extravanillaaddons.Utility.LogHelper;
import com.mythotix.extravanillaaddons.client.Settings.Keybindings;
import com.mythotix.extravanillaaddons.reference.Key;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;

public class KeyInputEventHandler {

    private static Key getPressedKeybinding(){

        if (Keybindings.a.isPressed()){

            return Key.A;
        }
        else if (Keybindings.b.isPressed()){

            return Key.B;
        }

        return Key.UNKNOWN;
    }

    @SubscribeEvent
    public void handleKeyInputEvent(InputEvent.KeyInputEvent event){


    }
}
