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

}
