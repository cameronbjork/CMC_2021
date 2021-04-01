package cmc;

import java.util.List;

import cmc.account.user.UserInteraction;

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
		boolean result = ui.logOn("peter", "securepassword");
		System.out.println("Expected: true; Result: " + result);

		// test login alternate scenario #1 (bad password)
		System.out.println("Testing login alternate scenario #1...");
		boolean result2 = ui.logOn("peter", "password123");
		System.out.println("Expected: false; Result: " + result2);
		
		// test login alternate scenario #2 (unknown username)
		System.out.println("Testing login alternate scenario #2...");
		boolean result3 = ui.logOn("doorknob", "password123");
		System.out.println("Expected: false; Result: " + result3);
	
		// test login alternate scenario #3 (Inactive Status)
		System.out.println("Testing login alternate scenario #2...");
		boolean result4 = ui.logOn("_______", "________");
		System.out.println("Expected: false; Result: " + result4);		
	}

	/**
	 * 
	 * Test scenario for the searchUniversity use case
	 */	
	
	private static void runSearchUniversity(UserInteraction ui) {
		// test searchUniversity() main scenario
		System.out.println("Testing searchUniversity main scenario...");
		boolean result = ui.searchUniversities("Minnesota", 3000);
		System.out.println("Expected: true; Result: " + result);
		
		// test searchUniversity() alternate scenario (null)
		System.out.println("Testing searchUniversity null data...");
		boolean result2 = ui.searchUniversities();
		System.out.println("Expected: false; Result: " + result2);
		
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
	 * Test scenario for the logOut use case
	 */		
	private static void logOut(UserInteraction ui) {
		// test logOut() main scenario
		System.out.println("Testing logOut() main scenario...");
		boolean result = ui.logOut();
		System.out.println("Expected: false; Result: " + result);		
	}
	

	/**
	 * The entry point for the Driver.
	 * 
	 * @param args unused/ignored here
	 */
	public static void main(String[] args) {
		UserInteraction ui = new UserInteraction();
		try {
		runLogin(ui);
		runViewProfile(ui);
		runEditProfile(ui);
		runSearchUniversity(ui);
		runViewSearchResults(ui);
		//runDisplaySavedUniversities(ui);
		} catch (NullPointerException e) {
			System.out.println("Null");
		}
		
		//runlogOut(ui);
		
	}

	//Running editing user
	public static void runAdminEditUser(a
			dminInteraction ui) {
		System.out.println("First name was peter");
		boolean result = ui.adminEditUser("peter", "jake", "FromStateFarm", "notSecure", 'u');
// NEEDS WORK COME BACK TO ME MIKEL
		
		
	}
	
}
