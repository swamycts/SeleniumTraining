package week4.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapDealActions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();

		Thread.sleep(2000);
WebElement element = driver.findElementByXPath("//span[contains(text(),'Summer Fashion')][1]");

Actions builder = new Actions(driver);

builder.moveToElement(element).perform();

//builder.moveToElement(element).click(driver.findElementByXPath("(//span[contains(text(),'T-Shirts')])[1]")).perform();


	}

}
