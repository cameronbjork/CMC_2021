package cmc.account.user;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import cmc.account.Account;
import cmc.university.University;

/**
 * A class to manage the user interaction use cases
 * @author Joe Koller, Logan Woods, Cameron Bjork, Michael Murphy, Jalen Lindsey, Charles Becker
 *
 */
public class UserInteraction {
	private UserFunctionalityController UFC;
	private SearchController SC;
	private AccountController AC;
	
	/**
	 * A method to create User functionality, search,
	 * and account controller objects
	 */
	public UserInteraction() {
		this.UFC = new UserFunctionalityController();
		this.SC = new SearchController();
		this.AC= new AccountController();
	}
	
	//Admin can edit type and activate/deactivate account
	/**
	 * A method to edit the information of a user account, controlled by the user
	 * @param userName the new userName for the user account
	 * @param firstName the new first name for the user account
	 * @param lastName the new last name for the user account
	 * @param passWord the new password for the user account
	 * @return boolean to confirm or deny if the information was successfully changed
	 */
	public boolean userEditUser(String userName, String firstName, String lastName, String passWord) {
		return this.AC.userEditUser(userName, firstName, lastName, passWord);

	}
	/**
	 * This method displays the saved universities of a user
	 * @param username the name of the user to find the saved universities of
	 * @return  boolean to confirm or deny if the saved universities were displayed
	 */
	public boolean displaySavedUniversities(String username) {
		ArrayList<University> saved = this.UFC.displaySavedUniversities(username);
		if (saved != null) {
		return true;
		} else {
			return false;
		}
	}

	//Create most recent search method
	/**
	 * This method searches for universities based on any number of criteria
	 * @param school name of the university to be searched
	 * @param state state of the university
	 * @param location location of the university
	 * @param control type of control of the university
	 * @param minNumStudents minimum number of students of the university
	 * @param maxNumStudents maximum number of students of the university
	 * @param minPercentFemale minimum percentage of female students of the university
	 * @param maxPercentFemale maximum percentage of female students of the university
	 * @param minSATVerbal minimum SATVerbal score of the university
	 * @param maxSATVerbal maximum SATVerbal score of the university
	 * @param minSATMath minimum SATMAth score of the university
	 * @param maxSATMath maximum SATMath score of the university
	 * @param minAnnualExpenses minimum annual expenses of the university
	 * @param maxAnnualExpenses maximum annual expenses of the university
	 * @param minPercentFinancialAid minimum percentage of financial aid of the university
	 * @param maxPercentFinancialAid maximum percentage of financial aid of the university
	 * @param minNumApplicants minimum number of applicants of the university
	 * @param maxNumApplicants maximum number of applicants of the university
	 * @param minPercentAdmit minimum admission percentage of the university
	 * @param maxPercentAdmit maximum admission percentage of the university
	 * @param minPercentEnrolled minimum percentage enrolled of the university
	 * @param maxPercentEnrolled maximum percentage enrolled of the university
	 * @param minAcademicScale minimum academic scale of the university
	 * @param maxAcademicScale maximum academic scale of the university
	 * @param minSocialScale minimum social scale of the university
	 * @param maxSocialScale maximum social scale of the university
	 * @param minQOLScale minimum QOL scale of the university
	 * @param maxQOLScale maximum QOL scale of the university
	 * @param emphasis1 search emphasis 1
	 * @param emphasis2 search emphasis 2
	 * @param emphasis3 search emphasis 3
	 * @param emphasis4 search emphasis 4
	 * @param emphasis5 search emphasis 5
	 * @return boolean to confirm the search
	 */
	public ArrayList<University> searchUniversities(String school, String state, String location, String control, int minNumStudents, 
			int maxNumStudents, int minPercentFemale, int maxPercentFemale, int minSATVerbal, int maxSATVerbal, int minSATMath, int maxSATMath, int minAnnualExpenses, 
			int maxAnnualExpenses, int minPercentFinancialAid, int maxPercentFinancialAid, int minNumApplicants, int maxNumApplicants,
			int minPercentAdmit, int maxPercentAdmit, int minPercentEnrolled, int maxPercentEnrolled, int minAcademicScale, int maxAcademicScale, 
			int minSocialScale, int maxSocialScale, int minQOLScale, int maxQOLScale, String emphasis1, String emphasis2, 
			String emphasis3, String emphasis4, String emphasis5) {
		
		ArrayList<University> universities = SearchController.searchUniversities(school, state, location, control, minNumStudents, maxNumStudents, 
				minPercentFemale, maxPercentFemale, minSATVerbal, maxSATVerbal, minSATMath, maxSATMath, minAnnualExpenses, maxAnnualExpenses, minPercentFinancialAid,
				maxPercentFinancialAid, minNumApplicants, maxNumApplicants, minPercentAdmit, maxPercentAdmit, minPercentEnrolled, maxPercentEnrolled, minAcademicScale,
				maxAcademicScale, minSocialScale, maxSocialScale, minQOLScale, maxQOLScale, emphasis1, emphasis2, emphasis3, emphasis4, emphasis5);
		
		return universities;

	}
	/**
	 * A method to retrieve the top recommended universities for a user based on 
	 * another university
	 * @param uni the university to base the recommended universities off
	 * @return boolean to confirm or deny the recommended universities 
	 */
	public boolean topRecommendedUnis(University uni) {
		ArrayList<University> recommendedUnis = new ArrayList<>();
		recommendedUnis.addAll(SearchController.topRecommendedUnis(uni));
		System.out.println("Recommended Uni's in Order:\n");
		for (int i = 0; i < recommendedUnis.size(); i++) {
		System.out.println(recommendedUnis.get(i).getUniName());
		}
		return true;
	}
	
