public class Dog extends Pet {


    public Dog(String name, String color, String activity) {
        super(name, color, activity);
    }

    public void bark() {
        System.out.println("dog name: " + name + "\ncolor: " + color + "\nwhat is this dog doing: " + activity + ".\n");
    }

}
