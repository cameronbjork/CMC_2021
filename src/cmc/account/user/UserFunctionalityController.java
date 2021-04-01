/**
 * 
 */
package cmc.account.user;

import java.util.ArrayList;

import cmc.university.University;

/**
 * @author cbjork001
 *
 */
public class UserFunctionalityController {
	private DBController DBC;

	public void displaySavedUniversities(String username) {
		User u2 = DBC.getUser(username);
		ArrayList<University> savedUniversities = new ArrayList<>(u2.getSavedUniversities());
		//Must connect to the web interface
	}
	
	public void saveUnversity(String u, University uni) {
		User u1 = DBC.getUser(u);
		University uni1 = DBC.getUniversity(uni);
		u1.setSavedUniversities(uni1);
	}

	public void removeSavedUniversity(String userName, University uni) {
		User u1 = DBC.getUser(userName);
		
		
	}
}
