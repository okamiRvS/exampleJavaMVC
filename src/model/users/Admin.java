package model.users;

public class Admin extends User {
	
	public Admin(String username, String password, String name, String email, String city, String country) {
		super(username, password, name, email, city, country);
		setIsAdmin(true);
	}
}
