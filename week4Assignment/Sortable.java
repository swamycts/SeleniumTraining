package week4.day1;

import org.openqa.selenium.Point;

//import java.awt.Point;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//import com.graphbuilder.curve.Point;

public class Sortable {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/sortable/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement myFrame = driver.findElementByXPath("//iframe[@class='demo-frame']");
		driver.switchTo().frame(myFrame);
		
		Thread.sleep(2000);
		
		WebElement source = driver.findElementByXPath("//li[contains(text(),'Item 1')]");
		//WebElement target = driver.findElementByXPath("//li[contains(text(),'Item 4')]");
		
		Point location = driver.findElementByXPath("//li[contains(text(),'Item 4')]").getLocation();
		
		int x = location.getX();
		int y = location.getY();
		
		
		Actions builder = new Actions(driver);
		//builder.dragAndDrop(source, target).perform();
		
		builder.dragAndDropBy(source, x, y).perform();
		Thread.sleep(2000);

		}

}
