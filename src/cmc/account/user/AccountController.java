/**
 * 
 */
package cmc.account.user;

import cmc.account.Account;

/**
 * This AccountController class implements the methods needed for
 * user interaction and accessing the database for account interactions
 * @author Cameron Bjork, Jaren Lindsey, Joe Koller, Charlie Becker, Logan Woods, Michael Murphy
 *
 */
public class AccountController {
	private DBController DBC;
	private User currentAccount;
	
	/** 
	 * Creates AccountController object
	 */
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
	public Account userEditUser(String userName, String firstName, String lastName, String passWord) {
		Account u2 = this.DBC.getUser(userName);
		if (u2 != null) {
			if (firstName != null) {
				u2.setFirstName(firstName);
			}
			
			if (lastName != null) {
				u2.setLastName(lastName);
			}
			if (passWord != null){
				u2.setPassWord(passWord);
			} 
			
		this.DBC.setUser(u2);
		}
		return u2;
		
	}
	
	/**
	 * This method is used to logon a user and set the appropriate login status
	 * @return boolean
	 * @param userName a string of the users userName name	  
	 * @param passWord a string of the users first name
	 */
	public int logOn(String userName, String passWord) {
		this.currentAccount = new User(this.DBC.getUser(userName).getUserName(), this.DBC.getUser(userName).getPassWord(), this.DBC.getUser(userName).getAccountType(), this.DBC.getUser(userName).getFirstName(), this.DBC.getUser(userName).getLastName(),this.DBC.getUser(userName).getStatus());
		if (currentAccount != null) {
			String p2 = this.currentAccount.getPassWord();
			if (p2.equals(passWord)) {
				this.currentAccount.setLoginStatus(true);
				return 0;
			} else {
				this.currentAccount.setLoginStatus(false);
				return -2;
			}
		}
		else {
			return -1;
		}
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
	 * 
	 * @param userName the username of the account to be logged out
	 * @return boolean
	 */
	public Account logOut(String userName) {
		User acc = this.DBC.getUser(userName);
		this.currentAccount = null;
		acc.setLoginStatus(false);
			return acc;
		}

	public void addUser(String userName, String firstName, String lastName, String passWord, char type) {
		this.DBC.addNewUser(userName, firstName, lastName, passWord, type);
		
	}

	public void deleteUser(String userName) {
		this.DBC.deleteUser(userName);
		
	}

	public User getCurrentAccount() {
		return this.currentAccount;
		
	}
	}
	
