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

	private ArrayList<University> uniDB;
	private University uni2;
	private University uni3;
	private University uni4;
	private University uni5;
	private University uni6;
	private User user1;
	private University uni1;
	
	public DBController() {
		this.user1 = new User("peter", "securepassword",'u', "peter","Ohmann");
		this.uni1 = new University("Sample");
		this.user1.setSavedUniversities(this.uni1);
		this.uni2 = new University ("St Johns", "Minnesota", "SMALL-CITY", "PRIVATE", 3000, 2, 3, 3, 10000, 50, 1000, 75, 97, 4, 3, 3, "MATH", "HISTORY", "SCIENCE", "PHYSICS", "NURSING");
		this.uni3 = new University ("PoopSchool", "Illinois", "CHICAGO", "PRIVATE", 6000, 78, 5, 5, 1000, 35, 900, 65, 67, 2, 4, 3, "EDUCATION", "NURSING", "BUSINESS","", "");
		this.uni4 = new University ("MinSchool", "Nebraska", "LINCOLN", "COMMUNITY", 12000, 42, 2, 5, 7000, 62, 900, 34, 62, 2, 1, 1, "COMMUNICATION", "MATH", "ENVIROMENTAL STUDIES", "", "");
		this.uni5 = new University ("Jacked School", "Idaho", "BOISE", "PRIVATE", 10000, 67, 1, 5, 700, 35, 900, 43, 49, 5, 4, 3, "COMPUTER SCIENCE", "NURSING", "EXCERSICE STUDY", "", "");
		this.uni6 = new University ("Drugs School", "California", "SAN FRANCISCO", "COMMUNITY", 2000, 99, 4, 5, 6000, 35, 900, 60, 67, 4, 0, 3, "NUMERICAL COMPUTING", "PRE MED", "MUSIC", "", "");
		this.uniDB = new ArrayList<University>();	
		this.uniDB.add(uni2);
		this.uniDB.add(uni3);
		this.uniDB.add(uni4);
		this.uniDB.add(uni5);
		this.uniDB.add(uni6);
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

//Search by state
	public ArrayList<University> checkState(University uni) {
		
		ArrayList<String> uniList = new ArrayList<String>();
		ArrayList<University> similarResults = new ArrayList<University>();
		uniList.add(uni2.getUniState());
		uniList.add(uni3.getUniState());
		uniList.add(uni4.getUniState());
		uniList.add(uni5.getUniState());
		uniList.add(uni6.getUniState());
		for(int i = 0; i < uniList.size() - 1;i++) {
			String searchByState = uni.getUniState();
			String individual = searchByState.substring(0, i);
			uniList.get(i);
			if(uniList.get(i).contains(individual) && !similarResults.contains(uniDB.get(i))) {
				similarResults.add(uniDB.get(i));
				else {
					distance += 1;
					//calculate distance for recommended(Not here because this is for search
				}
			}
		}
		return similarResults;
	}
}
