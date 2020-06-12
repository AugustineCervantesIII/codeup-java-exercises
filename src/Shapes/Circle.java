
//WALKTHROUGH
package Shapes;

public class Circle {

    private static int circleCount = 0;

    public static int getCircleCount(){
        return circleCount;
    }

    private double radius;

    public Circle(double radius){
        circleCount++;
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    public double getCircumference(){
        return 2 * Math.PI * radius;
    }

}
