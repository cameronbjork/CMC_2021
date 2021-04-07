import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import cmc.account.user.AccountControllerTest;
import cmc.account.user.SearchControllerTest;

@RunWith(Suite.class)
@SuiteClasses({SearchControllerTest.class, AccountControllerTest.class})
public class AllTests {

}
