import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ParkingLot {
    List<Vehicle> vehicleList=new ArrayList<>();
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
    public void parkVehicleInSlot(Bike bike, Slot slot) {
        slot.setOccupied(true);
        vehicleList.add(bike);
        slot.setVehicleId(bike.getId());
    }
    public void parkVehicleInSlot(Car car, Slot slot) {
        slot.setOccupied(true);
        vehicleList.add(car);
        slot.setVehicleId(car.getId());
    }
    public void parkVehicleInSlot(Truck truck, Slot slot) {
        slot.setOccupied(true);
        vehicleList.add(truck);
        slot.setVehicleId(truck.getId());
    }
}

