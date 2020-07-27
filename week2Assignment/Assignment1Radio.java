package week2.day2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1Radio {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");
		driver.manage().window().maximize();
		
		driver.findElementByXPath("//input[@id='yes']").click();
		
		List<WebElement> radio1 = driver.findElementsByXPath("(//input[@name='news'])");
		System.out.println(radio1.size());
		
	    for (int i=1; i<=radio1.size(); i++ )
	    {
	    	//boolean radio = driver.findElementByXPath("(//input[@name='news'])[" + i + "]"); 
	    	
	    	boolean rad1 = driver.findElementByXPath("(//input[@name='news'])[" + i + "]").isSelected();
	    	
	    	if(rad1 == true)
	    	{
	    		String s = driver.findElementByXPath("//label[@for='Checked']").getAttribute("for");
	            System.out.println(s);
	            
	    		System.out.println(s + " checkbox is checked");
	            
	    	}
	     }
		
    //(//input[@name='age'])[2]
				
	}

}
