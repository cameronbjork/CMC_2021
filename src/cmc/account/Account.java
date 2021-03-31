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
	
	public Account(String userName, String passWord, char accountType, String firstName, String lastName) {
		this.userName = userName;
		this.passWord = passWord;
		this.accountType = accountType;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the passWord
	 */
	public String getPassWord() {
		return passWord;
	}

	/**
	 * @param passWord the passWord to set
	 */
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	/**
	 * @return the accountType
	 */
	public char getAccountType() {
		return accountType;
	}

	/**
	 * @param accountType the accountType to set
	 */
	public void setAccountType(char accountType) {
		this.accountType = accountType;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the loginStatus
	 */
	public boolean isLoginStatus() {
		return loginStatus;
	}

	/**
	 * @param loginStatus the loginStatus to set
	 */
	public void setLoginStatus(boolean loginStatus) {
		this.loginStatus = loginStatus;
	}
	
	
	
}
