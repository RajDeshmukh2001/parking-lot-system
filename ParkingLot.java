import java.util.*;

public class ParkingLot {

    private List<Slot> slotList = new ArrayList<>();

    public void addSlot(SlotSize size, String floorNumber) {
        slotList.add(new Slot(UUID.randomUUID().toString(), size, floorNumber));
    }
}
