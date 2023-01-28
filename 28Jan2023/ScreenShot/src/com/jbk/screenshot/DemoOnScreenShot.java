package com.jbk.screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class DemoOnScreenShot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				
		File target	= new File ("C:\\Selenium_Workspace\\ScreenShot\\Login\\login1.png");
				
				
				
////		File target=new File("C:\\Selenium_Workspace\\screenshot\\login\\login.png");
//		File target=new File("C:\\Selenium_Workspace\\screenshot\\login\\login.svg");
		
		
		try {
			FileHandler.copy(source, target);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
