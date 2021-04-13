package systemtest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cmc.account.Account;
import cmc.account.user.UserInteraction;
import junit.framework.Assert;

public class UserEditUserTest {
	UserInteraction UI = new UserInteraction();

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testUserEditFirstName() {
		Account testresult1 = this.UI.userEditUser("peter", "Charlie", "Becker", "Password1234");
		Assert.assertEquals("Successful First Name change", "Charlie", testresult1.getFirstName());
	}
		
	@SuppressWarnings("deprecation")
	@Test
	public void testUserEditLastName() {
		Account testresult2 = this.UI.userEditUser("peter", "Charlie", "Becker", "Password1234");
		Assert.assertEquals("Successful Last Name change", "Becker",testresult2.getLastName());
	}
		
	@SuppressWarnings("deprecation")
	@Test
	public void testUserEditPassword() {
		Account testresult3 = this.UI.userEditUser("peter", "Charlie", "Becker", "Password1234");
		Assert.assertEquals("Successful Password change", "Password1234", testresult3.getPassWord());
	}
}

