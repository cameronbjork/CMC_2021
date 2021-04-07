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
	public String uniLocation;
	public String uniControl;
	private int numOfStudents;
	private double percentFemale;
	private double satVerbal;
	private double satMath;
	private double annualExpenses;
	private double percentFinAid;
	private int numApplicants;
	private double percentAdmit;
	private double percentEnrolled;
	private int academicScale;
	private int socialScale;
	private int qOLScale;
	private ArrayList<String> emphasisArray;
	
	/**
	 * Constructs University Object
	 * 
	 * @param uniName Name of Univeristy
	 * @param uniState State of University
	 * @param uniLocation Location of University
	 * @param uniControl Control of University
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
		
		this.emphasisArray = new ArrayList<String>();
	}
	
	public University(String uniName, String uniState, String uniLocation, String uniControl, int numOfStudents,
			double percentFemale, double satVerbal, double satMath, double annualExpenses, double percentFinAid,
			int numApplicants, double percentAdmit, double percentEnrolled, int academicScale, int socialScale, int qOLScale) {
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
	}

	/** Get name of University
	 * 
	 * @return String University Name
	 */
	public String getUniName() {
		return uniName;
	}
	
	/** Set name of University
	 * 
	 * @param uniName Name of University
	 */
	public void setUniName(String uniName) {
		this.uniName = uniName;
	}
	
	/** Get state of University
	 * 
	 * @return String University State
	 */
	public String getUniState() {
		return uniState;
	}
	
	/** Set state of University
	 * 
	 * @param uniState University State
	 */
	public void setUniState(String uniState) {
		this.uniState = uniState;
	}
	
	/** Get number of students of University
	 * 
	 * @return int number of students
	 */
	public int getNumOfStudents() {
		return numOfStudents;
	}
	
	/** Set number of students of University
	 * 
	 * @param numOfStudents Number of Students
	 */
	public void setNumOfStudents(int numOfStudents) {
		this.numOfStudents = numOfStudents;
	}
	
	/** Get percent female of University
	 * 
	 * @return int Percent Female
	 */
	public double getPercentFemale() {
		return percentFemale;
	}
	
	/** Set percent female of University
	 * 
	 * @param percentFemale Percent Female
	 */
	public void setPercentFemale(int percentFemale) {
		this.percentFemale = percentFemale;
	}
	
	/** Get SAT Verbal of University
	 * 
	 * @return int SAT Verbal
	 */
	public double getSatVerbal() {
		return satVerbal;
	}
	
	/** Set SAT Verbal of University
	 * 
	 * @param satVerbal SAT Verbal
	 */
	public void setSatVerbal(int satVerbal) {
		this.satVerbal = satVerbal;
	}
	
	/** Get SAT Math of University
	 * 
	 * @return int SAT Math
	 */
	public double getSatMath() {
		return satMath;
	}
	
	/** Set SAT Math of University
	 * 
	 * @param satMath SAT Math
	 */
	public void setSatMath(int satMath) {
		this.satMath = satMath;
	}
	public double getAnnualExpenses() {
		return annualExpenses;
	}
	public void setAnnualExpenses(int annualExpenses) {
		this.annualExpenses = annualExpenses;
	}
	public double getPercentFinAid() {
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
	public double getPercentAdmit() {
		return percentAdmit;
	}
	public void setPercentAdmit(int percentAdmit) {
		this.percentAdmit = percentAdmit;
	}
	public double getPercentEnrolled() {
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

	public String getUniLocation() {
		return this.uniLocation;
	}

	public String getControl() {
		// TODO Auto-generated method stub
		return this.uniControl;
	}
	
	public ArrayList<String> getEmphasis() {
		return this.emphasisArray;
	}

	public void setEmphasis(String emphToSet) {
		this.emphasisArray.add(emphToSet);
	}
	
}
