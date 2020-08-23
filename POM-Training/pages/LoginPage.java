package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

//in this page i.e Login page, we are performing 3 actions, so created 3 methods

public class LoginPage extends BaseClass {
	
	public LoginPage(ChromeDriver driver) {
    this.driver = driver;
		
	}


	public LoginPage enterUserName(){
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		return this;

	}
	
	public LoginPage enterPassword() {
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		
		return this;
	}
	
	public HomePage clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();

		return new HomePage(driver);
	}
}
