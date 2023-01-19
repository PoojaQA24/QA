package Utility;

import org.testng.annotations.Test;

import Page_object.login_page;

public class TC001 extends base {
	login_page ll;
	//validating the functional testing
	//validating the functionality check box do it except credentials or not
	//output the check box should accept the credentials 
	@Test(priority=1)
	public void verifyloginpage() {
		ll=new login_page(driver);
		ll.enterUN("admin");
		ll.enterPWD("manager");
		
		
	}

}
