package cmc.account.admin;

import cmc.account.user.DBController;
import cmc.university.University;

public class AdminFunctionalityController {

	private DBController DBC;
	
	/**
	 * A method that creates a new database controller object
	 */
	public AdminFunctionalityController() {
		this.DBC = new DBController();
	}
	
	/**
	 * A method to display the information of a selected university
	 * @param uni the name of the university to be displayed
	 * @return
	 */
	public void displayUniversity(University uni) {
		this.DBC.getUniversity(uni);
		
	}
	
	/**
	 * A method to set information of a selected university
	 * @param uni the name of the university to be displayed
	 */
	public void setUniversity(University uni) {
		this.DBC.getUniversity(uni);
	}
	
	/**
	 * A method for the admin to edit user information
	 * @param userName username of the user edited
	 * @param firstName firstname of the user edited
	 * @param lastName last name of the user edited
	 * @param passWord password of the user edited
	 * @param type whether the account being edited is a user or an admin
	 */
	public void adminEditUser(String userName, String firstName, String lastName, String passWord, char type) {
		this.DBC.setUserData(userName, firstName, lastName, passWord, type);
	}
	
	/**
	 * A method to add a new user to the database
	 * @param userName - the new username
	 * @param firstName the new first name 
	 * @param lastName the new last name
	 * @param passWord the new password
	 * @param type whether the new account is an admin or user
	 */
	public void addUser(String userName, String firstName, String lastName, String passWord, char type) {
		this.DBC.addNewUserData(userName, firstName, lastName, passWord, type);
	}
	
}
