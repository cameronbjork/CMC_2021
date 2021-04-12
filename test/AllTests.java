import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import cmc.account.AccountTest;
import cmc.account.admin.AdminTest;
import cmc.account.user.AccountControllerTest;
import cmc.account.user.DBControllerTest;
import cmc.account.user.SearchControllerTest;
import cmc.account.user.UserFunctionalityControllerTest;
import cmc.account.user.UserTest;
import cmc.university.UniversityTest;
import systemtest.LogOnTest;
import systemtest.LogOutTest;
import systemtest.SearchUniversitiesTest;
import systemtest.TopRecommendedUnisTest;

@RunWith(Suite.class)
@SuiteClasses({UserFunctionalityControllerTest.class})
public class AllTests {

}

//@SuiteClasses({SearchControllerTest.class, LogOnTest.class, LogOutTest.class,
	//SearchUniversitiesTest.class, TopRecommendedUnisTest.class, UserFunctionalityControllerTest.class,
	//DBControllerTest.class, UniversityTest.class, AccountTest.class, AdminTest.class,
	//UserTest.class})