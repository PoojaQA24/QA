package Utility;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Page_object.login_page;

public class TC004 extends base{
	//validating the functional testing
	//validating the functionality of login button with out feeling credentials it should show error
	//output should be it should generate the error massage should be Both Username and Password must be present
	login_page ll;
@Test(priority=4)
   public void verifyErrormsg() {
	ll=new login_page(driver);
	ll.clickBTN();
	String actualerror = driver.findElement(By.xpath("//div[text()='Both Username and Password must be present ']")).getText();
	String expectederror= "Both Username and Password must be present";
        if(actualerror.equals(expectederror)) {
        	System.out.println("tc pass");
        	
        }
        else {
        	System.out.println("tc fail");
        }
	
	
	
			
	
}

}
