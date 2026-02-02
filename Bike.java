import java.time.Duration;
import java.time.LocalDateTime;

public class Bike extends Vehicle {
     public Bike(String registrationNumber, String slotId) {
        super(registrationNumber, slotId);
    }
    @Override
    public String feeCalculation(String hourlyRate){
        if (getOutTimeStamp() == null) {
            setOutTimeStamp(LocalDateTime.now());
        }
        Duration duration = Duration.between(getInTimeStamp(), getOutTimeStamp());
        long totalMinutes = duration.toMinutes();
        double ratePerMinute = Double.parseDouble(hourlyRate) / 60.0;
        int fee =  (int) Math.ceil(totalMinutes * ratePerMinute);
        return String.format("₹%d", fee);
    }
}
