package pl.fsidorowicz.ponghpi.model;

public class BallModel {


        private int size = 50;
        private int xPos = 400;
        private int yPos = 400;
        private int xVel = 10;
        private int yVel = 10;

        public void move() {
            this.xPos = this.xPos + xVel;
            this.yPos = this.yPos + yVel;
        }

        public int getSize(){
            return this.size;
        }

        public int getXPos(){
            return this.xPos;
        }
        public int getYPos(){
            return this.yPos;
      }

}
