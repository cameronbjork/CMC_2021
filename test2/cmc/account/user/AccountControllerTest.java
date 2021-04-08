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
	private User userToTest;
	private AccountController AC;
	
	@Before
	public void setUp() throws Exception {
		this.userToTest = new User("ManMade", "Beast", 'u', "Horrible", "Programmer", 'Y');
		
		this.AC = new AccountController();
	}

	@After
	public void tearDown() throws Exception {
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testLoginMain() {
		Account test1result = this.AC.logOn(this.userToTest.getUserName(), this.userToTest.getPassWord());
		Assert.assertTrue("successful login",test1result.getLoginStatus() == true);
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

}
