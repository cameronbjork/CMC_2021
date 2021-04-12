package systemtest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cmc.account.user.UserInteraction;
import junit.framework.Assert;

public class RemoveSavedSchoolTest {
	private UserInteraction UI = new UserInteraction();

	@Before
	public void setUp() throws Exception {
		this.UI.addUser("Cam", "Cameron", "Bjork", "pass", 'u');
		this.UI.saveUniversity("Cam", "ST JOHNS UNIVERSITY");
	}

	@After
	public void tearDown() throws Exception {
		this.UI.deleteUser("Cam");
		this.UI.removeSavedUniversity("Cam", "ST JOHNS UNIVERSITY");
	}

	@SuppressWarnings("deprecation")
	@Test
	public void RemoveSavedSchoolMainTest() {
		this.UI.removeSavedUniversity("Cam", "ST JOHNS UNIVERSITY");
		Assert.assertTrue(this.UI.displaySavedUniversities("Cam").size() < 1);
	}

}
