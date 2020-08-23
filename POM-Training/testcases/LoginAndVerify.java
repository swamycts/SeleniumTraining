package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class LoginAndVerify extends BaseClass {
	
	@Test
	public void runLoginVerify() {
		
		new LoginPage(driver)
		.enterUserName()
		.enterPassword()
		.clickLoginButton()
		.verifyHomePage();
		
	}


}
