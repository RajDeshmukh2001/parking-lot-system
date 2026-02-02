import java.time.LocalDateTime;

public abstract class Vehicle {
    private String id;
    private String registrationNumber; 
    private LocalDateTime inTimeStamp; 
    private LocalDateTime outTimeStamp; 
    private String slotId; 
    abstract String feeCalculation(String rate);

    public Vehicle(String id, String registrationNumber, String slotId) {
        this.id = id;
        this.registrationNumber = registrationNumber;
        this.slotId = slotId;
        this.inTimeStamp = LocalDateTime.now();
    }
    public void setOutTimeStamp(LocalDateTime outTimeStamp) {
        this.outTimeStamp = outTimeStamp;
    }
    public String getId() {
        return id;
    }
    public String getRegistrationNumber() {
        return registrationNumber;
    }
    public LocalDateTime getInTimeStamp() {
        return inTimeStamp;
    }
    public LocalDateTime getOutTimeStamp() {
        return outTimeStamp;
    }
    public String getSlotId() {
        return slotId;
    }
}