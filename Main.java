import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ParkingLotService parkingLotService = new ParkingLotService();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Parking Lot System!");
        ParkingLot parkingLot = new ParkingLot();

        int numberOfFloors = InputValidator.readValidInt("Enter the number of floors: ");
        parkingLot.createParkingSlots(numberOfFloors);

        while (true) {
            System.out.println("1. Park Vehicle");
            System.out.println("2. Checkout Vehicle");
            System.out.println("3. Exit");

            int choice = InputValidator.readValidInt("Enter your choice (1 to 3): ");

            switch (choice) {

                case 1:
                    // Park
                    break;

                case 2:
                    ///checkout
                    System.out.print("Enter Vehicle Registration Number (e.g. KA01AB1234): ");
                    String registrationNumber = scanner.nextLine().trim().toUpperCase();

                    if (registrationNumber.isEmpty()) {
                        System.out.println("Registration number cannot be empty");
                        break;
                    }
                    if (!registrationNumber.matches("[A-Z]{2}[0-9]{2}[A-Z]{2}[0-9]{4}")) {
                        System.out.println("Invalid registration number format. Example: KA01AB1234");
                        break;
                    }
                    LocalDateTime exitTime = LocalDateTime.now();
                    parkingLotService.checkoutVehicle(registrationNumber, exitTime);
                    break;

                case 3:
                    scanner.close();
                    System.out.println("Exiting system!");
                    return;

                default:
                    System.out.println("Invalid choice.");
                    break;
            }

        }
    }
}
