package com.jbk.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfigurationData {
	
	WebDriver driver;
	
	public void connfigSetting(String url) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		 driver=new ChromeDriver();
		 driver.get(url);
	}

}
