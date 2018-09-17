package pl.fsidorowicz.ponghpi.controller;

import pl.fsidorowicz.ponghpi.model.BallModel;
import pl.fsidorowicz.ponghpi.model.PlayerModel;
import java.awt.event.KeyEvent;

public class PlayerController implements Controller{

    PlayerModel player;
    BallModel ball;

    public PlayerController(PlayerModel player, BallModel ball){

        this.player = player;
        this.ball = ball;
    }



    @Override
    public void keyPressed(int keyCode) {
        switch (keyCode) {
            case KeyEvent.VK_RIGHT:
                if (player.getXPos() < 599) {
                    double result = player.getXPos() + 20 * player.getXVel();
                    player.appendXVel();
                    player.setXPos(result);
                }
                break;
            case KeyEvent.VK_LEFT:
                if (player.getXPos() > 1) {
                    double result2 = player.getXPos() - 20 * player.getXVel();
                    player.appendXVel();
                    player.setXPos(result2);
                }
                break;


        }
    }

    @Override
    public void resetVel() {
        player.resetXVel();
    }


}
