import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class ParkingLot {
    Scanner sc = new Scanner(System.in);
    List<Slot> slots = new ArrayList<>();

    public void createParkingSlots(int noOfFloors) {
        for (int i = 1; i <= noOfFloors; i++) {
            int smallSlots = InputValidator.readValidInt("Enter number of Small size slots for " + i + " floor: ");
            for (int j = 0; j < smallSlots; j++) {
                String id = UUID.randomUUID().toString();
                slots.add(new Slot(id, SlotSize.SMALL, String.valueOf(i)));
            }

            int mediumSlots = InputValidator.readValidInt("Enter number of Medium size slots for " + i + " floor: ");
            for (int j = 0; j < mediumSlots; j++) {
                String id = UUID.randomUUID().toString();
                slots.add(new Slot(id, SlotSize.MEDIUM, String.valueOf(i)));
            }

            int largeSlots = InputValidator.readValidInt("Enter number of Large size slots for " + i + " floor: ");
            for (int j = 0; j < largeSlots; j++) {
                String id = UUID.randomUUID().toString();
                slots.add(new Slot(id, SlotSize.LARGE, String.valueOf(i)));
            }
        }
    }

    public List<Slot> getAllParkingSlots() { 
        return slots; 
    }
}