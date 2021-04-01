package cmc.account.user;

import java.util.ArrayList;
import java.util.List;

import cmc.university.University;

public class UserInteraction {
	private UserFunctionalityController UFC;
	private SearchController SC;
	private AccountController AC;
	
	
	public UserInteraction() {
		this.UFC = new UserFunctionalityController();
		this.SC = new SearchController();
		this.AC= new AccountController();
	}
	
	public boolean userEditUser(String userName, String firstName, String lastName, String passWord) {
		return this.AC.userEditUser(userName, firstName, lastName, passWord);

	}

	public boolean displaySavedUniversities(String username) {
		ArrayList<University> saved = this.UFC.displaySavedUniversities(username);
		if (saved != null) {
		return true;
		} else {
			return false;
		}
	}


	public boolean searchUniversities(String string, int numStudents) {
		ArrayList<University> universities = this.SC.searchUniversities(string, numStudents); 
		
		ArrayList<University> recUniSearch = new ArrayList<University>();
		recUniSearch.add(universities.get(0));
		
		for (int i =0; i < universities.size(); i++) {
			this.displaySearchResult(universities, i);
		}
		return true;

	}
	
	
	private University displaySearchResult(ArrayList<University> universities, int i) {
		return universities.get(i);
		
	}

	public boolean logOn(String userName, String passWord) {
		boolean result = this.AC.logOn(userName, passWord);
		return result;
	}
	
	public void logOut(String userName) {
		this.AC.logOut(userName);
	}
	
	public boolean displayProfile(String userName) {
		if (this.AC.displayProfile(userName) != null) {
			return true;
		} else {
			return false;
		}
	}
	
	public University getRecentUniversity(String u) {
		return this.SC.getRecentUniversity(u);
	}
	
	public void removeSavedUniversity(String userName, University uni) {
		this.UFC.removeSavedUniversity(userName, uni);
	}

	public boolean searchUniversities() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public void recommendedSearch(University uni) {
		this.SC.recommendedSearch(uni);
	}

	public boolean displayUniversity(University uni) {
		this.UFC.displayUniversity(uni);
		return true;
	}
	
}
