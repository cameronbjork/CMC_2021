/**
 * 
 */
package cmc.account.user;

import java.util.ArrayList;

import cmc.account.Account;
import cmc.university.University;

/**
 * @author cbjork001
 *
 */
public class DBController {
	private User user1;
	private University uni1;
	
	public DBController() {
		this.user1 = new User("peter", "securepassword",'u', "peter","Ohmann");
		this.uni1 = new University("Sample");
		this.user1.setSavedUniversities(this.uni1);
	}

	public User getUser(String userName) {
		return this.user1;
	}
	
	public User getAccount(String userName) {
		return this.user1;
}

	public ArrayList<University> getUniversities(String state, int numStudents) {
		ArrayList<University> searchResults = new  ArrayList<>();
		searchResults.add(uni1);
		return searchResults;
	}
	
	public University getUniversity(University uni) {
		return this.uni1;
	}

	public void setUser(User u2) {
		// TODO store user back to database
		
<<<<<<< HEAD
=======
	public University getUniversity(uni) {
		University uni1 = new U;
		return  null;
=======
	}
	
}
