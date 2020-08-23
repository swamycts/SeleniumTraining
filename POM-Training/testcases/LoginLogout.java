package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class LoginLogout extends BaseClass {
	
	@Test
	public void runLoginLogout() {
		
		new LoginPage(driver)
		.enterUserName()
		.enterPassword()
		.clickLoginButton()
		//.verifyHomePage()
		.Logout();


	}
	

}
