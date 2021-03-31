/**
 * 
 */
package cmc.account.user;

import java.util.ArrayList;
import java.util.List;

import cmc.university.University;

/**
 * @author cbjork001
 *
 */
public class SearchController {
	private DBController DBC;

	public ArrayList<University> searchUniversities(String string, String string2) {
		DBC.getUniversities(string,string2)
		return null;
		
	}

	public void getRecentUniversity(String u) {
		User u1 = (DBC.getUser(u));
		University uni1 = u1.getRecentUniversity();
		// Implement to Web Interface
	}
}
