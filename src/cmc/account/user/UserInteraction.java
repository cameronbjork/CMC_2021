package cmc.account.user;

import java.util.List;

public class UserInteraction {
	private UserFunctionalityController UFC;
	private SearchController SC;
	private AccountController AC;
	
	public void userEditUser(String userName, String firstName, String lastName, String passWord) {
		AC.userEditUser(userName, firstName, lastName, passWord);
	}

	public Boolean displaySavedUniversities(String username) {
		UFC.displaySavedUniversities(username);
		return true;
	}

	public Boolean searchUniversity(String string, String string2) {
		SC.searchUniversities(string,string2);
		if (string != null && string2 != null) {
		return true;
		} else {
			return false;
		}
	}
	
	public boolean logOn(String userName, String passWord) {
		return AC.logOn(userName, passWord);
	}
	
	public void displayProfile(String userName) {
		AC.displayProfile(userName);
	}
	
}
