package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class MyLeads extends BaseClass {
	
	public MyLeads(ChromeDriver driver) {
	this.driver = driver;
	}

	public CreateLead createLead() {
		driver.findElementByLinkText("Create Lead").click();
		return new CreateLead(driver);
		
	}

public FindLead findLead() {
	driver.findElementByLinkText("Find Leads").click();
	return new FindLead(driver);
}
}
