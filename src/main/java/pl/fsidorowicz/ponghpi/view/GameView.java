package pl.fsidorowicz.ponghpi.view;
import pl.fsidorowicz.ponghpi.model.BallModel;
import pl.fsidorowicz.ponghpi.model.Brick;
import pl.fsidorowicz.ponghpi.model.PlayerModel;
import processing.core.PApplet;

import java.util.List;

public class GameView extends AbstractView {

    private PlayerModel playerModel;
    private BallModel ballModel;
    private List<Brick> bricks;

    public  GameView(PApplet display, PlayerModel player, BallModel ballModel, List<Brick> bricks){
        super(display);
        this.playerModel = player;
        this.ballModel = ballModel;
        this.bricks = bricks;
        update();
    }
    //Updating every frame.
    @Override
    public void update(){
        display.background(0);
        display.fill(255, 255, 255);
        display.rect(playerModel.getXPos(), playerModel.getYPos(), playerModel.getXSize(), playerModel.getYSize());
        display.fill(255,0,0);
        display.ellipse(ballModel.getXPos(),ballModel.getYPos(),ballModel.getSize(),ballModel.getSize());
        display.fill(90, 0, 218);
        for(Brick brick : bricks)
            if(!brick.isHit())
                display.rect(brick.getxPos(), brick.getyPos(), brick.getxSize(), brick.getySize());
        display.redraw();
    }
}