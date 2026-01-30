public abstract class Vehicle {
    private String id;
    private String registrationNumber; 
    private String inTimeStamp; 
    private String outTimeStamp; 
    private String slotId; 

    public void setOutTimeStamp(String outTimeStamp) {
        this.outTimeStamp = outTimeStamp;
    }
    public void setSlotId(String slotId) {
        this.slotId = slotId;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
    public void setInTimeStamp(String inTimeStamp) {
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