package com.jbk.main;

import com.jbk.wait.DemoOnWait;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DemoOnWait obj=new DemoOnWait();
//		obj.ConfigSetting("https://www.google.com/");
		
		obj.ConfigSetting("https://www.qa.jbktest.com/");		
		
		obj.search();

	}

}
