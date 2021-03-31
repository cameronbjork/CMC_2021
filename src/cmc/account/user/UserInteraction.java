package cmc.account.user;

import java.util.ArrayList;
import java.util.List;

import cmc.university.University;

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
		ArrayList<University> universities = SC.searchUniversities(string,string2); 
		if (universities == null) {
		return false;
		} else {
			return true;
		}
	}
	
	public University getRecentUniversity(String u) {
		return SC.getRecentUniversity(u);
		
		
	}
}
