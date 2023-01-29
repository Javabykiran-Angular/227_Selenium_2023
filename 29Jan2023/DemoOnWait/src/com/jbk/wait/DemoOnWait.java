package com.jbk.wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoOnWait {

	WebDriver driver;
	
	public void ConfigSetting(String url) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		 driver=new ChromeDriver();
//		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get(url);
	}
	
	public void search() {
//		driver.findElement(By.name("q")).sendKeys("java by kiran"+Keys.ENTER);
//		
//		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div[1]/a")).click();
		
		driver.switchTo().frame("webform");
//		driver.findElement(By.xpath("//*[@id=\"webform_preview\"]/div")).click();
		System.out.println("=======Before ========= ");
		WebDriverWait waitelement=new WebDriverWait(driver, 10);
//		WebElement element= waitelement.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\\\"webform_preview\\\"]/div"))));
//		
		
		WebElement element= waitelement.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"webform_preview\"]/div")));
		System.out.println("======= After ========= ");
		
		element.click();
		
//		WebDriverWait waitelement=new WebDriverWait(driver, 15);
//		WebElement firstResult_element=waitelement.until(
//				ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div[1]/a/h3")));
//		
		
		
	}
	
	
}
