package com.sel;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class Scroll_down {
  WebDriver driver;
  
  public void BrowserLaunch() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver114.exe");
    ChromeOptions ch = new ChromeOptions();
    ch.addArguments("Incognito");
    driver = new ChromeDriver(ch);
    driver.manage().window().maximize();
    driver.get("https://www.amazon.in/");
  }
    
    public void scroll() throws InterruptedException {
    	
    	//WebElement watch = driver.findElement(By.className("_deals-shoveler-v2_style_dealImage__3nlqg"));
    	
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	//js.executeScript("arguments[0].click()", watch);
    	//js.executeScript("window.scrollBy(0, 100);");
    	js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
    	Thread.sleep(3000);
    	js.executeScript("window.scrollTo(0, 0);");
    	
    	TakesScreenshot ts = (TakesScreenshot) driver;
    	File scr = ts.getScreenshotAs(OutputType.FILE);
    	File des = new File("C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Screenshot\\ss4.png");
    	try {
			FileHandler.copy(scr, des);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
    }
    public static void main(String[] args) throws InterruptedException {
		Scroll_down sd = new Scroll_down();
		sd.BrowserLaunch();
		sd.scroll();
	}
}
