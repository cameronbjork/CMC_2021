package systemtest;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cmc.account.user.UserInteraction;
import cmc.university.University;
import junit.framework.Assert;

public class SearchUniversitiesTest extends UserInteraction {
	private UserInteraction UI = new UserInteraction();
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testSearchUniversitiesMain() {
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
	
	@SuppressWarnings("deprecation")
	@Test
	public void testSearchUniversitiesNull() {
		String school2 = null;
		String state2 = null;
		String location2 = null;
		String control2 = null; 
		int minNumStudents2 = -1;
		int maxNumStudents2 = -1;
		int minPercentFemale2 = -1; 
		int maxPercentFemale2 = -1;
		int minSATVerbal2 = -1; 
		int maxSATVerbal2 = -1;
		int minSATMath2 = -1; 
		int maxSATMath2 = -1;
		int minAnnualExpenses2 = -1;
		int maxAnnualExpenses2 = -1;
		int minPercentFinancialAid2 = -1; 
		int maxPercentFinancialAid2 = -1; 
		int minNumApplicants2 = -1; 
		int maxNumApplicants2 = -1;
		int minPercentAdmit2 = -1; 
		int maxPercentAdmit2 = -1; 
		int minPercentEnrolled2 = -1; 
		int maxPercentEnrolled2 = -1;
		int minAcademicScale2 = -1; 
		int maxAcademicScale2 = -1; 
		int minSocialScale2 = -1;
		int maxSocialScale2 = -1;
		int minQOLScale2 = -1; 
		int maxQOLScale2 = -1;
		String emphasis12 = null; 
		String emphasis22 = null;
		String emphasis32 = null;
		String emphasis42 = null;
		String emphasis52 = null;

		Assert.assertEquals("Null values inputted, no search results returned", 0, this.UI.searchUniversities(school2, state2, location2, control2, minNumStudents2, maxNumStudents2, 
				minPercentFemale2, maxPercentFemale2, minSATVerbal2, maxSATVerbal2, minSATMath2, maxSATMath2, minAnnualExpenses2, maxAnnualExpenses2, minPercentFinancialAid2,
				maxPercentFinancialAid2, minNumApplicants2, maxNumApplicants2, minPercentAdmit2, maxPercentAdmit2, minPercentEnrolled2, maxPercentEnrolled2, minAcademicScale2,
				maxAcademicScale2, minSocialScale2, maxSocialScale2, minQOLScale2, maxQOLScale2, emphasis12, emphasis22, emphasis32, emphasis42, emphasis52).size());
	}
}
