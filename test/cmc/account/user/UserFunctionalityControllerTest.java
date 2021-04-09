package cmc.account.user;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import cmc.account.user.*;


public class UserFunctionalityControllerTest {

	private UserFunctionalityController UFC;
	private DBController DBC; 
	
	@Before
	public void setUp() throws Exception {
		this.UFC = new UserFunctionalityController();
		this.DBC = new DBController();
		this.DBC.addNewUser("Jkoles", "Joe", "Koller", "goodPassword", 'u');
		this.UFC.saveUnversity("Jkoles", "SAINT JOHNS UNIVERSITY");
	}

	@After
	public void tearDown() throws Exception {
		this.DBC.deleteUser("Jkoles");
	}

	@Test
	public void testDisplayedUniversities() { 
		System.out.println(this.UFC.displaySavedUniversities(username));
		Assert.assertEquals("Test if University list is returned","ST JOHNS UNIVERSITY", this.UFC.displaySavedUniversities(username));
		
	}

}
