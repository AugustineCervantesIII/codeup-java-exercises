package Appliances;

//walkthrough
public class Refrigerator extends Appliance{
    public Refrigerator(String brand, String color){
        super(brand, color);
    }

    @Override
    public void makeSound() {
        System.out.println("~ ominous buzzing ~");
    }

    @Override
    public void doWork() {
        System.out.println("~ keep it chill ~");
    }
}