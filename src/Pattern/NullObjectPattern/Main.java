package Pattern.NullObjectPattern;

public class Main {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();
        Vehicle bike =  vehicleFactory.getObject("Bike");
        printObject(bike);
    }

    private static void printObject(Vehicle bike) {
        System.out.println(bike.getSeat());
        System.out.println(bike.getTank());
    }
}
