public class Lion extends Animal {

    public Lion(String hunting, String chasing, String feasting, String name, String color, String activity){
        super(hunting, chasing, feasting, name, color, activity);
    }

    public void roar(){
        System.out.println("king of the jungle is " + hunting + " for a " + chasing + " and hopes to feast on " + feasting+ ".") ;
    }

}
