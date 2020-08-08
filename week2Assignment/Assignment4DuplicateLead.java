package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4DuplicateLead {

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

       driver.findElementByXPath("//span[text()='Email']").click();
       String emailID = "t1@gmail.com"; 
     driver.findElementByXPath("//input[@name='emailAddress']").sendKeys(emailID);
     driver.findElementByXPath("//button[text()='Find Leads']").click();
     Thread.sleep(3000);
     driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[@class='linktext'])[1]").click();
     driver.findElementByXPath("//a[text()='Duplicate Lead']").click();
     String expectedTitle = "Duplicate Lead | opentaps CRM";
     String actualTitile = driver.getTitle();
     if((expectedTitle.equals(actualTitile))==true)
     {
    	 System.out.println("duplicate Lead title is correctly displayed");
     }
     else
     {
    	 System.out.println("title is not correct");
     }
     Thread.sleep(3000);
   driver.findElementByXPath("//input[@name='submitButton']").click();

	}

}
