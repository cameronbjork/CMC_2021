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
	
	public SearchController() {
		this.DBC = new DBController();
	}

	public ArrayList<University> searchUniversities(String string, int numStudents) {
		return this.DBC.getUniversities(string, numStudents);
		
		
	}

	public University getRecentUniversity(String u) {
		User u1 = (DBC.getUser(u));
		University uni1 = u1.getRecentUniversity();
		return uni1;
		// Implement to Web Interface
	}
}
