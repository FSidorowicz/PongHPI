package pl.fsidorowicz.ponghpi.starter;

import pl.fsidorowicz.ponghpi.controller.BallController;
import pl.fsidorowicz.ponghpi.controller.PlayerController;
import pl.fsidorowicz.ponghpi.model.BallModel;
import pl.fsidorowicz.ponghpi.model.PlayerModel;
import pl.fsidorowicz.ponghpi.view.GameView;
import processing.core.PApplet;
import static javax.swing.JOptionPane.*;


public class TheApp extends PApplet {

    private PlayerController playerController;
    private GameView gameView;
    BallModel ball;
    BallController ballController;

    @Override
    public void settings() {
        size(400, 400);
    }

    @Override
    public void setup() {  // setup() runs once
        frameRate(30);
        PlayerModel player = new PlayerModel();
        ball = new BallModel();
        playerController = new PlayerController(player, ball);
        ballController = new BallController(player, ball);
        gameView = new GameView(this, player, ball);

    }

    @Override
    public void draw() {  // draw() loops forever, until stopped
        if (!ball.getGameOver()) {
            moveBall();
            gameView.update();
        }
        else {
            showMessageDialog(null, "GameOver", "You lost!", INFORMATION_MESSAGE);
            System.exit(0);
        }
    }

    //Add further user interaction as necessary
    //@Override
    public void keyPressed() {
        playerController.keyPressed(keyCode);
        gameView.update();

    }

    public void keyReleased() {
        playerController.resetVel();
    }

    public void moveBall() {
        ballController.move();
    }
}
