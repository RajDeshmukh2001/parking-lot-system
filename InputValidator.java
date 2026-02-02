import java.util.Scanner;

public class InputValidator {

    static Scanner scanner = new Scanner(System.in);
    
    public static boolean isValidVehicleRegistrationNumber(String vehicleNumber) {
        //for indian vehicle number validation
        vehicleNumber=vehicleNumber.trim().toUpperCase();
        String vehicleNumberPattern = "^[A-Z]{2}\\s?[0-9]{1,2}\\s?[A-Z]{1,2}\\s?[0-9]{3,4}$";
        return vehicleNumber.matches(vehicleNumberPattern);
    }

    /**
     * Prompts the user until a valid integer is entered.
     *
     * @param message prompt shown to the user
     * @return the validated integer input
     */
    public static int readValidInt(String message) {
        int value;
        while (true) {
            System.out.print(message);
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                break;
            } else {
                System.out.println("Invalid input. Please enter numbers only.");
                scanner.next(); 
            }
        }
        return value;
    }
}