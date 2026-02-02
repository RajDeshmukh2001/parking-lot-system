import java.util.List;

public class ParkingLotService {
    // REMOVED: private static ParkingLot parkingLot = new ParkingLot(); 

    public boolean isSlotAvailableBySlotSize(ParkingLot parkingLot, SlotSize slotSize) {
        List<Slot> slots = parkingLot.getAllParkingSlots();
        for (Slot slot : slots) {
            if (!slot.isOccupied() && slot.getSize() == slotSize) {
                return true;
            }
        }
        return false;
    }

    public boolean isSlotAvailableByVehicleType(ParkingLot parkingLot, String vehicleType) {
        boolean slotAvailableStatus = false;
        
        switch (vehicleType) {
            case "bike":
                slotAvailableStatus = isSlotAvailableBySlotSize(parkingLot, SlotSize.SMALL);
                return slotAvailableStatus;
            case "car":
                slotAvailableStatus = isSlotAvailableBySlotSize(parkingLot, SlotSize.MEDIUM);
                if (!slotAvailableStatus) {
                    return slotAvailableStatus = isSlotAvailableBySlotSize(parkingLot, SlotSize.LARGE);
                }
                return slotAvailableStatus;
            case "truck":
                slotAvailableStatus = isSlotAvailableBySlotSize(parkingLot, SlotSize.LARGE);
                return slotAvailableStatus;
            default:
                return false;
        }
    }

    public void parkVehicle(ParkingLot parkingLot, String vehicleType, String vehicleRegistrationNumber) {
        List<Slot> slots = parkingLot.getAllParkingSlots();
        
        for (Slot slot : slots) {
            if (!slot.isOccupied()) {
                if (vehicleType.equals("bike") && slot.getSize() == SlotSize.SMALL) {
                    Bike bike = new Bike(vehicleRegistrationNumber, slot.getId());
                    parkingLot.parkVehicleInSlot(bike, slot);
                    System.out.println("Bike parked in slot: " + slot.getId());
                    return;
                }
                else if (vehicleType.equals("car") && (slot.getSize() == SlotSize.MEDIUM || slot.getSize() == SlotSize.LARGE)) {
                    Car car = new Car(vehicleRegistrationNumber, slot.getId());
                    parkingLot.parkVehicleInSlot(car, slot);
                    System.out.println("Car parked in slot: " + slot.getId());
                    return;
                }
                else if (vehicleType.equals("truck") && slot.getSize() == SlotSize.LARGE) {
                    Truck truck = new Truck(vehicleRegistrationNumber, slot.getId());
                    parkingLot.parkVehicleInSlot(truck, slot);
                    System.out.println("Truck parked in slot: " + slot.getId());
                    return;
                }
            }
        }
    }
}