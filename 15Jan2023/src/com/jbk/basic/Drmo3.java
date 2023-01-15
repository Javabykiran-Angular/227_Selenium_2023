package com.jbk.basic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drmo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///D:/javabykiranSelenium/Offline%20Website/index.html");
		
		WebElement email_element= driver.findElement(By.xpath("//*[@id=\"email\"]"));
//			email_element.sendKeys("Sumit");
		email_element.sendKeys("kiran@gmail.com");
		
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("sumit");
//			String pwd="sumit";
		String pwd="123456";
			
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(pwd);
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
//		
		String dashboard_str= driver.findElement(By.xpath("/html/body/div/div[1]/section[1]/h1")).getText();
		System.out.println(dashboard_str);
		
		

//		String dashboard_str= driver.findElement(By.xpath("/html/body/div/div[1]/section[1]/h1/text()")).getText();
//		System.out.println(dashboard_str);
		
		driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/a/span")).click();
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button")).click();
		
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("Sumit Raokhande");
		driver.findElement(By.xpath("//*[@id=\"mobile\"]")).sendKeys("7894563214");
		
	
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("sumit@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"course\"]")).sendKeys("Selenium");
		driver.findElement(By.xpath("//*[@id=\"Male\"]")).click();
		
	  WebElement dropDown_element=driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[6]/div/select"));
	  
	  Select dropdown=new Select(dropDown_element);
	  
//	  	dropdown.selectByIndex(1);
	  
//	  dropdown.selectByVisibleText("Delhi");
//		
	  dropdown.selectByValue("HP");
//		
		Select dropSelect=new Select(driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[6]/div/select")));
		dropSelect.selectByVisibleText("Delhi");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("selenium");
		driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[3]/div/input")).sendKeys("9960556397");
		
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
//		
		Alert alert= driver.switchTo().alert();
		
//		System.out.println(alert.getText());
		
		alert.accept();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/a/span")).click();
		
	

	}

}
