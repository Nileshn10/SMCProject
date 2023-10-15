package first;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Naukari {
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", null)
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();;
		WebDriver driver= new ChromeDriver(co);
		driver.manage().window().maximize();
	//	
		driver.get("https://www.naukri.com/");
		String parenet=driver.getWindowHandle();
		System.out.println(parenet);
		
       // driver.findElement(By.id("login_Layer")).click();
        Thread.sleep(600);
        // Set<String>child=driver.getWindowHandles();
       //  System.out.println(child);
         //for (String allwin : child) {
        	 
			//if(!allwin.equals(parenet)) {
			//	driver.switchTo().window(allwin);
                driver.findElement(By.xpath("//a[text()='Login']")).click();
                Thread.sleep(1000);
				driver.findElement(By.xpath("//body/div[@id='root']/div[4]/div[2]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/input[1]")).sendKeys("nileshnkokate55@gmail.com");
				driver.findElement(By.xpath("//body/div[@id='root']/div[4]/div[2]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/input[1]")).sendKeys("Elin@1010");
				driver.findElement(By.xpath("//button[text()='Login']")).click();
						
		
         
		//driver.quit();
		
	}

}
