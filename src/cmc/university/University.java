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
	private static ArrayList<String> uniLocation;
	private static ArrayList<String> uniControl;
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
	private int emphasisStudy1;
	private int emphasisStudy2;
	private int emphasisStudy3;
	private int emphasisStudy4;
	private int emphasisStudy5;
	
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
	public University(String uniName, String uniState, int numOfStudents, int percentFemale, int satVerbal, int satMath,
			int annualExpenses, int percentFinAid, int numApplicants, int percentAdmit, int percentEnrolled,
			int academicScale, int socialScale, int qOLScale, int emphasisStudy1, int emphasisStudy2,
			int emphasisStudy3, int emphasisStudy4, int emphasisStudy5) {
		super();
		this.uniName = uniName;
		this.uniState = uniState;
		University.uniLocation = new ArrayList<String>();
		uniLocation.add("SUBURBAN");
		uniLocation.add("URBAN");
		uniLocation.add("SMALL-CITY");
		uniLocation.add("-1");
		University.uniControl = new ArrayList<String>();
		uniControl.add("PRIVATE");
		uniControl.add("STATE");
		uniControl.add("CITY");
		uniControl.add("-1");
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
	public University(String uniName) {
		this.uniName = uniName;
	}
	
	
}
