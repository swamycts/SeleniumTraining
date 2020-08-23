package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class MyHomePage extends BaseClass {
	
	public MyHomePage(ChromeDriver driver) {
	this.driver = driver;
	}
	
	public MyLeads clickLead() {
		
		driver.findElementByLinkText("Leads").click();
		
		return new MyLeads(driver);
	}

}
