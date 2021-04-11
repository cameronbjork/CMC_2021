/**
 * 
 */
package cmc.account.user;

import java.util.ArrayList;

import cmc.account.Account;
import cmc.university.University;

/** Creates a User Object
 * 
 * @author Cameron Bjork, Joe Koller, Logan Woods, Jaren Lindsey, Michael Murphy, Charlie Becker
 *
 */
public class User extends Account {
	private ArrayList<University> savedUniversities;
	private University recentUniversity;
	
	/** Creates User Object
	 * 
	 * @param userName - UserName to set user to
	 * @param passWord - Password to set user to
	 * @param accountType - Account type to set user to
	 * @param firstName - First name to set user to
	 * @param lastName - Last name to set user to
	 */
	public User(String userName, String passWord, char accountType, String firstName, String lastName, char status) {
		super(userName, passWord, accountType, firstName, lastName, status);
		this.savedUniversities = new ArrayList<University>();
	}
	
	/** Returns an ArrayList of saved universities
	 * 
	 * @return ArrayList<University> of saved universities
	 */
	public ArrayList<University> getSavedUniversities() {
		return this.savedUniversities;
		// TODO Auto-generated method stub
		
	}
	
	/** Returns the most recent university viewed
	 * 
	 * @return University the most recent university viewed
	 */
	public University getRecentUniversity() {
		// TODO Auto-generated method stub
		return this.recentUniversity;
	}
	
	/** Sets a University to the saved list
	 * 
	 * @param uni1 - University to be saved
	 */
	public void setRecentUniversity(University recentUni) {
		this.recentUniversity = recentUni;
	}

	/** Sets a university to the savedUniversities list
	 * 
	 * @param uni1 University to save
	 */
	public void addSavedUniversities(University uni1) {
		this.savedUniversities.add(uni1);
		
	}
	
	/** Removes a University from the saved list
	 * 
	 * @param uni - University to be removed from list
	 */
	public void removeSavedUniversity(University uni) {
		this.savedUniversities.remove(uni);
		
	}
	
	
	
}
