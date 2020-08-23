package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.HomePage;
import pages.LoginPage;

public class TC001_CreateLead extends BaseClass {
	
	@Test
	public void runCreateLead() {
		
		//new HomePage(driver)
		new LoginPage(driver)
		.enterUserName()
		.enterPassword()
		.clickLoginButton()
		
		.crmsfaLinkClick()
		.clickLead()
		.createLead()
		.enterCompanyName()
		.enterFirstName()
		.enterLastName()
		.clickCreateLead()
		.verifyLeadCreation();
		
     
	}

}
