package com.jbk.fremwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoTest {
	WebDriver driver;
	
	
	@BeforeClass
	public void ConfigSetting() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("file:///D:/SeleniumSoftware/Offline%20Website/index.html");
	}
	
	@Test(priority = 1)
	public void emailId() {
		System.out.println("U r in emailId");
		WebElement email_Element= driver.findElement(By.xpath("//input[@id='email']"));
		email_Element.sendKeys("Abc");
	}
	
	@Test(priority = 2)
	public void password() {
		WebElement pwd_element=driver.findElement(By.xpath("//input[@id='password']"));
		pwd_element.sendKeys("Abc@123");
		
		WebElement login_element=driver.findElement(By.xpath("//button[starts-with(text(),\"Sign In\")]"));
		
		login_element.click();
		
		WebElement emailError_element=driver.findElement(By.xpath("//div[@id='email_error']"));
		
		String actualResult_emailError= emailError_element.getText();
		System.out.println(actualResult_emailError);
		String expectedResult_emailError="Please enter email as kiran@gmail.com";
		
		WebElement passwordError_Element=driver.findElement(By.xpath("//div[@id='password_error']"));
		String actualResult_password= passwordError_Element.getText();
		String expectedResult_password="Please enter password 123456";
		
//		System.out.println("---------Before Assert Execution---------");
		//hard Assert
//		Assert.assertEquals(actualResult_emailError, expectedResult_emailError);
		
		
		//soft Assert
		
		SoftAssert softassert=new SoftAssert();
		
		softassert.assertEquals(actualResult_emailError, expectedResult_emailError);
		
//		System.out.println("---------After Assert Execution---------");
		
		
		softassert.assertEquals(actualResult_password, expectedResult_password);
		
		softassert.assertAll();
		
	}
	
	
	
	
	

}
