package pl.fsidorowicz.ponghpi.starter;

import pl.fsidorowicz.ponghpi.controller.BallController;
import pl.fsidorowicz.ponghpi.controller.BrickController;
import pl.fsidorowicz.ponghpi.controller.PlayerController;
import pl.fsidorowicz.ponghpi.model.BallModel;
import pl.fsidorowicz.ponghpi.model.Brick;
import pl.fsidorowicz.ponghpi.model.PlayerModel;
import pl.fsidorowicz.ponghpi.view.GameView;
import processing.core.PApplet;

import java.util.ArrayList;
import java.util.List;

import static javax.swing.JOptionPane.*;


public class TheApp extends PApplet {

    private PlayerController playerController;
    private GameView gameView;
    private BallModel ball;
    private BallController ballController;
    List<Brick> bricks;
    boolean gameStarted;

    @Override
    public void settings() {
        size(400, 400);
    }

    @Override
    public void setup() {  // setup() runs once
        gameStarted = false;
        frameRate(30);
        PlayerModel player = new PlayerModel();
        ball = new BallModel();
        bricks = new BrickController().getBricks();
        playerController = new PlayerController(player, ball);
        ballController = new BallController(player, ball, bricks);
        gameView = new GameView(this, player, ball, bricks);

    }

    //Drawing every frame.
    @Override
    public void draw() {  // draw() loops forever, until stopped
        if (gameStarted) {
            if (!ball.getGameOver()) {
                moveBall();
                gameView.update();
                playerController.move();
            } else {
                int i = showConfirmDialog(null, "Game over! \nWould you like to play again?", "Choose One", YES_NO_OPTION);
                if (i == 0){
                    setup();
                }
                else
                    System.exit(0);
            }
        }
        else {
            showMessageDialog(null, "Start game", "Press OK to start the game.", INFORMATION_MESSAGE);
            gameStarted = true;
        }
    }

    //Key listener.
    public void keyPressed() {
        playerController.keyPressed(keyCode);
        gameView.update();
    }
    //Actions after key released - stop the player.
    public void keyReleased() {
        playerController.resetVel();
        playerController.resetTimer();

    }
    //Moving a ball. Method is called in draw method of this class.
    private void moveBall() {
        ballController.move();
    }
}