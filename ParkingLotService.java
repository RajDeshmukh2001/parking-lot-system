import java.util.List;

public class ParkingLotService {
    private static  ParkingLot parkingLot = new ParkingLot();
    public static boolean isSlotAvailableBySlotSize(SlotSize slotSize) {
        List<Slot> slots=parkingLot.getSlots();
        for(Slot slot:slots) {
            if(!slot.isOccupied() && slot.getSize()==slotSize) {
                return true;
            }
        }
        return false;
    }
}
