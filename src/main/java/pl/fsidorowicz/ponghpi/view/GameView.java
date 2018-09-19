package pl.fsidorowicz.ponghpi.view;
import pl.fsidorowicz.ponghpi.model.BallModel;
import pl.fsidorowicz.ponghpi.model.PlayerModel;
import processing.core.PApplet;

public class GameView extends AbstractView {

    private PlayerModel playerModel;
    private BallModel ballModel;

    public  GameView(PApplet display, PlayerModel player, BallModel ballModel){
        super(display);
        this.playerModel = player;
        this.ballModel = ballModel;
        update();

    }
    //Updating every frame.
    @Override
    public void update(){
        display.background(204);
        display.fill(0);
        display.rect(playerModel.getXPos(), playerModel.getYPos(), playerModel.getXSize(), playerModel.getYSize());
        display.ellipse(ballModel.getXPos(),ballModel.getYPos(),ballModel.getSize(),ballModel.getSize());
        display.redraw();

    }


}
