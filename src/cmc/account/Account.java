/**
 * 
 */
package cmc.account;

/**
 * 
 * Class for implementing the accounts of all users 
 * @author Cameron Bjork, Joe koller, Logan Woods, Jaren Lindsey, Michael Murphy
 *
 */
public abstract class Account {
	private String userName;
	private String passWord;
	private char accountType;
	private String firstName;
	private String lastName;
	private boolean loginStatus;
	
	/**
	 * 
	 * @param userName - Username of account
	 * @param passWord - Password of account
	 * @param accountType - Account type of account
	 * @param firstName - First name of account
	 * @param lastName - Last name of account
	 */
	public Account(String userName, String passWord, char accountType, String firstName, String lastName) {
		this.userName = userName;
		this.passWord = passWord;
		this.accountType = accountType;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	/**
	 * This method is used to return the name of a user as a string
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * This method sets the name of the user to a passed in string
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * This method gets the password of a user and returns a string
	 * @return the passWord
	 */
	public String getPassWord() {
		return passWord;
	}

	/**
	 * This method sets the password of a user given a string
	 * @param passWord the passWord to set
	 */
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	/**
	 * This method gets the account type of a user
	 * @return the accountType(char)
	 */
	public char getAccountType() {
		return accountType;
	}

	/**
	 * This method sets the account type for a  user given the account type(char)
	 * @param accountType the accountType to set
	 */
	public void setAccountType(char accountType) {
		this.accountType = accountType;
	}

	/**
	 * This method gets the first name of a user
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * This method sets the first name of a user
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * This method gets the last name of a user
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * This method sets the last name of a user
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * This method gets the login status of a user
	 * @return the loginStatus
	 */
	public boolean isLoginStatus() {
		return loginStatus;
	}

	/**
	 * This method sets the login status of a user
	 * @param loginStatus the loginStatus to set
	 */
	public void setLoginStatus(boolean loginStatus) {
		this.loginStatus = loginStatus;
	}
	
	/** Gets the login status back to user
	 * 
	 * @return loginStatus boolean to check if loggedin
	 */
	public boolean getLoginStatus(){
		return this.loginStatus;
	}
	
	
	
}
