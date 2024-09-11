import org.code.neighborhood.*;
public class Minion extends PainterPremium{
/*
*This class paints the minion Stuart
*/

  /*
  *has all methods in one to paint the minion
  */
  public void drawMinion(){
    //each method paints the color of the minion to complete the minion
    yellow();
    black();
    blue();
    gray();
    highlight();
  }

  /*
  *paints all parts of minion that are yellow
  */
  public void yellow(){
    //the top of the head
    move();
    move();
    paintLine(7, "yellow");
    turnRight();
    move();
    turnRight();
    paintLine(9, "yellow");
    turnLeft();

    //the bottom part of the body
    moveNumber(3);
    turnLeft();
    move();
    for(int i = 0; i < 3; i++){
      paintLine(9, "yellow");
      turnRight();
      move();
      turnRight();
      move();
      paintLine(9,"yellow");
      turnLeft();
      move();
      turnLeft();
      move();
    }
    
  }

  /*
  *paints all parts of the minion that are black
  */
  public void black(){
    //paints feet
    turnRight();
    move();
    turnLeft();
    move();
    paintLine(3,"black");
    move();
    paintLine(3,"black");

    //paints hands
    move();
    turnLeft();
    moveNumber(2);
    turnLeft();
    paintLine(2, "black");
    moveNumber(7);
    paintLine(1, "black");
    paintIt("black");

    //paints black of goggles and the eye
    turnRight();
    moveNumber(7);
    turnRight();
    move();
    for(int i = 3; i > 0; i--){
      paintSquare("black");
      turnRight();
      move();
      moveNumber(i);
    }

    //paints mouth
    turnRight();
    moveNumber(3);
    turnRight();
    moveNumber(3);
    paintIt("black");
    move();
    turnLeft();
    move();
    turnRight();
    paintLine(3, "black");
  }

  /*
  *paints all parts of the minion that are blue
  */
  public void blue(){
    //paints the strap on the left of the minion
    moveNumber(2);
    paintIt("blue");
    turnAround();
    turnRight();
    move();
    turnLeft();
    move();
    paintIt("blue");

    //paints strap on the right of the minion
    moveNumber(6);
    paintIt("blue");
    turnLeft();
    move();
    turnRight();
    move();
    paintIt("blue");

    //paints the body part of the overalls
    turnRight();
    moveNumber(2);
    turnRight();
    move();
    paintLine(7, "blue");
    turnLeft();
    move();
    turnLeft();
    move();
    paintLine(7, "blue");

    //paints the pants of the overalls
    turnRight();
    move();
    turnRight();
    moveNumber(2);
    paintLine(2, "blue");
    move();
    paintLine(2, "blue");
  }

  /*
  *paints the part of the minion that is gray
  */
  public void gray(){
    //paints box to make goggle
    turnRight();
    moveNumber(6);
    turnRight();
    move();
    paintLine(4, "gray");
    turnLeft();
    paintLine(3, "gray");
    turnLeft();
    paintLine(4, "gray");
    turnLeft();
    paintLine(3, "gray");
  }

  /*
  *adds white highlight to the eye and returns painter to top left corner
  */
  public void highlight(){
    //paints the white highlite of minion's eye
    turnLeft();
    moveNumber(3);
    turnLeft();
    move();
    move();
    paintIt("white");

    //returns painter to starting point
    moveNumber(2);
    turnLeft();
    moveNumber(6);
  }
}