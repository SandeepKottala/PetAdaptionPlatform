package adopt.user.adopter;

public class AdoptionLimitExceededException extends Exception {
    public AdoptionLimitExceededException(String message) {
        super(message);
    }
}

