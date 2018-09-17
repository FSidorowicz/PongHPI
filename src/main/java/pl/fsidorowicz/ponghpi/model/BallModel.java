package pl.fsidorowicz.ponghpi.model;

public class BallModel {


        private int size = 20;
        private int xPos = 200;
        private int yPos = 200;

        // Here ball's speed is set.
        private int xVel = (int)(Math.random()*4 +1);
        private int yVel = (int)(Math.random()*4 + 1);

        public void move() {
            if (xPos >= 390 || xPos <= 10)
                this.xVel = -1 *this.xVel;
            if (yPos >= 390 || yPos <=10)
                this.yVel =  -1 * this.yVel;
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
