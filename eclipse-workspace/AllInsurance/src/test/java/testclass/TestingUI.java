package testclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.PolicyCreation;



public class TestingUI  {
	WebDriver driver;
    LoginPage s;
    PolicyCreation q;
	
	
	@BeforeTest
	public void website() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.smcassure.in/lv/login.aspx");
		s = new LoginPage(driver);
		q=new PolicyCreation(driver);
		
		
	}
	@Test(priority=1)
	public void veryuser() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		s.userfiled();
	
		
	}
	@Test(priority=2)
	public void veryfypass() {
	
		s.passfield();
		s.clickbutton();
	}
	@Test(priority=3)
	public void verifypage() throws InterruptedException {
		Thread.sleep(1000);
	String abc=	driver.findElement(By.xpath("//*[text()='Insurance Manager']")).getText();
	System.out.println(abc);
	Assert.assertEquals(abc, "Insurance Manager");
	}
	
	@Test(priority=4)
	public void verifypolicyassurance() {
		q.clickonpolicyassurance();
	}
	@Test(priority=5)
	public void verifycration() throws InterruptedException {
		Thread.sleep(1000);
		q.clickonpolicy();
		
	}
	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
