import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) throws InterruptedException {

        List<Vehicle> vehicles = new ArrayList<>();

        Vehicle bike = new Bike("B1", "KA01BIKE123", "1");
        Vehicle car = new Car("C1", "KA01CAR123", "2");
        Vehicle truck = new Truck("T1", "KA01TRUCK123", "3");

        vehicles.add(bike);
        vehicles.add(car);
        vehicles.add(truck);
        System.out.println("Vehicles have entered the parking lot.");
        System.out.println("waiting for 2 minutes to simulate parking duration");
        Thread.sleep(2 * 60 * 1000);

        // Assume rates per hour
        String bikeRate = "50";
        String carRate = "100";
        String truckRate = "200";

        // Calculate and print fees
        for (Vehicle vehicle : vehicles) {
            String rate;

            if (vehicle instanceof Bike) {
                rate = bikeRate;
            } else if (vehicle instanceof Car) {
                rate = carRate;
            } else {
                rate = truckRate;
            }

            System.out.println(
                vehicle.getClass().getSimpleName() +
                " Fee: " +
                vehicle.feeCalculation(rate)
            );
        }
    }
}
