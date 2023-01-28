package com.jbk.iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoOniframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.qa.jbktest.com/");
		
		try {
			Thread.sleep(5000);
			
//			driver.switchTo().frame(1);
			
			driver.switchTo().frame("webform");
			driver.findElement(By.xpath("//*[@id=\"webform_preview\"]/div")).click();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
