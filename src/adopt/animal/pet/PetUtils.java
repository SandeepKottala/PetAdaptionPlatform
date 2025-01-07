package adopt.animal.pet;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class PetUtils {
	
	ArrayList<Pet> pets = new ArrayList<Pet>();
	public boolean addItemType(Pet pet) throws InvalidPetAgeException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Pet ID : ");
		int petID = sc.nextInt();
		System.out.println("Enter Pet Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Pet Age : ");
		int age = sc.nextInt();
		System.out.println("Enter Pet Breed : ");
		String breed = sc.nextLine();
		System.out.println("Enter Pet HealthStatus : ");
		String healthStatus = sc.nextLine();
		
		Pet p = new Pet(petID, name, age, breed, healthStatus);
		
		pets.add(p);
		PetDAO petDAO = new PetDAO();
		return true;
	}
/*
    // Calculate approximate age based on birth date
    public static int calculateApproximateAge(Date birthDate) {
        long diffInMillis = new Date().getTime() - birthDate.getTime();
        return (int) TimeUnit.DAYS.convert(diffInMillis, TimeUnit.MILLISECONDS) / 365;
    }

    // Generate a pet profile as a formatted string
    public static String generatePetProfile(Pet pet) {
        return "Pet Profile:\n" + pet.toString();
    }

    // Check if the pet is adoptable based on health status and age
    public static boolean isAdoptable(Pet pet) {
        return pet.getHealthStatus().equalsIgnoreCase("Healthy") && pet.getAge() > 0;
    }*/
}

