package first;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo595 {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		String Parent=driver.getWindowHandle();
		driver.get("https://www.myperfectresume.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("document.getElementsByClassName('ctf-js-currentportal')[0].click();");
		Set<String>child=driver.getWindowHandles();
		
		
		
		
		for(String allwin:child) {
			/*if(!allwin.equalsIgnoreCase(Parent)){
			driver.switchTo().window(allwin);*/
			if(driver.getTitle().contains("Member Sign In - My Perfect Resume")) {
				driver.switchTo().window(allwin);
			}
			
			
			
		}
		
		driver.findElement(By.xpath("(//*[@class='main-link'])[1]")).click();
		driver.findElement(By.xpath("(//*[@class='main-link'])[5]")).click();
		driver.findElement(By.xpath("(//*[@class='main-link'])[4]")).click();
		driver.findElement(By.xpath("//*[text()='Member Login']")).click();
		
		
		
		
		
		
		//driver.findElement(By.xpath("(//*[@class='ctf-js-currentportal'])[1]")).click();
		}
	
		

}