	/**
	 * A method to display the results of a search
	 * @param universities the list of all universities 
	 * @param i an integer to find the university from the list to be displayed
	 * @return University object 
	 */
	private University displaySearchResult(ArrayList<University> universities, int i) {
		return universities.get(i);
		
	}
	/**
	 * A method to log on a user and make the user active
	 * @param userName the name of the user to be logged on
	 * @param passWord the password of the user to confirm the ability to log on
	 * @return Account object
	 */
	public Account logOn(String userName, String passWord) {
		Account result = this.AC.logOn(userName, passWord);
		return result;
	}
	/**
	 * A method to log out a user and make the account inactive
	 * @param userName user name of the user to be logged out
	 * @return boolean to confirm the account was logged out
	 */
	public boolean logOut(String userName) {
		return this.AC.logOut(userName);
		
	}
	/**
	 * This method displays the profile of a user
	 * @param userName the name of the user to get the profile of
	 * @return boolean to confirm the profile was displayed
	 */
	public boolean displayProfile(String userName) {
		if (this.AC.displayProfile(userName) != null) {
			return true;
		} else {
			return false;
		}
	}
/**
 * A method to get the most recent university viewed
 * @param u the most recently searched university to be displayed
 * @return University object
 */
	public boolean getRecentUniversity(String u, University uni) {
		this.SC.getRecentUniversity(u, uni);
		return true;
}

	/**
	 * A method to remove a saved universitys
	 * @param userName the name of the user to remove the saved university from
	 * @param uni the university to be removed
	 */
	public boolean removeSavedUniversity(String userName, University uni) {
		this.UFC.removeSavedUniversity(userName, uni);
		return true;
	}

	
	/**
	 * A method to display a university
	 * @param uni the selected university to be displayed
	 * @return boolean to confirm the university was displayed
	 */
	public boolean displayUniversity(University uni) {
		this.UFC.displayUniversity(uni);
		return true;
	}
	
	/** User saves a university
	 * 
	 * @param userName to get User object from
	 * @param uni University to save to User
	 * @return boolean
	 */
	public boolean saveUniversity(String userName, University uni) {
		return this.UFC.saveUnversity(userName, uni);
	}

	
}
