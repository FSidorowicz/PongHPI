package pl.fsidorowicz.ponghpi.model;

public class BallModel {


    private int size = 20;
    private int xPos = 200;
    private int yPos = 200;
    private int xVel = -(int) (Math.random() * 3 + 2);
    private int yVel = -(int) (Math.random() * 3 + 2);
    private boolean gameOver = false;


    public void setXVel(boolean bounce) {
        if (bounce)
            this.xVel = -1 * this.xVel;
    }

    public void setYVel(boolean bounce) {
        if (bounce)
            this.yVel = -1 * this.yVel;
    }

    public int getXVel() {
        return this.xVel;
    }

    public int getYVel() {
        return this.yVel;
    }

    public void setXPos(int xPos) {
        this.xPos = xPos;
    }

    public void setYPos(int yPos) {
        this.yPos = yPos;
    }

    public int getSize() {
        return this.size;
    }

    public int getXPos() {
        return this.xPos;
    }

    public int getYPos() {
        return this.yPos;
    }

    public void gameOver(){
        this.gameOver = true;
    }

    public boolean getGameOver(){
        return this.gameOver;
    }
}
