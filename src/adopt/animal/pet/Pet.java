package adopt.animal.pet;

import adopt.animal.Animal;

public class Pet extends Animal {
    private int petId;
    private String name;
    private int age;
    private String breed;
    private String healthStatus;

    // Default constructor
    public Pet() {
    }

    // Parameterized constructor
    public Pet(int petId, String name, int age, String breed, String healthStatus) throws InvalidPetAgeException {
        this.petId = petId;
        this.name = name;
        setAge(age); // This will use the setter to validate age
        this.breed = breed;
        this.healthStatus = healthStatus;
    }

    // Getters and Setters
    public int getPetId() {
        return petId;
    }

    public void setPetId(int petId) {
        this.petId = petId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws InvalidPetAgeException {
        if (age < 0 || age > 50) { // Example validation for age
            throw new InvalidPetAgeException("Age must be between 0 and 50.");
        }
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    @Override
    public String toString() {
        return "Pet ID: " + petId + "\nName: " + name + "\nAge: " + age + "\nBreed: " + breed + "\nHealth Status: " + healthStatus;
    }
}
