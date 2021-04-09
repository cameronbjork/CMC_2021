package systemtest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cmc.account.Account;
import cmc.account.user.UserInteraction;
import junit.framework.Assert;

public class LogOnTest extends UserInteraction {
	private UserInteraction UI;
	
	
	@Before
	public void setUp() throws Exception {
		this.UI = new UserInteraction();
		this.UI.addUser("peter", "Peter", "Ohmann", "securepassword", 'u');
	}

	@After
	public void tearDown() throws Exception {
		this.UI.deleteUser("peter");
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testLoginMain() {
		Account test1result = this.UI.logOn("peter", "securepassword");
		Assert.assertTrue("successful login",test1result.getLoginStatus() == true);
	}
	//wrong username
	@SuppressWarnings("deprecation")
	@Test
	public void testLoginAlternate1() {
		Account test2result = this.UI.logOn("ManMadeBeast", "securepassword");
		Assert.assertTrue("failed login(wrong user)", test2result == null);
	}
	//wrong password
	@SuppressWarnings("deprecation")
	@Test
	public void testLoginAlternate2() {
		Account test3result = this.UI.logOn("peter", "notsecurepassword");
		Assert.assertTrue("failed login(wrong pass)", test3result.getLoginStatus() == false);
	}
	//null data
	@SuppressWarnings("deprecation")
	@Test
	public void testLoginAlternate3() {
		Account test4result = this.UI.logOn(null, null);
		Assert.assertTrue("failed login(wrong user)", test4result == null);
	}
	
	
}
