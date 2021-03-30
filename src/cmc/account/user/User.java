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
	public User(String userName, String passWord, char accountType, String firstName, String lastName,
			boolean loginStatus) {
		super(userName, passWord, accountType, firstName, lastName, loginStatus);
		this.isActive = true;
	}
	
	
	
}
