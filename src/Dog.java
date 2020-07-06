public class Dog extends Animal {


    public Dog(String hunting, String chasing, String feasting,String name, String color, String activity) {
        super(hunting, chasing, feasting, name, color, activity);
    }

    public void bark() {
        System.out.println("dog name: " + name + "\ncolor: " + color + "\nwhat is this dog doing: " + activity + ".\n");
    }

}
