/**
 * 
 */
package cmc.account.admin;

import cmc.account.Account;

/** Creates an Admin Object
 * 
 * @author Cameron, Charlie, Joe, Michael, Logan, Jaren
 *
 */
public class Admin extends Account {
	
	/** Creates Admin Object
	 * 
	 * @param userName - Username of admin
	 * @param passWord - Password of admin
	 * @param accountType - Account type of admin
	 * @param firstName - First Name of admin
	 * @param lastName - Last Name of admin
	 */
	public Admin(String userName, String passWord, char accountType, String firstName, String lastName, char status) {
		super(userName, passWord, accountType, firstName, lastName, status);
	}
	

}
