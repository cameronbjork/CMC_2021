import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import cmc.account.user.UserFunctionalityControllerTest;
import cmc.account.systemtest.AccountControllerTest;
import cmc.account.systemtest.SearchControllerTest;

@RunWith(Suite.class)
@SuiteClasses({SearchControllerTest.class, AccountControllerTest.class, UserFunctionalityControllerTest.class})
public class AllTests {
}
