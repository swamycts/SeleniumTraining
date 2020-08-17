package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login extends BaseClass {
	//public ChromeDriver driver;

	/*@Given("OpenChrome browser")
	public void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 driver = new ChromeDriver();
		
	}
	
	@And("Load the application URL")
	public void loadURL() {
		driver.get("http://leaftaps.com/opentaps/control/main");
	}
	
	@And("maximise the browser")
	public void maximise() {
		driver.manage().window().maximize();
	}
	@And("apply implicit wait")
	public void applyWait() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	*/
	@Given("enter the user name as demoCSR")
	public void enterUserName(String usr) {
		driver.findElementById("username").sendKeys("demoCSR");
	}
	@And("enter the password as crmsfa123")
	public void enterPWD(String pwd) {
		driver.findElementById("password").sendKeys("crmsfa123");
	}

	@When("click on login button")
	public void clickLogin() {
		driver.findElementByClassName("decorativeSubmit").click();	
	}

	@Then("user should be able to login")
	public void verifyHomePage() {
		String title1 = driver.getTitle();
		if(title1.equals("Leaftaps - TestLeaf Automation Platform")){
			System.out.println("Logged in successfully");
		}
     }
	
	@But("error message should be displayed")
	public void errorMessage() {
		System.out.println("error message");

	}
}


