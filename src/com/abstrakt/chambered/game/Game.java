package com.abstrakt.chambered.game;

import com.abstrakt.chambered.entities.*;
import com.abstrakt.chambered.gfx.*;
import com.abstrakt.proton.engine.*;

public class Game extends AbstractProton {

    private final Background background;
    private final Player player;
    private final Sword sword;

    public Game() {
        background = new Background();
        player = new Player();
        sword = new Sword(player);
    }

    public void update(ProtonEngine protonEngine, float dt) {
        player.Update(protonEngine);
        sword.Update(player);
    }

    public void render(ProtonEngine protonEngine, Renderer renderer) {
        background.Render(protonEngine, renderer);
        player.Render(protonEngine, renderer);
        sword.Render(protonEngine, renderer);
    }

    public static void main(String[] args) {
        ProtonEngine p = new ProtonEngine(new Game());
        p.setTitle("Chambered");
        p.start();
    }
}