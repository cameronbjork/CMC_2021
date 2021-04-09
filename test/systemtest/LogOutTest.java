package systemtest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cmc.account.Account;
import cmc.account.user.UserInteraction;
import junit.framework.Assert;

public class LogOutTest extends UserInteraction {
	private UserInteraction UI;
	
	
	@Before
	public void setUp() throws Exception {
		this.UI = new UserInteraction();
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testLogOutMain() {
		Account testresult = this.UI.logOut("peter");
		Assert.assertTrue("successful logout", testresult.getLoginStatus() == false);
	}

}
