package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class ViewLead extends BaseClass {
	
	public ViewLead(ChromeDriver driver) {
	this.driver = driver;
	}

	 public ViewLead verifyLeadCreation() {
	    	String Pagetitle = driver.getTitle();
			if(Pagetitle.equals("View Lead | opentaps CRM")){
				System.out.println("Lead is created successfully");	 
			
			
		}	
			return this;
	 }
			
	 /*public FindLead clickFindLeads() {
			driver.findElementByLinkText("Find Leads").click();	
			return new FindLead(driver);

		}
	*/ 
	 	public EditLead clickEditButton() {
		driver.findElementByLinkText("Edit").click();
		return new EditLead(driver);
				
		}

	 
	 

	 
}