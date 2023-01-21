package com.thekiranacdemy.demo;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoOnLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///D:/javabykiranSelenium/Offline%20Website/index.html");
		
//		driver.findElement(By.linkText("Register a new membership")).click();
		
		driver.findElement(By.partialLinkText("Register a ")).click();
		
		driver.findElement(By.name("name")).sendKeys("Sumit");
		
		driver.findElement(By.id("mobile")).sendKeys("7972547618");
		
//		driver.findElement(By.tagName("input")).sendKeys("abc@gmail.com");
		
		List<WebElement> list= driver.findElements(By.tagName("input"));
		System.out.println("====== "+list.size());
		
		for(int i=0;i<list.size();i++) {
			
			if(list.get(i).getAttribute("placeholder").compareTo("Email")==0) {
//				System.out.println("==== email find === ");
				list.get(i).sendKeys("sumit@gmail.com");
			}else if (list.get(i).getAttribute("type").compareTo("password")==0) {
				list.get(i).sendKeys("sumit123");
			}
			
		}
		
//		driver.findElement(By.className("btn btn-primary")).click();
		driver.findElement(By.className("btn")).click();
	
		Alert alert=driver.switchTo().alert();
		alert.accept();
		driver.switchTo().defaultContent();

		//navigation commands
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();
		
		
		
	}

}
