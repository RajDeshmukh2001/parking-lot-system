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
}
