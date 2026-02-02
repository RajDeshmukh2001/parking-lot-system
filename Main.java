import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

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
                
                case 1: //park vehicle

                    String vehicleType = null;
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
                                vehicleType="car";
                                break;
                            case "2":
                                System.out.println("Bike selected.");
                                vehicleType="bike";
                                break;
                            case "3":
                                System.out.println("Truck selected.");
                                vehicleType="truck";
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
                    boolean slotAvailableStatus=ParkingLotService.isSlotAvailableByVehicleType(vehicleType);
                    if(!slotAvailableStatus){
                        System.out.println("The slot for vehicle is not available");
                    }
                    //validate vehicle number


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
