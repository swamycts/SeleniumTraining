package steps;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLead extends BaseClass {
	
	@Then("user click on crmsfa link")
	public void clickCRMSFAlink() {
		driver.findElementByLinkText("CRM/SFA").click();
	}
	
	@Given("click on leads Link")
	public void click_on_leads_Link() {
		driver.findElementByLinkText("Leads").click();
	}

	@And("Click on createlead link")
	public void click_on_createlead_link() {
		driver.findElementByLinkText("Create Lead").click();
	}

	@Given("Enter company name")
	public void enter_company_name() {
		driver.findElementById("createLeadForm_companyName").sendKeys("testLeaf-cucu"); 	
	}

	@And("user enters firstname")
	public void enterFirstName() {
		driver.findElementById("createLeadForm_firstName").sendKeys("Mac");
	}

	@And("user enters lastname")
	public void enterLastName() {
		driver.findElementById("createLeadForm_lastName").sendKeys("Laren");
	}
	
	@When("Click on CreatLead button")
	public void click_on_CreatLead_button() {
		driver.findElementByName("submitButton").click();
	 	}

	@Then("Lead should be created")
    public void verifyCreationofLead() {
		String Pagetitle = driver.getTitle();
		if(Pagetitle.equals("View Lead | opentaps CRM")){
			System.out.println("Lead is created successfully");
		}
		
	
	}
	
	
}
