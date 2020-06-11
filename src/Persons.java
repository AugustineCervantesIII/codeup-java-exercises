public class Persons {

    String name;
    int age;
    double height;
    String eyeColor;
    String hairColor;

    //constructor
    public Persons(String name, int age, double height, String eyeColor, String hairColor){
        this.name = name;
        this.age = age;
        this.height = height;
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
    }

    public void speak(){
        System.out.println("Hello my name is " + name
                + " I am " + age + ", I am " + height + ".\n"
                + "My eyes are " + eyeColor + " and I also have "
                + hairColor + " hair.");
    }

}
