package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Path {

	WebDriver driver;
	
	public void browserLaunch() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver114.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}
	public void X_path() throws InterruptedException {
		
        WebElement img = driver.findElement(By.xpath("//img[@alt='Facebook']"));
        WebElement reg_email = driver.findElement(By.xpath("//input[@name='email']"));
        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        WebElement create_login = driver.findElement(By.xpath("//a[@id='u_0_0_b6']"));
        create_login.click();
        Thread.sleep(1000);
        
        WebElement gender = driver.findElement(By.xpath("//input[@value='2']"));
        gender.click();
        
        driver.navigate().to("https://www.nykaa.com/");
        
        WebElement search = driver.findElement(By.xpath("//input[@class='css-1upamjb']"));
        WebElement signin = driver.findElement(By.xpath("//button[text() = 'Sign in']"));
        WebElement Categories = driver.findElement(By.xpath("//a[@id='category']"));
        WebElement Healthwealth_tab = driver.findElement(By.xpath("//a[contains (text(), 'Health & Wellness')]"));
        
        driver.navigate().to("https://www.flipkart.com/");
        
        WebElement Search_bar = driver.findElement(By.xpath("//input[contains(@title, 'Search for products, brands and more')]"));
        WebElement submit_button = driver.findElement(By.xpath("//button[@type='submit']"));
        WebElement Viewall = driver.findElement(By.xpath("(//div[@class='_1AtVbE']//a)[1]"));
        WebElement Viewcart = driver.findElement(By.xpath("//a[@href='/viewcart?exploreMode=true&preference=FLIPKART']"));
	    WebElement Seller = driver.findElement(By.xpath("//span[text() = 'Become a Seller']"));
	    
	    driver.navigate().to("www.myntra.com/");
	    
	}
	
}

