
//WALKTHROUGH
package Shapes;
//
import util.Input;
//
//public class CircleApp {
//
//    public static void main(String[] args){
//        Input in = new Input();
//
//        System.out.println("please enter a number: ");
//
//        double radius = in.getDouble();
//
//        Circle c = new Circle(radius);
//        System.out.println(c.getArea());
//        System.out.println(c.getCircumference());
//    }
//
//}

public class CircleApp {

    public static void main(String[] args) {
        Input in = new Input();


        boolean willContinue = false;
        do {
            System.out.print("Please enter a number: ");
            double radius = in.getDouble();
            Circle c = new Circle(radius);
            System.out.println(c.getArea());
            System.out.println(c.getCircumference());

            System.out.println("Circle count is: " + Circle.getCircleCount());
            System.out.println("Do you want to enter another?");
            willContinue = in.yesNo();

            System.out.println(willContinue);

        } while(willContinue);
        System.out.println("Goodbye!");

    }

}