package first;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleMultipleWindoiw {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().setScriptTimeout(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.myperfectresume.com/");
		String parent=driver.getWindowHandle();
		WebElement first=driver.findElement(By.xpath("//a[text()='Chrome extension']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", first);
		driver.findElement(By.xpath("//span[text()='Member Login']")).click();
		
		Set<String>child=driver.getWindowHandles();
		for(String allwin:child) {
			driver.switchTo().window(allwin);
			if(driver.getTitle().contains("Member Sign In ")) {
				driver.findElement(By.id("widget-user-email")).sendKeys("NileshKOkate")	;
				driver.close();
				
			}
			driver.switchTo().window(parent);
			driver.findElement(By.xpath("//i[@class='icon-close close-icon']")).click();
			driver.navigate().to("https://google.com");
			driver.navigate().refresh();
			driver.close();
		}
		
		
		
	}

}
