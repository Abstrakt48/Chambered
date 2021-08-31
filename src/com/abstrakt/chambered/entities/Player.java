package com.abstrakt.chambered.entities;

import com.abstrakt.proton.engine.*;
import com.abstrakt.proton.gfx.*;
import com.abstrakt.proton.math.*;
import java.awt.event.KeyEvent;

public class Player {

    public ImageTile sprite;
    public Vector2 position;
    public Vector2 tile;
    public int speed = 2;

    public Player() {
        sprite = new ImageTile("/Sprites/Player.png", new Vector2(16, 16));
        position = new Vector2((int)(320/2),(int)(240/2));
        tile = new Vector2();
    }

    public void Update(ProtonEngine protonEngine) {
        if (protonEngine.getInput().isKey(KeyEvent.VK_W)) {
            position.y -= speed;
        }
        if (protonEngine.getInput().isKey(KeyEvent.VK_S)) {
            position.y += speed;
        }
        if (protonEngine.getInput().isKey(KeyEvent.VK_A)) {
            position.x -= speed;
            tile.x = 1;
        }
        if (protonEngine.getInput().isKey(KeyEvent.VK_D)) {
            position.x += speed;
            tile.x = 0;
        }
    }

    public void Render(ProtonEngine protonEngine, Renderer renderer) {
        renderer.drawImageTile(sprite, position, tile);
    }
}
