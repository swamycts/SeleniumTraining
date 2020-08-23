package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class CreateLead extends BaseClass {
	
	public CreateLead(ChromeDriver driver) {
	 this.driver = driver;
	 }
	
	public CreateLead enterCompanyName() {
		driver.findElementById("createLeadForm_companyName").sendKeys("testLeaf-cucu"); 
		return this;
	}
	
	
	public CreateLead enterFirstName() {
		driver.findElementById("createLeadForm_firstName").sendKeys("POM design");
		return this;
	}

	public CreateLead enterLastName() {
		driver.findElementById("createLeadForm_lastName").sendKeys("learning");
		return this;
	}

    public ViewLead clickCreateLead() {
    	driver.findElementByName("submitButton").click();
    	return new ViewLead(driver);
	}
	
    public void verifyLeadCreation() {
    	String Pagetitle = driver.getTitle();
		if(Pagetitle.equals("View Lead | opentaps CRM")){
			System.out.println("Lead is created successfully");
 
			
	}	
	
}
}