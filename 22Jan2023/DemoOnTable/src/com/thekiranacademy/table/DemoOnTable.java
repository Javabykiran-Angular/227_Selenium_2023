package com.thekiranacademy.table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoOnTable {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///D:/javabykiranSelenium/Offline%20Website/pages/examples/dashboard.html");
		
		driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/a/span")).click();
		
		
		 List<WebElement> list_row= driver.findElements(By.tagName("tr"));
		
		 System.out.println("=== "+list_row.size());
		
//		for(int i=1;i<5;i++) {
////			List<WebElement> list_col= driver.findElements(By.tagName("td"));
//			List<WebElement> list_col= list_row.get(i).findElements(By.tagName("td"));
////			System.out.println(list_col.size());
//				
//			for(int j=1;j<8;j++) {
//				System.out.println(list_col.get(j).getText());
//			}
//			System.out.println("====================");
//			
//		}
		 
		 for(int i=1;i<list_row.size();i++) {
//				List<WebElement> list_col= driver.findElements(By.tagName("td"));
				List<WebElement> list_col= list_row.get(i).findElements(By.tagName("td"));
//				System.out.println(list_col.size());
					
				for(int j=1;j<list_col.size();j++) {
					System.out.println(list_col.get(j).getText());
				}
				System.out.println("====================");
				
			}
		
		
		
		
	

	
	}

}
