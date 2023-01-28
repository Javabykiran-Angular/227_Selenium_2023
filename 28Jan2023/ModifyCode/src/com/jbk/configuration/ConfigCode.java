package com.jbk.configuration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfigCode {
	
	WebDriver driver;
	
	
	public void ConfigSetting(String url) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		 driver=new ChromeDriver();
		 driver.get(url);
	}
	
	public void emailInputBox() {
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("kiran@gmail.com");
		
	}
	
	
	
	
	

}
