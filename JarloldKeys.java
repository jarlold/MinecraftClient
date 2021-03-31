package jarlold;

import jarlold.hackmodules.FlyHacks;
import net.minecraft.client.settings.KeyBinding;

public class JarloldKeys {

    public static void processKeybinds() {

        if (JarloldGUI.keybind.isPressed()) {
            JarloldGUI.enabled = !JarloldGUI.enabled;
            if (JarloldGUI.enabled)
                JarloldGUI.on_enable();
            else
                JarloldGUI.on_disable();
        }


        if (FlyHacks.keybind.isPressed()) {
           FlyHacks.enabled = !FlyHacks.enabled;
           if (FlyHacks.enabled)
               FlyHacks.on_enable();
           else
               FlyHacks.on_disable();
        }

    }

}
