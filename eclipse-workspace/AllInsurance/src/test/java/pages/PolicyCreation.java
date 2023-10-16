package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PolicyCreation {
	WebDriver driver;
	@FindBy(xpath="//a[contains(text(),'New Policy')]")
	WebElement creationlink;
	@FindBy(xpath="//a[contains(text(),' Policy Issuance ')]")
	WebElement assurance;
	public PolicyCreation(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickonpolicyassurance() {
		assurance.click();
		
	}
	public void clickonpolicy() {
		creationlink.click();
	}
	

}
