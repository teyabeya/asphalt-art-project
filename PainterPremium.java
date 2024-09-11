import org.code.neighborhood.*;
public class PainterPremium extends PainterPlus{
/*
*This class has methods that help eliminate redundant code in the minion class.
*/

  /*
  *moves painter # of times forward provided in argument
  */
  public void moveNumber(int number){
  //while loop moves the painter until it moves (number) of times  
    while (number!=0){
      move();
      number--;
    }
  }

  /*
  *paints a line forward # of spaces from argument and color from argument
  */
  public void paintLine(int number, String color){
    //sets paint to (number)
    setPaint(number);
    
    //paints and then moves painter
    while (hasPaint()){
      paint(color);
      move();
    }
  }

  /*
  *paints entirety of the canvas based on size and color provided by argument
  */
  public void paintbg(int size, String color){
    //for loop paints line size of canvas, turns around and paints other way
    for(int i = 0; i < size/2; i++){
      paintLine(size-1,color);
      turnRight();
      paintLine(1,color);
      turnRight();
      paintLine(size-1,color);
      turnLeft();
      //only turns onto next line if can move south
      if (canMove()){
      paintLine(1,color);
      turnLeft();
      }
      paintIt(color);
    }
    //brings painter back to starting point
    turnAround();
    moveNumber(size-1);
    turnRight();
  }

  /*
  *paints a four-space square with color from argument
  */
  public void paintSquare(String color){
    //paints line then turns, repeat 3 times, then paint last saure
  for(int i = 0; i < 3; i++){
    paintLine(1, color);
    turnRight();
    }
    paintLine(1, color);
  }

  /*
  *turns painter opposite direction it is facing
  */
  public void turnAround(){
    //turns left twice to 180 degree turn
    turnLeft();
    turnLeft();
  }

  /*
  *paints the square the painter is on the argument color without moving
  */
  public void paintIt(String color){
    //paints square after setting the paint to 1
    setPaint(1);
    paint(color);
  }
  
}