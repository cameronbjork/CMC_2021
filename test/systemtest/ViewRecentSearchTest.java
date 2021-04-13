package systemtest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cmc.account.user.UserInteraction;
import junit.framework.Assert;

public class ViewRecentSearchTest {
	private UserInteraction UI = new UserInteraction();

	@Before
	public void setUp() throws Exception {
		this.UI.addUser("Cam", "Cameron", "Bjork", "pass", 'u');
		this.UI.setRecentUniversity("Cam", "ST JOHNS UNIVERSITY");
	}

	@After
	public void tearDown() throws Exception {
		this.UI.deleteUser("Cam");
	}

	@SuppressWarnings("deprecation")
	@Test
	public void viewRecentSearchMainTest() {
		Assert.assertNotNull(this.UI.getRecentUniversity("Cam"));
	}

}
