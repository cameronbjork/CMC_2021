package cmc.account.user;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cmc.account.Account;
import cmc.account.admin.*;
import cmc.account.user.*;
import junit.framework.Assert;

public class AccountControllerTest extends AccountController {
	private AccountController AC;
	
	@Before
	public void setUp() throws Exception{
		this.AC = new AccountController();
	}

	@After
	public void tearDown() throws Exception {
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testLoginMain() {
		Account test1result = this.AC.logOn("peter", "securepassword");
		Assert.assertTrue("successful login",test1result.getLoginStatus() == true);
	}
	//wrong username
	@SuppressWarnings("deprecation")
	@Test
	public void testLoginAlternate1() {
		Account test2result = this.AC.logOn("ManMadeBeast", "securepassword");
		Assert.assertTrue("failed login(wrong user)", test2result.getLoginStatus() == false);
	}
	//wrong password
	@SuppressWarnings("deprecation")
	@Test
	public void testLoginAlternate2() {
		Account test3result = this.AC.logOn("peter", "notsecurepassword");
		Assert.assertTrue("failed login(wrong pass)", test3result.getLoginStatus() == false);
	}
	//null data
	@SuppressWarnings("deprecation")
	@Test
	public void testLoginAlternate3() {
		Account test4result = this.AC.logOn("", "");
		Assert.assertTrue("failed login(wrong user)", test4result.getLoginStatus() == false);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testLogOutMain() {
		Account test5result = this.AC.logOut("peter");
		Assert.assertTrue("successful logout", test5result.getLoginStatus() == false);
	}

}
