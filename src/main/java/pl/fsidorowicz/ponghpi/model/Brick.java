package pl.fsidorowicz.ponghpi.model;

public class Brick {
    private int xSize;
    private int ySize;
    private int xPos;
    private int yPos;
    private boolean hit;

    public Brick(int xSize, int ySize, int xPos, int yPos) {
        this.xSize = xSize;
        this.ySize = ySize;
        this.xPos = xPos;
        this.yPos = yPos;
        this.hit = false;
    }

    public int getXSize() {
        return xSize;
    }

    public void setXSize(int xSize) {
        this.xSize = xSize;
    }

    public int getYSize() {
        return ySize;
    }

    public void setYSize(int ySize) {
        this.ySize = ySize;
    }

    public int getXPos() {
        return xPos;
    }

    public void setXPos(int xPos) {
        this.xPos = xPos;
    }

    public int getYPos() {
        return yPos;
    }

    public void setYPos(int yPos) {
        this.yPos = yPos;
    }

    public boolean isHit() {
        return hit;
    }

    public void setHit(boolean hit) {
        this.hit = hit;
    }
}
