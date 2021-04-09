package cmc.account.user;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import cmc.account.user.*;


public class UserFunctionalityControllerTest {

	private String username;
	private UserFunctionalityController UFC;
	
	@Before
	public void setUp() throws Exception {
		this.UFC = new UserFunctionalityController();
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testDisplayedUniversities() {
		username = "peter"; 
		Assert.assertEquals("Test if University list is returned","ST JOHNS UNIVERSITY",this.UFC.displaySavedUniversities(username);
		
	}

}
