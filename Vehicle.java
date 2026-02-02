import java.time.LocalDateTime;

import static java.util.UUID.randomUUID;

public abstract class Vehicle {
    private String id= randomUUID().toString();
    private String registrationNumber; 
    private LocalDateTime inTimeStamp; 
    private LocalDateTime outTimeStamp; 
    private String slotId; 

    public Vehicle(String registrationNumber, String slotId) {
        this.id = randomUUID().toString();
        this.registrationNumber = registrationNumber;
        this.slotId = slotId;
        this.inTimeStamp = LocalDateTime.now();
        this.outTimeStamp = null;
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
