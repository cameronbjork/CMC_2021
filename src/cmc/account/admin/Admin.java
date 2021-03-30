/**
 * 
 */
package cmc.account.admin;

import cmc.account.Account;

/**
 * @author Cameron
 *
 */
public class Admin extends Account {
	
	public Admin(String userName, String passWord, char accountType, String firstName, String lastName,
			boolean loginStatus) {
		super(userName, passWord, accountType, firstName, lastName, loginStatus);
	}
	
}
