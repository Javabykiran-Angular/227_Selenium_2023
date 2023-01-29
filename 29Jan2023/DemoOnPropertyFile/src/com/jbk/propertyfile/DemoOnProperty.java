package com.jbk.propertyfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.jbk.config.ConfigurationData;

public class DemoOnProperty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConfigurationData obj=new ConfigurationData();
		
		try {
			FileInputStream fis=new FileInputStream("D:\\SeleniumSoftware\\configurationFiles\\myfile.properties");
			
				Properties props=new Properties();
				props.load(fis);
				System.out.println(props.getProperty("name"));
				System.out.println(props.getProperty("password"));
				System.out.println(props.getProperty("url"));
				String urlStr=props.getProperty("url");
				
				obj.connfigSetting(urlStr);
				
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
