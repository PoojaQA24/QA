package Utility;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import Page_object.login_page;

public class TC008  {
	 public static void main(String[] args) {
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\pooja gaurishankar p\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://sakshingp.github.io/assignment/login.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		login_page ll=new login_page(driver);
		ll.enterUN("admin");
		ll.enterPWD("manager");
		ll.clickBTN();
		
		driver.findElement(By.xpath("//th[@id='amount']")).click();
	List<WebElement> ss= (List<WebElement>) driver.findElement(By.xpath("//table[@id='transactionsTable']/thead/tr/th[@id='amount']"));
	String[] beforesort=new String[ss.size()];
	
		for(int i=0;i<ss.size();i++) {
			beforesort[i]=ss.get(i).getText().trim();
			
		}
		System.out.println("before sort");
		System.out.println(beforesort);
		Arrays.sort(beforesort);
		
	System.out.println("aftar the sort");
	}
	   
	    
	
	


}
	
	


