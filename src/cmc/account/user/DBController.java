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
	private University newUni;
	private String[][] uniWithEmphasis = new String[25][2];
	private Admin admin1;
	private University recentUni;
	
	public DBController() {
		this.user1 = new User("peter", "securepassword",'u', "peter","Ohmann");
		this.admin1 = new Admin("poop", "notsecurepassword", 'a', "murp", "Dog");
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
		
		int k = 0;
		for (int i = 0; i < uniDB.size(); i++)  {
			k = 0;
			uniWithEmphasis[i][k] = this.uniDB.get(i).getUniName();
			k++;
			uniWithEmphasis[i][k] = this.uniDB.get(i).getEmphasisArray().get(i);
			}
		}
		
		

	
	
	public User getUser(String userName) {
		return this.user1;
	}
	
	public Account getAccount(String userName) {
		if(this.user1.getUserName() == userName) {
			return user1;
		}else {
			return admin1;
		}
	}

		
	public ArrayList<University> getAllUniversities() {
		return this.uniDB;
	}
	
	public University getUniversity(University uni) {
		return this.uni1;
	}
	
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

	public void setUser(User u2) {
		// TODO store user back to database
		this.user1 = u2;
	}

	public void addUniversity( String uniName, String uniState, String uniLocation, String uniControl,
	int numOfStudents, int percentFemale, int satVerbal, int satMath, int annualExpenses, int percentFinAid, 
	int numApplicants, int percentAdmit, int percentEnrolled, int academicScale, int socialScale, int qOLScale, 
	String emphasisStudy1, String emphasisStudy2, String emphasisStudy3, String emphasisStudy4, String emphasisStudy5) {
		this.newUni = new University( uniName,  uniState,  uniLocation,  uniControl,
				 numOfStudents,  percentFemale,  satVerbal,  satMath,  annualExpenses,  percentFinAid, 
				 numApplicants,  percentAdmit,  percentEnrolled,  academicScale,  socialScale,  qOLScale, 
				 emphasisStudy1,  emphasisStudy2,  emphasisStudy3,  emphasisStudy4,  emphasisStudy5);

	}




	public void setUserData(String userName, String firstName, String lastName, String passWord, char type) {
		this.user1.setFirstName(firstName); 
		this.user1.setLastName(lastName);
		this.user1.setAccountType(type);
		
	}

	public String[][] university_getNamesWithEmphasis() {
		// TODO Auto-generated method stub
		return uniWithEmphasis;
	}

	public void addNewUserData(String userName, String firstName, String lastName, String passWord, char type) {
			//just make a new user
	}
	
}

