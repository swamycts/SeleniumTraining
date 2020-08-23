package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;


public class EditLead extends BaseClass {
	
	public EditLead(ChromeDriver driver) {
		this.driver = driver;
	}
	
	/*public EditLead clickEditButton() {
		driver.findElementByLinkText("Edit").click();
	return this;
	}*/

	public EditLead enterfirstname() {
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("Zoho");
	return this;
	}

	public EditLead clickOnUpdateButton() {
		driver.findElementByName("submitButton").click();
		return this;
	}

	//Verify if the lead is updated
	
	public EditLead verifyLeadUpdated() {
		String title11 = driver.getTitle();
		String expectedRes = "View Lead | opentaps CRM";
		if(title11.equals(expectedRes))
		{
			System.out.println("Edit lead is success");
		}
		
		return this;
	}

		

}
