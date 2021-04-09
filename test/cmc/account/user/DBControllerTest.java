package cmc.account.user;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class DBControllerTest extends DBController {
	private DBController DBC = new DBController();

	@Before
	public void setUp() throws Exception {
		this.DBC.addNewUser("peter", "Peter", "Ohmann", "securepassword", 'u');
	}

	@After
	public void tearDown() throws Exception {
		this.DBC.deleteUser("peter");
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testGetAccount() {
		//for loop doesn't execute
		this.DBC.clearAllAccounts();
		Assert.assertNull("Account is null", this.DBC.getAccount("peter"));
		this.DBC.setAllAccounts();
		
		//for loop does execute
		Assert.assertEquals("Account is peter", "peter", this.DBC.getAccount("peter").getUserName());
		
		//userName matches
		Assert.assertEquals("Account is peter", "peter", this.DBC.getAccount("peter").getUserName());
		
		//userName doesn't match
		Assert.assertNull("Account is null", this.DBC.getAccount("wawa"));
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void getAllUniversitiesTest() {
		Assert.assertEquals("Size of UniList is 178", 178, this.DBC.getAllUniversities().size());
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void clearAllAccountsTest() {
		this.DBC.clearAllAccounts();
		Assert.assertEquals("When accounts are cleared, size is 0", this.DBC.allAccounts.size(), 0);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void setAllAccountsTest() {
		this.DBC.setAllAccounts();
		Assert.assertTrue(this.DBC.allAccounts.size() > 0);
	}
	
	

}
