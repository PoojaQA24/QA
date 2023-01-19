package Utility;

import org.testng.annotations.Test;

import Page_object.login_page;

public class TC007 extends base{
	//functional test case
	//validate the functionality of the radio button 
	//output it should click 
	login_page ll;
	@Test(priority=8)
	public void verifyradiobutton() throws Throwable {
		ll=new login_page(driver);
		ll.enterUN("admin");
		ll.enterPWD("password");
		ll.clickonrememberrediobutton();
		Thread.sleep(3000);
		ll.clickBTN();
		
	}

}
