import java.util.Scanner;

public class InputValidator {
    static Scanner scanner = new Scanner(System.in);

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
