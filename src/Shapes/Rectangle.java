package Shapes;

public class Rectangle extends Quadrilateral implements Measurable {


    public Rectangle(double length, double width) {
        super(length, width);
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
        return 2 * this.length + 2 * this.width;
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

//    //It should have protected properties for both length and width.
//    protected double length;
//    protected double width;
//
//    //Rectangle should define a constructor that accepts two numbers
//    // for length and width, and sets those properties.
//    public Rectangle(double width, double length){
//        this.length = length;
//        this.width = width;
//
//    }
//
//    //Create two methods on the Rectangle class, getArea and getPerimeter
//    // that return the respective values. The formulas for both follow:
//    public double getArea(){
//        return this.length * this.width;
//    }
//
//
//
//    public double getPerimeter(){
//        return 2 * this.length + 2 * this.width;
//    }
//
////    public static void main(String[] args){
////        Rectangle rectangle = new Rectangle(6,7);
////        System.out.println(rectangle.getArea());
////        System.out.println(rectangle.getPerimeter());
////    }

}
