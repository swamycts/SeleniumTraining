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
		/*WebElement myFrame = driver.findElementByXPath("//iframe[@class='demo-frame']");
		driver.switchTo().frame(myFrame);*/
		
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		
		WebElement item1 = driver.findElementByXPath("//ul[@id='sortable']/li[1]");
		//WebElement item2 = driver.findElementByXPath("//ul[@id='sortable']/li[2]");
		//WebElement item3 = driver.findElementByXPath("//ul[@id='sortable']/li[3]");
		WebElement item4 = driver.findElementByXPath("//ul[@id='sortable']/li[4]");
		
		/*Point location = driver.findElementByXPath("//li[contains(text(),'Item 4')]").getLocation();
		int x = location.getX();
		int y = location.getY();*/
		
		
		Actions builder = new Actions(driver);
		//builder.dragAndDrop(source, target).perform();
		
		builder.dragAndDrop(item1, item4).perform();
		Thread.sleep(2000);

		}

}
