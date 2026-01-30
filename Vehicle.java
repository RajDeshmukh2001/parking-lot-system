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

}