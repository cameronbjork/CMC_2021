package cmc.account.admin;

import cmc.account.user.AccountController;
import cmc.account.admin.AdminFunctionalityController;

public class AdminInteraction {

	private AdminFunctionalityController AFC;
	private AccountController AC;
	
	/**
	 * A method to create User functionality, search,
	 * and account controller objects
	 */
	public AdminInteraction() {
		this.AFC = new AdminFunctionalityController();
		this.AC= new AccountController();
	
	}
	
	/**
	 * A method to edit the information of a user account, controlled by the admin
	 * @param userName the new userName for the user account
	 * @param firstName the new first name for the user account
	 * @param lastName the new last name for the user account
	 * @param passWord the new password for the user account
	 * @return boolean to confirm or deny if the information was successfully changed
	 */
	public boolean adminEditUser(String userName, String firstName, String lastName, String passWord, char type) {
		this.AFC.adminEditUser(userName, firstName, lastName, passWord, type);
		return true;
	}
}
