package cmc.account.user;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cmc.account.Account;
import cmc.university.University;
import junit.framework.Assert;

public class UserInteractionTest {
	private UserInteraction ui = new UserInteraction();
	private ArrayList<University> searchResults;

	@Before
	public void setUp() throws Exception {
		this.ui.addUser("Cam", "Cameron", "Bjork", "pass", 'u');
		this.ui.saveUniversity("Cam", "ST JOHNS UNIVERSITY");
		this.searchResults = new ArrayList<University>();
	}

	@After
	public void tearDown() throws Exception {
		this.ui.deleteUser("Cam");
	}

	@SuppressWarnings("deprecation")
	@Test
	public void userEditUserTest() {
		this.ui.userEditUser("Cam", "Cameron1", "Bjork", null);
		Assert.assertTrue(this.ui.displayProfile("Cam").getFirstName().equals("Cameron1"));
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void displaySavedUniversities() {
		Assert.assertTrue(this.ui.displaySavedUniversities("Cam") != null);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void searchUniversitiesTest() {
		this.searchResults = this.ui.searchUniversities("St", "Minnesota","CHICAGO", "COMMUNITY", 1000, 3000, 65, 70, 2, 4, 2, 4, 9000, 1100, 49, 51, 999, 1001, 74, 76, 96, 98, 3, 5, 3, 5, 3, 5, "MATH", "NULL", "NULL", "NULL", "NULL");
		Assert.assertNotNull(this.searchResults);
		}
	
	@SuppressWarnings("deprecation")
	@Test
	public void topRecommendedUnisTest() {
		Assert.assertTrue(this.ui.topRecommendedUnis(this.searchResults.get(0)) != null);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void logOnTest() {
		Account acc = this.ui.logOn("Cam", "pass");
		Assert.assertTrue(acc.getLoginStatus() == true);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void logOutTest() {
		Account acc = this.ui.logOn("Cam", "pass");
		this.ui.logOut("Cam");
		Assert.assertTrue(acc.getLoginStatus() == false);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void displayProfileTest() {
		Assert.assertTrue(this.ui.displayProfile("Cam").getFirstName().equals("Cameron1"));
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void displayRecentUniversityTest() {
		Assert.assertNotNull(this.ui.getRecentUniversity("Cam"));
	}

}
