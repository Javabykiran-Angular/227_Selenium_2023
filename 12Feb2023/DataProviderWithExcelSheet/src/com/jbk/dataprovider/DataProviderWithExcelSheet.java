package com.jbk.dataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.jbk.utility.utility;

public class DataProviderWithExcelSheet extends utility{
	
	
	@BeforeMethod
	public void configSetting() {
		ConfigSetting("file:///D:/SeleniumSoftware/Offline%20Website/index.html");		
	}
	
	
	@Test(dataProvider = "logintestdata")
	public void LoginTestCase(String username,String pwd) {
//		System.out.println("-----------------------");
//		System.out.println(username+"   "+pwd);
//		System.out.println("-----------------------");
		
		WebElement email_Element= findWebElement("//input[@id='email']");
				
		email_Element.sendKeys(username);
		
		WebElement pwd_element=findWebElement("//input[@id='password']");
				
		pwd_element.sendKeys(pwd);
		
		WebElement login_element=findWebElement("//button[starts-with(text(),\"Sign In\")]");
				
		
		login_element.click();
		
		try {
			WebDriver driver=getDriver();
			
			File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File target=new File("C:\\Selenium_Workspace\\screenshot\\login\\login_"+username+".png");
//			File target=new File("C:\\Selenium_Workspace\\screenshot\\login\\login.svg");
			
			Thread.sleep(2000);

			FileHandler.copy(source, target);
			
			
			WebElement emailError_element=findWebElement("//div[@id='email_error']");
					
			
			String actualResult_emailError= emailError_element.getText();
			System.out.println(actualResult_emailError);
			String expectedResult_emailError="Please enter email as kiran@gmail.com";
			
			WebElement passwordError_Element=findWebElement("//div[@id='password_error']");
					
			String actualResult_password= passwordError_Element.getText();
			String expectedResult_password="Please enter password 123456";
			
			SoftAssert softassert=new SoftAssert();
			
			softassert.assertEquals(actualResult_emailError, expectedResult_emailError);
			
//			System.out.println("---------After Assert Execution---------");
			
			
			softassert.assertEquals(actualResult_password, expectedResult_password);
			
			softassert.assertAll();
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	@DataProvider(name = "logintestdata")
	public Object[][] LoginDataProvider(){
		
		Object[][] testObjArray=ReadExcelSheet("D:\\SeleniumSoftware\\excelfiles\\my1.xlsx");
		return testObjArray;
		
	}
	
	 public Object [][] ReadExcelSheet(String path) {
			String[][] tabArray = null;
			int ci,cj;
			
			try {
				FileInputStream fis=new FileInputStream(path);
				XSSFWorkbook workbook=new XSSFWorkbook(fis);
				XSSFSheet objSheet=workbook.getSheetAt(0);
				
				int rowcount=objSheet.getLastRowNum();
				System.out.println(rowcount);
				
				   tabArray=new String[rowcount][2];
				ci=0;
				for(int i=1;i<=rowcount;i++,ci++) {
					cj=0;
					XSSFRow row=objSheet.getRow(i);
					
					for(int j=0;j<2;j++,cj++) {
//						System.out.println("---> "+row.getCell(j));
						tabArray[ci][cj]=row.getCell(j).getStringCellValue();
//						System.out.println("Table data --->"+tabArray[ci][cj]);
					}
//					System.out.println("=============");
				}
				workbook.close();
				fis.close();
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return tabArray;
			
		}
	
	
	

}
