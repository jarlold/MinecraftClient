package jarlold.hackmodules;
import jarlold.BaseHackModule;
import jarlold.JarloldBase;
import jarlold.JarloldGUI;
import net.minecraft.client.settings.KeyBinding;

public class GhostHacks extends BaseHackModule {
    public static KeyBinding keybind = new KeyBinding("key.hacks", 103, "key.categories.inventory");
    public static String name = "Ghost";

    public static void on_enable(){
        JarloldGUI.enabled_hacks.add(name);
        JarloldBase.GhostMode = true;
    }

    public static void on_disable(){
        JarloldGUI.enabled_hacks.remove(name);
        for (int i=0; i < JarloldGUI.enabled_hacks.size(); i++) {
            if (JarloldGUI.enabled_hacks.get(i) == name) {
                JarloldGUI.enabled_hacks.remove(i);
                }
            }
        JarloldBase.GhostMode = true;
    }
}
