package pl.fsidorowicz.ponghpi.controller;

import pl.fsidorowicz.ponghpi.model.Brick;

import java.util.LinkedList;
import java.util.List;

public class BrickController {

    List<Brick> bricks = new LinkedList<>();

    public BrickController(){
        fillBrickList();
    }

    public List<Brick> getBricks() {
        return bricks;
    }
    private void fillBrickList(){
        int xPos = 2;
        int yPos = 2;
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 10; i++) {
                Brick brick = new Brick(35, 10, xPos, yPos);
                xPos += 40;
                bricks.add(brick);
            }
            xPos = 2;
            yPos += 15;
        }
    }
}