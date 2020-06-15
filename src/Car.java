public class Car extends Vehicle {

    //private int property for milesPerGallon
    private int milesPerGallon;

    //make a constructor that calls the vehicle constructor to
    //set all of the inherited fields and sets the milesPerGallon
    public Car(int milesPerGallon) {
        super(true, 4, "gasoline");
        this.milesPerGallon = milesPerGallon;
    }

    //add getters and setters for milesPerGallon
    public int getMilesPerGallon() {
        return milesPerGallon;
    }

    public void setMilesPerGallon(int milesPerGallon) {
        this.milesPerGallon = milesPerGallon;
    }

    //add a void deployAirBag() that will sout a message "Deploying airbag..."
    public void deployAirbag() {
        System.out.println("Deploying airbag...");
    }

    //add a .toString() method with IntelliJ
    @Override
    public String toString() {
        return "Car{" +
                "milesPerGallon = " + milesPerGallon +
                "} " + super.toString();
    }
}
