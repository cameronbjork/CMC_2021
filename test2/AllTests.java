import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import cmc.account.systemtest.AccountControllerTest;
import cmc.account.systemtest.SearchUniversitiesTest;
import cmc.account.systemtest.TopRecommendedUnisTest;
import cmc.account.user.SearchControllerTest;

@RunWith(Suite.class)
@SuiteClasses({SearchControllerTest.class, AccountControllerTest.class, SearchUniversitiesTest.class, TopRecommendedUnisTest.class})
public class AllTests {

}
