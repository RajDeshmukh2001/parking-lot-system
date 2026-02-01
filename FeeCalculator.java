import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class FeeCalculator {
    
    // Calculate fee based on actual minutes
    public double calculateParkingFee(LocalDateTime entryTime, LocalDateTime exitTime, SlotSize slotSize) {
        
        // Calculate total minutes between entry and exit
        long totalMinutes = ChronoUnit.MINUTES.between(entryTime, exitTime);
        
        // Minimum 1 minute charge
        if (totalMinutes == 0) {
            totalMinutes = 1;
        }
        
        // Convert minutes to hours (decimal)
        double hours = totalMinutes / 60.0;  // Use 60.0 to get decimal value
        
        // Get rate based on slot size
        double ratePerHour = 0;
        if (slotSize == SlotSize.SMALL) {
            ratePerHour = 100;
        } else if (slotSize == SlotSize.MEDIUM) {
            ratePerHour = 150;
        } else if (slotSize == SlotSize.LARGE) {
            ratePerHour = 200;
        }
        
        // Total fee = hours * rate (proportional to actual time)
        double totalFee = hours * ratePerHour;
        return totalFee;
    }
}