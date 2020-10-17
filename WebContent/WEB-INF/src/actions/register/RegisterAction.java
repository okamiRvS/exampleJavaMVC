package actions.register;

import com.opensymphony.xwork2.ActionSupport;

import model.authentication.Login;
import model.users.User;

public class RegisterAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	private String name;
	private String email;
	private String city;
	private String country;

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
		this.password = Login.MD5(password);	// Should be sanitized...
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

	public String execute() {
		Login a = Login.getInstance();
		if(username.isBlank() || password.isBlank()) {
			addActionError(getText("error.blank"));
			return "error";
		}
		if(!a.existUser(username)) {
			a.setUser(new User(username, password, name, email, city, country));
			return "success";
		} else {
			addActionError(getText("error.register"));
			return "error";
		}
			
	}
}
