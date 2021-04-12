import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import cmc.account.AccountTest;
import cmc.account.admin.AdminTest;
import cmc.account.user.AccountControllerTest;
import cmc.account.user.DBControllerTest;
import cmc.account.user.SearchControllerTest;
import cmc.account.user.UserFunctionalityControllerTest;
import cmc.account.user.UserInteractionTest;
import cmc.account.user.UserTest;
import cmc.university.UniversityTest;
import systemtest.LogOnTest;
import systemtest.LogOutTest;
import systemtest.RemoveSavedSchoolTest;
import systemtest.SaveSchoolTest;
import systemtest.SearchUniversitiesTest;
import systemtest.TopRecommendedUnisTest;
import systemtest.UserEditUserTest;
import systemtest.ViewProfileTest;
import systemtest.ViewRecentSearchTest;
import systemtest.ViewSavedSchoolsTest;
import systemtest.ViewSearchResultsTest;

@RunWith(Suite.class)
@SuiteClasses({UniversityTest.class, AccountTest.class, AdminTest.class,
	UserTest.class, AccountControllerTest.class, SearchControllerTest.class,
	UserFunctionalityControllerTest.class, DBControllerTest.class, UserInteractionTest.class, 
	LogOnTest.class, LogOutTest.class, SearchUniversitiesTest.class, TopRecommendedUnisTest.class,
	RemoveSavedSchoolTest.class, SaveSchoolTest.class, SearchUniversitiesTest.class, UserEditUserTest.class,
	ViewProfileTest.class, ViewRecentSearchTest.class, ViewSavedSchoolsTest.class, ViewSearchResultsTest.class})
public class AllTests {

}
