package Page_object;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Home_page {
	@FindBy(xpath="//div[@id='logged-user-name']")private WebElement name;
	@FindBy(xpath="//th[@id='amount']")private WebElement header;
	
	
	public Home_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public String getName() {
		String getname = name.getText();
		return getname;
	}
	public void clickonheader() {
		header.click();
	}
	
	    
	   
}
