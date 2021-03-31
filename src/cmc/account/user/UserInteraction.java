package cmc.account.user;

public class UserInteraction {
	private UserFunctionalityController UFC;
	private SearchController SC;
	private AccountController AC;
	
	public void userEditUser(String userName, String firstName, String lastName, String passWord) {
		AC.userEditUser(userName, firstName, lastName, passWord);
	}
}
