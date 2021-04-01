/**
 * 
 */
package cmc.university;

import java.awt.List;
import java.util.ArrayList;

/**
 * @author Cameron Bjork
 *
 */
public class University {
	private String uniName;
	private String uniState;
	private static String uniLocation;
	private static String uniControl;
	private int numOfStudents;
	private int percentFemale;
	private int satVerbal;
	private int satMath;
	private int annualExpenses;
	private int percentFinAid;
	private int numApplicants;
	private int percentAdmit;
	private int percentEnrolled;
	private int academicScale;
	private int socialScale;
	private int qOLScale;
	private String emphasisStudy1;
	private String emphasisStudy2;
	private String emphasisStudy3;
	private String emphasisStudy4;
	private String emphasisStudy5;
	
	/**
	 * Constructs University Object
	 * 
	 * @param uniName Name of Univeristy
	 * @param uniState State of University
	 * @param numOfStudents Number of students at University
	 * @param percentFemale Percent of female students at University
	 * @param satVerbal Average SAT verbal score
	 * @param satMath Average SAT math score
	 * @param annualExpenses Cost to go to University
	 * @param percentFinAid Percentage of financial aid given by University
	 * @param numApplicants Number of Applicants at University
	 * @param percentAdmit  Percent of students admitted to University
	 * @param percentEnrolled Percent of students enrolled to University
	 * @param academicScale 1-5 scale based on academics
	 * @param socialScale 1-5 scale based on social life
	 * @param qOLScale 1-5 scale based on quality of life
	 * @param emphasisStudy1 1st emphasis of school
	 * @param emphasisStudy2 2nd emphasis of school
	 * @param emphasisStudy3 3rd emphasis of school
	 * @param emphasisStudy4 4th emphasis of school
	 * @param emphasisStudy5 5th emphasis of school
	 */
	public University(String uniName, String uniState, String uniLocation, String uniControl, int numOfStudents, int percentFemale, int satVerbal, int satMath,
			int annualExpenses, int percentFinAid, int numApplicants, int percentAdmit, int percentEnrolled,
			int academicScale, int socialScale, int qOLScale, String emphasisStudy1, String emphasisStudy2,
			String emphasisStudy3, String emphasisStudy4, String emphasisStudy5) {
		super();
		this.uniName = uniName;
		this.uniState = uniState;
		this.uniLocation = uniLocation;
		this.uniControl = uniControl;
		this.numOfStudents = numOfStudents;
		this.percentFemale = percentFemale;
		this.satVerbal = satVerbal;
		this.satMath = satMath;
		this.annualExpenses = annualExpenses;
		this.percentFinAid = percentFinAid;
		this.numApplicants = numApplicants;
		this.percentAdmit = percentAdmit;
		this.percentEnrolled = percentEnrolled;
		this.academicScale = academicScale;
		this.socialScale = socialScale;
		this.qOLScale = qOLScale;
		this.emphasisStudy1 = emphasisStudy1;
		this.emphasisStudy2 = emphasisStudy2;
		this.emphasisStudy3 = emphasisStudy3;
		this.emphasisStudy4 = emphasisStudy4;
		this.emphasisStudy5 = emphasisStudy5;
	}
	
	public String getUniName() {
		return uniName;
	}
	public void setUniName(String uniName) {
		this.uniName = uniName;
	}
	public String getUniState() {
		return uniState;
	}
	public void setUniState(String uniState) {
		this.uniState = uniState;
	}
	public int getNumOfStudents() {
		return numOfStudents;
	}
	public void setNumOfStudents(int numOfStudents) {
		this.numOfStudents = numOfStudents;
	}
	public int getPercentFemale() {
		return percentFemale;
	}
	public void setPercentFemale(int percentFemale) {
		this.percentFemale = percentFemale;
	}
	public int getSatVerbal() {
		return satVerbal;
	}
	public void setSatVerbal(int satVerbal) {
		this.satVerbal = satVerbal;
	}
	public int getSatMath() {
		return satMath;
	}
	public void setSatMath(int satMath) {
		this.satMath = satMath;
	}
	public int getAnnualExpenses() {
		return annualExpenses;
	}
	public void setAnnualExpenses(int annualExpenses) {
		this.annualExpenses = annualExpenses;
	}
	public int getPercentFinAid() {
		return percentFinAid;
	}
	public void setPercentFinAid(int percentFinAid) {
		this.percentFinAid = percentFinAid;
	}
	public int getNumApplicants() {
		return numApplicants;
	}
	public void setNumApplicants(int numApplicants) {
		this.numApplicants = numApplicants;
	}
	public int getPercentAdmit() {
		return percentAdmit;
	}
	public void setPercentAdmit(int percentAdmit) {
		this.percentAdmit = percentAdmit;
	}
	public int getPercentEnrolled() {
		return percentEnrolled;
	}
	public void setPercentEnrolled(int percentEnrolled) {
		this.percentEnrolled = percentEnrolled;
	}
	public int getAcademicScale() {
		return academicScale;
	}
	public void setAcademicScale(int academicScale) {
		this.academicScale = academicScale;
	}
	public int getSocialScale() {
		return socialScale;
	}
	public void setSocialScale(int socialScale) {
		this.socialScale = socialScale;
	}
	public int getqOLScale() {
		return qOLScale;
	}
	public void setqOLScale(int qOLScale) {
		this.qOLScale = qOLScale;
	}
	public String getEmphasisStudy1() {
		return emphasisStudy1;
	}
	public void setEmphasisStudy1(String emphasisStudy1) {
		this.emphasisStudy1 = emphasisStudy1;
	}
	public String getEmphasisStudy2() {
		return emphasisStudy2;
	}
	public void setEmphasisStudy2(String emphasisStudy2) {
		this.emphasisStudy2 = emphasisStudy2;
	}
	public String getEmphasisStudy3() {
		return emphasisStudy3;
	}
	public void setEmphasisStudy3(String emphasisStudy3) {
		this.emphasisStudy3 = emphasisStudy3;
	}
	public String getEmphasisStudy4() {
		return emphasisStudy4;
	}
	public void setEmphasisStudy4(String emphasisStudy4) {
		this.emphasisStudy4 = emphasisStudy4;
	}
	public String getEmphasisStudy5() {
		return emphasisStudy5;
	}
	public void setEmphasisStudy5(String emphasisStudy5) {
		this.emphasisStudy5 = emphasisStudy5;
	}
	public University(String uniName) {
		this.uniName = uniName;
	}
	
	
}
