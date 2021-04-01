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

	public boolean displaySavedUniversities(String username) {
		UFC.displaySavedUniversities(username);
		return true;
	}

	public boolean searchUniversities(String string, int numStudents) {
		ArrayList<University> universities = SC.searchUniversities(string, numStudents); 
		
		for (int i =0; i < universities.size(); i++) {
			this.displaySearchResult(universities, i);
		}
		
		if (universities == null) {
		return false;
		} else {
			return true;
		}
	}
	
	private University displaySearchResult(ArrayList<University> unis, int i) {
		return unis.get(i);
		
	}

	public boolean logOn(String userName, String passWord) {
		return AC.logOn(userName, passWord);
	}
	
	public void displayProfile(String userName) {
		AC.displayProfile(userName);
	}
	
	public University getRecentUniversity(String u) {
		return SC.getRecentUniversity(u);
	}
	
	public void removeSavedUniversity(String userName, University uni) {
		UFC.removeSavedUniversity(userName, uni);
	}
	
}
