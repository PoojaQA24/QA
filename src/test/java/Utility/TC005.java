package Utility;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Page_object.login_page;

public class TC005 extends base{
	//functional testing test case
	//validate the functionality of login page by putting only user name 	
	//output it should generate the error massage and error massage should be Password must be present
	login_page ll;
   @Test(priority=5)
   public void verifytheincompletcredentials() {
	   ll=new login_page(driver);
	   ll.enterUN("admin");
		ll.clickBTN();
		String actualerror = driver.findElement(By.xpath("//div[text()='Password must be present']")).getText();
		String expectederror= "Password must be present";
	        if(actualerror.equals(expectederror)) {
	        	System.out.println("tc pass");
	        	
	        }
	        else {
	        	System.out.println("tc fail");
	        }
   }
}
