

public class Human {

    String name;
    int age;
    double height;
    String eyeColor;

    //constructor, this method has the same name as the class name
//    public Human(){
//
//    }

    //or
    public Human(String name, int age, double height, String eyeColor) {
        super();
        this.name = name;
        this.age = age;
        this.height = height;
        this.eyeColor = eyeColor;
    }

    public void speak() {
        System.out.println("Hello, my name is " + name);
        System.out.println("I am " + age + " years old. And I am " + height + " ...short");
        System.out.println("My eyes are " + eyeColor);
    }

    public void eat() {
        System.out.println("eating....");
    }

    public void walk() {
        System.out.println("walking...");
    }

    public void work() {
        System.out.println("working...");
    }

}
