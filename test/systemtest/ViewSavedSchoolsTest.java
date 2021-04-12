package systemtest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cmc.account.user.User;
import cmc.account.user.UserInteraction;
import junit.framework.Assert;

public class ViewSavedSchoolsTest {
	private UserInteraction UI = new UserInteraction();
	private User user = new User("Cam", "pass", 'u', "Cameron", "Bjork", 'Y');

	@Before
	public void setUp() throws Exception {
		this.UI.saveUniversity("Cam", "ST JOHNS UNIVERSITY");
	}

	@After
	public void tearDown() throws Exception {
		this.UI.removeSavedUniversity("Cam", "ST JOHNS UNIVERSITY");
	}

	@SuppressWarnings("deprecation")
	@Test
	public void viewSavedSchoolsMainTest() {
		Assert.assertNotNull(this.UI.displaySavedUniversities("Cam"));
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void viewSavedSchoolsAlternate1Test() {
		this.UI.removeSavedUniversity("Cam", "ST JOHNS UNIVERSITY");
		Assert.assertTrue(this.UI.displaySavedUniversities("Cam").size() == 0);
	}

}
