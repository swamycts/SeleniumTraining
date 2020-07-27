package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		// driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);


		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		Thread.sleep(2000);
	   driver.findElementByXPath("//a[@href='/crmsfa/control/leadsMain']").click();
	    //a[@href='/crmsfa/control/findLeads']  
	   driver.findElementByXPath("//a[contains(text(),'Find Leads')]").click();

       driver.findElementByXPath("//span[text()='Phone']").click();
     driver.findElementByXPath("//button[text()='Find Leads']").click();
     
     String leadId = "10088";
     Thread.sleep(3000);
     driver.findElementByXPath("//a[text()='"+ leadId +"']").click();
     driver.findElementByXPath("//a[text()='Delete']").click();   
     driver.findElementByXPath("//a[contains(text(),'Find Leads')]").click();
     driver.findElementByXPath("//input[@name='id']").sendKeys(leadId);
     driver.findElementByXPath("//button[text()='Find Leads']").click();
     
     String expectedResult = "No records to display";
     Thread.sleep(3000);
     String actualResult = driver.findElementByXPath("//div[text()='No records to display']").getText();
     
     //System.out.println(actualResult.equals(expectedResult));
     
     if((actualResult.equals(expectedResult)) == true)
     {
    	 System.out.println("Lead ID deleted successfully");
     }
     else
    	 System.out.println("Lead ID not deleted");
	}

}
