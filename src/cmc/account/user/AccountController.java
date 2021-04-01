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
	
	public AccountController() {
		this.DBC = new DBController();
	}

	public void userEditUser(String userName, String firstName, String lastName, String passWord) {
		User u2 = this.DBC.getUser(userName);
		if (u2 != null) {
			if (firstName != null) {
				u2.setFirstName(firstName);
			}else if (lastName != null) {
				u2.setLastName(lastName);
			}else if (passWord != null){
				u2.setPassWord(passWord);
			}			
		}
		DBC.setUser(u2);
	}
	
	public boolean logOn(String userName, String passWord) {
		User acc = this.DBC.getAccount(userName);
		String p2 = acc.getPassWord();
		if (p2.equals(passWord)) {
			acc.setLoginStatus(true);
			return true;
		} else {
			return false;
		}
	}

	public User displayProfile(String userName) {
		return DBC.getUser(userName);
	}
	
}
