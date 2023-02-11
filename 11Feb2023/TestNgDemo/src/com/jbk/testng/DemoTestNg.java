package com.jbk.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoTestNg {
	//it apply on project level
	@BeforeSuite
	public void beforeSuit() {
		System.out.println("---------beforeSuit -------------");
		
	}
	
	//it is based on Module 
	@BeforeTest
	public void beforTest() {
		System.out.println("========beforTest==========");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("========beforeClass==========");
		
	}
	
	@BeforeMethod
	public void berforeMethod() {
		System.out.println("======== berforeMethod ==========");		
	}
	
	@Test(priority = 2)
	public void aLoginTest() {
		System.out.println("U r in aLoginTest case " );
	}
	
	@Test(priority = 3)
	public void sloginTest() {
		System.out.println("sloginTest method");
	}
	
	@Test(priority = 1)
	public void mloginTest() {
		System.out.println("mloginTest method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("-------- afterMethod---------");
	}
	

	@AfterClass
	public void afterClass() {
		System.out.println("========afterClass==========");
		
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("========afterTest==========");
		
	}
	

	@AfterSuite
	public void afterSuit() {
		System.out.println("======== afterSuit ==========");
		
	}
	
	

}
