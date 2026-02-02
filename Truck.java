import java.time.Duration;
import java.time.LocalDateTime;

public class Truck extends Vehicle {
    public Truck(String id, String registrationNumber, String slotId) {
        super(id, registrationNumber, slotId);
    }
    private static final double RATE_PER_HOUR = 200.0;
    @Override
    public String feeCalculation() {
        if (getOutTimeStamp() == null) {
            setOutTimeStamp(LocalDateTime.now());
        }
        Duration duration = Duration.between(getInTimeStamp(), getOutTimeStamp());
        long totalMinutes = duration.toMinutes();
        double ratePerMinute = RATE_PER_HOUR / 60;
        int fee = (int) (totalMinutes * ratePerMinute);
        return String.format("₹%d", fee);
    }
}
