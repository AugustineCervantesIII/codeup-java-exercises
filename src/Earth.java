public class Earth {

    public static void main(String[] args) {

//        Human augustine;
//
//        augustine = new Human();
//
//        augustine.name = "Augustine";
//        augustine.age = 30;
//        augustine.height = 5.4;
//        augustine.eyeColor = "brown";
//
//        augustine.speak();

//or

        Human augustine = new Human("Augustine", 30, 5.4, "brown");

        Human johnny = new Human("Johnny", 31, 5.9, "brown");

        augustine.speak();
        augustine.eat();
        augustine.walk();
        augustine.work();

        johnny.speak();



    }

}
