public class VehicleTest {

    public static void main(String[] args){
        Vehicle v = new Vehicle();
        Car c = new Car();
        Jet j = new Jet();

        v.setVehicle("Electric car");
        v.setOperable(true);
        v.setPassengerCapacity(4);
        v.setPowerSource("battery");

        c.setVehicle("Car");
        c.setOperable(true);
        c.setPassengerCapacity(4);
        c.setPowerSource("gasoline");

        j.setVehicle("Jet");
        j.setOperable(false);
        j.setPassengerCapacity(2);
        j.setPowerSource("jet fuel");

        System.out.println(v.toString());
        System.out.println("-----");
        System.out.println(c.toString());
        System.out.println("-----");
        System.out.println(j.toString());

    }

}
