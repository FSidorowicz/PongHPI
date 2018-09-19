package pl.fsidorowicz.ponghpi.model;

public class BallModel {


    private int size = 20;
    private int xPos = 200;
    private int yPos = 100;
    private int xVel = getRandomSPeed() * getRandomDirection();
    private int yVel = getRandomSPeed() * getRandomDirection();
    private boolean gameOver = false;


    public void setXVel(boolean bounce) {
        if (bounce)
            this.xVel = -1 * this.xVel;
    }

    public void setYVel(boolean bounce) {
        if (bounce)
            this.yVel = -1 * this.yVel;
    }
    private int getRandomSPeed(){
        return (int)(Math.random()*3 + 2);
    }
    private int getRandomDirection(){
        int random = (int)(Math.random() *2);
        if (random == 0 )
            return 1;
        else
            return -1;
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
