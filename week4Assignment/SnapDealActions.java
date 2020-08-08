package week4.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDealActions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();


	}

}
