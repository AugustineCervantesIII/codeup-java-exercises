package Shapes;

public class Square extends Rectangle {

   //Square should define a constructor that accepts one argument, side, and calls the parent's
   //constructor to set both the length and width to the value of side.
    public Square(double side){
        super(side, side);

    }

}
