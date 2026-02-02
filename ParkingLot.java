import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ParkingLot {
    List<Slot> slots = new ArrayList<>();

    public void createParkingSlots(int numberOfFloors) {
        for (int floorNumber = 1; floorNumber <= numberOfFloors; floorNumber++) {
            int smallSlotCount = InputValidator.readValidInt("Enter number of Small size slots for " + floorNumber + " floor: ");
            for (int slotIndex = 0; slotIndex < smallSlotCount; slotIndex++) {
                String id = UUID.randomUUID().toString();
                slots.add(new Slot(id, SlotSize.SMALL, String.valueOf(floorNumber)));
            }

            int mediumSlotCount = InputValidator.readValidInt("Enter number of Medium size slots for " + floorNumber + " floor: ");
            for (int slotIndex = 0; slotIndex < mediumSlotCount; slotIndex++) {
                String id = UUID.randomUUID().toString();
                slots.add(new Slot(id, SlotSize.MEDIUM, String.valueOf(floorNumber)));
            }

            int largeSlotCount = InputValidator.readValidInt("Enter number of Large size slots for " + floorNumber + " floor: ");
            for (int slotIndex = 0; slotIndex < largeSlotCount; slotIndex++) {
                String id = UUID.randomUUID().toString();
                slots.add(new Slot(id, SlotSize.LARGE, String.valueOf(floorNumber)));
            }
        }
    }

    public List<Slot> getAllParkingSlots() { 
        return slots; 
    }
}