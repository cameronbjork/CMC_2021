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
public class User extends Account {
	private boolean isActive;
	private ArrayList<University> savedUniversities;
	private University recentUniversity;
	/**
	 * @param userName
	 * @param passWord
	 * @param accountType
	 * @param firstName
	 * @param lastName
	 * @param loginStatus
	 * @param isActive
	 * @param savedUniversities
	 * @param recentUniversity
	 */
	public User(String userName, String passWord, char accountType, String firstName, String lastName) {
		super(userName, passWord, accountType, firstName, lastName);
		this.isActive = true;
		this.savedUniversities = new ArrayList<University>();
	}
	public ArrayList<University> getSavedUniversities() {
		return this.savedUniversities;
		// TODO Auto-generated method stub
		
	}
	public University getRecentUniversity() {
		// TODO Auto-generated method stub
		return this.recentUniversity;
	}
	public void setSavedUniversities(University uni1) {
		this.savedUniversities.add(uni1);
		
	}
	public void removeSavedUniversity(University uni) {
		this.savedUniversities.remove(uni);
		
	}
	
	
	
}
