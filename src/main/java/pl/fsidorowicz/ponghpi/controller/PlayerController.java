package pl.fsidorowicz.ponghpi.controller;

import pl.fsidorowicz.ponghpi.model.BallModel;
import pl.fsidorowicz.ponghpi.model.PlayerModel;
import java.awt.event.KeyEvent;

public class PlayerController{

    private PlayerModel player;

    //Timers are used for controlling the player - to eliminate holding key delay.
    private boolean timerRight;
    private boolean timerLeft;

    public PlayerController(PlayerModel player, BallModel ball){
        this.player = player;
    }


    //Controlling the player.
    public void keyPressed(int keyCode) {
        switch (keyCode) {
            case KeyEvent.VK_RIGHT:
                if (player.getXPos() < 299) {
                    this.timerRight = true;
                }
                else if (player.getXPos() > 300) {
                    player.resetXVel();
                    player.setXPos(300);}
                break;
            case KeyEvent.VK_LEFT:
                if (player.getXPos() > 1) {
                    this.timerLeft = true;
                }
                else if (player.getXPos() <= 0){
                    player.resetXVel();
                    player.setXPos(0);}
                break;
        }
    }

    // Moving the player
    public void move(){
        if (timerRight){
            int result = player.getXPos() + 10 * player.getXVel();
            player.appendXVel();
            player.setXPos(result);
        }
        else if (timerLeft){
            int result2 = player.getXPos() - 10 * player.getXVel();
            player.appendXVel();
            player.setXPos(result2);
        }
    }

    //Stop the player after key release.
    public void resetTimer(){
        this.timerRight = false;
        this.timerLeft = false;
    }
    public void resetVel() {
        player.resetXVel();
    }
}