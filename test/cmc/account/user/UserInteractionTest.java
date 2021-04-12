package cmc.account.user;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cmc.university.University;
import junit.framework.Assert;

public class UserInteractionTest {
	private UserInteraction ui = new UserInteraction();

	@Before
	public void setUp() throws Exception {
		this.ui.addUser("Cam", "Cameron", "Bjork", "pass", 'u');
		this.ui.saveUniversity("Cam", "ST JOHNS UNIVERSITY");
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

}
