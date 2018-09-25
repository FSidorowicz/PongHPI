package pl.fsidorowicz.ponghpi.controller;

import pl.fsidorowicz.ponghpi.model.BallModel;
import pl.fsidorowicz.ponghpi.model.Brick;
import pl.fsidorowicz.ponghpi.model.PlayerModel;

import java.util.List;

public class BallController {


    private PlayerModel player;
    private BallModel ball;
    private List<Brick> bricks;
    private int score = 0;

    public BallController(PlayerModel player, BallModel ball, List<Brick> bricks) {
        this.player = player;
        this.ball = ball;
        this.bricks = bricks;
    }

    //Moving a ball and GAMEOVER when under the player.
    public void move() {
        for(Brick brick : bricks){
            if((ball.getYPos() <= (brick.getYPos() + 15) && ((ball.getXPos() >= brick.getXPos()) &&(ball.getXPos() <= brick.getXPos() + 40)) && !brick.isHit())){
                brick.setHit(true);
                ball.setYVel(ball.getYVel() * -1);
                score++;
            }
        }
        if ((ball.getXPos() <= 10) || (ball.getXPos() >= 390))
            ball.setXVel(ball.getXVel() * -1);
        if (ball.getYPos() <= 10)
            ball.setYVel(ball.getYVel() * -1);
        if ((ball.getYPos() >= 350) && ((player.getXPos() <= ball.getXPos() && (player.getXPos() >= ball.getXPos() - 100))))
            ball.setYVel(ball.getYVel() * -1 );
        if ((ball.getYPos() >= 350) && !((player.getXPos() <= ball.getXPos() && (player.getXPos() >= ball.getXPos() - 100))))
            ball.gameOver();
        if(score == bricks.size())
            ball.gameOver();
        if (!ball.isGameOver()) {
            ball.setXPos(ball.getXPos() + ball.getXVel());
            ball.setYPos(ball.getYPos() + ball.getYVel());
        }
    }
}