package pl.fsidorowicz.ponghpi.model;

public class PlayerModel {


    private int xSize;
    private int ySize;
    private int xPos;
    private int yPos;
    private int xVel;

    public PlayerModel(){
        xSize = 100;
        ySize = 20;
        xPos = 150;
        yPos = 360;
        xVel = 1;
    }

    public int getXSize() {
        return this.xSize;
    }
    public int getYSize() {
        return this.ySize;
    }

    public void setXPos(int xPos) {
        if (this.xPos < 0) { this.xPos = 0;}
        else if (this.xPos > 300) { this.xPos = 300;}
        else
            this.xPos = xPos;
    }

    public void appendXVel(){
        if (this.xVel < 5)
            this.xVel *= 1.05;
        else this.xVel = 5;
    }

    public void resetXVel() {
        this.xVel = 1;
    }

    public int getXVel(){
        return this.xVel;
    }

    public int getXPos() {
        return this.xPos;
    }

    public int getYPos(){
        return this.yPos;
    }

}
