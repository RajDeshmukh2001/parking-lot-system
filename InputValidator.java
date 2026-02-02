public class InputValidator {
    
    public static boolean isValidVehicleRegistrationNumber(String vehicleNumber) {
        //for indian vehicle number validation
        vehicleNumber=vehicleNumber.trim().toUpperCase();
        String vehicleNumberPattern = "^[A-Z]{2}\\s?[0-9]{1,2}\\s?[A-Z]{1,2}\\s?[0-9]{3,4}$";
        return vehicleNumber.matches(vehicleNumberPattern);
    }
}
