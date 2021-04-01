/**
 * 
 */
package cmc.account.user;

import java.util.ArrayList;
import java.util.Collection;
import java.lang.StringBuilder;

import cmc.account.Account;
import cmc.university.University;

/**
 * @author cbjork001
 *
 */
public class DBController {
	private User user1 = new User("peter", "securepassword",'u', "peter","Ohmann");
	private University uni1 = new University("Sample");
	private University uni2 = new University ("St Johns", "Minnesota", "SMALL-CITY", "PRIVATE", 3000, 2, 3, 3, 10000, 50, 1000, 75, 97, 4, 3, 3, "MATH", "HISTORY", "SCIENCE", "PHYSICS", "NURSING");
	private University uni3 = new University ("PoopSchool", "Illinois", "CHICAGO", "PRIVATE", 6000, 78, 5, 5, 1000, 35, 900, 65, 67, 2, 4, 3, "EDUCATION", "NURSING", "BUSINESS");
	private University uni4 = new University ("MinSchool", "Nebraska", "LINCOLN", "COMMUNITY", 12000, 42, 2, 5, 7000, 62, 900, 34, 62, 2, 1, 1, "COMMUNICATION", "MATH", "ENVIROMENTAL STUDIES");
	private University uni5 = new University ("Jacked School", "Idaho", "BOISE", "PRIVATE", 10000, 67, 1, 5, 700, 35, 900, 43, 49, 5, 4, 3, "COMPUTER SCIENCE", "NURSING", "EXCERSICE STUDY");
	private University uni6 = new University ("Drugs School", "California", "SAN FRANCISCO", "COMMUNITY", 2000, 99, 4, 5, 6000, 35, 900, 60, 67, 4, 0, 3, "NUMERICAL COMPUTING", "PRE MED", "MUSIC");

	
	
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

	public boolean checkState(University uni) {
		
		ArrayList<String> uniList = new ArrayList<String>();
		uniList.add(uni2.getUniState());
		uniList.add(uni3.getUniState());
		uniList.add(uni4.getUniState());
		uniList.add(uni5.getUniState());
		uniList.add(uni6.getUniState());
		for(int i = 0;uniList.contains(uni.subString());i++) {
			boolean isAMatch = true;
		}
		
	}
}
