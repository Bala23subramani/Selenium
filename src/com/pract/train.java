package com.pract;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class train {

	WebDriver driver;
	
	public void Browser_Launch() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver114.exe");
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("Incognito");
		driver = new ChromeDriver(ch);
		driver.manage().window().maximize();
		driver.get("https://www.trends.ajio.com/");
				
	}
    public void demo() {
    	
        WebElement close = driver.findElement(By.className("ic-close-quickview"));
        close.click();
        WebElement signup = driver.findElement(By.linkText("Sign In / Join AJIO"));
		signup.click();
	}
	public static void main(String[] args) {
		train t = new train();
		t.Browser_Launch();
		t.demo();
	}
}
