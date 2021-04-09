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


import dblibrary.project.csci230.*;
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
	private String[][] uniWithEmphasis = new String[25][2];
	private Admin admin1;
	private ArrayList<University> allUniversities;

	
	private UniversityDBLibrary univDBLib;
	
	/** Creates DBController object
	 * 
	 */
	public DBController() {
		this.user1 = new User("peter", "securepassword",'u', "peter","Ohmann", 'Y');
		this.user1.setSavedUniversities(this.getUniversityByName("ST JOHNS UNIVERSITY"));
		this.admin1 = new Admin("poop", "notsecurepassword", 'a', "murp", "Dog", 'Y');
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
		
		this.univDBLib = new UniversityDBLibrary("brogrammers", "brogrammers", "csci230");
		
		//Creates arraylist with all universities
		String[][] allUnis2D = this.univDBLib.university_getUniversities();
		this.allUniversities = new ArrayList<University>();
		for (int i = 0; i < allUnis2D.length; i++) {
			University uniToAdd = new University(allUnis2D[i][0], allUnis2D[i][1], allUnis2D[i][2],allUnis2D[i][3], Integer.parseInt(allUnis2D[i][4]), Double.parseDouble(allUnis2D[i][5]), Double.parseDouble(allUnis2D[i][6]), Integer.parseInt(allUnis2D[i][7]), Double.parseDouble(allUnis2D[i][8]), Double.parseDouble(allUnis2D[i][9]), Integer.parseInt(allUnis2D[i][10]), Double.parseDouble(allUnis2D[i][11]), Double.parseDouble(allUnis2D[i][12]), Integer.parseInt(allUnis2D[i][13]), Integer.parseInt(allUnis2D[i][14]), Integer.parseInt(allUnis2D[i][15]));
			this.allUniversities.add(uniToAdd);
		}
		
		//Adds emphasis to all Universities
		String[][] allUnisAndEmph2D = this.univDBLib.university_getNamesWithEmphases();
		for (int i = 0; i < allUnisAndEmph2D.length; i++) {
			for (int j = 0; j < this.allUniversities.size(); j++) {
				if (allUnisAndEmph2D[i][0] == this.allUniversities.get(j).getUniName()) {
					this.allUniversities.get(j).setEmphasis(allUnisAndEmph2D[i][1]);
				}
			}
		}
		}
		
		

	//START OF DATABASE IMPLEMENTATION
	/** Gets user from the Database
	 * 
	 * @param firstName -  First name of the User.
	 * @return user1 - User that is grabbed from the DB
	 */
	public User getUser(String firstName) {
		String[][] allUsers = this.univDBLib.user_getUsers();
		for (int i = 0; i < allUsers.length; i++) {
			if (allUsers[i][0] == firstName) {
				return new User(allUsers[i][2], allUsers[i][3], allUsers[i][4].charAt(0), allUsers[i][0], allUsers[i][2], allUsers[i][5].charAt(0));
		}
	}
		return null;
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
		return this.allUniversities;
	}
	
	//We probably wont need this, can  only search by uniName (String)
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
		University uni = null;
		System.out.println(this.allUniversities.size());
		for (int i = 0; i < this.allUniversities.size(); i++) {
			if (uniName == this.allUniversities.get(i).getUniName()) {
				uni = this.allUniversities.get(i);
			}
		}
		return uni;
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
	int numOfStudents, double percentFemale, double satVerbal, double satMath, double annualExpenses, double percentFinAid, 
	int numApplicants, double percentAdmit, double percentEnrolled, int academicScale, int socialScale, int qOLScale) {
		this.univDBLib.university_addUniversity(uniName,  uniState,  uniLocation,  uniControl,
				 numOfStudents,  percentFemale,  satVerbal,  satMath,  annualExpenses,  percentFinAid, 
				 numApplicants,  percentAdmit,  percentEnrolled,  academicScale,  socialScale,  qOLScale);
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
	
	//Emphasis being stored in arraylist in university, should delte this and just get university?
	/** Return university with emphasis'
	 * 
	 * @return String[][] - 2D array with all emphasis'
	 */
	public String [][] university_getAllUniversitiesAndEmphasis() {
		return this.univDBLib.university_getNamesWithEmphases();
	}

	public void addNewUserData(String userName, String firstName, String lastName, String passWord, char type) {
			//just make a new user
	}
	
}

