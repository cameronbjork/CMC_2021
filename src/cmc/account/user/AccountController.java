/**
 * 
 */
package cmc.account.user;

import cmc.account.Account;

/**
 * @author cbjork001
 *
 */
public class AccountController {
	private DBController DBC;

	public void userEditUser(String userName, String firstName, String lastName, String passWord) {
		User u2 = DBC.getUser(userName);
		if (u2 != null) {
			if (firstName != null) {
				u2.setFirstName(firstName);
			}else if (lastName != null) {
				u2.setLastName(lastName);
			}else if (passWord != null){
				u2.setpassWord(passWord);
			}			
		}
	}
	
	public void logOn(String userName, String passWord) {
		Account acc = DBC.getAccount(userName);
	}
	
	
}
