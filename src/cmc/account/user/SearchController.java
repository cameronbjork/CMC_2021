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
	public static final DBController DBC = new DBController();
	private static final Vector<University> uniList = new  Vector<University>();
	
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
	public static ArrayList<University> searchUniversities(String school, String state, String location, String control, int minNumStudents, 
			int maxNumStudents, int minPercentFemale, int maxPercentFemale, int minSATVerbal, int maxSATVerbal, int minSATMath, int maxSATMath, 
			int minAnnualExpenses, int maxAnnualExpenses, int minPercentFinancialAid, int maxPercentFinancialAid, int minNumApplicants, 
			int maxNumApplicants, int minPercentAdmit, int maxPercentAdmit, int minPercentEnrolled, int maxPercentEnrolled, 
			int minAcademicScale, int maxAcademicScale, int minSocialScale, int maxSocialScale, int minQOLScale, int maxQOLScale,
			String emphasis1, String emphasis2, String emphasis3, String emphasis4, String emphasis5) {
		
		ArrayList<University> similarResults = new ArrayList<University>();
		ArrayList <University> allResults = new ArrayList<University>(DBC.getAllUniversities());
		
		String tempUniName;
		for (int i = 0; i < allResults.size() - 1; i++) {
			
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
		String[][] uniAndEmphasis = DBC.university_getNamesWithEmphasis();
		String tempUni2;
		for (int i = 0; i < allResults.size(); i++) {
			tempUni2 = allResults.get(i).getUniName();
				if (uniAndEmphasis[i][0] == tempUni2) {
					if (emphasis1 == uniAndEmphasis[i][1] && emphasis1 != "" || emphasis2 == uniAndEmphasis[i][1] && emphasis2 != "" ||
							emphasis3 == uniAndEmphasis[i][1] && emphasis3 != "" || emphasis4 == uniAndEmphasis[i][1] && emphasis4 != ""||
							emphasis5 == uniAndEmphasis[i][1] && emphasis5 != "") {
						if (!similarResults.contains(allResults.get(i))) {
							similarResults.add(allResults.get(i));
						}
					}
				}
			} 
		//return list of searchResults
		return similarResults;
		} 


	/** Finds 5 recommended universities similar to the one being viewed
	 * 
	 * @param uniViewed - University being viewed
	 * @return ArrayList of top recommended universities
	 */
	public static ArrayList<University> topRecommendedUnis(University uniViewed) {
		SearchController.uniList.add(uniViewed);
		HashMap<String, Float> uniandDistance = new HashMap<String, Float>();
		float distance;
		int tempMax = 0;
		int tempMin = 0;
		String tempUniName;
		
		for (int i = 0; i < SearchController.uniList.size() / 2; i++) {
			distance = 0;
			tempUniName = SearchController.uniList.get(i).getUniName();
			
			//Check by uniName
			if (!SearchController.uniList.lastElement().getUniName().toLowerCase().equals(SearchController.uniList.get(i).getUniName().toLowerCase())) {
				distance++;
			}
		
			//Check by uniState
			if (!SearchController.uniList.lastElement().getUniState().toLowerCase().equals(SearchController.uniList.get(i).getUniState().toLowerCase())) {
				distance++;
			}
		
			//Check by Location
			if (!SearchController.uniList.lastElement().getUniLocation().equals(SearchController.uniList.get(i).getUniLocation())) {
				distance++;
			}
			
			//Check by Control
			if (!SearchController.uniList.lastElement().getControl().equals(SearchController.uniList.get(i).getControl())) {
				distance++;
			}
			
			//Check by numOfStudents
			if (SearchController.uniList.lastElement().getNumOfStudents() != SearchController.uniList.get(i).getNumOfStudents()) {
				
				//get max & min value
				tempMax = SearchController.uniList.get(0).getNumOfStudents();
				tempMin = SearchController.uniList.get(0).getNumOfStudents();
				for (int j = 0; j < SearchController.uniList.size() - 1; j++) {
					if (SearchController.uniList.get(j + 1).getNumOfStudents() > tempMax) {
						tempMax = SearchController.uniList.get(j + 1).getNumOfStudents();
					}
					if (SearchController.uniList.get(j + 1).getNumOfStudents() < tempMin) {
						tempMin = SearchController.uniList.get(j + 1).getNumOfStudents();
					}
				}
				distance += (float) (Math.abs(SearchController.uniList.lastElement().getNumOfStudents() - SearchController.uniList.get(i).getNumOfStudents())) / (Math.abs(tempMax - tempMin));
			}
			
			//Check by percentFemale
			if (SearchController.uniList.lastElement().getPercentFemale() != SearchController.uniList.get(i).getPercentFemale()) {
				
				//get max & min value
				tempMax = SearchController.uniList.get(0).getPercentFemale();
				tempMin = SearchController.uniList.get(0).getPercentFemale();
				for (int j = 0; j < SearchController.uniList.size() - 1; j++) {
					if (SearchController.uniList.get(j + 1).getPercentFemale() > tempMax) {
						tempMax = SearchController.uniList.get(j + 1).getPercentFemale();
					}
					if (SearchController.uniList.get(j + 1).getPercentFemale() < tempMin) {
						tempMin = SearchController.uniList.get(j + 1).getPercentFemale();
					}
				}
				distance += (float) (Math.abs(SearchController.uniList.lastElement().getPercentFemale() - SearchController.uniList.get(i).getPercentFemale())) / (Math.abs(tempMax - tempMin));
			}
			
			//Check by SAT Verbal
			if (SearchController.uniList.lastElement().getSatVerbal() != SearchController.uniList.get(i).getSatVerbal()) {
				
				//get max & min value
				tempMax = SearchController.uniList.get(0).getSatVerbal();
				tempMin = SearchController.uniList.get(0).getSatVerbal();
				for (int j = 0; j < SearchController.uniList.size() - 1; j++) {
					if (SearchController.uniList.get(j + 1).getSatVerbal() > tempMax) {
						tempMax = SearchController.uniList.get(j + 1).getSatVerbal();
					}
					if (SearchController.uniList.get(j + 1).getSatVerbal() < tempMin) {
						tempMin = SearchController.uniList.get(j + 1).getSatVerbal();
					}
				}
				distance += (float) (Math.abs(SearchController.uniList.lastElement().getSatVerbal() - SearchController.uniList.get(i).getSatVerbal())) / (Math.abs(tempMax - tempMin));
			} 
			
			//Check by SAT Math
			if (SearchController.uniList.lastElement().getSatMath() != SearchController.uniList.get(i).getSatMath()) {
				
				//get max & min value
				tempMax = SearchController.uniList.get(0).getSatMath();
				tempMin = SearchController.uniList.get(0).getSatMath();
				for (int j = 0; j < SearchController.uniList.size() - 1; j++) {
					if (SearchController.uniList.get(j + 1).getSatMath() > tempMax) {
						tempMax = SearchController.uniList.get(j + 1).getSatMath();
					}
					if (SearchController.uniList.get(j + 1).getSatMath() < tempMin) {
						tempMin = SearchController.uniList.get(j + 1).getSatMath();
					}
				}
				distance += (float) (Math.abs(SearchController.uniList.lastElement().getSatMath() - SearchController.uniList.get(i).getSatMath())) / (Math.abs(tempMax - tempMin));
			} 
			
			//Check by Annual Expenses
			if (SearchController.uniList.lastElement().getAnnualExpenses() != SearchController.uniList.get(i).getAnnualExpenses()) {
				
				//get max & min value
				tempMax = SearchController.uniList.get(0).getAnnualExpenses() ;
				tempMin = SearchController.uniList.get(0).getAnnualExpenses() ;
				for (int j = 0; j < SearchController.uniList.size() - 1; j++) {
					if (SearchController.uniList.get(j + 1).getAnnualExpenses()  > tempMax) {
						tempMax = SearchController.uniList.get(j + 1).getAnnualExpenses() ;
					}
					if (SearchController.uniList.get(j + 1).getAnnualExpenses()  < tempMin) {
						tempMin = SearchController.uniList.get(j + 1).getAnnualExpenses() ;
					}
				}
				distance += (float) (Math.abs(SearchController.uniList.lastElement().getAnnualExpenses()  - SearchController.uniList.get(i).getAnnualExpenses())) / (Math.abs(tempMax - tempMin));
			}
			
			//Check by Percent Financial Aid
			if (SearchController.uniList.lastElement().getPercentFinAid() != SearchController.uniList.get(i).getPercentFinAid()) {
				
				//get max & min value
				tempMax = SearchController.uniList.get(0).getPercentFinAid();
				tempMin = SearchController.uniList.get(0).getPercentFinAid();
				for (int j = 0; j < SearchController.uniList.size() - 1; j++) {
					if (SearchController.uniList.get(j + 1).getPercentFinAid()  > tempMax) {
						tempMax = SearchController.uniList.get(j + 1).getPercentFinAid() ;
					}
					if (SearchController.uniList.get(j + 1).getPercentFinAid()  < tempMin) {
						tempMin = SearchController.uniList.get(j + 1).getPercentFinAid() ;
					}
				}
				distance += (float) (Math.abs(SearchController.uniList.lastElement().getPercentFinAid() - SearchController.uniList.get(i).getPercentFinAid())) / (Math.abs(tempMax - tempMin));
			} 
			
			//Check by Number of Applicants
			if (SearchController.uniList.lastElement().getNumApplicants() != SearchController.uniList.get(i).getNumApplicants()) {
				
				//get max & min value
				tempMax = SearchController.uniList.get(0).getNumApplicants();
				tempMin = SearchController.uniList.get(0).getNumApplicants();
				for (int j = 0; j < SearchController.uniList.size() - 1; j++) {
					if (SearchController.uniList.get(j + 1).getNumApplicants()  > tempMax) {
						tempMax = SearchController.uniList.get(j + 1).getNumApplicants();
					}
					if (SearchController.uniList.get(j + 1).getNumApplicants()  < tempMin) {
						tempMin = SearchController.uniList.get(j + 1).getNumApplicants();
					}
				}
				distance += (float) (Math.abs(SearchController.uniList.lastElement().getNumApplicants() - SearchController.uniList.get(i).getNumApplicants())) / (Math.abs(tempMax - tempMin));
			} 
			
			//Check by Percent Admitted
			if (SearchController.uniList.lastElement().getPercentAdmit() != SearchController.uniList.get(i).getPercentAdmit()) {
				
				//get max & min value
				tempMax = SearchController.uniList.get(0).getPercentAdmit();
				tempMin = SearchController.uniList.get(0).getPercentAdmit();
				for (int j = 0; j < SearchController.uniList.size() - 1; j++) {
					if (SearchController.uniList.get(j + 1).getPercentAdmit()  > tempMax) {
						tempMax = SearchController.uniList.get(j + 1).getPercentAdmit();
					}
					if (SearchController.uniList.get(j + 1).getPercentAdmit()  < tempMin) {
						tempMin = SearchController.uniList.get(j + 1).getPercentAdmit();
					}
				}
				distance += (float) (Math.abs(SearchController.uniList.lastElement().getPercentAdmit() - SearchController.uniList.get(i).getPercentAdmit())) / (Math.abs(tempMax - tempMin));
			} 
			
			//Check by Academic Scale
			if (SearchController.uniList.lastElement().getPercentEnrolled() != SearchController.uniList.get(i).getPercentEnrolled()) {
				
				//get max & min value
				tempMax = SearchController.uniList.get(0).getPercentEnrolled();
				tempMin = SearchController.uniList.get(0).getPercentEnrolled();
				for (int j = 0; j < SearchController.uniList.size() - 1; j++) {
					if (SearchController.uniList.get(j + 1).getPercentEnrolled()  > tempMax) {
						tempMax = SearchController.uniList.get(j + 1).getPercentEnrolled();
					}
					if (SearchController.uniList.get(j + 1).getPercentEnrolled()  < tempMin) {
						tempMin = SearchController.uniList.get(j + 1).getPercentEnrolled();
					}
				}
				distance += (float) (Math.abs(SearchController.uniList.lastElement().getPercentEnrolled() - SearchController.uniList.get(i).getPercentEnrolled())) / (Math.abs(tempMax - tempMin));
			} 
			
			//Check by Social Scale
			if (SearchController.uniList.lastElement().getAcademicScale() != SearchController.uniList.get(i).getAcademicScale()) {
				
				//get max & min value
				tempMax = 5;
				tempMin = 1;
				distance += (float) (Math.abs(SearchController.uniList.lastElement().getAcademicScale() - SearchController.uniList.get(i).getAcademicScale())) / (Math.abs(tempMax - tempMin));
			} 
			
			//Check by Quality of Life Scale
			if (SearchController.uniList.lastElement().getqOLScale() != SearchController.uniList.get(i).getqOLScale()) {
				
				//get max & min value
				tempMax = 5;
				tempMin = 1;
				distance += (float) (Math.abs(SearchController.uniList.lastElement().getqOLScale() - SearchController.uniList.get(i).getqOLScale())) / (Math.abs(tempMax - tempMin));
			} 
			
			//Check for similar Emphasis
			String[][] uniAndEmphasis = SearchController.DBC.university_getNamesWithEmphasis();
			for (int j = 0; j < uniAndEmphasis.length; j++) {
					if (uniAndEmphasis[j][0] == SearchController.uniList.get(i).getUniName()) {
						if (SearchController.uniList.lastElement().getEmphasisStudy1() != (uniAndEmphasis[j][1])) {
							distance++;
						} else if (!SearchController.uniList.lastElement().getEmphasisStudy2().equals(uniAndEmphasis[j][1])) {
							distance++;
						} else if (!SearchController.uniList.lastElement().getEmphasisStudy3().equals(uniAndEmphasis[j][1])) {
							distance++;
						} else if (!SearchController.uniList.lastElement().getEmphasisStudy4().equals(uniAndEmphasis[j][1])) {
							distance++;
						} else if (!SearchController.uniList.lastElement().getEmphasisStudy5().equals(uniAndEmphasis[j][1])) {
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
			uniResultList.add(SearchController.DBC.getUniversityByName(resultList.get(i).getKey()));
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
	
