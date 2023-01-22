package com.jbk.windows;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoOnWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///D:/javabykiranSelenium/Offline%20Website/pages/examples/dashboard.html");
		driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[1]/div/a")).click();
		driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[2]/div/a")).click();
		driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[3]/div/a")).click();

		ArrayList<String> tabs=new ArrayList<String>(driver.getWindowHandles());
		
		System.out.println(tabs.size());
		
		for (int i = 0; i < tabs.size(); i++) {
			if(i!=0) {
				driver.switchTo().window(tabs.get(i));
				
				driver.close();
			}
	}
			
		driver.switchTo().window(tabs.get(0));
		driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/a/span")).click();
//		
	
		
		
		
		
		
		
		
		
		
		
		

	}

}
