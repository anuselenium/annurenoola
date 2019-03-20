package com.anu.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writingdata {

	public static void main(String[] args) throws Exception {
		
            File src = new File("C:\\Users\\Rohit\\Desktop\\Testdata.xlsx");
		
		          FileInputStream fis = new FileInputStream(src);
		          
		          XSSFWorkbook wb = new XSSFWorkbook(fis);
		  		   XSSFSheet ws = wb.getSheet("Sheet1");
		  		   ws.getRow(1).createCell(2).setCellValue("anu");
		  		    ws.getRow(2).createCell(2).setCellValue("renu");
		  		    
		  		    FileOutputStream fos = new FileOutputStream(src);
		  		    wb.write(fos);
		  		    wb.close();
		  		    
		  		
		

	}

}
