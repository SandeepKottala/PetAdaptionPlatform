package adopt.shelter;

public class ShelterCapacityExceededException extends Exception {
    public ShelterCapacityExceededException(String message) {
        super(message);
    }
}