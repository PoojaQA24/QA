package Utility;

import org.testng.annotations.Test;

import Page_object.login_page;

public class TC002 extends  base {
	login_page ll;
	//validating the functional testing
	//validating the functionality of login button 
	//output it should navigate to home page 
	
	@Test(priority=2)
	public void verifyloginbutton() {
		ll=new login_page(driver);
		ll.enterUN("admin");
		ll.enterPWD("manager");
		ll.clickBTN();
		
		
	}
}
