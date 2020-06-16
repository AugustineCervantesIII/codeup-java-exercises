public class Vehicle {

    private boolean isOperable;
    private int passengerCapacity;
    private String powerSource;


    public boolean getOperable() {
        return isOperable;
    }

    public void setOperable(boolean isOperable){
        this.isOperable = isOperable;
    }


    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public String getPowerSource(){
        return powerSource;
    }

    public void setPowerSource(String powerSource) {
        this.powerSource = powerSource;
    }

    @Override
    public String toString(){
        return  "Is operable: " + isOperable +
                "\nHow many passengers does it hold: " + passengerCapacity +
                "\nWhat powers this Vehicle: " + powerSource;
    }

    public Vehicle(boolean isOperable, int passengerCapacity, String powerSource){
        this.isOperable = isOperable;
        this.passengerCapacity = passengerCapacity;
        this.powerSource = powerSource;
    }

    //mini exercise 4
//In your Vehicle class, add a void method, turnOn(), that prints the message "Vehicle is turning on...".
//In your Jet class, override the turnOn() method to print the message "Igniting jet engines..."
//In your Car class, override the turnOn() method to print the message "Cranking engine..."
//In our vehicle test class, add a method, turn on vehicles, that takes in an array of vehicles and invokes the turnOn() method for all of them.


    //mini exercise 5
//    Super keyword uses...
//            - when used in a subclass method other than a constructor, it allows the subclass method to invoke the parent class method implementation
//  - when used in a subclass constructor, will invoke a parent constructor but has to be the first statement within the subclass constructor
//    Final keyword uses...
//            - when used on a class, it prevents any classes from extending from it
//  - when used on a method, the method cannot be overwritten
//  - when used on a property, it creates a constant
//-- !! MINI-EXERCISE 5 !!
//    Add a method of genericTurnOn to both the Jet class and the Car class (not the Vehicle class). When invoked, it should print out "Vehicle is turning on...". How can the parent version of the turnOn method be used to do this?
//    Experiment with the three uses for the final keyword using the Vehicle and Car classes. These three uses again are...
//            1. Create a constant
//  2. Prevent method overriding
//  3. Prevent inheritance (edited)
}
