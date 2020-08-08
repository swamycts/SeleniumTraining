package week4.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DranAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		WebElement myFrame = driver.findElementByXPath("//iframe[@class='demo-frame']");
		driver.switchTo().frame(myFrame);
		
		WebElement source = driver.findElementByXPath("//div[@id='draggable']");
		WebElement target = driver.findElementByXPath("//div[@id='droppable']");

		Actions builder = new Actions(driver); 
		builder.dragAndDrop(source, target).perform();
	}

}
