package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2EditLead {

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
	   //Thread.sleep(7000);
	   /*WebDriverWait wait = new WebDriverWait(driver, 30);
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@name='firstName'])[1]")));
	   driver.findElementByXPath("(//input[@name='firstName'])[1]").sendKeys("oracle");*/
	   
	   String firstName = "oracle";
	   String expectedpageTitle = "View Lead | opentaps CRM";
	   driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys(firstName);	 
	   driver.findElementByXPath("//button[text()='Find Leads']").click();
	   Thread.sleep(5000);
	   driver.findElementByXPath("//a[@class='linktext' and text()='"+ firstName +"']").click();
	   String actualPageTitle = driver.getTitle();
	   
	   boolean b = expectedpageTitle.equals(actualPageTitle);
		   if(b == true){
			   System.out.println("page title is as expected");
	   }
		   else
			   System.out.println("page title is wrong");
	
		   driver.findElementByXPath("//a[text()='Edit']").click();
		   
		   String updatedCompName = "cognizant tech";
		   
		   driver.findElementByXPath("(//input[@name='companyName'])[2]").clear();
		   driver.findElementByXPath("(//input[@name='companyName'])[2]").sendKeys(updatedCompName);
		   
		   driver.findElementByXPath("(//input[@name='submitButton'])[1]").click();
		   
		   String actualUpdatedName = driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText();
	
		   /*String[] strArray = actualUpdatedName.split(" ");
		   for (String string1 : strArray) {
			//System.out.println(string1);
			if (string1.equals(updatedCompName))
			{
				System.out.println("updated company name is displayed " + string1);
				
			}
			else
				System.out.println("updated company name is not displayed " + string1);
			break;
		}*/
	
		   if(actualUpdatedName.contains(updatedCompName)==true){
			   System.out.println("updated company name is displayed");
		   }
	
	}
	
}
