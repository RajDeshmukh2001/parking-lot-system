import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to the Parking Lot System!");
        ParkingLot parkingLot = new ParkingLot();
        // Create an instance of the service
        ParkingLotService parkingLotService = new ParkingLotService(); 
        
        Scanner scanner = new Scanner(System.in);
        int numberOfFloors = InputValidator.readValidInt("Enter the number of floors: ");
        parkingLot.createParkingSlots(numberOfFloors);

        while (true) {
            System.out.println("1. Park Vehicle");
            System.out.println("2. Checkout Vehicle");
            System.out.println("3. Exit");

            int choice = InputValidator.readValidInt("Enter your choice (1 to 3): ");

            switch (choice) {
                
                case 1: //park vehicle
                    String vehicleType = takeVehicleTypeInput(scanner);
                    // Updated to call instance method and pass parkingLot
                    boolean slotAvailableStatus = parkingLotService.isSlotAvailableByVehicleType(parkingLot, vehicleType);
                    
                    if (!slotAvailableStatus) {
                        System.out.println("The slot for vehicle is not available");
                    } else {
                        System.out.println("The slot for vehicle is available");
                    }

                    String vehicleRegistrationNumber = takeVehicleRegistrationNumberInput(scanner);
                    if (vehicleRegistrationNumber.isEmpty()) {
                        System.out.println("Vehicle registration number input is empty.");
                        break;
                    }
                    if (InputValidator.isVehicleAlreadyParked(parkingLot, vehicleRegistrationNumber)) {
                        System.out.println("Vehicle with registration number " + vehicleRegistrationNumber + " is already parked.");
                        break;
                    }
                    parkingLotService.parkVehicle(parkingLot, vehicleType, vehicleRegistrationNumber);
                    break;

                case 2:
                    // Checkout
                    break;

                case 3:
                    System.out.println("Exiting system!");
                    return;

                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }
    
    private static String takeVehicleTypeInput(Scanner scanner) {
        String vehicleType = "";
        while (true) {
            System.out.println("1. Car");
            System.out.println("2. Bike");
            System.out.println("3. Truck");
            System.out.println("4. Back to Main Menu");
            System.out.print("Enter vehicle type (1-4): ");
            String vehicleTypeMenuOption = scanner.nextLine().trim();
            switch (vehicleTypeMenuOption) {
                case "1": 
                    System.out.println("Car selected.");
                    vehicleType = "car";
                    break;
                case "2":
                    System.out.println("Bike selected.");
                    vehicleType = "bike";
                    break;
                case "3":
                    System.out.println("Truck selected.");
                    vehicleType = "truck";
                    break;
                case "4":
                    System.out.println("Returning to Main Menu.");
                    break;
                default:
                    System.out.println("Invalid vehicle type! Please try again.");
                    continue;
            }
            break;
        }
        return vehicleType;
    }

    private static String takeVehicleRegistrationNumberInput(Scanner scanner) {
        String vehicleRegistrationNumber;
        while (true) {
            System.out.print("Enter vehicle registration number: ");
            vehicleRegistrationNumber = scanner.nextLine().trim().toUpperCase();
            boolean isValidVehicleRegistrationNumber = InputValidator.isValidVehicleRegistrationNumber(vehicleRegistrationNumber);
            if (!isValidVehicleRegistrationNumber) {
                System.out.println("Invalid vehicle registration number! Please try again.");
                System.out.println("Valid format <state code> <rto code> <two alphabets> <four digits> e.g., KA 01 AB 1234");
            } else {
                break;
            }
        }
        return vehicleRegistrationNumber;
    }
}
