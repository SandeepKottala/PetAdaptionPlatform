package adopt.breed;

import java.util.List;

public class BreedUtils {

    // Checks if a breed is available by breed ID
    public static boolean isBreedAvailable(List<Breed> breeds, String breedId) {
        return breeds.stream().anyMatch(breed -> breed.getBreedID().equals(breedId));
    }

    // Finds a breed by its name
    public static Breed findBreedByName(List<Breed> breeds, String name) throws BreedNotFoundException {
        return breeds.stream()
                .filter(breed -> breed.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElseThrow(() -> new BreedNotFoundException("Breed with name '" + name + "' not found."));
    }

    // Generates a summary for the breed
    public static String generateBreedSummary(Breed breed) {
        StringBuilder summary = new StringBuilder();
        summary.append("Breed Summary\n");
        summary.append("Breed ID: ").append(breed.getBreedID()).append("\n");
        summary.append("Name: ").append(breed.getName()).append("\n");
        summary.append("Description: ").append(breed.getDescription()).append("\n");
        return summary.toString();
    }
}
