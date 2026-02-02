public class Slot {
    private String id;
    private SlotSize size;
    private String floorNumber;
    private boolean occupied = false;
    private String vehicleId=null;

    public String getId() {
        return id;
    }
    public SlotSize getSize() {
        return size;
    }
    public String getFloorNumber() {
        return floorNumber;
    }
    public boolean isOccupied() {
        return occupied;
    }
    public String getVehicleId() {
        return vehicleId;
    }
    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }
    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }
    public void setFloorNumber(String floorNumber) {
        this.floorNumber = floorNumber;
    }
    public void setSize(SlotSize size) {
        this.size = size;
    }
}
