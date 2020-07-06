public class Wolf extends Animal {

    public Wolf(String hunting, String chasing, String feasting, String name, String color, String activity){
        super(hunting, chasing, feasting, name, color, activity);
    }

    public void growl(){
        System.out.println("Cunning and smart, it is " + hunting + " its prey, a " + chasing + " but hopes to eat " + feasting + ".");
    }

}
