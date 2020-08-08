package week4.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableEg {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/table.html");
		driver.manage().window().maximize();

		List<WebElement> columns = driver.findElementsByXPath("//table//th");
		System.out.println("columns: "+columns.size());
		
		List<WebElement> rows = driver.findElementsByXPath("//table//tr");
				
		int x = rows.size()-1;
		System.out.println("rows: "+x);

		String ExpectedCourseName = "Learn to interact with Elements";
		
		List<WebElement> course = driver.findElementsByXPath("//table//tr");
		int y = course.size();
		
		for (int i = 2; i <= y; i++) {
			

			String ActualCourseName = driver.findElementByXPath("//table//tr["+i+ "]/td[1]").getText();
            if (ActualCourseName.equals(ExpectedCourseName)) {
            	String str= driver.findElementByXPath("//table//tr["+ i+ "]//td[2]").getText();
            System.out.println("value for Leran to interact elements is "+str);
            }
            
		}
		
			
		WebElement element1 =driver.findElementByXPath("//table//tr[4]/td[3]/input");
		System.out.println(element1.getAttribute("type"));
		element1.click();
		
	}

}
