package first;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchTheSMC {
	
	public static void main (String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.smcassure.in");
		String first1 = driver.getTitle();
		System.out.println(first1);
		driver.findElement(By.id("txtUserName")).sendKeys("DD23201");
		driver.findElement(By.id("txtPassword")).sendKeys("Nilesh@7");
		driver.findElement(By.name("btnLogin")).click();
		String first = driver.getWindowHandle();
		System.out.println(first);
		Set<String> Window2 = driver.getWindowHandles();
		System.out.println(Window2);
		Iterator<String> itr = Window2.iterator();
		while(itr.hasNext()) {
			String win3 = itr.next();
			driver.switchTo().window(win3);
			String title = driver.getTitle();
			System.out.println(title);
			
		}
		
		//driver.switchTo().frame(1);
		driver.findElement(By.name("btnLogin")).click();
		//driver.switchTo().alert().accept();
		
	}

}
