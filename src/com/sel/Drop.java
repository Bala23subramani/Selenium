package com.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Drop {
	
WebDriver driver;
	
	public void BrowserLaunch() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver114.exe");
		ChromeOptions ch = new ChromeOptions(); 
		ch.addArguments ("Incognito");
		driver = new ChromeDriver(ch);
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
}
	public void dropdown() {
	
	WebElement multidrop = driver.findElement(By.id("cars"));

	Select s = new Select (multidrop);
	System.out.println(s.isMultiple());

	s.selectByIndex(0);
	s.selectByValue ("opel");
	s.selectByVisibleText ("Audi");

	List<WebElement> options = s.getOptions(); 
	
	for (WebElement car : options) {
	System.out.println(car.getText ());
	}

	s.deselectByVisibleText ("Volvo");

	WebElement firstSelectedOption = s.getFirstSelectedOption();

	System.out.println(firstSelectedOption.getText()); 
	s.getAllSelectedOptions();

	List<WebElement> l = s.getAllSelectedOptions();
	for (int i=0; i<l.size(); i++) {
	System.out.println(l.get(i).getText());

	}
	s.deselectAll();

	List<WebElement> allSelectedOptions = s.getAllSelectedOptions(); 
	System .out.println(allSelectedOptions);
		
	}
	
	public static void main(String[] args) {
		
		Drop d= new Drop();
		d.BrowserLaunch();
		d.dropdown();
		
	}
}
