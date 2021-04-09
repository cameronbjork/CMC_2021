import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


import cmc.account.user.AccountControllerTest;
import cmc.account.user.SearchControllerTest;
import systemtest.LogOnTest;
import systemtest.SearchUniversitiesTest;
import systemtest.TopRecommendedUnisTest;

@RunWith(Suite.class)
@SuiteClasses({SearchControllerTest.class, LogOnTest.class, SearchUniversitiesTest.class, TopRecommendedUnisTest.class})
public class AllTests {

}
