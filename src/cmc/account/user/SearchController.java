/**
 * 
 */
package cmc.account.user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import cmc.university.University;

/**
 * @author cbjork001
 *
 */
public class SearchController {
	private DBController DBC;
	
	public SearchController() {
		this.DBC = new DBController();
	}

	public ArrayList<University> searchUniversities(String school, String state, String location, String control, int minNumStudents, 
			int maxNumStudents, int minPercentFemale, int maxPercentFemale, int minSATVerbal, int maxSATVerbal, int minSATMath, int maxSATMath, 
			int minAnnualExpenses, int maxAnnualExpenses, int minPercentFinancialAid, int maxPercentFinancialAid, int minNumApplicants, 
			int maxNumApplicants, int minPercentAdmit, int maxPercentAdmit, int minPercentEnrolled, int maxPercentEnrolled, 
			int minAcademicScale, int maxAcademicScale, int minSocialScale, int maxSocialScale, int minQOLScale, int maxQOLScale) {
		
		ArrayList<University> similarResults = new ArrayList<University>();
		ArrayList <University> allResults = new ArrayList<University>(this.DBC.getAllUniversities());
		
		//HashMap for each uniName can hold a distance value
		HashMap<String, Integer> uniAndDistance = new HashMap<String, Integer>(allResults.size());
		
		//Creates Key values for HashMap as uniName & values set to default distance value of 0
		for (int i = 0; i < allResults.size() - 1; i++) {
			uniAndDistance.put(allResults.get(i).getUniName(), 0);
		}
		
		String tempUniName;
		for (int i = 0; i < allResults.size() - 1; i++) {
			
			tempUniName = allResults.get(i).getUniName();
			
			//Check for school name
			if (tempUniName.contains(school)) {
				if (!similarResults.contains(allResults.get(i))) {
				similarResults.add(allResults.get(i));
				
				}
				//Update distance to HashMap
				uniAndDistance.replace(tempUniName, uniAndDistance.get(tempUniName) + 1);
			}
			
			//Check for similar states
			if (allResults.get(i).getUniState().contains(state)) {
				if (!similarResults.contains(allResults.get(i))) {
				similarResults.add(allResults.get(i));
				
				}
				//Update distance to HashMap
				uniAndDistance.replace(tempUniName, uniAndDistance.get(tempUniName) + 1);
			}
			
			//Check for Location
			if (allResults.get(i).getUniLocation().contains(location)) {
				if (!similarResults.contains(allResults.get(i))) {
				similarResults.add(allResults.get(i));
				
				}
				//Update distance to HashMap
				uniAndDistance.replace(tempUniName, uniAndDistance.get(tempUniName) + 1);
			}
			
			//Check for Control
			if (allResults.get(i).getControl().contains(control)) {
				if (!similarResults.contains(allResults.get(i))) {
				similarResults.add(allResults.get(i));
				
				}
				//Update distance to HashMap
				uniAndDistance.replace(tempUniName, uniAndDistance.get(tempUniName) + 1);
			}
			
			//Check for similar numOfStudents
			if (allResults.get(i).getNumOfStudents() >= minNumStudents && allResults.get(i).getNumOfStudents() <= maxNumStudents) {
				if (!similarResults.contains(allResults.get(i))) {
				similarResults.add(allResults.get(i));
				
				}
				//Update distance to HashMap
				uniAndDistance.replace(tempUniName, uniAndDistance.get(tempUniName) + 1);
			}
			
			//Check for similar percentFemale
			if (allResults.get(i).getPercentFemale() >= minPercentFemale && allResults.get(i).getPercentFemale() <= maxPercentFemale) {
				if (!similarResults.contains(allResults.get(i))) {
				similarResults.add(allResults.get(i));
				
				}
				//Update distance to HashMap
				uniAndDistance.replace(tempUniName, uniAndDistance.get(tempUniName) + 1);
			}
			
			//Check for similar SATVerbal
			if (allResults.get(i).getSatVerbal() >= minSATVerbal && allResults.get(i).getSatVerbal() <= maxSATVerbal) {
				if (!similarResults.contains(allResults.get(i))) {
				similarResults.add(allResults.get(i));
				
				}
				//Update distance to HashMap
				uniAndDistance.replace(tempUniName, uniAndDistance.get(tempUniName) + 1);
			}
			
			//Check for similar SATMath
			if (allResults.get(i).getSatMath() >= minSATMath && allResults.get(i).getSatMath() <= maxSATMath) {
				if (!similarResults.contains(allResults.get(i))) {
				similarResults.add(allResults.get(i));
				
				}
				//Update distance to HashMap
				uniAndDistance.replace(tempUniName, uniAndDistance.get(tempUniName) + 1);
			}
			
			//Check for similar Expenses
			if (allResults.get(i).getAnnualExpenses() >= minAnnualExpenses && allResults.get(i).getAnnualExpenses() <= maxAnnualExpenses) {
				if (!similarResults.contains(allResults.get(i))) {
				similarResults.add(allResults.get(i));
				
				}
				//Update distance to HashMap
				uniAndDistance.replace(tempUniName, uniAndDistance.get(tempUniName) + 1);
			}
			
			//Check for similar percentFinancialAid
			if (allResults.get(i).getPercentFinAid() >= minPercentFinancialAid && allResults.get(i).getPercentFinAid() <= maxPercentFinancialAid) {
				if (!similarResults.contains(allResults.get(i))) {
				similarResults.add(allResults.get(i));
				
				}
				//Update distance to HashMap
				uniAndDistance.replace(tempUniName, uniAndDistance.get(tempUniName) + 1);
			}
			
			//Check for similar numApplicants
			if (allResults.get(i).getNumApplicants() >= minNumApplicants && allResults.get(i).getNumApplicants() <= maxNumApplicants) {
				if (!similarResults.contains(allResults.get(i))) {
				similarResults.add(allResults.get(i));
				
				}
				//Update distance to HashMap
				uniAndDistance.replace(tempUniName, uniAndDistance.get(tempUniName) + 1);
			}
			
			//Check for similar percentAdmitted
			if (allResults.get(i).getPercentAdmit() >= minPercentAdmit && allResults.get(i).getPercentAdmit() <= maxPercentAdmit) {
				if (!similarResults.contains(allResults.get(i))) {
				similarResults.add(allResults.get(i));
				
				}
				//Update distance to HashMap
				uniAndDistance.replace(tempUniName, uniAndDistance.get(tempUniName) + 1);
			}
			
			//Check for similar percentEnrolled
			if (allResults.get(i).getPercentEnrolled() >= minPercentEnrolled && allResults.get(i).getPercentEnrolled() <= maxPercentEnrolled) {
				if (!similarResults.contains(allResults.get(i))) {
				similarResults.add(allResults.get(i));
				
				}
				//Update distance to HashMap
				uniAndDistance.replace(tempUniName, uniAndDistance.get(tempUniName) + 1);
			}
			
			//Check for similar acadmicsScale
			if (allResults.get(i).getAcademicScale() >= minAcademicScale && allResults.get(i).getAcademicScale() <= maxAcademicScale) {
				if (!similarResults.contains(allResults.get(i))) {
				similarResults.add(allResults.get(i));
				
				}
				//Update distance to HashMap
				uniAndDistance.replace(tempUniName, uniAndDistance.get(tempUniName) + 1);
			}
			
			//Check for similar socialScale
			if (allResults.get(i).getSocialScale() >= minSocialScale && allResults.get(i).getSocialScale() <= maxSocialScale) {
				if (!similarResults.contains(allResults.get(i))) {
				similarResults.add(allResults.get(i));
				
				}
				//Update distance to HashMap
				uniAndDistance.replace(tempUniName, uniAndDistance.get(tempUniName) + 1);
			}
			
			//Check for similar qOLScale
			if (allResults.get(i).getqOLScale() >= minQOLScale && allResults.get(i).getSocialScale() <= maxQOLScale) {
				if (!similarResults.contains(allResults.get(i))) {
				similarResults.add(allResults.get(i));
				
				}
				//Update distance to HashMap
				uniAndDistance.replace(tempUniName, uniAndDistance.get(tempUniName) + 1);
			}
		}

		//return list of searchResults
		return similarResults;
		
		
	}

	public University getRecentUniversity(String u) {
		User u1 = (DBC.getUser(u));
		University uni1 = u1.getRecentUniversity();
		return uni1;
		// Implement to Web Interface
	}
	
	public boolean recommendedSearch(University uni) {
		return DBC.checkState(uni);
			
		}
	}
	
