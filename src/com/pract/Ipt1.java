package com.pract;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Ipt1 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver114.exe");
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("Incognito");	
		WebDriver driver = new ChromeDriver(ch);
		driver.manage().window().maximize();
	    driver.get("https://www.amazon.in/");
	    
	    WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
	    search.sendKeys("books");
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    WebElement book = driver.findElement(By.xpath("//div[@aria-label='books']"));
	    
	    Actions a = new Actions(driver);
	    a.click(book).build().perform();
	    
	    List<WebElement> books = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
	    int size = books.size();
	    System.out.println("List of books :" +size);
	    String select = "Think and Grow Rich: THE 21st CENTURY EDITION";
	    for (WebElement book1 :books) {
	    	String s =book1.getText();
	    	System.out.println(s);
	    	if (book1.getText().contains(select)) {
	    		book1.click();
	    	}
	    		    	
	    }
	    	    
		
	}

	
	
}
