package config;
import java.util.List;

import java.util.ArrayList;


import adopt.animal.pet.Pet;
import adopt.animal.pet.PetDAO;

public class Main {
	
	public static void main(String args[])  {
		List<Pet> al = new ArrayList<>();
		System.out.format("%-5s %-15s %-10s %-10s %-15s\n", "petId", "Name", "Age", "Breed", "HealthStatus");
		PetDAO dao = new PetDAO();
		al = dao.getAllPet();
		for(Pet pet : al) {
			System.out.format("%-5s %-15s %-10s %-10s %-15s\n", "pet.getPetId()", "pet.getName()", "pet.getAge()", "pet.Breed()", "pet.HealthStatus()");
		}
		
	}

}
