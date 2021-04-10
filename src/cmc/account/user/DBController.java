/**
 * 
 */
package cmc.account.user;


import java.util.ArrayList;

import cmc.account.Account;
import cmc.account.admin.Admin;
import cmc.university.University;



import dblibrary.project.csci230.*;

//NEED: GET ACCOUNT AND GET ADMIN, change GET USER TO JUST ACCOUNTS WITH TYPE U

/** Communicates with the Database to get and set data
 * 
 * @author Cameron, Joe, Michael, Logan, Jaren, Charlie
 *
 */
public class DBController {
	private ArrayList<University> allUniversities;
	protected ArrayList<Account> allAccounts;
	private String[][] allUnisAndEmph;

	
	private UniversityDBLibrary univDBLib;
	
	/** Creates DBController object
	 * 
	 */
	public DBController() {
		
		this.univDBLib = new UniversityDBLibrary("brogrammers", "brogrammers", "csci230");
		
		this.allUniversities = new ArrayList<University>();
		this.allUnisAndEmph = this.univDBLib.university_getNamesWithEmphases();
		this.setAllUniversities();
		this.setAllUniversityEmphasis();

		this.allAccounts = new ArrayList<Account>();
		this.setAllAccounts();
		
		}
		
		

	//START OF DATABASE IMPLEMENTATION
	/** Gets user from the Database
	 * 
	 * @param firstName -  First name of the User.
	 * @return user1 - User that is grabbed from the DB
	 */
	public User getUser(String userName) {
		for (int i = 0; i < this.allAccounts.size(); i++) {
			if (this.allAccounts.get(i).getUserName() == userName) {
				return (User) this.getAccount(userName);
		}
	}
		return null;
}
	
	//handle bad username case here and in AC
	
	public Account getAccount(String userName) {

		for (int i = 0; i < allAccounts.size(); i++) {			
			if (allAccounts.get(i).getUserName().equals(userName)) {
				return allAccounts.get(i);
				}
		}
		return null;
	}

	/** Returns an ArrayList of all the universities in the DB
	 * 	
	 * @return uniDB - ArrayList of all Universities in DB
	 */
	public ArrayList<University> getAllUniversities() {
		return this.allUniversities;
	}
	
	public void clearAllAccounts() {
		this.allAccounts.clear();
	}
	
	public void setAllAccounts() {
		this.allAccounts.clear();
		//Adds all Accounts to a list
		String[][] allUsers = this.univDBLib.user_getUsers();
		this.allAccounts = new ArrayList<Account>();
		for (int i = 0; i < allUsers.length; i++) {
			if (allUsers[i][4].charAt(0) == 'a') {
				this.allAccounts.add(new Admin(allUsers[i][2], allUsers[i][3], allUsers[i][4].charAt(0), allUsers[i][0], allUsers[i][1], allUsers[i][5].charAt(0)));
			}
			else {
				this.allAccounts.add(new User(allUsers[i][2], allUsers[i][3], allUsers[i][4].charAt(0), allUsers[i][0], allUsers[i][1], allUsers[i][5].charAt(0)));
			}
			}
	}
	
	/** Returns a university based on it's name
	 * 
	 * @param uniName - Name of university to be returned
	 * @return allResults.get(i) - University being returned
	 */
	public University getUniversityByName(String uniName) {
		for (int i = 0; i < this.allUniversities.size(); i++) {
			if (uniName.equals(this.allUniversities.get(i).getUniName())) {
				return this.allUniversities.get(i);
			}
		}
		return null;
	}
	
	/** Set a Users data back to DB
	 * 
	 * @param u2 User to set back to DB
	 */
	public void setUser(Account u2) {
		// TODO store user back to database
		this.univDBLib.user_editUser(u2.getUserName(), u2.getFirstName(), u2.getLastName(), u2.getPassWord(), u2.getAccountType(), u2.getStatus());
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
	int numApplicants, double percentAdmit, double percentEnrolled, int academicScale, int socialScale, int qOLScale, String emphasis1, String emphasis2, String emphasis3, String emphasis4, String emphasis5) {
		this.univDBLib.university_addUniversity(uniName,  uniState,  uniLocation,  uniControl,
				 numOfStudents,  percentFemale,  satVerbal,  satMath,  annualExpenses,  percentFinAid, 
				 numApplicants,  percentAdmit,  percentEnrolled,  academicScale,  socialScale,  qOLScale);
		this.setAllUniversities();
		this.setAllUniversityEmphasis();
	}
	
