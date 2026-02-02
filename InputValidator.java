public class InputValidator {
    
    public static boolean isValidVehicleNumber(String vehicleNumber) {
        //for indian vehicle number validation
        String vehicleNumberPattern = "^[A-Z]{2}\\s?[0-9]{1,2}\\s?[A-Z]{1,2}\\s?[0-9]{1,2,3,4}$";
        return vehicleNumber.matches(vehicleNumberPattern);
    }
}
