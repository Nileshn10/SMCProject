package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{
	WebDriver driver;
	
	@FindBy(xpath="//input[@name='txtUserName']")
	WebElement userid;
	@FindBy(xpath="//input[@name='txtPassword']")
	WebElement password;
	@FindBy(xpath="//input[@name='btnLogin']")
	WebElement logbutton;
	
        public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void userfiled() {
		userid.sendKeys("dd23201");
		
	}
	public void passfield() {
		password.sendKeys("Nilesh@11");
	}
	public void clickbutton() {
		logbutton.click();
	}
	
	

}
