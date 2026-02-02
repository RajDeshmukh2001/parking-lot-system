import java.time.Duration;
import java.time.LocalDateTime;

public class Truck extends Vehicle {
    public Truck(String id, String registrationNumber, String slotId) {
        super(id, registrationNumber, slotId);
    }
    @Override
    public String feeCalculation(String rate) {
        if (getOutTimeStamp() == null) {
            setOutTimeStamp(LocalDateTime.now());
        }
        Duration duration = Duration.between(getInTimeStamp(), getOutTimeStamp());
        long totalMinutes = duration.toMinutes();
        double ratePerMinute = Double.parseDouble(rate) / 60;
        int fee = (int) (totalMinutes * ratePerMinute);
        return String.format("₹%d", fee);
    }
}
