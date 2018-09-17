package pl.fsidorowicz.ponghpi.model;

import pl.fsidorowicz.ponghpi.view.AbstractView;

public class PlayerModel {


    private int xSize = 200;
    private int ySize = 40;
    private int xPos = 300;
    private int yPos;
    private double xVel = 1;

    public PlayerModel(){
        this.setYPos();

    }

    public int getXSize() {
        return this.xSize;
    }
    public int getYSize() {
        return this.ySize;
    }
    public void setXPos(double xPos) {
        if (this.xPos < 0) { this.xPos = 0;}
        else if (this.xPos > 600) { this.xPos = 600;}
        else
            this.xPos = (int)xPos;
    }

    public void appendXVel(){
        if (this.xVel < 5)
        this.xVel = this.xVel * 1.05;
        else this.xVel = 5;
    }


    public void resetXVel() {
        this.xVel = 1;
    }

    public double getXVel(){
        return this.xVel;
    }

    private void setYPos() {
        this.yPos = 740;
    }

    public int getXPos() {
        return this.xPos;
    }

    public int getYPos(){
        return this.yPos;
    }

}
