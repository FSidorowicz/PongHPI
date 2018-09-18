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


    //Controlling the player.
    @Override
    public void keyPressed(int keyCode) {
        switch (keyCode) {
            case KeyEvent.VK_RIGHT:
                if (player.getXPos() < 299) {
                    double result = player.getXPos() + 20 * player.getXVel();
                    player.appendXVel();
                    player.setXPos(result);
                }
                else if (player.getXPos() > 300) {
                    player.resetXVel();
                    player.setXPos(300);}
                break;
            case KeyEvent.VK_LEFT:
                if (player.getXPos() > 1) {
                    double result2 = player.getXPos() - 20 * player.getXVel();
                    player.appendXVel();
                    player.setXPos(result2);
                }
                else if (player.getXPos() <= 0){
                    player.resetXVel();
                    player.setXPos(0);}
                break;


        }
    }


    public void resetVel() {
        player.resetXVel();
    }


}
