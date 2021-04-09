package systemtest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cmc.account.Account;
import cmc.account.user.UserInteraction;
import junit.framework.Assert;

public class LogOutTest extends UserInteraction {
	private UserInteraction UI = new UserInteraction();
	
	
	@Before
	public void setUp() throws Exception {
		this.UI.addUser("peter", "Peter", "Ohmann", "securepassword", 'u');
	}

	@After
	public void tearDown() throws Exception {
		this.UI.deleteUser("peter");
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testLogOutMain() {
		Account testresult = this.UI.logOut("peter");
		Assert.assertTrue("successful logout", testresult.getLoginStatus() == false);
	}

}
