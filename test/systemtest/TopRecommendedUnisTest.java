package systemtest;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cmc.account.user.UserInteraction;
import cmc.university.University;
import junit.framework.Assert;

public class TopRecommendedUnisTest extends UserInteraction {
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

	@SuppressWarnings("deprecation")
	@Test
	public void testTopRecommendedUniversitiesMain() {
		ArrayList<University> recommended = new ArrayList<University>();
		recommended.addAll(this.UI.topRecommendedUnis(this.testUni));
		Assert.assertNotNull(recommended);
		Assert.assertEquals("The school with the most keys is returned first", "COLGATE", recommended.get(0).getUniName());
	}

}
