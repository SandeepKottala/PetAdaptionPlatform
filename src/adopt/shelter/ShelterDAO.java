package adopt.shelter;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import adopt.animal.pet.Pet;
import config.DbConnection;

public class ShelterDAO {
	
	public List<Shelter> getAllShelter() {
		List<Shelter> itemlist=new ArrayList<Shelter>();
		try{
			Connection con=DbConnection.getConnection();
			Statement stm=con.createStatement();
			ResultSet rs=stm.executeQuery("select * from Shelter");
			while(rs.next()){
				Shelter shelter = new Shelter(rs.getString("shelterId"),rs.getString("name"),rs.getString("location"),rs.getString("contactInfo"), 
				rs.getInt("capacity"), rs.getInt("currentPetsCount"));
				itemlist.add(shelter);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return itemlist;
	}


}
