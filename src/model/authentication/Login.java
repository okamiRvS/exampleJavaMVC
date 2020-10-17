package model.authentication;

import java.util.ArrayList;
import java.util.List;

import model.users.Admin;
import model.users.User;

public class Login {

	private List<Admin> admins = new ArrayList<Admin>();
	private List<User> users = new ArrayList<User>();
	private static Login uniqueInstance;
	
	public Login() throws Exception {
		if(uniqueInstance != null) {
			throw new Exception("SingletonException message");
		} else {
			Admin umberto = new Admin("Okami", MD5("123"), "Umberto", "okami@gmail.com", "Milano", "Cologno Monzese");
			Admin silvia = new Admin("Silvii", MD5("123"), "Silvia", "silvii@gmail.com", "Milano", "Bollate");
			admins.add(umberto);
			admins.add(silvia);
			
			User samuele = new User("Samu", MD5("321"), "Samuele", "samu@gmail.com", "Milano", "Gorgonzola");
			User sara = new User("Sara", MD5("321"), "Sara", "sara@gmail.com", "Milano", "Monza");
			users.add(samuele);
			users.add(sara);
		}
	}
	
	public List<Admin> getAdmins() {
		return admins;
	}
	
	public List<User> getUsers() {
		return users;
	}
	
	public void setUser(User a) {
		users.add(a);
	}
	
	public static Login getInstance() {
		if (uniqueInstance == null) {
			try {
				uniqueInstance = new Login();
			} catch (Exception x) {
				System.out.println("SingletonException");
			}
		}
		return uniqueInstance;

	}
	
	public boolean autheticateAdmin(String username, String password) {
		for(Admin admin: admins) {
			if (admin.getUsername().equals(username) && admin.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean autheticateUser(String username, String password) {
		for(User user: users) {
			if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean existUser(String username) {
		for(User user: users) {
			if (user.getUsername().equals(username)) {
				return true;
			}
		}
		for(Admin admin: admins) {
			if (admin.getUsername().equals(username)) {
				return true;
			}
		}
		return false;
	}
	
	public static String MD5(String md5) {
		if(md5.isBlank()) {return "";} // to sanitize the input...
		try {
			java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
			byte[] array = md.digest(md5.getBytes());
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < array.length; ++i) {
				sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1, 3));
			}
			return sb.toString();
		} catch (java.security.NoSuchAlgorithmException e) {
		}
		return null;
	}
}
