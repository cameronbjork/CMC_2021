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
		String p2 = acc.getPassWord();
		if (p2.equals(passWord)) {
			acc.setLoginStatus(true);
		} else {
			acc.setLoginStatus(false);
		}
		return acc;
	}

	public User displayProfile(String userName) {
		return DBC.getUser(userName);
	}

	public void logOut(String userName) {
		Account acc = this.DBC.getUser(userName);
		acc.setLoginStatus(false);
	}
	
}
