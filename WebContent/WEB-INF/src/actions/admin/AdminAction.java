package actions.admin;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import model.authentication.Login;
import model.users.Admin;
import model.users.User;

public class AdminAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private List<Admin> admins = new ArrayList<Admin>();
	private List<User> users = new ArrayList<User>();

	public List<Admin> getAdmins() {
		return admins;
	}

	public List<User> getUsers() {
		return users;
	}

	// Default method invoked by STRUTS2
	public String execute() {
		Login a = Login.getInstance();
		this.admins = a.getAdmins();
		this.users = a.getUsers();
		return "success";
	}

}
