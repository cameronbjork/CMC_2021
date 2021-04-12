package cmc.account.user;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cmc.account.Account;
import cmc.account.admin.*;
import cmc.account.user.AccountController;
import junit.framework.Assert;
import systemtest.*;
import cmc.account.user.UserInteraction;

public class AccountControllerTest extends AccountController {
	private AccountController AC = new AccountController();
	private UserInteraction UI = new UserInteraction();
	
	@Before
	public void setUp() throws Exception{
		this.UI.addUser("peter", "Peter", "Ohmann", "securepassword", 'u');
	}

	@After
	public void tearDown() throws Exception {
		this.UI.deleteUser("peter");
	}

	@Test
	public void LogOnTest() {
		
		//testing the main, correct scenario, good username and password
		this.UI.userEditUser("peter", null, null, "securepassword");
		Account test1result = this.UI.logOn("peter", "securepassword");
		Assert.assertTrue("successful login", test1result.getLoginStatus() == true);
		
		//testing the scenario where an incorrect username is given
		Account test2result = this.UI.logOn("ManMadeBeast", "securepassword");
		Assert.assertTrue("failed login(wrong user)", test2result == null);
		
		//testing the scenario where an incorrect password is given
		Account test3result = this.UI.logOn("peter", "notsecurepassword");
		Assert.assertTrue("failed login(wrong pass)", test3result.getLoginStatus() == false);
		
		//testing the scenario where both an incorrect username and password are given
		Account test4result = this.UI.logOn(null, null);
		Assert.assertTrue("failed login(wrong user)", test4result == null);
		
	}
	
	

	@Test
	public void LogOutTest() {
		Account testresult = this.UI.logOut("peter");
		Assert.assertTrue("successful logout", testresult.getLoginStatus() == false);
	}

}
