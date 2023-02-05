package com.jbk.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoOnXpath {
	WebDriver driver;
	
	public void configSetting(String url) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
	}
	
	public void elementSearch() {
		driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[3]/td[3]/input")).sendKeys("abc");
	//	driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[7]/td[3]/input[1]")).sendKeys("abc@abc.com");
		driver.findElement(By.xpath("//input[contains(@name,'login')]")).sendKeys("abc1@abc1.com");
		driver.findElement(By.xpath("//input[starts-with(@name,'passwd')]")).sendKeys("abc@123");
		
		driver.findElement(By.linkText("Home")).click();
		
	}
	
	public void elementFollowing() {
		//driver.findElement(By.xpath("(//div[@id='HEADBAND0']//following::li)[2]//a")).click();
		
//		driver.findElement(By.xpath("//div[@id='HEADBAND0']//child::li[3]//a")).click();
		
		driver.findElement(By.xpath("//div[@id='HEADBAND0']//child::li[3]//following-sibling::li[2]//a")).click();
		
	}
	
	

}
