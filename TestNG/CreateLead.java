package testcase;

import org.testng.annotations.BeforeTest;
//import org.testng.annotations.DataProvider;

//import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass {
	
	@BeforeTest
	public void setFile(){
		excelName = "CreateLead";
	}

	@Test(dataProvider = "fetchdata")
	public void runCreateLead(String company, String fName, String lName) {
		
		/*System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		*/
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(company);
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
		driver.findElementByName("submitButton").click();
		//driver.close();
		
		
}
	/*@DataProvider(name="fetchdata")
	public String[][] sendData() {
		String[][] data = new String[2][3]; //row column indicates 2 rows and 3 columns 
				
		data[0][0] = "TestLeaf";
		data[0][1] = "Gopi";
		data[0][2] = "J";
		
		data[1][0] = "CTS";
		data[1][1] = "Swamy";
		data[1][2] = "Ss";
		
		return data;
		

	}*/		

}






