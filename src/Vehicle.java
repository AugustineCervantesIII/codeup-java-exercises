public class Vehicle {

    private String Vehicle;
    private boolean isOperable;
    private int passengerCapacity;
    private String powerSource;

    public String getVehicle() {
        return Vehicle;
    }

    public void setVehicle(String vehicle) {
        this.Vehicle = vehicle;
    }

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
        return  "Vehicle type: " + Vehicle + "\nIs operable: " + isOperable +
                "\nHow many passengers does it hold: " + passengerCapacity +
                "\nWhat powers this Vehicle: " + powerSource;
    }

}
