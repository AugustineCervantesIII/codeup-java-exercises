public class Jet extends Vehicle {

    //private int property for maximumAltitude
    private int maxAltitude;

    //add a void method takeOff() that will sout a message "Taking off..."
    public void takeOff() {
        System.out.println("Taking off...no");
    }

    //make a constructor that calls the vehicle constructor to set all of the
    //inherited fields and sets the maximumAltitude
    public Jet(int maxAltitude) {
        super(false, 2, "jet fuel");
        this.maxAltitude = maxAltitude;
    }

    //add getters and setters for maximumAltitude
    public int getMaxAltitude() {
        return this.maxAltitude;
    }

    //add a .toString() method with IntelliJ
    public void setMaxAltitude(int maxAltitude) {
        this.maxAltitude = maxAltitude;
    }

    @Override
    public String toString() {
        return "Jet{" +
                "maxAltitude = " + maxAltitude +
                "} " + super.toString();
    }
}