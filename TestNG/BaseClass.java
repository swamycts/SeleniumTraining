package testcase;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class BaseClass {

	public ChromeDriver driver;  // set globally
	public String excelName; //set globally
	
	@Parameters({"username","password"})
	@BeforeMethod
	public void Login(String uName, String pWord)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys(uName);
		driver.findElementById("password").sendKeys(pWord);
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		
	}
	
	@DataProvider(name="fetchdata")
	public String[][] sendData() throws IOException {
		/*String[][] data = new String[2][3]; //row column indicates 2 rows and 3 columns 
				
		data[0][0] = "TestLeaf";
		data[0][1] = "Gopi";
		data[0][2] = "J";
		
		data[1][0] = "CTS";
		data[1][1] = "Swamy";
		data[1][2] = "Ss";*/
		
		return ReadExcel.excelData(excelName);
	}
	
	
	@AfterMethod
	public void close(){
		driver.close();
	}
	
}
