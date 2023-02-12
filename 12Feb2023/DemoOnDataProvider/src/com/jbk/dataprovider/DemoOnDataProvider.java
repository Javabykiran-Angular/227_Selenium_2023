package com.jbk.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoOnDataProvider {
	
	@Test(priority = 1, dataProvider = "testdata" )
	public void LoginTestCase(int id,String username,String pwd) {
		System.out.println("ID => "+id+" Username => "+username+" Password=> "+pwd);
	}
	
	@DataProvider(name = "testdata")
	public Object[][] LoginTestData(){
		
		return new Object[][] {
			{9,"Sumit","123"},
			{3,"Spruha","456"},
			{6,"Kiran","789"},
		};
		
	}

}
