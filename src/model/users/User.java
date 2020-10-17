package model.users;

public class User {
	 // A user is characterized by a few simple attributes, such as username, password, name, email, city, and country. 
	private String username;
	private String password;
	private String name;
	private String email;
	private String city;
	private String country;
	private Boolean isAdmin = false;
	
	public User(String username, String password, String name, String email, String city, String country) {
		this.username = username;
		this.password = password;
		this.name = name;
		this.email = email;
		this.city = city;
		this.country = country;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Boolean getIsAdmin() {
		return isAdmin;
	}
	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", name=" + name + ", email=" + email
				+ ", city=" + city + ", country=" + country + ", isAdmin=" + isAdmin + "]";
	}
}
