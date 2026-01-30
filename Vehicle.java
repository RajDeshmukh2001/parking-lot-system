public abstract class Vehicle {
    private String id;
    private String registrationNumber; 
    private String inTimeStamp; 
    private String outTimeStamp; 
    private String slotId; 

    public Vehicle(String id, String registrationNumber) { 
        this.id = id; 
        this.registrationNumber = registrationNumber; 
        this.inTimeStamp = java.time.LocalDateTime.now().toString(); 
        this.outTimeStamp = null; 
        this.slotId = null;
    }

    public void setOutTimeStamp(String outTimeStamp) {
        this.outTimeStamp = outTimeStamp;
    }
    public void setSlotId(String slotId) {
        this.slotId = slotId;
    }

}