/**
 * 
 */
package cmc.account.user;

import cmc.account.Account;

/**
 * @author cbjork001
 *
 */
public class DBController {
	private User user1;

	public User getUser(String userName) {
		// TODO Auto-generated method stub
		return user1;
	}
	
	public User getAccount(String userName) {
		User user2 = new User("peter", "securepassword",'u', "peter","Ohmann");
		return user2;
}
}
