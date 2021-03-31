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

	public User displaySavedUniversities(String username) {
		User u2 = DBC.getUser(username);
		ArrayList<University> = u2.getSavedUniversities();
		//Must connect to the web interface
	}
	
	public saveUnversity(String u, University uni) {
		User u1 = DBC.getUser(u);
		University uni1 = DBC.getUniversity();
		u1.setSavedUniversities(uni1);
	}
	//FINISH THIS
}
