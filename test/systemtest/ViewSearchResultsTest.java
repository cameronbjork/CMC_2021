package systemtest;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cmc.account.user.UserInteraction;
import cmc.university.University;
import junit.framework.Assert;

public class ViewSearchResultsTest {
	private UserInteraction UI = new UserInteraction();

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@SuppressWarnings("deprecation")
	@Test
	public void ViewSearchResultsMainTest() {
		ArrayList<University> testSearchResults = new ArrayList<University>();
		
		String school = "ST JOHNS";
		String state = "Minnesota";
		String location = "SMALL-CITY";
		String control = "PRIVATE"; 
		int minNumStudents = 2999;
		int maxNumStudents = 3001;
		int minPercentFemale = 1; 
		int maxPercentFemale = 3;
		int minSATVerbal = 2; 
		int maxSATVerbal = 4;
		int minSATMath = 2; 
		int maxSATMath = 4;
		int minAnnualExpenses = 9999;
		int maxAnnualExpenses = 1001;
		int minPercentFinancialAid = 49; 
		int maxPercentFinancialAid = 51; 
		int minNumApplicants = 999; 
		int maxNumApplicants = 1001;
		int minPercentAdmit = 74; 
		int maxPercentAdmit = 76; 
		int minPercentEnrolled = 96; 
		int maxPercentEnrolled = 98;
		int minAcademicScale = 3; 
		int maxAcademicScale = 5; 
		int minSocialScale = 2;
		int maxSocialScale = 4;
		int minQOLScale = 2; 
		int maxQOLScale = 4;
		String emphasis1 = "MATH"; 
		String emphasis2 = "HISTORY";
		String emphasis3 = "SCIENCE";
		String emphasis4 = "PHYSICS";
		String emphasis5 = "NURSING";
		
		testSearchResults = this.UI.searchUniversities(school, state, location, control, minNumStudents, maxNumStudents, 
				minPercentFemale, maxPercentFemale, minSATVerbal, maxSATVerbal, minSATMath, maxSATMath, minAnnualExpenses, maxAnnualExpenses, minPercentFinancialAid,
				maxPercentFinancialAid, minNumApplicants, maxNumApplicants, minPercentAdmit, maxPercentAdmit, minPercentEnrolled, maxPercentEnrolled, minAcademicScale,
				maxAcademicScale, minSocialScale, maxSocialScale, minQOLScale, maxQOLScale, emphasis1, emphasis2, emphasis3, emphasis4, emphasis5);
		
		Assert.assertEquals("HAMPHSIRE COLLEGE is returned from search results", "HAMPSHIRE COLLEGE", testSearchResults.get(0).getUniName());
	}
}

