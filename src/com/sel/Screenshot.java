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

public class Screenshot {
	
	WebDriver driver;

	public void BrowserLaunch() {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver114.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
}
	public void S_Shot() throws IOException {
		WebElement Mobiles = driver.findElement(By.xpath("(//a[@class='nav-a  '])[5]"));
		Mobiles.click();
		
		TakesScreenshot ts =  (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Screenshot\\ss1.png");
		FileHandler.copy(src, dest);
		
		driver.navigate().to("https://www.facebook.com/");
		
		
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("bala@abc .com");	
		WebElement password = driver.findElement(By.id("pass")); 
		password.sendKeys ("1213523");

		WebElement login_btn = driver.findElement(By.name ("login")); 
		login_btn.click();
		
		TakesScreenshot ts1 =  (TakesScreenshot) driver;
		File src1 = ts1.getScreenshotAs(OutputType.FILE);
		File dest1 = new File("C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Screenshot\\ss2.png");
		FileHandler.copy(src1, dest1);

	}
	
	public static void main(String[] args) throws IOException {
		Screenshot s = new Screenshot();
		s.BrowserLaunch();
		s.S_Shot();
	}
}
