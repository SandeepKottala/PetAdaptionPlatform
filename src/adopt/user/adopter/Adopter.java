package adopt.user.adopter;

import adopt.reviewable.Reviewable;
import adopt.user.User;

public class Adopter extends User implements Reviewable {
    private int adopterId;
    private String name;
    private String address;
    private String contactDetails; // Combine email and phone as a single string, or you can split this into two separate fields if required
    private int adoptedPetsCount;

    // Default constructor
    public Adopter() {
    }

    // Parameterized constructor
    public Adopter(int adopterId, String name, String address, String contactDetails, int adoptedPetsCount) {
        this.adopterId = adopterId;
        this.name = name;
        this.address = address;
        this.contactDetails = contactDetails;
        this.adoptedPetsCount = adoptedPetsCount;
    }

    // Getters and Setters
    public int getAdopterId() {
        return adopterId;
    }

    public void setAdopterId(int adopterId) {
        this.adopterId = adopterId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(String contactDetails) throws InvalidAdopterContactException {
        if (!AdopterUtils.validateContactDetails(contactDetails)) {
            throw new InvalidAdopterContactException("Invalid contact details provided.");
        }
        this.contactDetails = contactDetails;
    }

    public int getAdoptedPetsCount() {
        return adoptedPetsCount;
    }

    public void setAdoptedPetsCount(int adoptedPetsCount) {
        this.adoptedPetsCount = adoptedPetsCount;
    }

	@Override
	public void addReview() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void retrieveReview() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calculateAvereageReview() {
		// TODO Auto-generated method stub
		
	}
}

