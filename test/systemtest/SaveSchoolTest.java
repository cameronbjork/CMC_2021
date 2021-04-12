package systemtest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import cmc.account.user.UserInteraction;

public class SaveSchoolTest {
	private UserInteraction UI = new UserInteraction();

	@Before
	public void setUp() throws Exception {
		this.UI.addUser("Cam", "Cameron", "Bjork", "pass", 'u');
		this.UI.saveUniversity("Cam", "ST JOHNS UNIVERSITY");
	}

	@After
	public void tearDown() throws Exception {
		this.UI.deleteUser("Cam");
	}

	@Test
	public void saveSchoolMainTest() {
		this.UI.saveUniversity("Cam", "ST JOHNS UNIVERSITY");
		Assert.assertNotNull(this.UI.displayProfile("Cam").getSavedUniversities());
	}

}
