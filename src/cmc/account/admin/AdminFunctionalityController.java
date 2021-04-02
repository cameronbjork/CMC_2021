package cmc.account.admin;

import cmc.account.user.DBController;
import cmc.university.University;

public class AdminFunctionalityController {

	private DBController DBC;
	
	public AdminFunctionalityController() {
		this.DBC = new DBController();
	}
	public void displayUniversity(University uni) {
		this.DBC.getUniversity(uni);
		
	}
	public void setUniversity(University uni) {
		this.DBC.getUniversity(uni);
	}
	
	public void adminEditUser(String userName, String firstName, String lastName, String passWord, char type) {
		this.DBC.setUserData(userName, firstName, lastName, passWord, type);
	}

	public void addUser(String userName, String firstName, String lastName, String passWord, char type) {
		this.DBC.addNewUserData(userName, firstName, lastName, passWord, type);
	}
	
}
