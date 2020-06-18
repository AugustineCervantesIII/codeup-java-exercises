package Shapes;

public class Square extends Quadrilateral{

    public Square(double side) {
        super(side, side);
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return 4 * this.length;
    }

    @Override
    public double getArea() {
        return this.length * this.length;
    }


//public class Square extends Rectangle {
//
//   //Square should define a constructor that accepts one argument, side, and calls the parent's
//   //constructor to set both the length and width to the value of side.
//    public Square(double side){
//        super(side, side);
//
//    }
//
////    public void setWidth() {
////
////    }
////
////    public void setLength() {
////
////    }
//
//    @Override
//    public double getArea(){
//        System.out.println("override");
//        return 2 * this.length;
//    }
//
//    @Override
//    public double getPerimeter(){
//        System.out.println("override");
//        return 4 * this.length;
//    }

}

