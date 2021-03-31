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
}
