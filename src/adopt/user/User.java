package adopt.user;

public class User {
	
	int userID;
	String name;
	String contactInfo;
	
	public User() {
		// default constructor
	}
	
	public User(int userID) {
		this.userID = userID;
	}
	
	public void setUserID(int userID) {
		this.userID = userID;
	}
	
	public int getUserID(int userID) {
		return userID;
	}
	
}
