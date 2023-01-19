package Utility;

import org.testng.Reporter;
import org.testng.annotations.Test;

import Page_object.login_page;
import dev.failsafe.internal.util.Assert;

public class TC003 extends base{
	login_page ll;
	//validating the functional testing
	//validating the functionality of verify title
	//output it should verify the title if the title is mismatch then tc will fail
	
	@Test(priority=3)
	public void verifytitle() throws Throwable {
		String Actualtitle=driver.getTitle();
		System.out.println("orignal title is");
		System.out.println(Actualtitle);
	String	expectedtitle="Demo App";
    if(Actualtitle.equals(expectedtitle)) {
    	System.out.println("Tc pass");
    	
    }
    else {
    	System.out.println("tc fail");
    }
		
	}
}
