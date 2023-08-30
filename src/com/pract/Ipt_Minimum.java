package com.pract;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Ipt_Minimum {

	static WebDriver driver;
	static List<WebElement> all;
	static List<Integer> li= new ArrayList<>();
	
	public static void Browser_launch() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver114.exe" );
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("Incognito");
		driver = new ChromeDriver(ch);
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/kids?f=Categories%3AJeans%3A%3AGender%3Aboys%2Cboys%20girls&plaEnabled=false");
		allprice();
		minprice();
	}
	
	public static void allprice() {
		all = driver.findElements(By.xpath("//span[@class='product-strike']//preceding::span[@class='product-discountedPrice']"));
	    for (WebElement single : all) {
			System.out.println(single.getText());
			
		}
	    
	}
	
	public static void minprice() {
		
		for (WebElement single : all) {
		String replace = single.getText().replace("Rs. ", "");
		int parseInt = Integer.parseInt(replace);
		li.add(parseInt);
		 }
		System.out.println(li);
		Integer min = Collections.min(li);
		System.out.println(min);
	}
	public static void main(String[] args) {
		Browser_launch();
	}
}
