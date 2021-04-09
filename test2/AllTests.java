import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

<<<<<<< HEAD
import cmc.account.user.AccountControllerTest;
import cmc.account.user.SearchControllerTest;
import cmc.account.user.UserFunctionalityControllerTest;
=======
import cmc.account.systemtest.AccountControllerTest;
import cmc.account.systemtest.SearchControllerTest;
>>>>>>> 40d2b3bb6bad2f17789f704766556a2a8b9a8b79

@RunWith(Suite.class)
@SuiteClasses({SearchControllerTest.class, AccountControllerTest.class, UserFunctionalityControllerTest.class})
public class AllTests {

}
