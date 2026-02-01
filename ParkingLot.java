import java.util.*;

public class ParkingLot {

    private List<Slot> slotList = new ArrayList<>();

    public void addSlot(SlotSize size, String floorNumber) {
        Slot slot = new Slot();
        slot.setId(UUID.randomUUID().toString());
        slot.setSize(size);
        slot.setFloorNumber(floorNumber);
        slot.setOccupied(false);
        slotList.add(slot);
    }
}
