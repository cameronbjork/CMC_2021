/**
 * 
 */
package cmc.account.user;

import java.util.ArrayList;

import cmc.university.University;

/**
 * A class that manages the use case functionality of the user
 * @author Joe Koller, Logan Woods, Cameron Bjork, Michael Murphy, Jalen Lindsey, Charles Becker 
 *
 */
public class UserFunctionalityController {
	private DBController DBC;
	
	/**
	 * A method that creates a new data base controller object
	 */
	public UserFunctionalityController() {
		this.DBC = new DBController();
	}
	
	/**
	 * This method displays the user's saved universities and returns an
	 * array list of saved university objects
	 * @param username The name of the users account
	 * @return an array list of university objects
	 */
	public ArrayList<University> displaySavedUniversities(String username) {
		User u2 = DBC.getUser(username);
		return u2.getSavedUniversities();
	}
	
	/**
	 * This method saves a selected university and puts it in
	 * a list of university objects
	 * @param u The user account
     * @param the university to be saved
	 */
	public boolean saveUnversity(String u, University uni) {
		User u1 = DBC.getUser(u);
		u1.setSavedUniversities(uni);
		return true;
	}

	/**
	 * This method removes a selected saved university from 
	 * the saved university list
	 * @param userName the name of the user
	 * @param uni the saved university to be removed
	 */
	public boolean removeSavedUniversity(String userName, University uni) {
		User u1 = DBC.getUser(userName);
		u1.removeSavedUniversity(uni);
		return true;
		
	}
	
	//Do we need this??
	/**
	 * A method to display the information of a selected university
	 * @param uni the name of the university to be displayed
	 * @return
	 */
	public University displayUniversity(University uni) {
		return this.DBC.getUniversity(uni);
		
	}
	
}
