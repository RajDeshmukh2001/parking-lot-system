public class Slot {
    private int id;
    public enum Size {
    SMALL, MEDIUM, LARGE
}
    private Size size;
    private int floorNo;
    private boolean occupied;
    private String vehicleId;
    
    public int getId() {
        return id;
    }
    public Size getSize() {
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
    public void setId(int id) {
        this.id = id;
    }
    public void setFloorNo(int floorNo) {
        this.floorNo = floorNo;
    }
    public void setSize(Size size) {
        this.size = size;
    }
}
