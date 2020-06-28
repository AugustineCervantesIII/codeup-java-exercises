public class Cat extends Pet {

    public Cat(String name, String color, String activity) {
        super(name, color, activity);
    }

    public void meow() {
        System.out.println("cat name: " + name + ".\ncolor: " + color + ".\nwhat is he/she doing: " + activity + ".\n");
    }

}
