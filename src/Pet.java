public class Pet {

    //profile
    String name;
    String color;
    String activity;

    public Pet(String name, String color, String activity){
        super();
        this.name = name;
        this.color = color;
        this.activity = activity;
    }

    public void eat(){
        System.out.println("eating...");
    }

    public void sleep(){
        System.out.println("sleeping...");
    }

}
