package cmc.account.user;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cmc.account.Account;
import cmc.university.University;
import junit.framework.Assert;

public class DBControllerTest extends DBController {
	private DBController DBC = new DBController();

	@Before
	public void setUp() throws Exception {
		this.DBC.addNewUser("peter", "Peter", "Ohmann", "securepassword", 'u');
		this.DBC.addUniversity("MY SCHOOL", "Minnesota", "SMALL-CITY", "PUBLIC", 5000, 25.0, 750.0, 750.0, 10000.99, 10.0, 3500, 50.0, 25.0, 5, 5, 5, "MATH", null, null, null, null);
	}

	@After
	public void tearDown() throws Exception {
		this.DBC.deleteUser("peter");
		this.DBC.removeUniversity("MY SCHOOL");
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
		Assert.assertTrue("Size of UniList is 178", this.DBC.getAllUniversities().size() >= 178);
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
	
	@SuppressWarnings("deprecation")
	@Test
	public void getUniversityByNameTest() {
		Assert.assertEquals("ST JOHNS UNIVERSITY is returned", "ST JOHNS UNIVERSITY", this.DBC.getUniversityByName("ST JOHNS UNIVERSITY").getUniName());
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void setUserTest() {
		Account acc = this.DBC.getAccount("peter");
		acc.setPassWord("securepassword1");
		this.DBC.setUser(acc);
		Assert.assertEquals("peter password set to securepassword1", "securepassword1", this.DBC.getAccount("peter").getPassWord());
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void addUniversityTest() {
		Assert.assertEquals("MY SCHOOL added in setUp() is returned", "MY SCHOOL", this.DBC.getUniversityByName("MY SCHOOL").getUniName());
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void setAllUniversitiesTest() {
		this.DBC.setAllUniversities();
		Assert.assertTrue("Universities list > 0", this.DBC.getAllUniversities().size() > 0);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void removeUniversityTest() {
		this.DBC.removeUniversity("MY SCHOOL");
		Assert.assertNull(this.DBC.getUniversityByName("MY SCHOOL"));
		this.DBC.addUniversity("MY SCHOOL", "Minnesota", "SMALL-CITY", "PUBLIC", 5000, 25.0, 750.0, 750.0, 10000.99, 10.0, 3500, 50.0, 25.0, 5, 5, 5, "MATH", null, null, null, null);
		}
	
	@SuppressWarnings("deprecation")
	@Test
	public void university_getAllUniversitiesAndEmphasisTest() {
		Assert.assertTrue(this.DBC.university_getAllUniversitiesAndEmphasis().length > 0);
	}
	
	public void setAllUniversity() {
		
	}

}
