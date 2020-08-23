package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC002_EditLead extends BaseClass {

	@Test
	public void runEditLd() throws InterruptedException {
		
	new LoginPage(driver)			
	 .enterUserName()
	 .enterPassword()
	 .clickLoginButton()
	 .crmsfaLinkClick()
	 .clickLead()
	 .findLead()
	 .enterFirstName()
	 .clickFindLeadButton()
	 .searchResult_isDisplayed()
	 .clicksOnTheSearchResult()
	 .clickEditButton()
	 .enterfirstname()
	 .clickOnUpdateButton()
	 .verifyLeadUpdated();
	 
	 	 
	
	 
		
	}

}
