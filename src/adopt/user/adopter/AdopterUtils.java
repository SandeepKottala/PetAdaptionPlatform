package adopt.user.adopter;

public class AdopterUtils {
    // Maximum allowed adoptions per adopter
    private static final int MAX_ADOPTIONS = 3;

    // Method to validate contact details (basic email and phone validation)
    public static boolean validateContactDetails(String contactDetails) {
        // Simple regex for email and phone validation
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
        String phoneRegex = "\\d{10}";
        String[] details = contactDetails.split(","); // Assume email,phone format

        if (details.length == 2) {
            String email = details[0].trim();
            String phone = details[1].trim();
            return email.matches(emailRegex) && phone.matches(phoneRegex);
        }
        return false;
    }

    // Method to check if an adopter can adopt more pets
    public static boolean calculateAdoptionEligibility(Adopter adopter) throws AdoptionLimitExceededException {
        if (adopter.getAdoptedPetsCount() >= MAX_ADOPTIONS) {
            throw new AdoptionLimitExceededException("Adoption limit exceeded.");
        }
        return true;
    }

    // Method to generate a report for the adopter
    public static String generateAdopterReport(Adopter adopter) {
        return "Adopter Report: \n" +
               "ID: " + adopter.getAdopterId() + "\n" +
               "Name: " + adopter.getName() + "\n" +
               "Address: " + adopter.getAddress() + "\n" +
               "Contact Details: " + adopter.getContactDetails() + "\n" +
               "Adopted Pets Count: " + adopter.getAdoptedPetsCount();
    }
}
