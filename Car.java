public class Car extends Vehicle {
    public Car(String id, String registrationNumber, String slotId) {
        setId(id);
        setRegistrationNumber(registrationNumber);
        setInTimeStamp();
        setSlotId(slotId);
    }
}
