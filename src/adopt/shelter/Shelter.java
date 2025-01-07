package adopt.shelter;

import java.util.ArrayList;
import java.util.List;
import adopt.user.User;

// Shelter Class
public class Shelter extends User{
    private String shelterID;
    private String name;
    private String location;
    private String contactInfo;
    private int capacity;
    private int currentPetsCount;

    // Default Constructor
    public Shelter() {
        this.shelterID = "";
        this.name = "";
        this.location = "";
        this.contactInfo = "";
        this.capacity = 0;
        this.currentPetsCount = 0;
    }

    // Parameterized Constructor
    public Shelter(String shelterID, String name, String location, String contactInfo, int capacity, int currentPetsCount) {
        this.shelterID = shelterID;
        this.name = name;
        this.location = location;
        this.contactInfo = contactInfo;
        this.capacity = capacity;
        this.currentPetsCount = currentPetsCount;
    }

    // Getters and Setters
    public String getShelterID() {
        return shelterID;
    }

    public void setShelterID(String shelterID) {
        this.shelterID = shelterID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCurrentPetsCount() {
        return currentPetsCount;
    }

    public void setCurrentPetsCount(int currentPetsCount) {
        this.currentPetsCount = currentPetsCount;
    }

    // Method to add a pet to the shelter (with custom exception)
    public void addPet() throws ShelterCapacityExceededException {
        if (currentPetsCount >= capacity) {
            throw new ShelterCapacityExceededException("Cannot add more pets. Shelter is at full capacity.");
        }
        currentPetsCount++;
    }

    // Method to remove a pet from the shelter
    public void removePet() throws ShelterNotFoundException {
        if (currentPetsCount == 0) {
            throw new ShelterNotFoundException("No pets available in the shelter to remove.");
        }
        currentPetsCount--;
    }
}

