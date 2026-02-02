import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    List<Vehicle> vehicleList=new ArrayList<>();

    public void parkVehicleInSlot(Bike bike, Slot slot) {
        slot.setOccupied(true);
        vehicleList.add(bike);
        slot.setVehicleId(bike.getId());
    }
}
