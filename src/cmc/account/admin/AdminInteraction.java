package cmc.account.admin;

import cmc.account.user.AccountController;
import cmc.account.admin.AdminFunctionalityController;

public class AdminInteraction {

	private AdminFunctionalityController AFC;
	private AccountController AC;
	
	
	public AdminInteraction() {
		this.AFC = new AdminFunctionalityController();
		this.AC= new AccountController();
	
	}
	
	public boolean adminEditUser(String userName, String firstName, String lastName, String passWord, char type) {
		this.AFC.adminEditUser(userName, firstName, lastName, passWord, type);
		return true;
	}
}
