package Page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class login_page {
	@FindBy(xpath="//input[@id='username']")private WebElement UN;
	@FindBy(xpath="//input[@id='password']")private WebElement PWD;
	@FindBy(xpath="//button[@id='log-in']")private WebElement click;
	@FindBy(xpath="//input[@class='form-check-input']")private WebElement rediobutton;
	public login_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void enterUN(String username) {
		UN.clear();
		UN.sendKeys(username);
	}
   public void enterPWD(String password) {
	   PWD.clear();
	   PWD.sendKeys(password);
   }
   public void clickBTN() {
	   click.click();
   }
    
   public void clickonrememberrediobutton() {
	   rediobutton.click();
   }
   }
   



   


