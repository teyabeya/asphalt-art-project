import org.code.neighborhood.*;

public class PainterPlus extends Painter {

  //turn left x3  = turn right
  public void turnRight() {
    turnLeft();
    turnLeft();
    turnLeft();
  }

  //take all the paint in a bucket until no more
  public void takeAllPaint(){
    while (isOnBucket()){
      takePaint();
    }
  }

  //move forward until unable to
  public void moveFast(){
    while (canMove()){
      move();
    }
  }

  //paint then move forward until there is no more paint left
  public void paintToEmpty(String color){
    while (hasPaint()){
      paint(color);
      move();
    }
  }

  //paint in a circle/donut
  public void paintDonut(String color){
    while (hasPaint()){
      move();
      turnRight();
      paint(color);
      move();
      paint(color);
    }
    }
  }
