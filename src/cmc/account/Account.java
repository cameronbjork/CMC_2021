/**
 * 
 */
package cmc.account;

/**
 * @author cbjork001
 *
 */
public abstract class Account {
	private String userName;
	private String passWord;
	private char accountType;
	private String firstName;
	private String lastName;
	private boolean loginStatus;
	
	public Account(String userName, String passWord, char accountType, String firstName, String lastName,
			boolean loginStatus) {
		this.userName = userName;
		this.passWord = passWord;
		this.accountType = accountType;
		this.firstName = firstName;
		this.lastName = lastName;
		this.loginStatus = loginStatus;
	}
	
	
	
}
