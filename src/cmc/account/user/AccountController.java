/**
 * 
 */
package cmc.account.user;

import cmc.account.Account;

/**
 * This AccountController class implements the methods needed for
 * user interaction and accessing the database for account interactions
 * @author cbjork001
 *
 */
public class AccountController {
	private DBController DBC;
	private int test;
	
	public AccountController() {
		this.DBC = new DBController();
	}
	/**
	 * This method is used to edit a user's information
	 * @return boolean
	 * @param userName a string of the users userName name	  
	 * @param firstName a string of the users first name
	 * @param lastName a string of the users last name
	 * @param passWord a string of the users password
	 */
	public boolean userEditUser(String userName, String firstName, String lastName, String passWord) {
		User u2 = this.DBC.getUser(userName);
		boolean bool = false;
		if (u2 != null) {
			if (firstName != null) {
				u2.setFirstName(firstName);
				System.out.println("First changed to: " + firstName);
				bool = true;} else {
					return false;
			}if (lastName != null) {
				u2.setLastName(lastName);
				System.out.println("last changed to: " + lastName);
				bool = true; } else {
					return false;
				}
			}if (passWord != null){
				System.out.println("Pass changed to: " + passWord);
				u2.setPassWord(passWord);
				bool = true;
			} else {
				return false;
		}
		DBC.setUser(u2);
		return bool;
	}
	

	public Account logOn(String userName, String passWord) {
		Account acc = this.DBC.getAccount(userName);
	/**
	 * This method is used to logon a user and set the appropriate login status
	 * @return boolean
	 * @param userName a string of the users userName name	  
	 * @param passWord a string of the users first name
	 */

		String p2 = acc.getPassWord();
		if (p2.equals(passWord)) {
			acc.setLoginStatus(true);
		} else {
			acc.setLoginStatus(false);
		}
		return acc;
	}
	
	/**
	 * This method displays the profile of the user
	 * @param userName the name of the user as a string
	 * @return a User
	 */
	public User displayProfile(String userName) {
		return DBC.getUser(userName);
	}

	/**
	 * This method logs the user out and sets the login status to false
	 * @param userName the username of the account to be logged out
	 */
	public void logOut(String userName) {
		Account acc = this.DBC.getUser(userName);
		acc.setLoginStatus(false);
	}
	
}
