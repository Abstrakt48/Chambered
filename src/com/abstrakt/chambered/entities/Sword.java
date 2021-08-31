package com.abstrakt.chambered.entities;

import com.abstrakt.proton.engine.*;
import com.abstrakt.proton.gfx.*;
import com.abstrakt.proton.math.*;

public class Sword {

    public ImageTile sprite;
    public Vector2 position;
    public Vector2 tile;

    public Sword(Player player) {
        sprite = new ImageTile("/Sprites/Sword.png", new Vector2(16, 16));
        position = new Vector2(player.position.x,player.position.y);
        tile = new Vector2();
    }

    private void SetSwordPositionTile(Player player, int swordOffs) {
        if (player.tile.x == 0) position.x = player.position.x - swordOffs;
        else position.x = player.position.x + swordOffs;
        position.y = player.position.y;

        tile.x = player.tile.x;
    }

    public void Update(Player player) {
        SetSwordPositionTile(player, 4);
    }

    public void Render(ProtonEngine protonEngine, Renderer renderer) {
        renderer.drawImageTile(sprite, position, tile);
    }

}
