import java.util.List;

public class ParkingLotService {
    private static  ParkingLot parkingLot = new ParkingLot();
    public static boolean isSlotAvailableBySlotSize(SlotSize slotSize) {
        List<Slot> slots=parkingLot.getAllParkingSlots();
        for(Slot slot:slots) {
            if(!slot.isOccupied() && slot.getSize()==slotSize) {
                return true;
            }
        }
        return false;
    }

    public static boolean isSlotAvailableByVehicleType(String vehicleType) {
        boolean slotAvailableStatus= false;
        
        switch (vehicleType) {
            case "bike":
                slotAvailableStatus=isSlotAvailableBySlotSize(SlotSize.SMALL);
                return slotAvailableStatus;
            case "car":
                slotAvailableStatus=isSlotAvailableBySlotSize(SlotSize.MEDIUM);
                if(!slotAvailableStatus) {
                    return slotAvailableStatus=isSlotAvailableBySlotSize(SlotSize.LARGE);
                }
                return slotAvailableStatus;
            case "truck":
                slotAvailableStatus=isSlotAvailableBySlotSize(SlotSize.LARGE);
                return slotAvailableStatus;
            default:
                return false;
        }
    }

    public static void parkVehicle(String vehicleType, String vehicleRegistrationNumber) {
        //first the first available slot for the vehicle type is found
        //the first floor slots will be checked first and filled and so does for other floors
        List<Slot> slots=parkingLot.getAllParkingSlots();
        //the slots is alread sorted by floor number while creating parking lot
        
        for(Slot slot:slots) {
            if(!slot.isOccupied()) {
                if(vehicleType.equals("bike") && slot.getSize()==SlotSize.SMALL) {
                    Bike bike=new Bike( vehicleRegistrationNumber, slot.getId());
                    parkingLot.parkVehicleInSlot(bike, slot);
                    System.out.println("Bike parked in slot: "+slot.getId());
                    return;
                }
                else if(vehicleType.equals("car") && (slot.getSize()==SlotSize.MEDIUM || slot.getSize()==SlotSize.LARGE)) {
                    Car car=new Car( vehicleRegistrationNumber, slot.getId());
                    parkingLot.parkVehicleInSlot(car, slot);
                    System.out.println("Car parked in slot: "+slot.getId());
                    return;
                }
                else if(vehicleType.equals("truck") && slot.getSize()==SlotSize.LARGE) {
                    Truck truck=new Truck( vehicleRegistrationNumber, slot.getId());
                    parkingLot.parkVehicleInSlot(truck, slot);
                    System.out.println("Truck parked in slot: "+slot.getId());
                    return;
                }
            }
        }
    }
}