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

}
