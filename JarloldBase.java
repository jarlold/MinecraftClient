package jarlold;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.gui.AbstractGui;
import net.minecraft.client.gui.FontRenderer;

public class JarloldBase {
    // Draw's a custom gui test
    // Should be called at the end of IngameGui.renderIngameGUI

    public static boolean GhostMode = false;
   /*Must modify the CleintPlayerEntity.respawnPlayer() to
    *  set player health to 20.0f, and then return without sending respawn packet
    *  set entity.player.PlayerEntity.onDeath to return early
    *  set DeathScreen.shouldCloseOnEsc to return True (or return ghost)
    *  set DeathScreen.setShowDeathScreen to return early
    *  You probably don't need to do all of that actually, and some if it probably breaks parts of the game, but it's
    *  2:20 AM and I just wanna watch youtube videos or sleep or something.
    */
}
