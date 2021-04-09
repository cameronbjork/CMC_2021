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

public class AccountControllerTest extends AccountController {
	private AccountController AC = new AccountController();
	
	@Before
	public void setUp() throws Exception{
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
	//empty data
	@SuppressWarnings("deprecation")
	@Test
	public void testLoginAlternate3() {
		Account test4result = this.AC.logOn("", "");
		Assert.assertTrue("failed login(wrong user)", test4result.getLoginStatus() == false);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testUserEditFirstName() {
		Account testresult1 = this.AC.userEditUser("peter", "Charlie", "Becker", "Password1234");
		Assert.assertEquals("Successful First Name change", "Charlie", testresult1.getFirstName());
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testUserEditLastName() {
		Account testresult2 = this.AC.userEditUser("peter", "Charlie", "Becker", "Password1234");
		Assert.assertEquals("Successful Last Name change", "Becker",testresult2.getLastName());
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testUserEditPassword() {
		Account testresult3 = this.AC.userEditUser("peter", "Charlie", "Becker", "Password1234");
		Assert.assertEquals("Successful Password change", "Password1234", testresult3.getPassWord());
	}
	//public void testLoginAlternate1() {
		//boolean test2reult = AccountController.logOn("ManMade", "WRONG PASS", 'u', "Horrible", "Programmer", 'Y');
		//Assert.assertFalse("failed login(wrong pass)", test2 result);
	//}

	
	@SuppressWarnings("deprecation")
	@Test
	public void testLogOutMain() {
		Account test5result = this.AC.logOut("peter");
		Assert.assertEquals("successful logout", false, test5result.getLoginStatus());
	}

}
