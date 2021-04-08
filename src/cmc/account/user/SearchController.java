package cmc.account.user;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Vector;

import cmc.university.University;

/** Controller that helps with searching the DB
 * 
 * @author Cameron Bjork, Michael Murphy, Joe Koller, Charlie Becker, Jaren Lindsey, Logan Woods
 *
 */
public class SearchController {
	public DBController DBC = new DBController();
	private Vector<University> uniList = new  Vector<University>();
	
	/**
	 * Creates a search controller object
	 */
	public SearchController() {
	}

	/** Searches for universities
	 * 
	 * @param school - University name to search by
	 * @param state - University state to search by
	 * @param location - University location to search by
	 * @param control - University control to search by
	 * @param minNumStudents - University min num of students to search by
	 * @param maxNumStudents - University max num of students to search by
	 * @param minPercentFemale - University min percent female to search by
	 * @param maxPercentFemale - University max percent female to search by
	 * @param minSATVerbal - University min SAT Verbal to search by
	 * @param maxSATVerbal - University max SAT Verbal to search by
	 * @param minSATMath - University min SAT Math to search by
	 * @param maxSATMath - University max SAT Math to search by
	 * @param minAnnualExpenses - University min annual expenses to search by
	 * @param maxAnnualExpenses - University max annual expenses to search by
	 * @param minPercentFinancialAid  - University min percent financial aid to search by
	 * @param maxPercentFinancialAid - University max percent financial aid to search by
	 * @param minNumApplicants - University min num applicants to search by
	 * @param maxNumApplicants - University max num applicants to search by
	 * @param minPercentAdmit - University min percent admitted to search by
	 * @param maxPercentAdmit - University max percent admitted to search by
	 * @param minPercentEnrolled - University min percent enrolled to search by
	 * @param maxPercentEnrolled - University max percent enrolled to search by
	 * @param minAcademicScale - University min academic scale to search by
	 * @param maxAcademicScale - University max academic scale to search by
	 * @param minSocialScale - University min social scale to search by
	 * @param maxSocialScale - University max social scale to search by
	 * @param minQOLScale - University min quality of life scale to search by
	 * @param maxQOLScale - University max quality of life scale to search by
	 * @param emphasis1 - University emphasis1 to search by
	 * @param emphasis2 - University emphasis2 to search by
	 * @param emphasis3 - University emphasis3 to search by
	 * @param emphasis4 - University emphasis4 to search by
	 * @param emphasis5 - University emphasis5 to search by
	 * @return ArrayList of universities that were found by search
	 */
	public ArrayList<University> searchUniversities(String school, String state, String location, String control, int minNumStudents, 
			int maxNumStudents, int minPercentFemale, int maxPercentFemale, int minSATVerbal, int maxSATVerbal, int minSATMath, int maxSATMath, 
			int minAnnualExpenses, int maxAnnualExpenses, int minPercentFinancialAid, int maxPercentFinancialAid, int minNumApplicants, 
			int maxNumApplicants, int minPercentAdmit, int maxPercentAdmit, int minPercentEnrolled, int maxPercentEnrolled, 
			int minAcademicScale, int maxAcademicScale, int minSocialScale, int maxSocialScale, int minQOLScale, int maxQOLScale,
			String emphasis1, String emphasis2, String emphasis3, String emphasis4, String emphasis5) {
		
		ArrayList<University> similarResults = new ArrayList<University>();
		ArrayList <University> allResults = new ArrayList<University>(this.DBC.getAllUniversities());
		
		
		String tempUniName;
		for (int i = 0; i < allResults.size() - 1; i++) {
			System.out.println(this.DBC.getAllUniversities().get(i).getUniName());
			tempUniName = allResults.get(i).getUniName();
			
			//Add uni to vector
			uniList.add(allResults.get(i));
			
			//Check for school name
			if (tempUniName.toLowerCase().contains(school.toLowerCase()) && school != "") {
				if (!similarResults.contains(allResults.get(i))) {
				similarResults.add(allResults.get(i));
				
				}
			}
			
			//Check for similar states
			if (allResults.get(i).getUniState().toLowerCase().contains(state.toLowerCase()) && state != "") {
				if (!similarResults.contains(allResults.get(i))) {
				similarResults.add(allResults.get(i));
				}
			}
			
			//Check for Location
			if (allResults.get(i).getUniLocation().contains(location) && location != "-1") {
				if (!similarResults.contains(allResults.get(i))) {
				similarResults.add(allResults.get(i));
				}
			}
			
			//Check for Control
			if (allResults.get(i).getControl().contains(control) && control != "-1") {
				if (!similarResults.contains(allResults.get(i))) {
				similarResults.add(allResults.get(i));
				}
			}
			
			//Check for similar numOfStudents
			if (allResults.get(i).getNumOfStudents() >= minNumStudents && allResults.get(i).getNumOfStudents() <= maxNumStudents && minNumStudents != -1 && maxNumStudents != -1) {
				if (!similarResults.contains(allResults.get(i))) {
				similarResults.add(allResults.get(i));
				
				}
			}
			
			//Check for similar percentFemale
			if (allResults.get(i).getPercentFemale() >= minPercentFemale && allResults.get(i).getPercentFemale() <= maxPercentFemale && minPercentFemale != -1 && maxPercentFemale != -1) {
				if (!similarResults.contains(allResults.get(i))) {
				similarResults.add(allResults.get(i));
				
				}
			}
			
			//Check for similar SATVerbal
			if (allResults.get(i).getSatVerbal() >= minSATVerbal && allResults.get(i).getSatVerbal() <= maxSATVerbal && minSATVerbal != -1 && maxSATVerbal != -1) {
				if (!similarResults.contains(allResults.get(i))) {
				similarResults.add(allResults.get(i));
				
				}
			}
			
			//Check for similar SATMath
			if (allResults.get(i).getSatMath() >= minSATMath && allResults.get(i).getSatMath() <= maxSATMath && minSATMath != -1 && maxSATMath != -1) {
				if (!similarResults.contains(allResults.get(i))) {
				similarResults.add(allResults.get(i));
				
				}
			}
			
			//Check for similar Expenses
			if (allResults.get(i).getAnnualExpenses() >= minAnnualExpenses && allResults.get(i).getAnnualExpenses() <= maxAnnualExpenses) {
				if (!similarResults.contains(allResults.get(i))) {
				similarResults.add(allResults.get(i));
				
				}
			}
			
			//Check for similar percentFinancialAid
			if (allResults.get(i).getPercentFinAid() >= minPercentFinancialAid && allResults.get(i).getPercentFinAid() <= maxPercentFinancialAid && minPercentFinancialAid != -1 && maxPercentFinancialAid != -1) {
				if (!similarResults.contains(allResults.get(i))) {
				similarResults.add(allResults.get(i));
				
				}
			}
			
			//Check for similar numApplicants
			if (allResults.get(i).getNumApplicants() >= minNumApplicants && allResults.get(i).getNumApplicants() <= maxNumApplicants && minNumApplicants != -1 && maxNumApplicants != -1) {
				if (!similarResults.contains(allResults.get(i))) {
				similarResults.add(allResults.get(i));
				
				}
			}
			
			//Check for similar percentAdmitted
			if (allResults.get(i).getPercentAdmit() >= minPercentAdmit && allResults.get(i).getPercentAdmit() <= maxPercentAdmit && minPercentAdmit != -1 && maxPercentAdmit != -1) {
				if (!similarResults.contains(allResults.get(i))) {
				similarResults.add(allResults.get(i));
				
				}
			}
			
			//Check for similar percentEnrolled
			if (allResults.get(i).getPercentEnrolled() >= minPercentEnrolled && allResults.get(i).getPercentEnrolled() <= maxPercentEnrolled && minPercentEnrolled != -1 && maxPercentEnrolled != -1) {
				if (!similarResults.contains(allResults.get(i))) {
				similarResults.add(allResults.get(i));
				
				}
			}
			
			//Check for similar acadmicsScale
			if (allResults.get(i).getAcademicScale() >= minAcademicScale && allResults.get(i).getAcademicScale() <= maxAcademicScale && minAcademicScale != -1 && maxAcademicScale != -1) {
				if (!similarResults.contains(allResults.get(i))) {
				similarResults.add(allResults.get(i));
				
				}
			}
			
			//Check for similar socialScale
			if (allResults.get(i).getSocialScale() >= minSocialScale && allResults.get(i).getSocialScale() <= maxSocialScale && minSocialScale != -1 && maxSocialScale != -1) {
				if (!similarResults.contains(allResults.get(i))) {
				similarResults.add(allResults.get(i));
				
				}
			}
			
			//Check for similar qOLScale
			if (allResults.get(i).getqOLScale() >= minQOLScale && allResults.get(i).getSocialScale() <= maxQOLScale && minQOLScale != -1 && maxQOLScale != -1) {
				if (!similarResults.contains(allResults.get(i))) {
				similarResults.add(allResults.get(i));
				
				}
			}
		}
		

		//Check for similar Emphasis
		String[][] uniAndEmphasis = DBC.university_getAllUniversitiesAndEmphasis();
		University tempUni2;
		for (int i = 0; i < allResults.size(); i++) {
			tempUni2 = allResults.get(i);
				if (uniAndEmphasis[i][0] == tempUni2.getUniName()) {
					if (emphasis1 == uniAndEmphasis[i][1] && emphasis1 != "" || emphasis2 == uniAndEmphasis[i][1] && emphasis2 != "" ||
							emphasis3 == uniAndEmphasis[i][1] && emphasis3 != "" || emphasis4 == uniAndEmphasis[i][1] && emphasis4 != ""||
							emphasis5 == uniAndEmphasis[i][1] && emphasis5 != "") {
						if (!similarResults.contains(allResults.get(i))) {
							similarResults.add(allResults.get(i));
						}
					}
				}
			} 
		System.out.println();
		for (int i = 0; i < similarResults.size(); i++) {
		System.out.println(similarResults.get(i).getUniName());
		}
		//return list of searchResults
		return similarResults;
		} 


