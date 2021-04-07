/**
 * 
 */
package cmc.account.user;

import java.util.ArrayList;
import java.util.Collection;
import java.lang.StringBuilder;

import cmc.account.Account;
import cmc.account.admin.Admin;
import cmc.university.University;

/** Communicates with the Database to get and set data
 * 
 * @author Cameron, Joe, Michael, Logan, Jaren, Charlie
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
	private University newUni;
	private String[][] uniWithEmphasis = new String[25][2];
	private Admin admin1;
	private University recentUni;
	
	/** Creates DBController object
	 * 
	 */
	public DBController() {
		this.user1 = new User("peter", "securepassword",'u', "peter","Ohmann");
		this.admin1 = new Admin("poop", "notsecurepassword", 'a', "murp", "Dog");
		this.user1.setSavedUniversities(this.uni1);
		this.uni2 = new University ("St Johns", "Minnesota", "SMALL-CITY", "PRIVATE", 3000, 2, 3, 3, 10000, 50, 1000, 75, 97, 4, 3, 3, "MATH", "HISTORY", "SCIENCE", "PHYSICS", "NURSING");
		this.uni3 = new University ("TheSchool", "Illinois", "CHICAGO", "PRIVATE", 6000, 78, 5, 5, 1000, 35, 900, 65, 67, 2, 4, 3, "EDUCATION", "NURSING", "BUSINESS","", "");
		this.uni4 = new University ("MinSchool", "Nebraska", "LINCOLN", "COMMUNITY", 12000, 42, 2, 5, 7000, 62, 900, 34, 62, 2, 1, 1, "COMMUNICATION", "MATH", "ENVIROMENTAL STUDIES", "", "");
		this.uni5 = new University ("Jacked School", "Idaho", "BOISE", "PRIVATE", 10000, 67, 1, 5, 700, 35, 900, 43, 49, 5, 4, 3, "COMPUTER SCIENCE", "NURSING", "EXCERSICE STUDY", "", "");
		this.uni6 = new University ("Drugs School", "California", "SAN FRANCISCO", "COMMUNITY", 2000, 99, 4, 5, 6000, 35, 900, 60, 67, 4, 0, 3, "NUMERICAL COMPUTING", "PRE MED", "MUSIC", "", "");
		this.uniDB = new ArrayList<University>();	
		this.uniDB.add(uni2);
		this.uniDB.add(uni3);
		this.uniDB.add(uni4);
		this.uniDB.add(uni5);
		this.uniDB.add(uni6);
		
		int k = 0;
		for (int i = 0; i < uniDB.size(); i++)  {
			k = 0;
			uniWithEmphasis[i][k] = this.uniDB.get(i).getUniName();
			k++;
			uniWithEmphasis[i][k] = this.uniDB.get(i).getEmphasisArray().get(i);
			}
		}
		
		

	
	/** Gets user from the Database
	 * 
	 * @param userName -  Username of the User.
	 * @return user1 - User that is grabbed from the DB
	 */
	public User getUser(String userName) {
		return this.user1;
	}
	
	//handle bad username case here and in AC
	public Account getAccount(String userName) {
		if(this.user1.getUserName() == userName) {
			return user1;
		}else {
			return admin1;
		}
	}

	/** Returns an ArrayList of all the universities in the DB
	 * 	
	 * @return uniDB - ArrayList of all Universities in DB
	 */
	public ArrayList<University> getAllUniversities() {
		return this.uniDB;
	}
	
	/** Returns a singular university
	 * 
	 * @param uni - University to return
	 * @return uni1 - University being returned
	 */
	public University getUniversity(University uni) {
		return this.uni1;
	}
	
	/** Returns a university based on it's name
	 * 
	 * @param uniName - Name of university to be returned
	 * @return allResults.get(i) - University being returned
	 */
	public University getUniversityByName(String uniName) {
		ArrayList <University> allResults = new ArrayList<University>();
		allResults.addAll(this.getAllUniversities());
		for (int i = 0; i < allResults.size(); i++) {
			if (uniName == allResults.get(i).getUniName()) {
				return  allResults.get(i);
			}
		}
		return null;
	}
	
	/** Set a Users data back to DB
	 * 
	 * @param u2 User to set back to DB
	 */
	public void setUser(User u2) {
		// TODO store user back to database
		this.user1 = u2;
	}

	/** Admin functionality to add University to Database
	 * 
	 * @param uniName - Name of University
	 * @param uniState - State University is in
	 * @param uniLocation - Location of University
	 * @param uniControl - Control of University
	 * @param numOfStudents - Number of Students at University
	 * @param percentFemale - Percentage of females at University
	 * @param satVerbal - Average SAT Verbal score
	 * @param satMath - Average SAT Math score
	 * @param annualExpenses - Annual expenses at University
	 * @param percentFinAid - Percentage of Financial Aid given out
	 * @param numApplicants - Number of Applicants at University
	 * @param percentAdmit - Percent of people admitted to University
	 * @param percentEnrolled - Percent of people enrolled at University
	 * @param academicScale - Academic scale of University
	 * @param socialScale - Social scale of University
	 * @param qOLScale - Quality of Life Scale of University
	 * @param emphasisStudy1 - Emphasis 1 of University
	 * @param emphasisStudy2 - Emphasis 2 of University
	 * @param emphasisStudy3 - Emphasis 3 of University
	 * @param emphasisStudy4 - Emphasis 4 of University
	 * @param emphasisStudy5 - Emphasis 5 of University
	 */
	public void addUniversity( String uniName, String uniState, String uniLocation, String uniControl,
	int numOfStudents, int percentFemale, int satVerbal, int satMath, int annualExpenses, int percentFinAid, 
	int numApplicants, int percentAdmit, int percentEnrolled, int academicScale, int socialScale, int qOLScale, 
	String emphasisStudy1, String emphasisStudy2, String emphasisStudy3, String emphasisStudy4, String emphasisStudy5) {
		this.newUni = new University( uniName,  uniState,  uniLocation,  uniControl,
				 numOfStudents,  percentFemale,  satVerbal,  satMath,  annualExpenses,  percentFinAid, 
				 numApplicants,  percentAdmit,  percentEnrolled,  academicScale,  socialScale,  qOLScale, 
				 emphasisStudy1,  emphasisStudy2,  emphasisStudy3,  emphasisStudy4,  emphasisStudy5);
	}
	
	/** Admin functionality to set User
	 * 
	 * @param userName - Username to grab user fromo
	 * @param firstName - Password to change to
	 * @param lastName - Lastname to change to
	 * @param passWord - Password to change to
	 * @param type - Type to change to
	 */
	public void setUserData(String userName, String firstName, String lastName, String passWord, char type) {
		this.user1.setFirstName(firstName); 
		this.user1.setLastName(lastName);
		this.user1.setPassWord(passWord);
		this.user1.setAccountType(type);
		
	}
	
	/** Return university with emphasis'
	 * 
	 * @return String[][] - 2D array with all emphasis'
	 */
	public String[][] university_getNamesWithEmphasis() {
		return uniWithEmphasis;
	}

	public void addNewUserData(String userName, String firstName, String lastName, String passWord, char type) {
			//just make a new user
	}
	
}

