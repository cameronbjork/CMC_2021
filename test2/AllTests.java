import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import cmc.account.user.AccountControllerTest;
import cmc.account.user.SearchControllerTest;
import cmc.account.user.UserFunctionalityControllerTest;

@RunWith(Suite.class)
@SuiteClasses({SearchControllerTest.class, AccountControllerTest.class, UserFunctionalityControllerTest.class})
public class AllTests {

}
