import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class FeeCalculator {
    
   
    public double calculateParkingFee(LocalDateTime entryTime, LocalDateTime exitTime, SlotSize slotSize) {
        
        // Calc mins between entry and exit
        long totalMinutes = ChronoUnit.MINUTES.between(entryTime, exitTime);
        
    
        if (totalMinutes == 0) {
            totalMinutes = 1;
        }
        
        // mins to hrs
        double hours = totalMinutes / 60.0; 
        
        
        double ratePerHour = 0;
        if (slotSize == SlotSize.SMALL) {
            ratePerHour = 100;
        } else if (slotSize == SlotSize.MEDIUM) {
            ratePerHour = 150;
        } else if (slotSize == SlotSize.LARGE) {
            ratePerHour = 200;
        }
        
        double totalFee = hours * ratePerHour;
        return totalFee;
    }
}