package week4.day1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErailWebTable {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://erail.in");
		driver.manage().window().maximize();

		driver.findElementById("chkSelectDateOnly").click();
		
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("ms");
		driver.findElementById("txtStationFrom").sendKeys(Keys.TAB);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("mdu");
		driver.findElementById("txtStationTo").sendKeys(Keys.TAB);
		Thread.sleep(4000);
		
		List<WebElement> allRows = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tbody/tr"));
		int trainSize = allRows.size();
		System.out.println("rows " + trainSize);

		List<WebElement> trainNames = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tbody/tr/td[2]"));
        int trainCount = trainNames.size();
		System.out.println("train names " + trainCount);
		
		List<String> trainNamesNew = new ArrayList<String>(); 
		
		for (int i = 1; i <= trainSize; i++) {
			
				
				//driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tbody/tr"));
				String trains = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']//tbody/tr["+i+ "]/td[2]").getText();
				System.out.println(trains);
			
				trainNamesNew.add(trains);
			
				
			//table[@class='DataTable TrainList TrainListHeader']//tbody/tr[2];
			
		}
		System.out.println(trainNamesNew.size());
		
		Set<String> newValues = new LinkedHashSet<String>();
		
		for (String tmpString : trainNamesNew) {
			newValues.add(tmpString);
		}
		
		System.out.println(newValues);
		System.out.println(newValues.size());
		
		//table[@class='DataTable TrainList TrainListHeader']//tbody/tr/td[2]
		
		//table[@class='DataTable TrainList TrainListHeader']//tbody/tr/td[2]
			
		
		
	}

}
