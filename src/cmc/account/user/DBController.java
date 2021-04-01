/**
 * 
 */
package cmc.account.user;

import cmc.account.Account;
import cmc.university.University;

/**
 * @author cbjork001
 *
 */
public class DBController {
	private User user1 = new User("peter", "securepassword",'u', "peter","Ohmann");
	private University uni1 = new University("Sample");

	public User getUser(String userName) {
		// TODO Auto-generated method stub
		return this.user1;
	}
	
	public User getAccount(String userName) {
		return this.user1;
}

	public void getUniversities(String state, int numStudents) {
		
	}
	
	public University getUniversity(University uni) {
		return this.uni1;
	}

	public void setUser(User u2) {
		// TODO store user back to database
		
	}
}
