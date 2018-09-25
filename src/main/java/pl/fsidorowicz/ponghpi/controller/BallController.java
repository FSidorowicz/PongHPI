package pl.fsidorowicz.ponghpi.controller;

import pl.fsidorowicz.ponghpi.model.BallModel;
import pl.fsidorowicz.ponghpi.model.Brick;
import pl.fsidorowicz.ponghpi.model.PlayerModel;

import java.util.LinkedList;
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
            if((ball.getYPos() <= (brick.getyPos() + 15) && ((ball.getXPos() >= brick.getxPos()) &&(ball.getXPos() <= brick.getxPos() + 40)) && !brick.isHit())){
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
        if (!ball.getGameOver()) {
            ball.setXPos(ball.getXPos() + ball.getXVel());
            ball.setYPos(ball.getYPos() + ball.getYVel());
        }
    }

    private double setYVelocity(int playerXPosition, int ballXPosition){
        System.out.println("ball: " + ballXPosition + ",player: " + playerXPosition);
        int positionOnPlayer = ballXPosition - playerXPosition;
        int degrees = (positionOnPlayer * 180)/100;
        double radians = Math.toRadians(degrees);
        return Math.sin(radians);
    }
}