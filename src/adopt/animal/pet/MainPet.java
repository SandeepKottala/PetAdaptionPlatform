package adopt.animal.pet;

public class MainPet {
    
    public static void main(String[] args) throws InvalidPetAgeException {
		
		PetUtils itu = new PetUtils();
		itu.displayPetList();
		System.out.println("Add new item type =" +itu.addItemType());
		itu.displayPetList();
	}
}
