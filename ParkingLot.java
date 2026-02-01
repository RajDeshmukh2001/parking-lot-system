import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ParkingLot {
    private List<Slot> slotList = new ArrayList<>();
    private List<Vehicle> vehicleList = new ArrayList<>();
    private FeeCalculator feeCalculator = new FeeCalculator();

    public void addSlot(SlotSize size, String floorNumber) {
        Slot slot = new Slot();
        slot.setId(UUID.randomUUID().toString());
        slot.setSize(size);
        slot.setFloorNumber(floorNumber);
        slot.setOccupied(false);
        slotList.add(slot);
    }

    public Vehicle findVehicleByRegistration(String registrationNumber) {
        for (Vehicle vehicle : vehicleList) {
            if (vehicle.getRegistrationNumber().equals(registrationNumber)) {
                return vehicle;
            }
        }
        return null;
    }
   public void checkoutVehicle(String registrationNumber, LocalDateTime exitTime) {
    
    Vehicle vehicle = findVehicleByRegistration(registrationNumber);
    
    if (vehicle == null) {
        System.out.println("Vehicle with registration number " + registrationNumber + "  is not found");
        return;
    }
    
    vehicle.setOutTimeStamp(exitTime);
    
    String slotId = vehicle.getSlotId();
    
    Slot slot = null;
    for (Slot s : slotList) {
        if (s.getId().equals(slotId)) {
            slot = s;
            break;
        }
    }
    
    if (slot == null) {
        System.out.println("Error: Slot not found");
        return;
    }
    
    double fee = feeCalculator.calculateParkingFee(
        vehicle.getInTimeStamp(), 
        vehicle.getOutTimeStamp(), 
        slot.getSize()
    );
    
    printReceipt(vehicle, slot, fee);
    
    slot.setOccupied(false);
    slot.setVehicleId(null);
    
    vehicleList.remove(vehicle);
    
    System.out.println("Vehicle checked out successfully");
}
    
   private void printReceipt(Vehicle vehicle, Slot slot, double fee) {
    
    System.out.println("\nParking Receipt");
    System.out.println("Vehicle ID: " + vehicle.getId());
    System.out.println("VehicleRegistration Number: " + vehicle.getRegistrationNumber());
    System.out.println("Slot: " + slot.getId());
    System.out.println("Floor: " + slot.getFloorNumber());
    System.out.println("Slot Type: " + slot.getSize());
    System.out.println("Entry Time: " + vehicle.getInTimeStamp());
    System.out.println("Exit Time: " + vehicle.getOutTimeStamp());
    System.out.println("Total Fee: Rs " + fee);
}
}
