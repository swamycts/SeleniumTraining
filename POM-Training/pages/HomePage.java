package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

//as Logout button exists in the Home page we are creating Logout method in this class

public class HomePage extends BaseClass {

	public HomePage(ChromeDriver driver) {
	this.driver = driver;
	}
	
	public MyHomePage crmsfaLinkClick() {
		driver.findElement(By.linkText("CRM/SFA")).click();

		String expectedTitle = "My Home | opentaps CRM";
		String actualTitle = driver.getTitle();
	
		if(expectedTitle.equals(actualTitle)){
			System.out.println("My Home page is displayed");
			}
		
		return new MyHomePage(driver);
	}
	
	public LoginPage Logout() {
		
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		String text = driver.findElementByXPath("//h2[text()='Leaftaps Login']").getText();
		if(text.contains("Login")){
			System.out.println("Logged out successfully");
		}
		return new LoginPage(driver);
		}
	
	public HomePage verifyHomePage() {
		String title1 = driver.getTitle();
		if(title1.equals("Leaftaps - TestLeaf Automation Platform")){
			System.out.println("Logged in successfully");
		}
		else
		{
			System.out.println("not in the right page");
		}
		
		return this;
     }
}
