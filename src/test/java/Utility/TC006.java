package Utility;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Page_object.login_page;

public class TC006 extends base{
	//functional testing test case
		//validate the functionality of login page by putting only password 	
		//output it should generate the error massage and error massage should be  Username must be present
		login_page ll;
	   @Test(priority=6)
	   public void verifytheincompletcredentials() {
		   ll=new login_page(driver);
		   ll.enterPWD("manager");
			ll.clickBTN();
			String actualerror = driver.findElement(By.xpath("//div[text()='Username must be present']")).getText();
			String expectederror= "Username must be present";
		        if(actualerror.equals(expectederror)) {
		        	System.out.println("tc pass");
		        	
		        }
		        else {
		        	System.out.println("tc fail");
		        }
	   }

}
