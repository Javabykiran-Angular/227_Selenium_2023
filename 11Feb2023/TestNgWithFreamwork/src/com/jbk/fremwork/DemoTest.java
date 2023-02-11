package com.jbk.fremwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DemoTest {
	WebDriver driver;
	
	
	@BeforeClass
	public void ConfigSetting() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("file:///D:/SeleniumSoftware/Offline%20Website/index.html");
	}
	
	@Test(priority = 1)
	public void emailId() {
		System.out.println("U r in emailId");
		WebElement email_Element= driver.findElement(By.xpath("//input[@id='email']"));
		email_Element.sendKeys("Abc");
	}
	
	@Test(priority = 2)
	public void password() {
		WebElement pwd_element=driver.findElement(By.xpath("//input[@id='password']"));
		pwd_element.sendKeys("Abc@123");
		
		WebElement login_element=driver.findElement(By.xpath("//button[starts-with(text(),\"Sign In\")]"));
		
		login_element.click();
		
	}
	
	
	
	
	

}
