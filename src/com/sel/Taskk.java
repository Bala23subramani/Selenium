package com.sel;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;


public class Taskk {
	
	WebDriver driver;
	
	public void BrowserLaunch() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver114.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}
	
	public void LoginTest() throws InterruptedException, IOException {
	
		
		
	WebElement create_account = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
	create_account.click();
	
	Thread.sleep(1000);
		
	WebElement first_name = driver.findElement(By.name("firstname"));
	first_name.sendKeys("Bala");
	
	WebElement surnname = driver.findElement(By.name("lastname"));
    surnname.sendKeys("J");
    
    WebElement email = driver.findElement(By.name("reg_email__"));
    email.sendKeys("ABC@gmail.com");
    
    WebElement password = driver.findElement(By.name("reg_passwd__"));
    password.sendKeys("12312312");
    
    WebElement DOB_date = driver.findElement(By.id("day"));
    Select date = new Select(DOB_date);
    date.selectByIndex(22);
    //DOB_date.sendKeys("23");
    
    WebElement DOB_month = driver.findElement(By.id("month"));
    Select month = new Select(DOB_month);
    month.selectByIndex(3);
    //DOB_month.sendKeys("April");
    
    WebElement DOB_year = driver.findElement(By.id("year"));
    Select year = new Select(DOB_year);
    year.selectByIndex(26);
    //DOB_year.sendKeys("1996");
    
    WebElement gender = driver.findElement(By.xpath("//input[@value='2']"));
    gender.click();
    
    
    WebElement singup = driver.findElement(By.name("websubmit"));
    singup.click();
    
    TakesScreenshot sc =  (TakesScreenshot) driver;
	File src1 = sc.getScreenshotAs(OutputType.FILE);
	File dest1 = new File("C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Screenshot\\ss3.png");
	FileHandler.copy(src1, dest1);

	
	}
	public static void main(String[] args) throws InterruptedException, IOException {
		
		Taskk obj = new Taskk();
		obj.BrowserLaunch();
		obj.LoginTest();
		
		
	
}
}
