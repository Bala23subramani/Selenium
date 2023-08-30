package com.sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	WebDriver driver;
	
	public void brwoserLaunch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver114.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
	}
	
	public void driveMethods() {
		String homepage_title = driver.getTitle();  
		System.out.println(homepage_title);

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
			
			driver.navigate().to ("https://www.amazon.in/");
			String amazonUrl = driver.getCurrentUrl(); 
			System.out.println(amazonUrl);
			
			driver.navigate().back();

			driver.navigate().forward();
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			driver.close();
		
	}

			public static void main(String[] args) {
			
			Task w  = new Task(); 
			w.brwoserLaunch();
			w.driveMethods();
			


	}

}
