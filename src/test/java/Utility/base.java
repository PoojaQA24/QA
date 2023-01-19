package Utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class base {
	WebDriver driver;
	@BeforeClass
	public void OpenBrowser() {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\pooja gaurishankar p\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
	 driver= new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://sakshingp.github.io/assignment/login.html");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	
		
	}
	
	

}
