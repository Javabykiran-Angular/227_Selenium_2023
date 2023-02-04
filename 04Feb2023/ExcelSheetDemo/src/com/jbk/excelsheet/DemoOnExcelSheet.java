package com.jbk.excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DemoOnExcelSheet {
	
	public void readExcelSheet() {
		
		try {
			FileInputStream fis=new FileInputStream("D:\\SeleniumSoftware\\excelfiles\\myexcel.xlsx");
			

			XSSFWorkbook workbook=new XSSFWorkbook(fis);
			XSSFSheet objSheet=workbook.getSheetAt(0);
			XSSFRow row=objSheet.getRow(1);
			String value=row.getCell(0).getStringCellValue();
//			System.out.println(value);
			String pwd=row.getCell(1).getStringCellValue();
//			System.out.println(pwd);
			

			int rowcount=objSheet.getLastRowNum();
			
			for(int i=1;i<=rowcount;i++) {
				XSSFRow row1=objSheet.getRow(i);
				int colcount=row1.getLastCellNum();
				
				for(int j=0;j<colcount;j++) {
					System.out.println(row1.getCell(j).getStringCellValue());
				}
				System.out.println("------------------");
				
			}
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
