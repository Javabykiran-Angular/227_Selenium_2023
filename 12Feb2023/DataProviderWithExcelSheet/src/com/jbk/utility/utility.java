package com.jbk.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class utility {
	WebDriver driver;
	
	public void ConfigSetting(String url) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		  driver=new ChromeDriver();
//			driver.get("file:///D:/SeleniumSoftware/Offline%20Website/index.html");	
		  driver.get(url);	
	}
	
	public WebElement findWebElement(String xpath) {
		return (driver.findElement(By.xpath(xpath)));
	}
	public WebDriver getDriver() {
		return (driver);
	}
	

}
