package systemtest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cmc.account.user.User;
import cmc.account.user.UserInteraction;
import junit.framework.Assert;

public class ViewProfileTest {
	private UserInteraction ui = new UserInteraction();
	private User user = new User("Cam", "pass", 'u', "Cameron", "Bjork", 'Y');

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@SuppressWarnings("deprecation")
	@Test
	public void viewProfileMainTest() {
		Assert.assertTrue(this.ui.displayProfile("Cam") != null);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void viewProfileAlternate1Test() {
		Assert.assertNull(this.ui.displayProfile("not a profile"));
	}

}
