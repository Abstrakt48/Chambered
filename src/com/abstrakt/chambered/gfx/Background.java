package com.abstrakt.chambered.gfx;

import com.abstrakt.proton.engine.*;
import com.abstrakt.proton.gfx.*;
import com.abstrakt.proton.math.*;

public class Background {

    public ImageTile sprite;
    public int tileW = 64, tileH = 64;

    public Background() {
        sprite = new ImageTile("/Sprites/Background.png", new Vector2(tileW, tileH));
    }

    public void Render(ProtonEngine protonEngine, Renderer renderer) {
        for (int y = 0; y < protonEngine.getHeight(); y+=tileW) {
            for (int x = 0; x < protonEngine.getWidth(); x+=tileH) {
                renderer.drawImage(sprite, new Vector2(x,y));
            }
        }
    }
}
