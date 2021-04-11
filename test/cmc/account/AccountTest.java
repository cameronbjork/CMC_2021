package cmc.account;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cmc.account.user.User;
import junit.framework.Assert;

public class AccountTest extends Account {
	public AccountTest() {
		super("cameron", "pass", 'u', "Cam", "Bjork", 'Y');
	}

	private User acc;

	@Before
	public void setUp() throws Exception {
		this.acc = new User("cameron", "pass", 'u', "Cam", "Bjork", 'Y');
	}

	@After
	public void tearDown() throws Exception {
	}

	@SuppressWarnings("deprecation")
	@Test
	public void getUserNametest() {
		Assert.assertTrue(this.acc.getUserName().equals("cameron"));
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void getPassWordTest() {
		Assert.assertTrue(this.acc.getPassWord().equals("pass"));
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void getAccountTypeTest() {
		Assert.assertTrue(this.acc.getAccountType() == 'u');
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void getFirstNameTest() {
		Assert.assertTrue(this.acc.getFirstName().equals("Cam"));
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void getLastNameTest() {
		Assert.assertTrue(this.acc.getLastName().equals("Bjork"));
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void getLoginStatusTest() {
		Assert.assertTrue(this.acc.getLoginStatus() == false);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void getStatusTest() {
		Assert.assertTrue(this.acc.getStatus() == 'Y');
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void setUserNameTest() {
		this.acc.setUserName("cam");
		Assert.assertTrue(this.acc.getUserName().equals("cam"));
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void setPassWordTest() {
		this.acc.setPassWord("pass1");
		Assert.assertTrue(this.acc.getPassWord().equals("pass1"));
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void setAccountTypeTest() {
		this.acc.setAccountType('a');
		Assert.assertTrue(this.acc.getAccountType() == 'a');
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void setFirstNameTest() {
		this.acc.setFirstName("Cameron");
		Assert.assertTrue(this.acc.getFirstName().equals("Cameron"));
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void setLastNameTest() {
		this.acc.setLastName("bjork");
		Assert.assertTrue(this.acc.getLastName().equals("bjork"));
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void setLoginStatusTest() {
		this.acc.setLoginStatus(true);
		Assert.assertTrue(this.acc.getLoginStatus() == true);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void setStatusTest() {
		this.acc.setStatus('N');
		Assert.assertTrue(this.acc.getStatus() == 'N');
	}

}
