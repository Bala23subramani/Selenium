package com.pract;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Minipro {

	WebDriver driver;
	
	public void Browser_launch(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver114.exe");
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("Incognito");
		driver = new ChromeDriver(ch);
		driver.manage().window().maximize();
		driver.get("https://www.nykaa.com/");
			
	}
	public void Login() {
		
		WebElement signin = driver.findElement(By.className("css-1gzc5zn"));
		signin.click();
		
		WebElement log = driver.findElement(By.className("css-ejuz3m"));
		log.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {	
			e.printStackTrace();
		}
		
		WebElement name = driver.findElement(By.name("emailMobile"));
		name.sendKeys("8220716567");
		
		WebElement Proceed_click = driver.findElement(By.id("submitVerification"));
		Proceed_click.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {	
			e.printStackTrace();
		}
		WebElement Otp = driver.findElement(By.id("otpField"));
		Otp.sendKeys("232152");
		
		WebElement verify = driver.findElement(By.className("button big fill full "));
		verify.click();
	}
	
	public void Mom_baby() {
		
		WebElement mom = driver.findElement(By.xpath("//a[text() ='mom & baby']"));
		
		Actions a = new Actions(driver);
		a.moveToElement(mom).build().perform();
		
		WebElement Baby_powder = driver.findElement(By.xpath("//a[text() ='Baby Powder']"));
		Baby_powder.click();
		
	}
	
	public void Next_page() {
		Set<String> Next = driver.getWindowHandles();
		
		for (String id : Next) {
			driver.switchTo().window(id);		
		}
		
		WebElement Click_Himalaya = driver.findElement(By.xpath("//div[text() ='Himalaya Baby Powder']"));
		Click_Himalaya.click();
	}
	
	public void Again_nextpage() {
		Set<String> Again_next = driver.getWindowHandles();
		
		for (String id : Again_next) {
			driver.switchTo().window(id);
		}
				
	}
	
	public void Select_Himalaya() {
		
		WebElement Select_drop = driver.findElement(By.className("css-2t5nwu"));
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Select s = new Select(Select_drop);
		s.selectByValue("0");
		
		WebElement Add_tobag = driver.findElement(By.className("btn-text"));
		Add_tobag.click();
	}
	
	public void Bag() {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		WebElement Bag_option = driver.findElement(By.className("cart-count"));
		Bag_option.click();
		
		WebElement frames = driver.findElement(By.className("css-acpm4k"));
		driver.switchTo().frame(frames);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement quantity = driver.findElement(By.xpath("(//img[@class='css-g7xef ek8d9s80'])[2]"));
		quantity.click();
		
		WebElement Select_quantity = driver.findElement(By.xpath("(//div[@label='4'])[1]"));
		Select_quantity.click();
		
		WebElement proceed = driver.findElement(By.xpath("//span[@class=' css-1l4d0ex e171rb9k3']"));
		proceed.click();
	}
	
	public void address() {
		
		WebElement pincode = driver.findElement(By.className("input-element  "));
		pincode.sendKeys("600092");
		
		WebElement number= driver.findElement(By.className("input-element  "));
		number.sendKeys("222");
		
		WebElement details = driver.findElement(By.className("input-element input-area "));
		details.sendKeys("ABCD");
		
		WebElement submit = driver.findElement(By.className("css-mq2cy2 e8tshxd0"));
		submit.click();

	}
	
	public void payment() {
		
		WebElement Card_number = driver.findElement(By.xpath("//input[@label='Card Number']"));
		Card_number.sendKeys("4263982640269299");
		
		WebElement date = driver.findElement(By.xpath("//input[@label='Expiry (MM/YY)']"));
		date.sendKeys("02/26");
		
		WebElement Cvv_number = driver.findElement(By.xpath("//input[@placeholder='CVV']"));
		Cvv_number.sendKeys("837");
		
		WebElement proceed = driver.findElement(By.className("css-v61n2j e8tshxd0"));
		proceed.click();
		
		WebElement Option = driver.findElement(By.className("css-v61n2j e8tshxd0"));
		Option.click();
		
		WebElement Currency = driver.findElement(By.className("checkmark"));
		Currency.click();
		
		WebElement Pay_now = driver.findElement(By.className("pay-btn"));
		Pay_now.click();
		
		WebElement failed = driver.findElement(By.className("css-1iwzqhf emgaj5l0"));
		failed.click();
		
		
	}
	
	public void delete() {
		
		WebElement Bag = driver.findElement(By.xpath("//span[@class='cart-count']"));
		Bag.click();
		
		WebElement element = driver.findElement(By.className("css-acpm4k"));
		element.click();
		driver.switchTo().frame(element);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement remove = driver.findElement(By.xpath("(//span[@class='css-175whwo ehes2bo0'])[2]"));
		remove.click();
		
		WebElement confirm = driver.findElement(By.className("css-h96myd e8tshxd1"));
		confirm.click();
		
	    WebElement Back = driver.findElement(By.xpath("//span[@class='css-175whwo ehes2bo0']"));
		Back.click();
	}
	public static void main(String[] args) {
		Minipro mini = new Minipro();
		mini.Browser_launch();
		//mini.Login();
		mini.Mom_baby();
		mini.Next_page();
		mini.Again_nextpage();
		mini.Select_Himalaya();
		mini.Bag();
		mini.address();
		mini.payment();
		mini.delete();
		
	}
}
