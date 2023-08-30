package com.sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Frame {
	WebDriver driver;
	
	public void Browser_Launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver114.exe");
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("Incognito");
		driver = new ChromeDriver(ch);
		driver.manage().window().maximize();
		driver.get("https://letcode.in/frame");
	}
	
	public void frames () {
		driver.switchTo().frame("firstFr");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement First_name = driver.findElement(By.name("fname"));
		First_name.sendKeys("Bala");
		WebElement Last_name = driver.findElement(By.name("lname"));
		Last_name.sendKeys("J");
		
	}
		public void Frames2 () {
		WebElement element = driver.findElement(By.xpath("//iframe[@class='has-background-white']"));
		driver.switchTo().frame(element);		
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("ABC@gmail.com");
		
		driver.switchTo().defaultContent();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		WebElement name = driver.findElement(By.xpath("(//a[@title='Koushik Chatterjee'])[1]"));
		name.click();
	}
	public static void main(String[] args) {
		Frame f = new Frame();
		f.Browser_Launch();
		f.frames();
		f.Frames2();
	}
}
