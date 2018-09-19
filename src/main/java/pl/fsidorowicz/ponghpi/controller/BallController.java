package pl.fsidorowicz.ponghpi.controller;

import pl.fsidorowicz.ponghpi.model.BallModel;
import pl.fsidorowicz.ponghpi.model.PlayerModel;

public class BallController {


    PlayerModel player;
    BallModel ball;

    public BallController(PlayerModel player, BallModel ball) {

        this.player = player;
        this.ball = ball;
    }

    //Moving a ball and GAMEOVER when under the player.
    public void move() {
        if ((ball.getXPos() <= 10) || (ball.getXPos() >= 390))
            ball.setXVel(true);
        else
            ball.setXVel(false);
        if (ball.getYPos() <= 10)
            ball.setYVel(true);
        else if ((ball.getYPos() >= 350) && ((player.getXPos() <= ball.getXPos() && (player.getXPos() >= ball.getXPos() - 100))))
            ball.setYVel(true);
        else if ((ball.getYPos() >= 350) && !((player.getXPos() <= ball.getXPos() && (player.getXPos() >= ball.getXPos() - 100))))
            ball.gameOver();
        else
            ball.setYVel(false);


        if (!ball.getGameOver()) {
            ball.setXPos(ball.getXPos() + ball.getXVel());
            ball.setYPos(ball.getYPos() + ball.getYVel());
        }
    }

}
