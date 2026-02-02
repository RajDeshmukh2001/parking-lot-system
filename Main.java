import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to the Parking Lot System!");
        Scanner scanner = new Scanner(System.in);
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
                    // Checkout
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
