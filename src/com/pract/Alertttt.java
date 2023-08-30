package com.pract;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alertttt {

	WebDriver driver;
	
	public void Browser_Launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver114.exe");
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("Incognito");
		driver = new ChromeDriver(ch);
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
	}
	
	public void Alert_Option() {
		
		WebElement Confirm_box = driver.findElement(By.id("confirmButton"));
		Confirm_box.click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Alert alert_method = driver.switchTo().alert();
		alert_method.dismiss();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('promtButton').click()");
		Alert alert_method1 = driver.switchTo().alert();
		alert_method1.sendKeys("ABC");
	
	}
	public static void main(String[] args) {
		Alertttt alt = new Alertttt();
		alt.Browser_Launch();
		alt.Alert_Option();
	}
}
