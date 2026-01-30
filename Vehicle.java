public abstract class Vehicle {
    private String id;
    private String registrationNumber; 
    private String inTimeStamp; 
    private String outTimeStamp; 
    private String slotId; 

    public Vehicle(String id, String registrationNumber, String slotId) {
        this.id = id;
        this.registrationNumber = registrationNumber;
        this.slotId = slotId;
        this.inTimeStamp = java.time.LocalDateTime.now().toString();
    }
    public String getId() {
        return id;
    }
    public String getRegistrationNumber() {
        return registrationNumber;
    }
    public String getInTimeStamp() {
        return inTimeStamp;
    }
    public String getOutTimeStamp() {
        return outTimeStamp;
    }
    public String getSlotId() {
        return slotId;
    }
}