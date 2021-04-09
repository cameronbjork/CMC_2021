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
	public void testGetUser() {
		this.DBC.clearAllAccounts();
		Assert.assertNull(this.DBC.getUser("peter"));
		this.DBC.setAllAccounts();
	}

}
