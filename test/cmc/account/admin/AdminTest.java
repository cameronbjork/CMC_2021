package cmc.account.admin;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AdminTest {
	private Admin ad  = new Admin("cam", "pass", 'a', "Cameron", "Bjork", 'Y');

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void adminTest() {
		Assert.assertNotNull(this.ad);
	}

}
