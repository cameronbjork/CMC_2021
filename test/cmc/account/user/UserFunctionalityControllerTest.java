package cmc.account.user;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import cmc.account.user.*;


public class UserFunctionalityControllerTest extends UserFunctionalityController {
	private String username;
	private UserFunctionalityController UFC;
	private DBController DBC; 
	
	@Before
	public void setUp() throws Exception {
		this.UFC = new UserFunctionalityController();
		this.DBC = new DBController();
		this.DBC.addNewUser("Jkoles", "Joe", "Koller", "goodPassword", 'u');
		this.UFC.saveUnversity("Jkoles", "ST JOHNS UNIVERSITY");
	}

	@After
	public void tearDown() throws Exception {
		this.DBC.deleteUser("Jkoles");
	}

	@Test
	public void testDisplayedUniversities() {
		String username = "Jkoles";
		Assert.assertEquals("Test if University list is returned","ST JOHNS UNIVERSITY", this.UFC.displaySavedUniversities(username).get(0).getUniName());
	}

	@Test
	public void testSaveUniversity() {
		//university is not already in data base
		String username = "Jkoles";
		Assert.assertTrue("Test if University is saved", this.UFC.saveUnversity(username, "ST JOHNS UNIVERSITY"));
		//university is already in the saved universities list
		this.UFC.saveUnversity(username, ("ALBANY"));
		Assert.assertFalse("Test if University is not saved because it has already been saved", this.UFC.saveUnversity(username, "ALBANY"));
	}
	
	@Test
	public void testRemoveSavedUniversity() {
		String username = "Jkoles";
		this.UFC.saveUnversity("Jkoles","YALE");
		Assert.assertTrue("Test if University is removed", this.UFC.removeSavedUniversity(username, "ST JOHNS UNIVERSITY"));
	}
	
	
	
	
	
	
	
}
