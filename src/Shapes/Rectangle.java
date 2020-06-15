package Shapes;

public class Rectangle {

    //It should have protected properties for both length and width.
    protected double length;
    protected double width;

    //Rectangle should define a constructor that accepts two numbers
    // for length and width, and sets those properties.
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;

    }

    //Create two methods on the Rectangle class, getArea and getPerimeter
    // that return the respective values. The formulas for both follow:
    public double getArea(){
        return this.length * this.width;
    }



    public double getPerimeter(){
        return 2 * this.length + 2 * this.width;
    }

//    public static void main(String[] args){
//        Rectangle rectangle = new Rectangle(6,7);
//        System.out.println(rectangle.getArea());
//        System.out.println(rectangle.getPerimeter());
//    }

}
