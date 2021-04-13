package cmc.account.user;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import cmc.university.University;

public class UserTest {
	private User u  = new User("cam", "pass", 'u', "Cameron", "Bjork", 'Y');
	private University uni = new University("MY SCHOOL", "Minnesota", "SMALL-CITY", "PUBLIC", 5000, 25.0, 750.0, 750.0, 10000.99, 10.0, 3500, 50.0, 25.0, 5, 5, 5);


	@Before
	public void setUp() throws Exception {
		this.u.addSavedUniversities(uni);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void addSavedUniversitiesTest() {
		this.u.addSavedUniversities(uni);
		Assert.assertTrue(this.u.getSavedUniversities().contains(uni));
	}
	
	@Test
	public void getSavedUniversitiesTest() {
		Assert.assertTrue(this.u.getSavedUniversities().contains(uni));
	}
	
	@Test
	public void removeSavedUniversityTest() {
		this.u.removeSavedUniversity(uni);
		Assert.assertTrue(this.u.getSavedUniversities().size() == 0);
	}

}
