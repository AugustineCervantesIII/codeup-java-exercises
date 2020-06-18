package Shapes;


public class ShapesTest {
    public static void main(String[] args) {

    Measurable myShape = new Square(4);

        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

        System.out.println("----");

    Measurable myShape2 = new Rectangle(5, 10);

        System.out.println(myShape2.getArea());
        System.out.println(myShape2.getPerimeter());

        System.out.println("----");

        Quadrilateral myShape3 = new Rectangle(3, 2);
        System.out.println(myShape3.getPerimeter());

//
//        Rectangle box1 = new Rectangle(4, 5);
//        System.out.println(box1.getPerimeter());
//        System.out.println(box1.getArea());
//
//        System.out.println("-----");
//
//        Rectangle box2 = new Square(5);
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());

    }

}
