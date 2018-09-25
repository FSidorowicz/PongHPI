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

    public int getxSize() {
        return xSize;
    }

    public void setxSize(int xSize) {
        this.xSize = xSize;
    }

    public int getySize() {
        return ySize;
    }

    public void setySize(int ySize) {
        this.ySize = ySize;
    }

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    public boolean isHit() {
        return hit;
    }

    public void setHit(boolean hit) {
        this.hit = hit;
    }

    @Override
    public String toString() {
        return "Brick{" +
                "xSize=" + xSize +
                ", ySize=" + ySize +
                ", xPos=" + xPos +
                ", yPos=" + yPos +
                ", hit=" + hit +
                '}';
    }
}
