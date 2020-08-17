package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EditLead extends BaseClass {

	@Given("user click on Leads Menu")
    public void clickOnLeads() {
		driver.findElementByXPath("//a[text()='Leads']").click();

	}
	
	
	@And("user clicks on Find Leads link")
	public void user_clicks_on_Find_Leads_link() {
		driver.findElementByLinkText("Find Leads").click();
	}

	@Given("user enters firstname field")
	public void user_enters_firstname_field() {
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("test");   
	}

	@When("user clicks on Find Leads button")
	public void user_clicks_on_Find_Leads_button() throws InterruptedException {
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
	}

	@Then("search result page is displayed")
	public void search_result_page_is_displayed() {
	    System.out.println("search results are displayed");
	}

	@When("user clicks on the search result")
	public void user_clicks_on_the_search_result() {
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		
	}

	@When("user clicks on Edit button")
	public void user_clicks_on_Edit_button() {
		driver.findElementByLinkText("Edit").click();
		}

	@When("user Updates the firstname")
	public void user_Updates_the_firstname() {
		driver.findElementById("updateLeadForm_companyName").sendKeys("Storebrand");
			}

	@When("Click on Update button")
	public void click_on_Update_button() {
		driver.findElementByName("submitButton").click();
	}

	@Then("Verify the lead is updated")
	public void verify_the_lead_is_updated() {
		String title11 = driver.getTitle();
		String expectedRes = "View Lead | opentaps CRM";
		if(title11.equals(expectedRes))
		{
			System.out.println("Edit lead is success");
		}
		
		
	}

	
}
