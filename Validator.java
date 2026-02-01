import java.util.Scanner;

public class Validator {

    public static int readInt(Scanner scanner, String message) {
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
