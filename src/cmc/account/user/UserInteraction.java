package cmc.account.user;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import cmc.account.Account;
import cmc.university.University;

public class UserInteraction {
	private UserFunctionalityController UFC;
	private SearchController SC;
	private AccountController AC;
	
	
	public UserInteraction() {
		this.UFC = new UserFunctionalityController();
		this.SC = new SearchController();
		this.AC= new AccountController();
	}
	
	//Admin can edit type and activate/deactivate account
	public boolean userEditUser(String userName, String firstName, String lastName, String passWord) {
		return this.AC.userEditUser(userName, firstName, lastName, passWord);

	}

	public boolean displaySavedUniversities(String username) {
		ArrayList<University> saved = this.UFC.displaySavedUniversities(username);
		if (saved != null) {
		return true;
		} else {
			return false;
		}
	}
	
	//Create most recent search method
	public boolean searchUniversities(String school, String state, String location, String control, int minNumStudents, 
			int maxNumStudents, int minPercentFemale, int maxPercentFemale, int minSATVerbal, int maxSATVerbal, int minSATMath, int maxSATMath, int minAnnualExpenses, 
			int maxAnnualExpenses, int minPercentFinancialAid, int maxPercentFinancialAid, int minNumApplicants, int maxNumApplicants,
			int minPercentAdmit, int maxPercentAdmit, int minPercentEnrolled, int maxPercentEnrolled, int minAcademicScale, int maxAcademicScale, 
			int minSocialScale, int maxSocialScale, int minQOLScale, int maxQOLScale, String emphasis1, String emphasis2, 
			String emphasis3, String emphasis4, String emphasis5) {
		
		ArrayList<University> universities = this.SC.searchUniversities(school, state, location, control, minNumStudents, maxNumStudents, 
				minPercentFemale, maxPercentFemale, minSATVerbal, maxSATVerbal, minSATMath, maxSATMath, minAnnualExpenses, maxAnnualExpenses, minPercentFinancialAid,
				maxPercentFinancialAid, minNumApplicants, maxNumApplicants, minPercentAdmit, maxPercentAdmit, minPercentEnrolled, maxPercentEnrolled, minAcademicScale,
				maxAcademicScale, minSocialScale, maxSocialScale, minQOLScale, maxQOLScale, emphasis1, emphasis2, emphasis3, emphasis4, emphasis5);
		
		if (universities.size() != 0) {
			for (int i = 0; i < universities.size(); i++) {
				System.out.println(universities.get(i).getUniName());
			}
				return true;
		}
		else {
			return false;
		}

	}
	
	public boolean topRecommendedUnis(University uni) {
		ArrayList<University> recommendedUnis = new ArrayList<>();
		recommendedUnis.addAll(this.SC.topRecommendedUnis(uni));
		System.out.println("Recommended Uni's in Order:\n");
		for (int i = 0; i < recommendedUnis.size(); i++) {
		System.out.println(recommendedUnis.get(i).getUniName());
		}
		return true;
	}
	
	
	private University displaySearchResult(ArrayList<University> universities, int i) {
		return universities.get(i);
		
	}

	public Account logOn(String userName, String passWord) {
		Account result = this.AC.logOn(userName, passWord);
		return result;
	}
	
	public boolean logOut(String userName) {
		return this.AC.logOut(userName);
		
	}
	
	public boolean displayProfile(String userName) {
		if (this.AC.displayProfile(userName) != null) {
			return true;
		} else {
			return false;
		}
	}
	
	public University getRecentUniversity(String u) {
		return this.SC.getRecentUniversity(u);
	}
	
	public boolean removeSavedUniversity(String userName, University uni) {
		return this.UFC.removeSavedUniversity(userName, uni);
	}

	public boolean displayUniversity(University uni) {
		this.UFC.displayUniversity(uni);
		return true;
	}
	
	public boolean saveUniversity(String userName, University uni) {
		return this.UFC.saveUnversity(userName, uni);
	}

	
}
