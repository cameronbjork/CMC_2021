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
	
	public UserFunctionalityController() {
		this.DBC = new DBController();
	}

	public ArrayList<University> displaySavedUniversities(String username) {
		User u2 = DBC.getUser(username);
		return u2.getSavedUniversities();
	}
	
	public boolean saveUnversity(String u, University uni) {
		User u1 = DBC.getUser(u);
		University uni1 = DBC.getUniversity(uni);
		u1.setSavedUniversities(uni1);
		return true;
	}

	public boolean removeSavedUniversity(String userName, University uni) {
		User u1 = DBC.getUser(userName);
		u1.removeSavedUniversity(uni);
		return true;
		
	}

	public University displayUniversity(University uni) {
		return this.DBC.getUniversity(uni);
		
	}
	
}
