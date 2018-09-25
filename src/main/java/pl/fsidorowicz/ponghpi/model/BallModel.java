package pl.fsidorowicz.ponghpi.model;

public class BallModel {


    private int size = 20;
    private int xPos = 200;
    private int yPos = 100;
    private int xVel;
    private int yVel;
    private boolean gameOver = false;

    public BallModel(){
        xVel = getRandomSPeed() * getRandomDirection();
        yVel = getRandomSPeed() * getRandomDirection();
    }


    public void setXVel(int xVel) {
        this.xVel = xVel;
    }

    public void setYVel(int yVel) {
        this.yVel = yVel;
    }

    private int getRandomSPeed() {
        return (int) (Math.random() * 3 + 2);
    }

    private int getRandomDirection() {
        int random = (int) (Math.random() * 2);
        if (random == 0)
            return 1;
        else
            return random;
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

    public void gameOver() {
        this.gameOver = true;
    }

    public boolean getGameOver() {
        return this.gameOver;
    }
}
