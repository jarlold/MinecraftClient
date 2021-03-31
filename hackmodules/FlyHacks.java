package jarlold.hackmodules;

import jarlold.JarloldBase;
import jarlold.JarloldGUI;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;

public class FlyHacks extends jarlold.BaseHackModule {
    public static KeyBinding keybind= new KeyBinding("key.hacks", 82, "key.categories.inventory");
    public static String name = "Fly";
    public static boolean enabled = false;

    public static void on_enable() {
        enabled = true;
        JarloldGUI.enabled_hacks.add(name);
    }

    public static void on_update() {
        while (enabled) {
            Minecraft.getInstance().player.abilities.isFlying = true;
        }
    }

    public static void on_disable() {
        enabled = false;
        JarloldGUI.enabled_hacks.remove(name);
        for (int i=0; i < JarloldGUI.enabled_hacks.size(); i++) {
            if (JarloldGUI.enabled_hacks.get(i) == name) {
                JarloldGUI.enabled_hacks.remove(i);
            }
        }
        Minecraft.getInstance().player.abilities.isFlying = false;
    }

}
