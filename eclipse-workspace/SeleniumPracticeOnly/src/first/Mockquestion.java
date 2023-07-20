package first;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mockquestion {
	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	
	
	
	driver.get("https://www.myperfectresume.com/");
	JavascriptExecutor js=(JavascriptExecutor)driver;
//	js.executeScript("document.getElementsByClassName('ctf-js-currentportal')[0].click();");
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.quit();
	
	/*
	 * Thread.sleep(1000); WebElement
	 * link=driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']"));
	 * js.executeScript("argument[0].click();", link);
	 */
    
			
	
	
	
	/*
	 * String parent=driver.getWindowHandle();
	 * 
	 * if(!driver.equals(parent)) { driver.switchTo().window(parent);
	 * driver.get("https://google.com"); }
	 */
	
	
	driver.close();
}

}


