package jarlold;

import com.mojang.blaze3d.matrix.MatrixStack;
import jarlold.hackmodules.FlyHacks;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.AbstractGui;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.settings.KeyBinding;

import java.util.ArrayList;

public class JarloldGUI {

    public static KeyBinding keybind = new KeyBinding("key.hacks", 85, "key.categories.inventory");
    public static ArrayList<String> enabled_hacks = new ArrayList<String>();
    public static boolean enabled = false;

    // The base draw function, should be called at the end of RenderIngameGui in IngameGui.java
    public static void GuiRender(FontRenderer fontrend, MatrixStack matrixstack) {
        FlyHacks.on_update();
        if (enabled) {
            AbstractGui.drawString(matrixstack, fontrend, "~Reboot Main Menu:~", 250, 0, 0xFFFF0000);
        }
        else {
            AbstractGui.drawString(matrixstack, fontrend, "Reboot Client (1.16.4):", 0, 0, 0xFFFF0000);
            for (int i = 0; i < enabled_hacks.size(); i++) {
                AbstractGui.drawString(matrixstack, fontrend, enabled_hacks.get(i), 0, (i+1)*20, 0xFFFF0000);

            }
        }
    }

    public static void on_enable() {
        Minecraft.getInstance().mouseHelper.ungrabMouse();
    }

    public static void on_disable() {
        Minecraft.getInstance().mouseHelper.grabMouse();

    }
}