	public ArrayList<University> setAllUniversities() {
		this.allUniversities.clear();
		//Creates arraylist with all universities
		String[][] allUnis2D = this.univDBLib.university_getUniversities();
		for (int i = 0; i < allUnis2D.length; i++) {
			University uniToAdd = new University(allUnis2D[i][0], allUnis2D[i][1], allUnis2D[i][2],allUnis2D[i][3], Integer.parseInt(allUnis2D[i][4]), Double.parseDouble(allUnis2D[i][5]), Double.parseDouble(allUnis2D[i][6]), Integer.parseInt(allUnis2D[i][7]), Double.parseDouble(allUnis2D[i][8]), Double.parseDouble(allUnis2D[i][9]), Integer.parseInt(allUnis2D[i][10]), Double.parseDouble(allUnis2D[i][11]), Double.parseDouble(allUnis2D[i][12]), Integer.parseInt(allUnis2D[i][13]), Integer.parseInt(allUnis2D[i][14]), Integer.parseInt(allUnis2D[i][15]));
			this.allUniversities.add(uniToAdd);
		}
		return this.allUniversities;
	}
	
	public void removeUniversity(String school) {
		University uni = this.getUniversityByName(school);
		this.removeUniversityEmphasis(uni.getUniName(), uni.getEmphasis1(), uni.getEmphasis2(), uni.getEmphasis3(), uni.getEmphasis4(), uni.getEmphasis5());
		this.univDBLib.university_deleteUniversity(uni.getUniName());
		this.setAllUniversities();
	}
	
	/** Return university with emphasis'
	 * 
	 * @return String[][] - 2D array with all emphasis'
	 */
	public String [][] university_getAllUniversitiesAndEmphasis() {
		return this.univDBLib.university_getNamesWithEmphases();
	}
	
	public void removeUniversityEmphasis(String school, String emphasis1, String emphasis2, String emphasis3, String emphasis4, String emphasis5 ) {
		this.univDBLib.university_removeUniversityEmphasis(school, emphasis1);
		this.univDBLib.university_removeUniversityEmphasis(school, emphasis2);
		this.univDBLib.university_removeUniversityEmphasis(school, emphasis3);
		this.univDBLib.university_removeUniversityEmphasis(school, emphasis4);
		this.univDBLib.university_removeUniversityEmphasis(school, emphasis5);
	}
	
	public void setAllUniversityEmphasis() {
		for (int i = 0; i < this.allUnisAndEmph.length; i++) {
			for (int j = 0; j < this.allUniversities.size(); j++) {
				if (this.allUnisAndEmph[i][0] == this.allUniversities.get(j).getUniName()) {
					this.allUniversities.get(j).setEmphasis(this.allUnisAndEmph[i][1]);
				}
			}
		}
		this.setAllUniversities();
	}

	public void addNewUser(String userName, String firstName, String lastName, String passWord, char type) {
		this.univDBLib.user_addUser(firstName, lastName, userName, passWord, type);
		this.setAllAccounts();
	}

	public void addSavedSchool(String userName, String school) {
		this.univDBLib.user_saveSchool(userName, school);
	}
	
	public void removeSavedUniversity(String userName, String school) {
		this.univDBLib.user_removeSchool(userName, school);
	}
	
	public ArrayList<University> getSavedUniversity(String userName) {
		String[][] allUsersAndSavedSchools = this.univDBLib.user_getUsernamesWithSavedSchools();
		ArrayList<University> savedUnis = new ArrayList<University>();
		for (int i = 0; i < allUsersAndSavedSchools.length; i++) {
			if ( allUsersAndSavedSchools[i][0].equals(userName)) {
				savedUnis.add(this.getUniversityByName(allUsersAndSavedSchools[i][1]));
			}
		}
		return savedUnis;
	}

	public void deleteUser(String userName) {
		this.univDBLib.user_deleteUser(userName);
	}
	
}

