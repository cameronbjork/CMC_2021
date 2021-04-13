package cmc.university;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UniversityTest {
	private University uni = new University("MY SCHOOL", "Minnesota", "SMALL-CITY", "PUBLIC", 5000, 25.0, 750.0, 750.0, 10000.99, 10.0, 3500, 50.0, 25.0, 5, 5, 5);

	@Before
	public void setUp() throws Exception {
		this.uni.setEmphasis("MATH");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void getUniNametest() {
		Assert.assertTrue(this.uni.getUniName().equals("MY SCHOOL"));
	}
	
	@Test
	public void setUniNameTest() {
		this.uni.setUniName("THE SCHOOL");
		Assert.assertTrue(this.uni.getUniName().equals("THE SCHOOL"));
	}
	
	@Test
	public void getUniStateTest() {
		Assert.assertTrue(this.uni.getUniState().equals("Minnesota"));
	}
	
	@Test
	public void setUniStateTest() {
		this.uni.setUniState("MN");
		Assert.assertTrue(this.uni.getUniState().equals("MN"));
	}
	
	@Test
	public void getUniLocationTest() {
		Assert.assertTrue(this.uni.getUniLocation().equals("SMALL-CITY"));
	}
	
	@Test
	public void getControlTest() {
		Assert.assertTrue(this.uni.getControl().equals("PUBLIC"));
	}
	
	@Test
	public void getNumOfStudentsTest() {
		Assert.assertTrue(this.uni.getNumOfStudents() == 5000);
	}
	
	@Test
	public void setNumOfStudentsTest() {
		this.uni.setNumOfStudents(6000);
		Assert.assertTrue(this.uni.getNumOfStudents() == 6000);
	}
	
	@Test
	public void getPercentFemaleTest() {
		Assert.assertTrue(this.uni.getPercentFemale() == 25.0);
	}
	
	@Test
	public void setPercentFemaleTest() {
		this.uni.setPercentFemale(20);
		Assert.assertTrue(this.uni.getPercentFemale() == 20);
	}
	
	@Test
	public void getSatVerbalTest() {
		Assert.assertTrue(this.uni.getSatVerbal() == 750.0);
	}
	
	@Test
	public void setSatVerbalTest() {
		this.uni.setSatVerbal(700.0);
		Assert.assertTrue(this.uni.getSatVerbal() == 700.0);
	}
	
	@Test
	public void getSatMathTest() {
		Assert.assertTrue(this.uni.getSatMath() == 750.0);
	}
	
	@Test
	public void setSatMathTest() {
		this.uni.setSatMath(700.0);
		Assert.assertTrue(this.uni.getSatMath() == 700.0);
	}
	
	@Test
	public void getAnnualExpensesTest() {
		Assert.assertTrue(this.uni.getAnnualExpenses() == 10000.99);
	}
	
	@Test
	public void setAnnualExpensesTest() {
		this.uni.setAnnualExpenses(1000.00);
		Assert.assertTrue(this.uni.getAnnualExpenses() == 1000.00);
	}
	
	@Test
	public void getPercentFinAidTest()  {
		Assert.assertTrue(this.uni.getPercentFinAid() == 10.0);
	}
	
	@Test
	public void setPercentFinAidTest() {
		this.uni.setPercentFinAid(15.0);
		Assert.assertTrue(this.uni.getPercentFinAid() == 15.0);
	}
	
	@Test
	public void getNumApplicantsTest() {
		Assert.assertTrue(this.uni.getNumApplicants() == 3500);
	}
	
	@Test
	public void setNumApplicantsTest() {
		this.uni.setNumApplicants(4000);
		Assert.assertTrue(this.uni.getNumApplicants() == 4000);
	}
	
	@Test
	public void getPercentAdmitTest() {
		Assert.assertTrue(this.uni.getPercentAdmit() == 50.0);
	}
	
	@Test
	public void setPercentAdmitTest() {
		this.uni.setPercentAdmit(51.0);
		Assert.assertTrue(this.uni.getPercentAdmit() == 51.0);
	}
	
	@Test
	public void getPercentEnrolledTest() {
		Assert.assertTrue(this.uni.getPercentEnrolled() ==  25.0);
	}
	
	@Test
	public void setPercentEnrolledTest() {
		this.uni.setPercentEnrolled(20.0);
		Assert.assertTrue(this.uni.getPercentEnrolled() == 20.0);
	}
	
	@Test
	public void getAcademicScaleTesst() {
		Assert.assertTrue(this.uni.getAcademicScale() == 5);
	}
	
	@Test
	public void setAcademicScaleTest() {
		this.uni.setAcademicScale(1);
		Assert.assertTrue(this.uni.getAcademicScale() ==  1);
	}
	
	@Test
	public void getSocialScaleTest() {
		Assert.assertTrue(this.uni.getSocialScale() == 5);
	}
	
	@Test
	public void setSocialScaleTest() {
		this.uni.setSocialScale(1);
		Assert.assertTrue(this.uni.getSocialScale() == 1);
	}
	
	@Test
	public void getqOLScaleTest() {
		Assert.assertTrue(this.uni.getqOLScale() == 5);
	}
	
	@Test
	public void setqOLScaleTest() {
		this.uni.setqOLScale(1);
		Assert.assertTrue(this.uni.getqOLScale() == 1);
	}
	
	@Test
	public void setEmphasisTest() {
		//Input is null
		this.uni.setEmphasis(null);
		Assert.assertTrue(this.uni.getEmphasis().size() == 1);
		
		//Input is not null
		this.uni.setEmphasis("CSCI");
		Assert.assertTrue(this.uni.getEmphasis().contains("CSCI"));
	}
	
	@Test
	public void getEmphasisTest() {
		Assert.assertTrue(this.uni.getEmphasis().contains("MATH"));
	}
	
	@Test
	public void removeEmphasisTest() {
		this.uni.removeEmphasis("MATH");
		Assert.assertTrue(!this.uni.getEmphasis().contains("MATH"));
	}
}
