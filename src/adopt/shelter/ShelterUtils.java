package adopt.shelter;

import java.util.ArrayList;
import java.util.List;

public class ShelterUtils {

    // Method to calculate the current occupancy rate of the shelter
    public static double calculateOccupancyRate(Shelter shelter) {
        if (shelter.getCapacity() == 0) {
            return 0.0;
        }
        return (double) shelter.getCurrentPetsCount() / shelter.getCapacity() * 100;
    }

    // Method to find the nearest shelter (dummy implementation)
    public static Shelter findNearestShelter(String location) throws InvalidShelterLocationException {
        if (location == null || location.isEmpty()) {
            throw new InvalidShelterLocationException("Invalid location provided.");
        }

        // Dummy list of shelters (for example purposes)
        List<Shelter> shelters = new ArrayList<>();
        shelters.add(new Shelter("1", "Shelter A", "New York", "contactA@example.com", 50, 30));
        shelters.add(new Shelter("2", "Shelter B", "Los Angeles", "contactB@example.com", 40, 20));

        // In a real application, logic would be used to find the nearest shelter.
        // For now, return the first shelter for simplicity.
        return shelters.get(0); 
    }

    // Method to generate a detailed report of the shelter's status
    public static String generateShelterReport(Shelter shelter) {
        StringBuilder report = new StringBuilder();
        report.append("Shelter Report\n");
        report.append("Shelter ID: ").append(shelter.getShelterID()).append("\n");
        report.append("Name: ").append(shelter.getName()).append("\n");
        report.append("Location: ").append(shelter.getLocation()).append("\n");
        report.append("Contact Info: ").append(shelter.getContactInfo()).append("\n");
        report.append("Capacity: ").append(shelter.getCapacity()).append("\n");
        report.append("Current Pets Count: ").append(shelter.getCurrentPetsCount()).append("\n");
        report.append("Occupancy Rate: ").append(calculateOccupancyRate(shelter)).append("%\n");

        // Dummy data for adoptions and events
        report.append("Recent Adoptions: ").append(5).append("\n");
        report.append("Upcoming Events: ").append("Pet Adoption Drive on Saturday").append("\n");

        return report.toString();
    }
}
