import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot();

        System.out.println("Welcome to the Parking Lot System!");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Park Vehicle");
            System.out.println("2. Checkout Vehicle");
            System.out.println("3. Exit");
            System.out.print("Enter your choice(in numbers from 1 to 3): ");

            int choice = scanner.nextInt();
            scanner.nextLine();
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
