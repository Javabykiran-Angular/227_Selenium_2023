package com.jbk.main;

import com.jbk.xpath.DemoOnXpath;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DemoOnXpath obj=new DemoOnXpath();
//		obj.configSetting("http://register.rediff.com/register/register.php?FormName=user_details");
		obj.configSetting("https://www.att.com/");
		//obj.elementSearch();
		obj.elementFollowing();

	}

}
