import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to the Parking Lot Management System");

        Scanner scanner = new Scanner(System.in);
        ParkingLot parkingLot = new ParkingLot();

        int floors = Validator.readInt(scanner, "Enter number of Floors: ");

        for (int i = 1; i <= floors; i++) {
            System.out.println();
            System.out.println("Floor " + i);

            int small = Validator.readInt(scanner, "Small slots: ");
            int medium = Validator.readInt(scanner, "Medium slots: ");
            int large = Validator.readInt(scanner, "Large slots: ");

            for (int j = 0; j < small; j++) {
                parkingLot.addSlot(SlotSize.SMALL, String.valueOf(i));
            }
            for (int j = 0; j < medium; j++) {
                parkingLot.addSlot(SlotSize.MEDIUM, String.valueOf(i));
            }
            for (int j = 0; j < large; j++) {
                parkingLot.addSlot(SlotSize.LARGE, String.valueOf(i));
            }
        }

        while (true) {
            System.out.println();
            System.out.println("1. Park Vehicle");
            System.out.println("2. Checkout Vehicle");
            System.out.println("3. Exit");

            int choice = Validator.readInt(scanner,"Enter your choice (numbers 1 to 3): ");
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
                    System.out.println("Invalid choice. Please select between 1 and 3.");
            }
        }

    }
}