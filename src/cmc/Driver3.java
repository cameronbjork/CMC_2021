package cmc;

import java.util.List;

import cmc.account.Account;
import cmc.account.admin.AdminInteraction;
import cmc.account.user.UserInteraction;
import cmc.university.University;

/**
 * An example of a CMC Driver...demoing only the Login use case.
 * 
 * @author Joe Koller
 */
public class Driver3 {

	/**
	 * Test scenarios for the login use case.
	 * 
	 */
	private static void runLogin(UserInteraction ui) {
		// test login main scenario (successful login)
		System.out.println("Testing login main scenario...");
		Account result = ui.logOn("peter", "securepassword");
		boolean status = result.getLoginStatus();
		System.out.println("Expected: true; Result: " + status);
		
		// test login alternate scenario #1 (bad password)
		System.out.println("Testing login alternate scenario #1...");
		Account result2 = ui.logOn("peter", "password123");
		boolean status2 = result.getLoginStatus();
		System.out.println("Expected: false; Result: " + status2);
		
		// test login alternate scenario #2 (unknown username)
		System.out.println("Testing login alternate scenario #2...");
		Account result3 = ui.logOn("doorknob", "password123");
		boolean status3 = result.getLoginStatus();
		System.out.println("Expected: false; Result: " + status3);
	
		// test login alternate scenario #3 (Inactive Status)
		System.out.println("Testing login alternate scenario #2...");
		Account result4 = ui.logOn("_______", "________");
		boolean status4 = result.getLoginStatus();
		System.out.println("Expected: false; Result: " + status4);	
		
		//test login for admin
		System.out.println("Testing login admin scenario, checking account type... ");
		Account result5 = ui.logOn("poop", "notsecurepassword");
		boolean status5;
		if(result5.getAccountType() == 'a') {
			//connect to admin main page
			status5 = true;
		} else {
			//connect to user main page
			status5 = false;
		}
		System.out.println("Expected: true; Result: " + status5);
	}



	/**
	 * 
	 * Test scenario for the searchUniversity use case
	 */	
	
	private static void runSearchUniversity(UserInteraction ui) {
		// test searchUniversity() main scenario
		System.out.println("Testing searchUniversity main scenario...");
		boolean result = ui.searchUniversities("St", "Minnesota","CHICAGO", "COMMUNITY", 1000, 3000, 65, 70, 2, 4, 2, 4, 9000, 1100, 49, 51, 999, 1001, 74, 76, 96, 98, 3, 5, 3, 5, 3, 5);
		System.out.println("Expected: true; Result: " + result);
		
		// test searchUniversity() alternate scenario (null)
		System.out.println("Testing searchUniversity null data...");
		boolean result2 = ui.searchUniversities("NULL", "NULL", "-1", "-1", -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1);
		System.out.println("Expected: false; Result: " + result2);	
	}	
	//test recentUniversity() main scenario
	private static void runRecentUniversity(UserInteraction ui) {
		University PoopSchool = new University ("PoopSchool", "Illinois", "CHICAGO", "PRIVATE", 6000, 78, 5, 5, 1000, 35, 900, 65, 67, 2, 4, 3, "EDUCATION", "NURSING", "BUSINESS","", "");
		System.out.println("Testing recentUniversity main scenario...");
		boolean result = ui.getRecentUniversity("peter", PoopSchool);
		System.out.println("Expected: true; Result: " + result);
		
		
		
	}
	/**
	 * Test scenarios for the viewSearchResults use case.
	 */	
	private static void runViewSearchResults(UserInteraction ui) {
		// test viewSearchResults main scenario
		System.out.println("Testing viewSearchResults main scenario...");
		Boolean result = ui.searchUniversities("state", 1000);
		System.out.println("Expected: true; Result: " + result);
		
		// test viewSearchResults main scenario
		System.out.println("Testing viewSearchResults alternate scenario #1 (null fields)");
		result = ui.searchUniversities();
		System.out.println("Expected: false; Result: " + result);		
	}
	/**
	 * 
	 * Test Scenarios for the viewRecommendedSchools use case.
	 */
	private static void runViewRecommendedSchools(UserInteraction ui) {
		// test viewRecommendedSchools main scenario
		System.out.println("Testing viewSearchResults main scenario...");
		boolean result = ui.viewRecommendedSchools();
		System.out.println("Expected: true; Result: " + result);		
	}
	
	/**
	 * Test Scenarios for the 
	 */
	
	
	/**
	 * Test scenarios for the view profile use case.
	 */
	private static void runViewProfile(UserInteraction ui) {
		// code here to test the "View Profile" use case...
		System.out.println("Testing viewProfile main scenario...");
		boolean result = ui.displayProfile("peter");
		System.out.println("Expected: true; Result: " + result);
	}
	
	private static void runEditProfile(UserInteraction ui) {
		System.out.println("Testing editProfile main scenario...");
		boolean result = ui.userEditUser("peter", "p", "last", "password");
		System.out.println("Expected: true; Result: " + result);
	}
	
	/**
	 * 
	 * Test scenario for the viewSavedUniversities use case
	 */
	private static void runDisplaySavedUniversities(UserInteraction ui) {
		System.out.println("Testing viewSavedUniversities main scenario...");
		boolean result = ui.displaySavedUniversities("peter");
		System.out.println("Expected: true; Result: " + result);
	}
	/**
	 * 
	 * Test scenario for the displayUniversities use case
	 */
	private static void runDisplayUniversity(UserInteraction ui, University uni) {
		System.out.println("Testing displayUniversity main scenario...");
		boolean result = ui.displayUniversity(uni);
		System.out.println("Expected: true; Result: " + result);
	}
		
	public static void runAdminEditUser(AdminInteraction ui) {
		System.out.println("Testing editProfile main scenario...");
		boolean result = ui.adminEditUser("peter", "p", "last", "password", 'u');
		System.out.println("Expected: true; Result: " + result);
	}
	

	
	/**
	 * The entry point for the Driver.
	 * 
	 * @param args unused/ignored here
	 */
	public static void main(String[] args) {
		UserInteraction ui = new UserInteraction();

		AdminInteraction ai = new AdminInteraction();

		try {
		runLogin(ui);
		//runViewProfile(ui);
		//runEditProfile(ui);
		//runSearchUniversity(ui);
		//runAdminEditUser(ai); //For admin we need viewUniversities;List and viewUsers:List
		//runViewSearchResults(ui);
		//runDisplaySavedUniversities(ui);
		//runDisplayUniversity(ui,uni);
		runRecentUniversity(ui);
		} catch (NullPointerException e) {
			System.out.println("Null");
		}
		
		//runlogOut(ui);
	}

	//Running editing user



}
	


		
	

