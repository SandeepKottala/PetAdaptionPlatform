package adopt.animal.pet;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import config.DbConnection;

public class PetDAO {
	
	public List<Pet> getAllPet() {
		List<Pet> itemlist=new ArrayList<Pet>();

		
		
		try{
			Connection con=DbConnection.getConnection();
			Statement stm=con.createStatement();
			ResultSet rs=stm.executeQuery("select * from Pet");
			while(rs.next()){
				Pet ip=new Pet(rs.getInt("Id"),rs.getString("name"),rs.getInt("age"),rs.getString("breed"), 
						rs.getString("healthstatus"));
				itemlist.add(ip);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return itemlist;
	}

}
