package cmc.account.user;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cmc.account.user.SearchController;
import cmc.account.user.UserInteraction;
import cmc.university.University;
import junit.framework.Assert;

//Test only from the UI
@SuppressWarnings("deprecation")
public class SearchControllerTest {
	private University testUni;
	private UserInteraction UI;

	@Before
	public void setUp() throws Exception {
		this.testUni = new University("St Johns", "Minnesota", "SMALL-CITY", "PRIVATE", 3000, 2, 3, 3, 10000, 50, 1000, 75, 97, 4, 3, 3, "MATH", "HISTORY", "SCIENCE", "PHYSICS", "NURSING");

		this.UI = new UserInteraction();
		
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testSearchUniversities() {
		
	}
	
	@Test
	public void testRecommendedUniversities() {
		
	}
	
	/**@SuppressWarnings("deprecation")
	@Test
	public void testGetAllUniversities() {
		this.allUnis  = new ArrayList<University>();
		this.allUnis.addAll(this.UI.DBC.getAllUniversities());
		Assert.assertTrue("Returns arraylist with all universities", this.allUnis.size() > 0);
		//Whatever is first in DB
		Assert.assertEquals("ABILENE CHRISTIAN UNIVERSITY", this.allUnis.get(0).getUniName());
	} **/
	
	/**@Test
	public void testGetUniName() {
		Assert.assertEquals("ABILENE CHRISTIAN UNIVERSITY", this.allUnis.get(0).getUniName());
	}
**/
}