	/** Finds 5 recommended universities similar to the one being viewed
	 * 
	 * @param uniViewed - University being viewed
	 * @return ArrayList of top recommended universities
	 */
	public ArrayList<University> topRecommendedUnis(University uniViewed) {
		this.uniList.add(uniViewed);
		HashMap<String, Float> uniandDistance = new HashMap<String, Float>();
		float distance;
		double tempMax = 0;
		double tempMin = 0;
		String tempUniName;
		
		for (int i = 0; i < this.uniList.size() / 2; i++) {
			distance = 0;
			tempUniName = this.uniList.get(i).getUniName();
			
			//Check by uniName
			if (!this.uniList.lastElement().getUniName().toLowerCase().equals(this.uniList.get(i).getUniName().toLowerCase())) {
				distance++;
			}
		
			//Check by uniState
			if (!this.uniList.lastElement().getUniState().toLowerCase().equals(this.uniList.get(i).getUniState().toLowerCase())) {
				distance++;
			}
		
			//Check by Location
			if (!this.uniList.lastElement().getUniLocation().equals(this.uniList.get(i).getUniLocation())) {
				distance++;
			}
			
			//Check by Control
			if (!this.uniList.lastElement().getControl().equals(this.uniList.get(i).getControl())) {
				distance++;
			}
			
			//Check by numOfStudents
			if (this.uniList.lastElement().getNumOfStudents() != this.uniList.get(i).getNumOfStudents()) {
				
				//get max & min value
				tempMax = this.uniList.get(0).getNumOfStudents();
				tempMin = this.uniList.get(0).getNumOfStudents();
				for (int j = 0; j < this.uniList.size() - 1; j++) {
					if (this.uniList.get(j + 1).getNumOfStudents() > tempMax) {
						tempMax = this.uniList.get(j + 1).getNumOfStudents();
					}
					if (this.uniList.get(j + 1).getNumOfStudents() < tempMin) {
						tempMin = this.uniList.get(j + 1).getNumOfStudents();
					}
				}
				distance += (float) (Math.abs(this.uniList.lastElement().getNumOfStudents() - this.uniList.get(i).getNumOfStudents())) / (Math.abs(tempMax - tempMin));
			}
			
			//Check by percentFemale
			if (this.uniList.lastElement().getPercentFemale() != this.uniList.get(i).getPercentFemale()) {
				
				//get max & min value
				tempMax = this.uniList.get(0).getPercentFemale();
				tempMin = this.uniList.get(0).getPercentFemale();
				for (int j = 0; j < this.uniList.size() - 1; j++) {
					if (this.uniList.get(j + 1).getPercentFemale() > tempMax) {
						tempMax = this.uniList.get(j + 1).getPercentFemale();
					}
					if (this.uniList.get(j + 1).getPercentFemale() < tempMin) {
						tempMin = this.uniList.get(j + 1).getPercentFemale();
					}
				}
				distance += (float) (Math.abs(this.uniList.lastElement().getPercentFemale() - this.uniList.get(i).getPercentFemale())) / (Math.abs(tempMax - tempMin));
			}
			
			//Check by SAT Verbal
			if (this.uniList.lastElement().getSatVerbal() != this.uniList.get(i).getSatVerbal()) {
				
				//get max & min value
				tempMax = this.uniList.get(0).getSatVerbal();
				tempMin = this.uniList.get(0).getSatVerbal();
				for (int j = 0; j < this.uniList.size() - 1; j++) {
					if (this.uniList.get(j + 1).getSatVerbal() > tempMax) {
						tempMax = this.uniList.get(j + 1).getSatVerbal();
					}
					if (this.uniList.get(j + 1).getSatVerbal() < tempMin) {
						tempMin = this.uniList.get(j + 1).getSatVerbal();
					}
				}
				distance += (float) (Math.abs(this.uniList.lastElement().getSatVerbal() - this.uniList.get(i).getSatVerbal())) / (Math.abs(tempMax - tempMin));
			} 
			
			//Check by SAT Math
			if (this.uniList.lastElement().getSatMath() != this.uniList.get(i).getSatMath()) {
				
				//get max & min value
				tempMax = this.uniList.get(0).getSatMath();
				tempMin = this.uniList.get(0).getSatMath();
				for (int j = 0; j < this.uniList.size() - 1; j++) {
					if (this.uniList.get(j + 1).getSatMath() > tempMax) {
						tempMax = this.uniList.get(j + 1).getSatMath();
					}
					if (this.uniList.get(j + 1).getSatMath() < tempMin) {
						tempMin = this.uniList.get(j + 1).getSatMath();
					}
				}
				distance += (float) (Math.abs(this.uniList.lastElement().getSatMath() - this.uniList.get(i).getSatMath())) / (Math.abs(tempMax - tempMin));
			} 
			
			//Check by Annual Expenses
			if (this.uniList.lastElement().getAnnualExpenses() != this.uniList.get(i).getAnnualExpenses()) {
				
				//get max & min value
				tempMax = this.uniList.get(0).getAnnualExpenses() ;
				tempMin = this.uniList.get(0).getAnnualExpenses() ;
				for (int j = 0; j < this.uniList.size() - 1; j++) {
					if (this.uniList.get(j + 1).getAnnualExpenses()  > tempMax) {
						tempMax = this.uniList.get(j + 1).getAnnualExpenses() ;
					}
					if (this.uniList.get(j + 1).getAnnualExpenses()  < tempMin) {
						tempMin = this.uniList.get(j + 1).getAnnualExpenses() ;
					}
				}
				distance += (float) (Math.abs(this.uniList.lastElement().getAnnualExpenses()  - this.uniList.get(i).getAnnualExpenses())) / (Math.abs(tempMax - tempMin));
			}
			
			//Check by Percent Financial Aid
			if (this.uniList.lastElement().getPercentFinAid() != this.uniList.get(i).getPercentFinAid()) {
				
				//get max & min value
				tempMax = this.uniList.get(0).getPercentFinAid();
				tempMin = this.uniList.get(0).getPercentFinAid();
				for (int j = 0; j < this.uniList.size() - 1; j++) {
					if (this.uniList.get(j + 1).getPercentFinAid()  > tempMax) {
						tempMax = this.uniList.get(j + 1).getPercentFinAid() ;
					}
					if (this.uniList.get(j + 1).getPercentFinAid()  < tempMin) {
						tempMin = this.uniList.get(j + 1).getPercentFinAid() ;
					}
				}
				distance += (float) (Math.abs(this.uniList.lastElement().getPercentFinAid() - this.uniList.get(i).getPercentFinAid())) / (Math.abs(tempMax - tempMin));
			} 
			
			//Check by Number of Applicants
			if (this.uniList.lastElement().getNumApplicants() != this.uniList.get(i).getNumApplicants()) {
				
				//get max & min value
				tempMax = this.uniList.get(0).getNumApplicants();
				tempMin = this.uniList.get(0).getNumApplicants();
				for (int j = 0; j < this.uniList.size() - 1; j++) {
					if (this.uniList.get(j + 1).getNumApplicants()  > tempMax) {
						tempMax = this.uniList.get(j + 1).getNumApplicants();
					}
					if (this.uniList.get(j + 1).getNumApplicants()  < tempMin) {
						tempMin = this.uniList.get(j + 1).getNumApplicants();
					}
				}
				distance += (float) (Math.abs(this.uniList.lastElement().getNumApplicants() - this.uniList.get(i).getNumApplicants())) / (Math.abs(tempMax - tempMin));
			} 
			
			//Check by Percent Admitted
			if (this.uniList.lastElement().getPercentAdmit() != this.uniList.get(i).getPercentAdmit()) {
				
				//get max & min value
				tempMax = this.uniList.get(0).getPercentAdmit();
				tempMin = this.uniList.get(0).getPercentAdmit();
				for (int j = 0; j < this.uniList.size() - 1; j++) {
					if (this.uniList.get(j + 1).getPercentAdmit()  > tempMax) {
						tempMax = this.uniList.get(j + 1).getPercentAdmit();
					}
					if (this.uniList.get(j + 1).getPercentAdmit()  < tempMin) {
						tempMin = this.uniList.get(j + 1).getPercentAdmit();
					}
				}
				distance += (float) (Math.abs(this.uniList.lastElement().getPercentAdmit() - this.uniList.get(i).getPercentAdmit())) / (Math.abs(tempMax - tempMin));
			} 
			
			//Check by Academic Scale
			if (this.uniList.lastElement().getPercentEnrolled() != this.uniList.get(i).getPercentEnrolled()) {
				
				//get max & min value
				tempMax = this.uniList.get(0).getPercentEnrolled();
				tempMin = this.uniList.get(0).getPercentEnrolled();
				for (int j = 0; j < this.uniList.size() - 1; j++) {
					if (this.uniList.get(j + 1).getPercentEnrolled()  > tempMax) {
						tempMax = this.uniList.get(j + 1).getPercentEnrolled();
					}
					if (this.uniList.get(j + 1).getPercentEnrolled()  < tempMin) {
						tempMin = this.uniList.get(j + 1).getPercentEnrolled();
					}
				}
				distance += (float) (Math.abs(this.uniList.lastElement().getPercentEnrolled() - this.uniList.get(i).getPercentEnrolled())) / (Math.abs(tempMax - tempMin));
			} 
			
			//Check by Social Scale
			if (this.uniList.lastElement().getAcademicScale() != this.uniList.get(i).getAcademicScale()) {
				
				//get max & min value
				tempMax = 5;
				tempMin = 1;
				distance += (float) (Math.abs(this.uniList.lastElement().getAcademicScale() - this.uniList.get(i).getAcademicScale())) / (Math.abs(tempMax - tempMin));
			} 
			
			//Check by Quality of Life Scale
			if (this.uniList.lastElement().getqOLScale() != this.uniList.get(i).getqOLScale()) {
				
				//get max & min value
				tempMax = 5;
				tempMin = 1;
				distance += (float) (Math.abs(this.uniList.lastElement().getqOLScale() - this.uniList.get(i).getqOLScale())) / (Math.abs(tempMax - tempMin));
			} 
			
			//Check for similar Emphasis
			String[][] uniAndEmphasis = this.DBC.university_getAllUniversitiesAndEmphasis();
			for (int j = 0; j < uniAndEmphasis.length; j++) {
					if (uniAndEmphasis[j][0] == this.uniList.get(i).getUniName()) {
						if (this.uniList.lastElement().getEmphasis1() != (uniAndEmphasis[j][1])) {
							distance++;
						} else if (!this.uniList.lastElement().getEmphasis2().equals(uniAndEmphasis[j][1])) {
							distance++;
						} else if (!this.uniList.lastElement().getEmphasis3().equals(uniAndEmphasis[j][1])) {
							distance++;
						} else if (!this.uniList.lastElement().getEmphasis4().equals(uniAndEmphasis[j][1])) {
							distance++;
						} else if (!this.uniList.lastElement().getEmphasis5().equals(uniAndEmphasis[j][1])) {
							distance++;
						}
					}
				}
			
			//Add uni and distance to HashMap
			uniandDistance.put(tempUniName, distance);
			}		
		
		
		//Sort by lowest 5
		List<Entry<String,Float>> resultList  = new ArrayList<Entry<String, Float>>();
		ArrayList<University> uniResultList = new ArrayList<University>();
		
		Set<Entry<String, Float>> set = uniandDistance.entrySet();
		
		ArrayList<Entry<String, Float>> list = new ArrayList<Entry<String, Float>>(set);
		
		Collections.sort(list, new Comparator<Map.Entry<String, Float>>() {
			public int compare(Entry<String, Float> o1, Entry<String, Float> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		
		//SWITCH TO 1,6 WHEN DB IS CONNECTED
		resultList = list.subList(1, 4);
		
		int i = 0;
		while (i < resultList.size()) {
			System.out.println(resultList.get(i).getKey());
			uniResultList.add(this.DBC.getUniversityByName(resultList.get(i).getKey()));
			i++;
		}
		
		return uniResultList;
	}
	
	/** Gets the most recently viewed university from the user
	 * 
	 * @param u - username to get recent university from
	 * @param uni - university to get
	 * @return University most recent university
	 */
	public University getRecentUniversity(String u, University uni) {
		User u1 = (DBC.getUser(u));
		u1.setRecentUniversity(uni);
		return u1.getRecentUniversity();
		// Implement to Web Interface
	}
	}
	
