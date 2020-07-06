public class Cat extends Animal {

    public Cat(String hunting, String chasing, String feasting,String name, String color, String activity) {
        super(hunting, chasing, feasting, name, color, activity);
    }

    public void meow() {
        System.out.println("cat name: " + name + ".\ncolor: " + color + ".\nwhat is he/she doing: " + activity + ".\n");
    }

}
