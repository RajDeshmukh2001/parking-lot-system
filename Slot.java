public class Slot {
    private String id;
    private SlotSize size;
    private int floorNo;
    private boolean occupied;
    private String vehicleId;
    
    public String getId() {
        return id;
    }
    public SlotSize getSize() {
        return size;
    }
    public int getFloorNo() {
        return floorNo;
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
    public void setId(String id) {
        this.id = id;
    }
    public void setFloorNo(int floorNo) {
        this.floorNo = floorNo;
    }
    public void setSize(SlotSize size) {
        this.size = size;
    }
}
