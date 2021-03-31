package jarlold;

import net.minecraft.client.settings.KeyBinding;

public class BaseHackModule {
    public static String name = "BaseHackModule";
    public static KeyBinding keybind= new KeyBinding("key.hacks", 82, "key.categories.inventory");
    public static boolean enabled = false;

    public static void on_enable() {

    }

    public static void on_disable() {

    }

    public static void on_update() {

    }
}
