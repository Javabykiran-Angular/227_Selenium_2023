package com.jbk.modify;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoOnModify {
		
	WebDriver driver;
	
	public void driverSetting(){
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		 driver=new ChromeDriver();
	}
	
	public void getUrl(String url) {
		driver.get(url);
	} 
	
	public void login() {
		WebElement email_element= driver.findElement(By.xpath("//*[@id=\"email\"]"));
		//	email_element.sendKeys("Sumit");
		email_element.sendKeys("kiran@gmail.com");
		
		//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("sumit");
		//	String pwd="sumit";
		String pwd="123456";
			
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(pwd);
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DemoOnModify obj=new DemoOnModify();
		
		obj.driverSetting();
		obj.getUrl("file:///D:/javabykiranSelenium/Offline%20Website/index.html");
		obj.login();
		
		

	}

}
