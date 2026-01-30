public class Slot {
    private int id;
    public enum Type {
    SMALL, MEDIUM, LARGE
}
    private Type type;
    private int floorNo;
    private boolean occupied;
    private String vehicleId;
    
    public int getId() {
        return id;
    }
    public Type getType() {
        return type;
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
    
}
