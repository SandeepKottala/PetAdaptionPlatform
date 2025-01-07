package adopt.breed;

//Breed Class
public class Breed {
 private String breedID;
 private String name;
 private String description;

 // Default Constructor
 public Breed() {
     this.breedID = "";
     this.name = "";
     this.description = "";
 }

 // Parameterized Constructor
 public Breed(String breedID, String name, String description) throws InvalidBreedDescriptionException {
     this.breedID = breedID;
     this.name = name;
     setDescription(description); // Use setter to validate description
 }

 // Getters and Setters
 public String getBreedID() {
     return breedID;
 }

 public void setBreedID(String breedID) {
     this.breedID = breedID;
 }

 public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }

 public String getDescription() {
     return description;
 }

 public void setDescription(String description) throws InvalidBreedDescriptionException {
     if (description == null || description.isEmpty() || description.length() > 255) {
         throw new InvalidBreedDescriptionException("Invalid description provided. It must not be empty or exceed 255 characters.");
     }
     this.description = description;
 }
}
