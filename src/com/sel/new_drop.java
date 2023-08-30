package com.sel;

import java.awt.CardLayout;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class new_drop {

	WebDriver driver;
	
	public void Browser_Launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver114.exe");
		ChromeOptions c = new ChromeOptions();
		c.addArguments("Incognito");		
		driver = new ChromeDriver(c);
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
						
	}
	public void Drop_Down() {
		
		WebElement multi = driver.findElement(By.id("cars"));
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", multi);
		
		Select s =  new Select(multi);
		s.selectByIndex(3);
		s.selectByValue("volvo");
		s.selectByVisibleText("Saab");
		
		List<WebElement> options = s.getOptions();
		for (WebElement car : options) {
		System.out.println(car.getText());
		}
			
		List<WebElement> all = s.getAllSelectedOptions();
		
		for (int i=0; i<all.size(); i++) {
			System.out.println(all.get(i).getText());
		}
		
        WebElement first = s.getFirstSelectedOption();
        System.out.println(first.getText());
        
        s.deselectAll();
	}
	public static void main(String[] args) {
		new_drop d = new new_drop();
		d.Browser_Launch();
		d.Drop_Down();
	}
}
