package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class FindLead extends BaseClass {

	public FindLead(ChromeDriver driver) {
		this.driver = driver;
		}
	
	/*public FindLead clickFindLeads() {
		driver.findElementByLinkText("Find Leads").click();		
return this;
	}
*/	
	public FindLead enterFirstName() throws InterruptedException {
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("test");
		
return this;
	}
	
	public FindLead clickFindLeadButton() throws InterruptedException {
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(5000);
	return this;
	}
	
	public FindLead searchResult_isDisplayed() {
	    System.out.println("search results are displayed");
	return this;
	}
	
	public ViewLead clicksOnTheSearchResult() {
		//driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		return new ViewLead(driver);
	}
	
	
}
