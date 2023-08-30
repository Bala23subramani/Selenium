package com.sel;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Mini {
	
	WebDriver driver;
	
	public void Browser_Launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver114.exe");
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("Incognito");
		driver = new ChromeDriver(ch);
		driver.manage().window().maximize();
		driver.get("https://www.nykaa.com/");
	}
		public void Sing_up() throws InterruptedException {
			
			WebElement sing = driver.findElement(By.className("css-1gzc5zn"));
			sing.click();
			WebElement sing_in = driver.findElement(By.className("css-ejuz3m"));
			sing_in.click();
			Thread.sleep(3000);
			WebElement number = driver.findElement(By.name("emailMobile"));
			number.sendKeys("9940567237");
			WebElement submit = driver.findElement(By.id("submitVerification"));
			submit.click();
			Thread.sleep(3000);
			WebElement Otp = driver.findElement(By.id("otpField"));
			Otp.sendKeys("232152");
			WebElement verify = driver.findElement(By.className("button big fill full "));
			verify.click();
		}
		
		public void mom_baby() {
			
			WebElement cursor = driver.findElement(By.xpath("//a[text() = 'mom & baby']"));
		    
			Actions a = new Actions(driver);
			a.moveToElement(cursor).build().perform();
			
			WebElement powder = driver.findElement(By.linkText("Baby Powder"));
			powder.click();
		}
			
		public void	Baby_powder() {
            Set<String> windowHandles = driver.getWindowHandles();
            for (String string : windowHandles) {
				driver.switchTo().window(string);
			}
			WebElement Himalaya = driver.findElement(By.className("css-xrzmfa"));
			Himalaya.click();
			
		}
		
		public void Himalaya_Babypowder(){
			Set<String> windowHandles = driver.getWindowHandles();
	        for (String string : windowHandles) {
				driver.switchTo().window(string);
				}
			WebElement dropdown = driver.findElement(By.className("css-2t5nwu"));
			Select s = new Select(dropdown);
			s.selectByValue("3");
			WebElement Addto_cart = driver.findElement(By.className("btn-text"));
			Addto_cart.click();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
		}
		public void cart() {
			
			
		    WebElement Bag = driver.findElement(By.xpath("//span[@class='cart-count']"));
			Bag.click();
			
			WebElement ele = driver.findElement(By.className("css-acpm4k"));
			ele.click();
			driver.switchTo().frame(ele);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			WebElement drop = driver.findElement(By.xpath("(//p[@color='#001325'])[4]"));
			drop.click();
			WebElement drop_options = driver.findElement(By.xpath("(//div[@label='4'])[1]"));
			drop_options.click();
		
			WebElement proceed = driver.findElement(By.xpath("//div[@class='css-207d6f e25lf6d6']"));
			proceed.click();

		}
		public void address() {
			WebElement pincode = driver.findElement(By.className("input-element  "));
			pincode.sendKeys("600116");
			WebElement Flat_no = driver.findElement(By.className("input-element  "));
			Flat_no.sendKeys("No 4");
			WebElement addr = driver.findElement(By.className("input-element input-area "));
			addr.sendKeys("ABCD");
			WebElement submit = driver.findElement(By.className("css-mq2cy2 e8tshxd0"));
			submit.click();

		}
	public void payment() {
		WebElement card = driver.findElement(By.xpath("//input[@label='Card Number']"));
		card.sendKeys("5425233430109903");
		WebElement date = driver.findElement(By.xpath("//input[@label='Expiry (MM/YY)']"));
		date.sendKeys("05/12");
		WebElement cvv = driver.findElement(By.xpath("//input[@placeholder='CVV']"));
		cvv.sendKeys("564");
		WebElement proceed = driver.findElement(By.className("css-v61n2j e8tshxd0"));
		proceed.click();
		WebElement pay = driver.findElement(By.className("css-v61n2j e8tshxd0"));
		pay.click();
		WebElement currency = driver.findElement(By.className("checkmark"));
		currency.click();
		WebElement paynow = driver.findElement(By.className("pay-btn"));
		paynow.click();
		WebElement payment_failed = driver.findElement(By.className("css-1iwzqhf emgaj5l0"));
		payment_failed.click();
		
		
	}
	
	public void cart_delete() {
		WebElement Bag = driver.findElement(By.xpath("//span[@class='cart-count']"));
		Bag.click();
		
		WebElement ele = driver.findElement(By.className("css-acpm4k"));
		ele.click();
		driver.switchTo().frame(ele);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement delete = driver.findElement(By.xpath("(//span[@class='css-175whwo ehes2bo0'])[2]"));
		delete.click();
		
		WebElement confirm = driver.findElement(By.className("css-h96myd e8tshxd1"));
		confirm.click();
		
	    WebElement Back = driver.findElement(By.xpath("//span[@class='css-175whwo ehes2bo0']"));
		Back.click();
	}
	
	public static void main(String[] args) throws InterruptedException {
		Mini m = new Mini();
		m.Browser_Launch();
		m.mom_baby();
		m.Baby_powder();
		m.Himalaya_Babypowder();
		m.cart();
		m.address();
		
	}

}
