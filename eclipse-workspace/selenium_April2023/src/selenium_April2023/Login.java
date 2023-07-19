package selenium_April2023;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@name='email']")).sendKeys("9960121098");
		driver.findElement(By.xpath("//*[@name='pass']")).sendKeys("Elin@1010");
		driver.findElement(By.xpath("//*[@name='login']")).click();
	
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeAsyncScript("window.scrollBy(0,1000)");
		
		
	}

}
