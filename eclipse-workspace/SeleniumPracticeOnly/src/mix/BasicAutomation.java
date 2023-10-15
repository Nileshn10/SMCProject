package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicAutomation {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Tv Set");
		driver.findElement(By.id("nav-search-submit-button")).click();
		System.out.println("Hellow git");
		
		
		
		
		//driver.findElement(By.name("q")).sendKeys("Selenium Automatio");
	//	driver.findElement(By.xpath("//body[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[2]/div[2]/div[6]/center[1]/input[1]")).click();
		
		
		
		
		
		
	}

}
