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
		username = "Jkoles";
		Assert.assertEquals("Test if University list is returned","ST JOHNS UNIVERSITY", this.UFC.displaySavedUniversities(username));
	}

	@Test
	public void testSaveUniversity() {
		username = "Jkoles";
		Assert.assertTrue("Test if University list is returned", this.UFC.saveUnversity(username, "YALE"));
	}
	
	@Test
	public void testRemoveSavedUniversity() {
		username = "Jkoles";
		this.UFC.saveUnversity("Jkoles","YALE");
		Assert.assertTrue("Test if University list is returned", this.UFC.removeSavedUniversity(username, this.DBC.getUniversityByName("Yale")));
	}
	
	
	
	
	
	
	
}
