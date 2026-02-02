import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class ParkingLot {
    Scanner sc = new Scanner(System.in);
    List<Slot> slots = new ArrayList<>();

    public void createParkingSlots(String noOfFloors) {
        for (int i = 1; i <= Integer.parseInt(noOfFloors); i++) {
            System.out.println("Enter number of slots for Small size for " + i + " floor");
            String smallSlots = sc.nextLine();
            for (int j = 0; j < Integer.parseInt(smallSlots); j++) {
                String id = UUID.randomUUID().toString();
                slots.add(new Slot(id, SlotSize.SMALL, String.valueOf(i)));
            }

            System.out.println("Enter number of slots for Medium size for " + i + " floor");
            String mediumSlots = sc.nextLine();
            for (int j = 0; j < Integer.parseInt(mediumSlots); j++) {
                String id = UUID.randomUUID().toString();
                slots.add(new Slot(id, SlotSize.MEDIUM, String.valueOf(i)));
            }

            System.out.println("Enter number of slots for Large size for " + i + " floor");
            String largeSlots = sc.nextLine();
            for (int j = 0; j < Integer.parseInt(largeSlots); j++) {
                String id = UUID.randomUUID().toString();
                slots.add(new Slot(id, SlotSize.LARGE, String.valueOf(i)));
            }
        }
    }

    public List<Slot> getAllParkingSlots() { 
        return slots; 
    }
}